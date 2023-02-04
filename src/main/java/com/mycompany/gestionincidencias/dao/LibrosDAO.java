/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package com.mycompany.gestionincidencias.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sergi
 */

/*
public class TicketDAO {
    
    public void insertarLibro(Libro libro) throws ParseException, SQLException {
        
           try {
            Util util = new Util();
            Connection conexion = util.CreaConexion();
            java.sql.Statement sentencia = conexion.createStatement();
            String sql = String.format("INSERT INTO catalogo(titulo, autor, editorial, fecha_publicacion, imagen, descripcion, precio, unidades, enventa) VALUES ('%s', '%s', '%s', '%tF %n', '%s', '%s', '%s', '%d','%d')",
                    libro.getTitulo(), libro.getAutor(), libro.getEditorial(), new Date(), libro.getImagen(), libro.getDescripcion(), libro.getPrecio(),libro.getUnidades(), libro.getEnventa()); // fechayhora es un String en la Base de datos
            sentencia.executeUpdate(sql);
            System.out.println("Libro insertado en la BBDD");
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    
  }
    
    public ArrayList<Libro> getLibros() {
        ArrayList<Libro> listaLibros = new ArrayList<>();
        Libro libro;
        try {
            Util util = new Util();
            Connection conexion = util.CreaConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM catalogo");
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    libro = new Libro(rs.getString("titulo"),rs.getString("autor"), rs.getString("editorial"), rs.getDate("fecha_publicacion"), rs.getString("imagen"), rs.getString("descripcion"), rs.getFloat("precio"), rs.getInt("unidades"), rs.getInt("enventa"));
                    listaLibros.add(libro);
                }
            } else {
                System.out.println("No hay libros");
            }
            rs.close();
            sentencia.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaLibros;
    }
    
    
    public void modificarLibro(Libro libro, Libro libro_mod) throws ParseException, SQLException {
        try {
            Util util = new Util();
            Connection conexion = util.CreaConexion();
            Statement sentencia = conexion.createStatement();
            String sql = String.format("UPDATE catalogo SET titulo='%s', autor='%s', editorial='%s', descripcion='%s', precio='%s', unidades='%s', enventa='%d' WHERE titulo='%s'",
                    libro_mod.getTitulo(), libro_mod.getAutor(), libro_mod.getEditorial(), libro_mod.getDescripcion(), libro_mod.getPrecio(),libro_mod.getUnidades(), libro_mod.getEnventa(), libro.getTitulo()); 
            sentencia.executeUpdate(sql);
            System.out.println("Libro Modificado");
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    
     public void borrarlibro(Libro libro) throws ParseException, SQLException {
        try {
            
            
            Util util = new Util();
            Connection conexion = util.CreaConexion();
            Statement sentencia = conexion.createStatement();
            String sql = String.format("DELETE FROM catalogo WHERE titulo='%s'",
                    libro.getTitulo()); 
            sentencia.executeUpdate(sql);
            System.out.println("Libro Eliminado");
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
}
*/