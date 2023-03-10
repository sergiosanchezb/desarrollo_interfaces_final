/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestionincidencias.view;

import com.mycompany.gestionincidencias.dto.Usuario;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;

/**
 *
 * @author sergi
 */
public class Principal extends javax.swing.JFrame {

    //CREAMOS ESTAS VARIABLES PARA REALIZAR ACCIONES POSTERIORMENTE
    boolean admin = false;
    Usuario usuario_acceso;

    /**
     * Creates new form Principal
     */
    public Principal() {

        this.usuario_acceso = usuario_acceso;

        if (usuario_acceso.isAdmin() == 1) {
            admin = true;
        }

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int ancho = (int) d.getWidth() / 2;
        int alto = (int) d.getHeight() / 2;
        this.setSize(ancho, alto);

        this.setExtendedState(MAXIMIZED_BOTH);

        initComponents();

        if (!admin) {
            jb_crear_users.setEnabled(false);
        }

    }

    public Principal(Usuario usuario_acceso) {

        //ASIGNAMOS EL USUARIO PASADO POR PARÁMETRO AL OBJECTO CREADO EN LA CLASE
        this.usuario_acceso = usuario_acceso;

        //IDENTIFICAMOS SI EL USUARIO TIENE EL ATRIBUTO ADMIN
        if (usuario_acceso.isAdmin() == 1) {
            admin = true;
        }

        //IDENTIFICAMOS LAS DIMENSIONES DE LA PANTALLA
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int ancho = (int) d.getWidth() / 2;
        int alto = (int) d.getHeight() / 2;
        this.setSize(ancho, alto);

        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();

        //SI EL USUARIO NO ES ADMIN, NO SE LE MUESTRA ESTE COMPONENTE
        if (!admin) {
            jb_crear_users.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jb_crear_users = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_clientes = new javax.swing.JButton();
        jbutton_informe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpanel_datos = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuAyuda = new javax.swing.JMenu();
        jMenuItem_Ayuda = new javax.swing.JMenuItem();
        jmenuExit = new javax.swing.JMenu();
        jmenu_exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GESTION INCIDENCIAS");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono-listar.png"))); // NOI18N
        jButton1.setText("VER INCIDENCIAS");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jb_crear_users.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jb_crear_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono-usuario.png"))); // NOI18N
        jb_crear_users.setText("USUARIOS");
        jb_crear_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_usersActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono-crear.png"))); // NOI18N
        jButton2.setText("CREAR INCIDENCIAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_clientes.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes.png"))); // NOI18N
        btn_clientes.setText("CLIENTES");
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        jbutton_informe.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbutton_informe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informe.png"))); // NOI18N
        jbutton_informe.setText("INFORMES");
        jbutton_informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_informeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbutton_informe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jb_crear_users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbutton_informe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_crear_users, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 540));

        javax.swing.GroupLayout jpanel_datosLayout = new javax.swing.GroupLayout(jpanel_datos);
        jpanel_datos.setLayout(jpanel_datosLayout);
        jpanel_datosLayout.setHorizontalGroup(
            jpanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jpanel_datosLayout.setVerticalGroup(
            jpanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel1.add(jpanel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 880, 540));

        jmenuAyuda.setText("Archivo");
        jmenuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuAyudaActionPerformed(evt);
            }
        });

        jMenuItem_Ayuda.setText("Ayuda");
        jMenuItem_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AyudaActionPerformed(evt);
            }
        });
        jmenuAyuda.add(jMenuItem_Ayuda);

        jMenuBar1.add(jmenuAyuda);

        jmenuExit.setText("Exit");

        jmenu_exit.setText("Exit");
        jmenu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_exitActionPerformed(evt);
            }
        });
        jmenuExit.add(jmenu_exit);

        jMenuBar1.add(jmenuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        jpanel_listar panel_listar = null;
        try {
            panel_listar = new jpanel_listar(usuario_acceso);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        panel_listar.setSize(ancho, alto);
        panel_listar.setLocation(0, 0);

        //AL PULSAR SOBRE ESTE BOTÓN, AÑADIMOS AL PANEL DATOS EL PANEL LISTAR
        jpanel_datos.removeAll();
        jpanel_datos.add(panel_listar);
        jpanel_datos.revalidate();
        jpanel_datos.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_crear_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_usersActionPerformed
        // TODO add your handling code here:

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        jpanel_crear_usuario panel_crear_usuario = null;
        panel_crear_usuario = new jpanel_crear_usuario(usuario_acceso);

        panel_crear_usuario.setSize(ancho, alto);
        panel_crear_usuario.setLocation(0, 0);

        //AL PULSAR SOBRE ESTE BOTÓN, AÑADIMOS AL PANEL DATOS EL PANEL CREAR USUARIO
        jpanel_datos.removeAll();
        jpanel_datos.add(panel_crear_usuario);
        jpanel_datos.revalidate();
        jpanel_datos.repaint();
    }//GEN-LAST:event_jb_crear_usersActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        jpanel_crear_incidencia panel_crear_incidencia = null;
        try {
            panel_crear_incidencia = new jpanel_crear_incidencia(usuario_acceso);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        panel_crear_incidencia.setSize(ancho, alto);
        panel_crear_incidencia.setLocation(0, 0);

        //AL PULSAR SOBRE ESTE BOTÓN, AÑADIMOS AL PANEL DATOS EL PANEL CREAR INCIDENCIA
        jpanel_datos.removeAll();
        jpanel_datos.add(panel_crear_incidencia);
        jpanel_datos.revalidate();
        jpanel_datos.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        // TODO add your handling code here:

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        jpanel_crear_clientes panel_clientes = null;
        panel_clientes = new jpanel_crear_clientes();

        panel_clientes.setSize(ancho, alto);
        panel_clientes.setLocation(0, 0);

        //AL PULSAR SOBRE ESTE BOTÓN, AÑADIMOS AL PANEL DATOS EL PANEL CLIENTES
        jpanel_datos.removeAll();
        jpanel_datos.add(panel_clientes);
        jpanel_datos.revalidate();
        jpanel_datos.repaint();
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void jmenuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmenuAyudaActionPerformed

    private void jMenuItem_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AyudaActionPerformed
        // TODO add your handling code here:
        // Carga el fichero de ayuda
        File fichero = new File("./src/main/java/com/mycompany/gestionincidencias/help/help_set.hs");
        URL hsURL;
        HelpSet helpset;
        try {
            hsURL = fichero.toURI().toURL();
            try {
                // Crea el HelpSet y el HelpBroker
                helpset = new HelpSet(getClass().getClassLoader(), hsURL);
                HelpBroker hb = helpset.createHelpBroker();
                // Pone ayuda al botón y a F1 en la ventana.
                hb.enableHelpOnButton(jMenuItem_Ayuda, "aplicacion", helpset);
                hb.enableHelpKey(this.getContentPane(), "aplicacion", helpset);
            } catch (HelpSetException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem_AyudaActionPerformed

    private void jbutton_informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_informeActionPerformed
        // TODO add your handling code here:
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        jpanel_informes panel_informes = null;
        panel_informes = new jpanel_informes();

        panel_informes.setSize(ancho, alto);
        panel_informes.setLocation(0, 0);

        //AL PULSAR SOBRE ESTE BOTÓN, AÑADIMOS AL PANEL DATOS EL PANEL INFORMES
        jpanel_datos.removeAll();
        jpanel_datos.add(panel_informes);
        jpanel_datos.revalidate();
        jpanel_datos.repaint();
    }//GEN-LAST:event_jbutton_informeActionPerformed

    private void jmenu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_exitActionPerformed
        // TODO add your handling code here:

        //CERRAMOS LA APLICACIÓN
        System.exit(0);
    }//GEN-LAST:event_jmenu_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Ayuda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_crear_users;
    private javax.swing.JButton jbutton_informe;
    private javax.swing.JMenu jmenuAyuda;
    private javax.swing.JMenu jmenuExit;
    private javax.swing.JMenuItem jmenu_exit;
    private javax.swing.JPanel jpanel_datos;
    // End of variables declaration//GEN-END:variables
}
