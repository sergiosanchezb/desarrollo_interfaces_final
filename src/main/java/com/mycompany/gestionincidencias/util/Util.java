package com.mycompany.gestionincidencias.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergi
 */

public class Util {

    //GUARDAMOS EN VARIABLES LOS DATOS DE NUESTRA BBDD
    private final String bd = "appevent_grupo3";
    private final String login = "grupo3";
    private final String password = "&jP9n5z54";
    private final String url = "jdbc:mysql://188.164.193.188:3306/" + bd;

    public Util() {

    }

    //MÉTODO PARA LA CREACIÓN DE LA CONEXIÓN
    public Connection CreaConexion() throws ClassNotFoundException {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion;
            conexion = DriverManager.getConnection(url, login, password);
            System.out.println("Conexión establecida");
            return conexion;

        } catch (SQLException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}