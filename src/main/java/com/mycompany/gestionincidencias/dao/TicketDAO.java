package com.mycompany.gestionincidencias.dao;

import com.mycompany.gestionincidencias.dto.Cliente;
import com.mycompany.gestionincidencias.dto.Ticket;
import com.mycompany.gestionincidencias.dto.Usuario;
import com.mycompany.gestionincidencias.util.Hash;
import com.mycompany.gestionincidencias.util.Util;
import com.mycompany.gestionincidencias.view.proceso;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author sergi
 */
public class TicketDAO {

    public ArrayList<Ticket> getTickets() throws SQLException {
        ArrayList<Ticket> listaTickets = new ArrayList<>();
        Ticket ticket;
        
        try {

            Util util = new Util();
            Connection conexion = util.CreaConexion();
            Statement sentencia = conexion.createStatement();

            ResultSet rs = sentencia.executeQuery("SELECT * FROM SSB_Ticket");

            if (rs.isBeforeFirst()) {
                
                while (rs.next()) {
                    ticket = new Ticket(rs.getString("nombre"), rs.getString("descripcion"), rs.getString("estado"), rs.getString("prioridad"), rs.getInt("cliente"));
                    listaTickets.add(ticket);
                }
                
            } else {
                System.out.println("No hay tickets");
            }
            rs.close();
            sentencia.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaTickets;
    }

    public void insertarUsuario(Usuario usuario) throws ParseException, SQLException {

        try {
            Util util = new Util();
            Connection conexion = util.CreaConexion();
            java.sql.Statement sentencia = conexion.createStatement();
            String sql = String.format("INSERT INTO SSB_Usuario(nombre, especialidad, username, password, admin) VALUES ('%s', '%s', '%s', '%s','%d')",
                    usuario.getNombre(), usuario.getEspecialidad(), usuario.getUsuario(), usuario.getContraseña(), usuario.isAdmin());
            sentencia.executeUpdate(sql);
            System.out.println("Usuario insertado en la BBDD");
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertarTicket(Ticket ticket, Usuario usuario_acceso) throws ParseException, SQLException {

        try {

            Util util = new Util();
            Connection conexion = util.CreaConexion();
            java.sql.Statement sentencia = conexion.createStatement();
            String sql = String.format("INSERT INTO SSB_Ticket(nombre, descripcion, estado, prioridad, cliente) VALUES ('%s', '%s', '%s', '%s', '%d')",
                    ticket.getNombre(), ticket.getDescripcion(), ticket.getEstado(), ticket.getPrioridad(), ticket.getCliente());
            sentencia.executeUpdate(sql);
            System.out.println("Usuario insertado en la BBDD");
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> getUsuarios() throws SQLException {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        Usuario usuario;

        try {
            Util util = new Util();
            Connection conexion = util.CreaConexion();
            Statement sentencia = conexion.createStatement();

            ResultSet rs = sentencia.executeQuery("SELECT * FROM SSB_Usuario");

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    usuario = new Usuario(rs.getString("nombre"), rs.getString("especialidad"), rs.getString("username"), rs.getString("password"), rs.getInt("admin"));
                    listaUsuarios.add(usuario);
                }
            } else {
                System.out.println("No hay usuarios");
            }

            rs.close();
            sentencia.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    public ArrayList<Cliente> getClientes() throws SQLException {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Cliente cliente;

        try {

            Util util = new Util();
            Connection conexion = util.CreaConexion();
            Statement sentencia = conexion.createStatement();

            ResultSet rs = sentencia.executeQuery("SELECT * FROM SSB_Cliente");

            if (rs.isBeforeFirst()) {

                while (rs.next()) {
                    cliente = new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("direccion"));
                    listaClientes.add(cliente);
                }

            } else {
                System.out.println("No hay usuarios");
            }

            rs.close();
            sentencia.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaClientes;
    }

    public int getIdUsuario(Usuario usuario) throws SQLException {

        int id = 0;

        try {

            ResultSet rs;

            Util util = new Util();
            Connection conexion;

            conexion = util.CreaConexion();
            String consulta = "SELECT id FROM SSB_Usuario WHERE nombre=(?)";
            PreparedStatement ps = conexion.prepareStatement(consulta);

            ps.setString(1, usuario.getNombre());

            rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt("id");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

    public void insertarCliente(Cliente cliente) throws ParseException, SQLException {

        try {
            Util util = new Util();
            Connection conexion = util.CreaConexion();
            java.sql.Statement sentencia = conexion.createStatement();
            String sql = String.format("INSERT INTO SSB_Cliente(nombre, telefono, direccion) VALUES ('%s', '%s', '%s')",
                    cliente.getNombre(), cliente.getTelefono(), cliente.getDireccion());
            sentencia.executeUpdate(sql);
            System.out.println("Cliente insertado en la BBDD");
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarUsuario(String nombre_ant, String nombre, String especialidad, String username, String password, Usuario usuario_acceso) throws ParseException, SQLException {

        try {
            Util util = new Util();
            Connection conexion = util.CreaConexion();
            Statement sentencia = conexion.createStatement();
            String sql = String.format("UPDATE SSB_Usuario SET nombre='%s', especialidad='%s', username='%s', password='%s', usuario_acceso='%d', fecha_modificacion='%s' WHERE nombre='%s'",
                    nombre, especialidad, username, password, getIdUsuario(usuario_acceso), new Date().toGMTString(), nombre_ant);
            sentencia.executeUpdate(sql);
            System.out.println("Usuario Modificado");
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarUsuario(Usuario usuario) throws ParseException, SQLException {

        try {
            Util util = new Util();
            Connection conexion = util.CreaConexion();
            Statement sentencia = conexion.createStatement();
            String sql = String.format("DELETE FROM SSB_Usuario WHERE nombre='%s'",
                    usuario.getNombre());
            sentencia.executeUpdate(sql);
            System.out.println("Usuario Eliminado");
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarTicket(String nombre_ant, String nombre, String descripcion, String estado, String prioridad, Usuario usuario_acceso) throws ParseException, SQLException {

        try {

            Util util = new Util();
            Connection conexion = util.CreaConexion();
            Statement sentencia = conexion.createStatement();
            String sql = String.format("UPDATE SSB_Ticket SET nombre='%s', descripcion='%s', estado='%s', prioridad='%s', usuario_acceso='%d', fecha_modificacion='%s' WHERE nombre='%s'",
                    nombre, descripcion, estado, prioridad, getIdUsuario(usuario_acceso), new Date().toGMTString(), nombre_ant);
            sentencia.executeUpdate(sql);
            System.out.println("Ticket Modificado");
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarTicket(String nombre) throws ParseException, SQLException {

        try {

            Util util = new Util();
            Connection conexion = util.CreaConexion();
            Statement sentencia = conexion.createStatement();
            String sql = String.format("DELETE FROM SSB_Ticket WHERE nombre='%s'",
                    nombre);
            sentencia.executeUpdate(sql);
            System.out.println("Ticket Eliminado");
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
