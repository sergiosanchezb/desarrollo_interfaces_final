/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.gestionincidencias.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author sergi
 */
public class jpanel_informes extends javax.swing.JPanel {

    /**
     * Creates new form jpanel_informes
     */
    public jpanel_informes() {
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

        miBoton1 = new com.mycompany.gestionincidencias.util.MiBoton();
        miBoton2 = new com.mycompany.gestionincidencias.util.MiBoton();
        btn_incidencias_cliente = new com.mycompany.gestionincidencias.util.MiBoton();

        miBoton1.setText("LISTADO CLIENTES");
        miBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBoton1ActionPerformed(evt);
            }
        });

        miBoton2.setText("LISTADO INCIDENCIAS");
        miBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBoton2ActionPerformed(evt);
            }
        });

        btn_incidencias_cliente.setText("INCIDENCIAS POR CLIENTE");
        btn_incidencias_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incidencias_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(miBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(miBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn_incidencias_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(miBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_incidencias_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(miBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void miBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBoton2ActionPerformed
        // TODO add your handling code here:

        String reportResource = "./src/main/java/com/mycompany/gestionincidencias/informes/REPORT_INCIDENCIAS.jrxml";
        String reportCompilado = "./src/main/java/com/mycompany/gestionincidencias/informes/REPORT_INCIDENCIAS.jasper";
        String reportPDF = "./src/main/java/com/mycompany/gestionincidencias/informes/REPORT_INCIDENCIAS.pdf";
        JasperReport reporte;
        boolean compilado = true;
        Map<String, Object> params = new HashMap<String, Object>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://188.164.193.188:3306/appevent_grupo3", "grupo3", "&jP9n5z54");
            if (compilado) {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(reportCompilado);
            } else {
                reporte = JasperCompileManager.compileReport(reportResource);
            }
            JasperPrint informe = JasperFillManager.fillReport(reporte, params, conexion);
            JasperViewer.viewReport(informe, false);
            JasperExportManager.exportReportToPdfFile(informe, reportPDF);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_miBoton2ActionPerformed

    private void miBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBoton1ActionPerformed
        // TODO add your handling code here:
        String reportResource = "./src/main/java/com/mycompany/gestionincidencias/informes/REPORT_CLIENTES.jrxml";
        String reportCompilado = "./src/main/java/com/mycompany/gestionincidencias/informes/REPORT_CLIENTES.jasper";
        String reportPDF = "./src/main/java/com/mycompany/gestionincidencias/informes/REPORT_CLIENTES.pdf";
        JasperReport reporte;
        boolean compilado = true;
        Map<String, Object> params = new HashMap<String, Object>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://188.164.193.188:3306/appevent_grupo3", "grupo3", "&jP9n5z54");
            if (compilado) {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(reportCompilado);
            } else {
                reporte = JasperCompileManager.compileReport(reportResource);
            }
            JasperPrint informe = JasperFillManager.fillReport(reporte, params, conexion);
            JasperViewer.viewReport(informe, false);
            JasperExportManager.exportReportToPdfFile(informe, reportPDF);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miBoton1ActionPerformed

    private void btn_incidencias_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incidencias_clienteActionPerformed
        // TODO add your handling code here:
        Panel_Informe_Incidencias_Cliente objectoInforme = new Panel_Informe_Incidencias_Cliente();
        objectoInforme.setVisible(true);
    }//GEN-LAST:event_btn_incidencias_clienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.gestionincidencias.util.MiBoton btn_incidencias_cliente;
    private com.mycompany.gestionincidencias.util.MiBoton miBoton1;
    private com.mycompany.gestionincidencias.util.MiBoton miBoton2;
    // End of variables declaration//GEN-END:variables
}
