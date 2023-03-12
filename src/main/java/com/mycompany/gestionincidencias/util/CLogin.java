package com.mycompany.gestionincidencias.util;

import com.mycompany.gestionincidencias.dto.Usuario;
import com.mycompany.gestionincidencias.view.Principal;
import com.mycompany.gestionincidencias.view.proceso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author sergi
 */
public class CLogin {

    public boolean validaUsuario(JTextField usuario, JPasswordField password) {

        boolean inicio_correcto = false;
        int id_usuario = 0;

        try {

            ResultSet rs;

            //SE REALIZA CONSULTA SQL PARA COMPROBAR SI EL USUARIO Y PASSWORD SON "CORRECTOS" (EXISTEN EN LA BBDD)
            Util util = new Util();
            Connection conexion = util.CreaConexion();
            String consulta = "SELECT * FROM SSB_Usuario WHERE username=(?) AND password=(?)";
            PreparedStatement ps = conexion.prepareStatement(consulta);

            String contra = String.valueOf(password.getPassword());

            ps.setString(1, usuario.getText());
            ps.setString(2, contra);

            rs = ps.executeQuery();

            if (rs.next()) {

                //OBTENEMOS ID DEL USUARIO LOGUEADO
                String consulta2 = "SELECT id,nombre,username,password,especialidad,admin FROM SSB_Usuario WHERE username=(?)";
                PreparedStatement ps2 = conexion.prepareStatement(consulta2);

                ps2.setString(1, usuario.getText());
                rs = ps2.executeQuery();
                Usuario usuario_acceso = new Usuario();

                while (rs.next()) {
                    id_usuario = rs.getInt(1);

                    //CREO EL USUARIO PARA PASARLO COMO PARÁMETRO AL FRAME PRINCIPAL Y HACER USO DEL ADMIN O NO
                    usuario_acceso.setNombre(rs.getString("nombre"));
                    usuario_acceso.setUsuario(rs.getString("username"));
                    usuario_acceso.setContraseña(rs.getString("password"));
                    usuario_acceso.setEspecialidad(rs.getString("especialidad"));
                    usuario_acceso.setAdmin(rs.getInt("admin"));
                }

                //MOSTRAMOS UN MENSAJE E INICIAMOS FRAME PRINCIPAL
                JOptionPane.showMessageDialog(null, "Incio de sesión correcto");
                inicio_correcto = true;
                proceso p = new proceso(usuario_acceso);
                p.setVisible(true);
                //Principal objectoPrincipal = new Principal(usuario_acceso);
                //objectoPrincipal.setVisible(true);

                try {

                    //SE REALIZA CONSULTA SQL PARA LA INSERCCIÓN DE LOS ACCESOS EN LA TABLA SSB_Accesos CADA VEZ QUE SE INICIE SESION
                    String sql = String.format("INSERT INTO SSB_Acceso(usuario, fecha_acceso) VALUES ('%s', '%s')", id_usuario, new Date().toGMTString());
                    ps.executeUpdate(sql);
                    System.out.println("Acceso insertado en la BBDD");
                    conexion.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }

            } else {
                //SE MUESTRA UN MENSAJE POR PANTALLA AL CLIENTE PARA IDICARLE QUE EL INICIO HA SIDO ERRÓNEO
                JOptionPane.showMessageDialog(null, "Inicio de sesion incorrecto, introduzca bien las credenciales", "ERROR", 0);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e.toString());

        }

        return inicio_correcto;

    }
}
