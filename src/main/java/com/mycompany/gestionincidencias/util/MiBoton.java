/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionincidencias.util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author sergi
 */
public class MiBoton extends JButton implements Serializable, MouseListener{

    private int tamañoFuente;
    private Color color_exit;
    private Color color_entered;
    private Color color_released;
    private Color color_pressed;
    private Color color_clicked;


    public MiBoton() {
        
        this.setBackground(Color.GRAY);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Tahoma", Font.BOLD, 16));
        this.setPreferredSize(new Dimension(400,50));
        addMouseListener(this);
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
       this.setBackground(color_clicked);
       this.setForeground(Color.WHITE);
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        this.setBackground(color_pressed);
        this.setForeground(Color.BLACK);
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        this.setBackground(color_released);
        this.setForeground(Color.WHITE);
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
       this.setBackground(color_entered);
       this.setForeground(Color.darkGray);
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        this.setBackground(color_exit);
        this.setForeground(Color.darkGray);
        
    }

    public int getTamañoFuente() {
        return tamañoFuente;
    }

    public void setTamañoFuente(int tamañoFuente) {
        this.tamañoFuente = tamañoFuente;
    }

    public Color getColor_exit() {
        return color_exit;
    }

    public void setColor_exit(Color color_exit) {
        this.color_exit = color_exit;
    }

    public Color getColor_entered() {
        return color_entered;
    }

    public void setColor_entered(Color color_entered) {
        this.color_entered = color_entered;
    }

    public Color getColor_released() {
        return color_released;
    }

    public void setColor_released(Color color_released) {
        this.color_released = color_released;
    }

    public Color getColor_pressed() {
        return color_pressed;
    }

    public void setColor_pressed(Color color_pressed) {
        this.color_pressed = color_pressed;
    }

    public Color getColor_clicked() {
        return color_clicked;
    }

    public void setColor_clicked(Color color_clicked) {
        this.color_clicked = color_clicked;
    }
    
}