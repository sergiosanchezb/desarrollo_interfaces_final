/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionincidencias.dto;

/**
 *
 * @author sergi
 */
public class Usuario {

    private int id;
    private String nombre;
    private String usuario;
    private String contraseña;
    private String especialidad;
    private int admin;


    public Usuario(String nombre, String especialidad, String usuario, String contraseña, int admin) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.especialidad = especialidad;
        this.admin = admin;
    }

    public Usuario() {
    }
    
    public String[] toArrayString(){

        String[] s = new String[5];

        s[0]=this.nombre;
        s[1]=this.especialidad;
        s[2]=this.usuario;
        s[3]=this.contraseña;
        s[4]=String.valueOf(this.admin);

        return s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int isAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", especialidad=" + especialidad + ", admin=" + admin + '}';
    }
    
}