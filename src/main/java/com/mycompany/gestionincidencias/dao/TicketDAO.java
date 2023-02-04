package com.mycompany.gestionincidencias.dao;

import com.mycompany.gestionincidencias.dto.Cliente;
import com.mycompany.gestionincidencias.dto.Ticket;
import com.mycompany.gestionincidencias.util.Util;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
                    ticket = new Ticket(rs.getString("nombre"),rs.getString("descripcion"), rs.getString("estado"), rs.getString("prioridad"), rs.getInt("cliente"));
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
    
}
