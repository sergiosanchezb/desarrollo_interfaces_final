
package com.mycompany.gestionincidencias.util;

import com.mycompany.gestionincidencias.view.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author sergi
 */
public class CLogin {
    
    public boolean validaUsuario(JTextField usuario, JPasswordField password){
        
        boolean inicio_correcto=false;
        
        try{
            
            ResultSet rs;

            Util util = new Util();
            Connection conexion = util.CreaConexion();
            String consulta="SELECT * FROM SSB_Usuario WHERE username=(?) AND password=(?)";
            PreparedStatement ps = conexion.prepareStatement(consulta);

            String contra = String.valueOf(password.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            
            rs = ps.executeQuery();
            
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Incio de sesión correcto");
                inicio_correcto=true;
                Principal objectoPrincipal = new Principal();
                objectoPrincipal.setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Incio de sesión incorrecto, vuelva a intentarlo");
            }
            
            
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "ERROR "+e.toString());
            
        }
        
        return inicio_correcto;
        
    }
    
    
    
}
