package com.mycompany.gestionincidencias.dto;

/**
 *
 * @author sergi
 */
public class Ticket {
    
    private String nombre;
    private String descripcion;
    private String estado;
    private String prioridad;
    private int cliente;

    public Ticket() {
    }

    public Ticket(String nombre, String descripcion, String estado, String prioridad, int cliente) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.cliente = cliente;
    }
    
    public String[] toArrayString(){

        String[] s = new String[5];

        s[0]=this.nombre;
        s[1]=this.descripcion;
        s[2]=this.estado;
        s[3]=this.prioridad;
        s[4]=String.valueOf(this.cliente);

        return s;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    
    
}
