/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.gestionincidencias.view;

import com.mycompany.gestionincidencias.dao.TicketDAO;
import com.mycompany.gestionincidencias.dto.Usuario;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergi
 */
public class jpanel_crear_usuario extends javax.swing.JPanel {

    Usuario usuario_acceso;

    /**
     * Creates new form jpanel_crear_usuario
     */
    public jpanel_crear_usuario(Usuario usuario_acceso) {

        //ASIGNAMOS EN EL OBJETO USUARIO_ACCESO EL USUARIO PASADO POR PARÁMETRO
        this.usuario_acceso = usuario_acceso;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        miBoton1 = new com.mycompany.gestionincidencias.util.MiBoton();
        miBoton2 = new com.mycompany.gestionincidencias.util.MiBoton();
        jpanel_data = new javax.swing.JPanel();
        miBoton3 = new com.mycompany.gestionincidencias.util.MiBoton();
        jb_borrar = new com.mycompany.gestionincidencias.util.MiBoton();

        setPreferredSize(new java.awt.Dimension(880, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel4.setText("CREACIÓN DE USUARIOS - GESTIÓN INCIDENCIAS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 73, 365, -1));

        miBoton1.setBackground(new java.awt.Color(102, 102, 102));
        miBoton1.setText("CREAR");
        miBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBoton1ActionPerformed(evt);
            }
        });
        add(miBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 129, 120, 27));

        miBoton2.setBackground(new java.awt.Color(102, 102, 102));
        miBoton2.setText("MODIFICAR");
        miBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBoton2ActionPerformed(evt);
            }
        });
        add(miBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 129, 140, 27));

        miBoton3.setBackground(new java.awt.Color(102, 102, 102));
        miBoton3.setText("LISTAR");
        miBoton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBoton3ActionPerformed(evt);
            }
        });

        jb_borrar.setText("BORRAR");
        jb_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_dataLayout = new javax.swing.GroupLayout(jpanel_data);
        jpanel_data.setLayout(jpanel_dataLayout);
        jpanel_dataLayout.setHorizontalGroup(
            jpanel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_dataLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(miBoton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jb_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jpanel_dataLayout.setVerticalGroup(
            jpanel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_dataLayout.createSequentialGroup()
                .addGroup(jpanel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miBoton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 331, Short.MAX_VALUE))
        );

        add(jpanel_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 690, 360));
    }// </editor-fold>//GEN-END:initComponents

    private void miBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBoton2ActionPerformed
        // TODO add your handling code here:

        //ABRIMOS EL PANEL PARA MODIFICAR USUARIOS
        Panel_Modificar objectoModificar = new Panel_Modificar(usuario_acceso);
        objectoModificar.setVisible(true);

        /*
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        
        jpanel_modificar_usuario panel_modificar_usuario = null;
        
        try {
            panel_modificar_usuario = new jpanel_modificar_usuario();
        } catch (SQLException ex) {
            Logger.getLogger(jpanel_crear_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        panel_modificar_usuario.setSize(ancho,alto);
        panel_modificar_usuario.setLocation(0,0);
        
        jpanel_data.removeAll();
        jpanel_data.add(panel_modificar_usuario);
        jpanel_data.revalidate();
        jpanel_data.repaint();
         */
    }//GEN-LAST:event_miBoton2ActionPerformed

    private void miBoton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBoton3ActionPerformed
        // TODO add your handling code here:

        //ABRIMOS EL PANEL PARA LISTAR USUARIOS
        Panel_Listar objectoListar = new Panel_Listar();
        objectoListar.setVisible(true);
    }//GEN-LAST:event_miBoton3ActionPerformed

    private void miBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBoton1ActionPerformed
        // TODO add your handling code here:

        //ABRIMOS EL PANEL PARA CREAR USUARIOS
        Panel_Crear objectoCrear = new Panel_Crear();
        objectoCrear.setVisible(true);
    }//GEN-LAST:event_miBoton1ActionPerformed

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
        // TODO add your handling code here:

        //ABRIMOS EL PANEL PARA ELIMINAR USUARIOS
        Panel_Eliminar objectoEliminar = new Panel_Eliminar();
        objectoEliminar.setVisible(true);
    }//GEN-LAST:event_jb_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private com.mycompany.gestionincidencias.util.MiBoton jb_borrar;
    private javax.swing.JPanel jpanel_data;
    private com.mycompany.gestionincidencias.util.MiBoton miBoton1;
    private com.mycompany.gestionincidencias.util.MiBoton miBoton2;
    private com.mycompany.gestionincidencias.util.MiBoton miBoton3;
    // End of variables declaration//GEN-END:variables
}
