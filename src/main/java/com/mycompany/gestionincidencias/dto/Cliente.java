package com.mycompany.gestionincidencias.dto;

/**
 *
 * @author sergi
 */
public class Cliente {
    
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    
    public Cliente(int id, String nombre, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Cliente(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Cliente() {
    }
    
    
    public String[] toArrayString(){

        String[] s = new String[5];
        
        s[0]=Integer.toString(this.id);
        s[1]=this.nombre;
        s[2]=this.telefono;
        s[3]=this.direccion;

        return s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

}
