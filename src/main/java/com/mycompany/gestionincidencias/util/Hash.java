/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionincidencias.util;

import java.security.MessageDigest;
import java.util.Base64;

/**
 *
 * @author sergi
 */
public class Hash {

    public Hash() {
        
    }

    /* Retorna un hash a partir de un tipo y un texto */
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes("UTF-8"));
            String hash = Base64.getEncoder().encodeToString(hashBytes);
            return hash;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
