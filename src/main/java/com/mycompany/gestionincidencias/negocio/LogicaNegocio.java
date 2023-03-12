package com.mycompany.gestionincidencias.negocio;

import com.mycompany.gestionincidencias.dao.TicketDAO;
import com.mycompany.gestionincidencias.dto.Ticket;
import com.mycompany.gestionincidencias.dto.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergi
 */
public class LogicaNegocio {
    
    private static List<Ticket> lista_ticket = new ArrayList<>();
    
    
    public static void anadirticket(Ticket ticket){
        lista_ticket.add(ticket);
    }
    
    public static List<Ticket> mostrartickets() throws SQLException{
        TicketDAO ticketsdao= new TicketDAO();
        
        return ticketsdao.getTickets();
    }

    public static List<Usuario> mostrarUsuarios() throws SQLException{
        TicketDAO ticketsdao= new TicketDAO();
        
        return ticketsdao.getUsuarios();
    }
/*
    public static void modificarLibro(Ticket libro_ant, Ticket libro_new) throws ParseException, SQLException{
        TicketDAO librosdao= new TicketDAO();
        
        librosdao.modificarLibro(libro_ant, libro_new);
    }
    
    
    public static void eliminarLibro(Ticket ticket){
        
            mostrarlibros().remove(ticket);
    }
*/  
    
}
