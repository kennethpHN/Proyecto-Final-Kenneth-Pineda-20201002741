/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package GUI;

import Util.AdminSerializacion;
import gestiones.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Dennis2
 */
public class MDIPrincipal extends javax.swing.JFrame {

    public static FrmFacturacionBoletos frmFacturacionBoletos = new FrmFacturacionBoletos();
    public static FrmFacturacion frmFacturacion = new FrmFacturacion();

    /**
     * Ubicar todas las gestiones
     */
    public static GestionBoleto gBoleto = new GestionBoleto();
    public static GestionOrigen gOrigen = new GestionOrigen();
    public static GestionDestino gDestino = new GestionDestino();
    public static GestionPasajero gPasajero = new GestionPasajero();
    public static GestionAerolinea gAero = new GestionAerolinea();
    public static GestionCliente gCliente = new GestionCliente();
    public static GestionAsesorServ gAsesor = new GestionAsesorServ();
    public static GestionHoraAbordaje gHora = new GestionHoraAbordaje();
    public static GestionAsiento gAsiento = new GestionAsiento();
    public static GestionCategVuelo gCateg = new GestionCategVuelo();
    public static GestionNumPuerta gNPuerta = new GestionNumPuerta();
    public static GestionFecha gFecha = new GestionFecha();
    public static GestionFactura gFactura = new GestionFactura();

    private BufferedImage img;

    public MDIPrincipal() {
        initComponents();
        //super.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        
        
        //jLabel2.setSize(MAXIMIZED_HORIZ,MAXIMIZED_VERT);

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);

        } catch (Exception e) {
            System.out.println("Error setting the LAF..." + e);
        }

        /*try {
            img = ImageIO.read(new URL("https://i.stack.imgur.com/0ZYY8.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        desktopPane = new JDesktopPane() {
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                grphcs.drawImage(img, 0, 0, null);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(img.getWidth(), img.getHeight());
            }
        };*/


        //De-Serialización
        try {
            gDestino = (GestionDestino) AdminSerializacion.de_serealizacion("gDestino.obj");
            if (gDestino == null) {
                gDestino = new GestionDestino();

            }
        } catch (Exception e) {
        }

        try {
            gOrigen = (GestionOrigen) AdminSerializacion.de_serealizacion("gOrigen.obj");
            if (gOrigen == null) {
                gOrigen = new GestionOrigen();

            }
        } catch (Exception e) {
        }

        try {
            gPasajero = (GestionPasajero) AdminSerializacion.de_serealizacion("gPasajero.obj");
            if (gPasajero == null) {
                gPasajero = new GestionPasajero();

            }
        } catch (Exception e) {
        }

        try {
            gAero = (GestionAerolinea) AdminSerializacion.de_serealizacion("gAero.obj");
            if (gAero == null) {
                gAero = new GestionAerolinea();

            }
        } catch (Exception e) {
        }

        try {
            gAsiento = (GestionAsiento) AdminSerializacion.de_serealizacion("gAsiento.obj");
            if (gAsiento == null) {
                gAsiento = new GestionAsiento();

            }
        } catch (Exception e) {
        }

        try {
            gCateg = (GestionCategVuelo) AdminSerializacion.de_serealizacion("gCateg.obj");
            if (gCateg == null) {
                gCateg = new GestionCategVuelo();

            }
        } catch (Exception e) {
        }

        try {
            gCliente = (GestionCliente) AdminSerializacion.de_serealizacion("gCliente.obj");
            if (gCliente == null) {
                gCliente = new GestionCliente();

            }
        } catch (Exception e) {
        }

        try {
            gAsesor = (GestionAsesorServ) AdminSerializacion.de_serealizacion("gAsesor.obj");
            if (gAsesor == null) {
                gAsesor = new GestionAsesorServ();

            }
        } catch (Exception e) {
        }

        try {
            gFecha = (GestionFecha) AdminSerializacion.de_serealizacion("gFecha.obj");
            if (gFecha == null) {
                gFecha = new GestionFecha();

            }
        } catch (Exception e) {
        }

        try {
            gHora = (GestionHoraAbordaje) AdminSerializacion.de_serealizacion("gHora.obj");
            if (gHora == null) {
                gHora = new GestionHoraAbordaje();

            }
        } catch (Exception e) {
        }

        try {
            gNPuerta = (GestionNumPuerta) AdminSerializacion.de_serealizacion("gNPuerta.obj");
            if (gNPuerta == null) {
                gNPuerta = new GestionNumPuerta();

            }
        } catch (Exception e) {
        }

        try {
            gBoleto = (GestionBoleto) AdminSerializacion.de_serealizacion("gBoleto.obj");
            if (gBoleto == null) {
                gBoleto = new GestionBoleto();

            }
        } catch (Exception e) {
        }

        try {
            gFactura = (GestionFactura) AdminSerializacion.de_serealizacion("gFactura.obj");
            if (gFactura == null) {
                gFactura = new GestionFactura();

            }
        } catch (Exception e) {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/test.jpg"));
        Image img=icon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g)
            {
                g.drawImage(img,0,0,getWidth(),
                    getHeight(),this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mnuBoletos = new javax.swing.JMenuItem();
        mnuCiudades = new javax.swing.JMenu();
        mnuDestino = new javax.swing.JMenuItem();
        mnuOrigen = new javax.swing.JMenuItem();
        mnuPersona = new javax.swing.JMenu();
        mnuCliente = new javax.swing.JMenuItem();
        mnuPasajero = new javax.swing.JMenuItem();
        mnuAsesor = new javax.swing.JMenuItem();
        mnuFecha = new javax.swing.JMenuItem();
        mnuHoraAbordaje = new javax.swing.JMenuItem();
        mnuCategVuelo = new javax.swing.JMenuItem();
        mnuAsiento = new javax.swing.JMenuItem();
        mnuNumPuerta = new javax.swing.JMenuItem();
        mnuAerolinea = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        btnFacturacion = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Gestion");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        mnuBoletos.setMnemonic('o');
        mnuBoletos.setText("Boletos");
        mnuBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBoletosActionPerformed(evt);
            }
        });
        fileMenu.add(mnuBoletos);

        mnuCiudades.setText("Ciudades");

        mnuDestino.setText("Ciudad de Destino");
        mnuDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDestinoActionPerformed(evt);
            }
        });
        mnuCiudades.add(mnuDestino);

        mnuOrigen.setText("Ciudad de Origen");
        mnuOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOrigenActionPerformed(evt);
            }
        });
        mnuCiudades.add(mnuOrigen);

        fileMenu.add(mnuCiudades);

        mnuPersona.setText("Persona");

        mnuCliente.setText("Cliente");
        mnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClienteActionPerformed(evt);
            }
        });
        mnuPersona.add(mnuCliente);

        mnuPasajero.setText("Pasajero");
        mnuPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPasajeroActionPerformed(evt);
            }
        });
        mnuPersona.add(mnuPasajero);

        mnuAsesor.setText("Asesor de Servicio");
        mnuAsesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsesorActionPerformed(evt);
            }
        });
        mnuPersona.add(mnuAsesor);

        fileMenu.add(mnuPersona);

        mnuFecha.setText("Fecha");
        mnuFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFechaActionPerformed(evt);
            }
        });
        fileMenu.add(mnuFecha);

        mnuHoraAbordaje.setText("Hora de Abordaje");
        mnuHoraAbordaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHoraAbordajeActionPerformed(evt);
            }
        });
        fileMenu.add(mnuHoraAbordaje);

        mnuCategVuelo.setText("Categoria de Vuelo");
        mnuCategVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCategVueloActionPerformed(evt);
            }
        });
        fileMenu.add(mnuCategVuelo);

        mnuAsiento.setText("Asiento");
        mnuAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAsientoActionPerformed(evt);
            }
        });
        fileMenu.add(mnuAsiento);

        mnuNumPuerta.setText("Número de Puerta");
        mnuNumPuerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNumPuertaActionPerformed(evt);
            }
        });
        fileMenu.add(mnuNumPuerta);

        mnuAerolinea.setText("Aerolinea");
        mnuAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAerolineaActionPerformed(evt);
            }
        });
        fileMenu.add(mnuAerolinea);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Facturas");

        btnFacturacion.setText("Facturación");
        btnFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturacionActionPerformed(evt);
            }
        });
        editMenu.add(btnFacturacion);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuActionPerformed

    private void mnuBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBoletosActionPerformed
        // TODO add your handling code here:
        FrmBoleto frm1 = new FrmBoleto();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuBoletosActionPerformed

    private void mnuOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOrigenActionPerformed
        // TODO add your handling code here:
        FrmOrigen frm1 = new FrmOrigen();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuOrigenActionPerformed


    private void mnuPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPasajeroActionPerformed
        // TODO add your handling code here:
        FrmPasajero frm1 = new FrmPasajero();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuPasajeroActionPerformed

    private void mnuDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDestinoActionPerformed
        // TODO add your handling code here:
        FrmDestino frm1 = new FrmDestino();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuDestinoActionPerformed

    private void mnuAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAerolineaActionPerformed
        // TODO add your handling code here:
        FrmAerolinea frm1 = new FrmAerolinea();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuAerolineaActionPerformed

    private void mnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClienteActionPerformed
        // TODO add your handling code here:
        FrmCliente frm1 = new FrmCliente();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuClienteActionPerformed

    private void mnuAsesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsesorActionPerformed
        // TODO add your handling code here:
        FrmAsesorServ frm1 = new FrmAsesorServ();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuAsesorActionPerformed

    private void mnuHoraAbordajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHoraAbordajeActionPerformed
        // TODO add your handling code here:
        FrmHoraAbordaje frm1 = new FrmHoraAbordaje();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuHoraAbordajeActionPerformed

    private void mnuAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAsientoActionPerformed
        // TODO add your handling code here:
        FrmAsiento frm1 = new FrmAsiento();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuAsientoActionPerformed

    private void mnuCategVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCategVueloActionPerformed
        // TODO add your handling code here:
        FrmCategVuelo frm1 = new FrmCategVuelo();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuCategVueloActionPerformed

    private void mnuNumPuertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNumPuertaActionPerformed
        // TODO add your handling code here:
        FrmNumPuerta frm1 = new FrmNumPuerta();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuNumPuertaActionPerformed

    private void mnuFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFechaActionPerformed
        // TODO add your handling code here:
        FrmFecha frm1 = new FrmFecha();

        Dimension JInternal = frm1.getSize(); //dimension de frame
        Dimension desktopSize = this.getSize();
        frm1.setLocation((desktopSize.width - JInternal.width) / 2, (desktopSize.height - JInternal.height) / 2);

        frm1.setVisible(true);
        this.desktopPane.add(frm1);
    }//GEN-LAST:event_mnuFechaActionPerformed

    private void btnFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturacionActionPerformed
        // TODO add your handling code here:
        Dimension jInternal = frmFacturacion.getSize(); //Dimensión de mi formulario interno
        Dimension desktopSize = this.getSize(); //Dimensiones de mi desktop
        frmFacturacion.setLocation((desktopSize.width - jInternal.width) / 2, (desktopSize.height - jInternal.height) / 2);
        this.desktopPane.add(frmFacturacion);
        frmFacturacion.setVisible(true);
    }//GEN-LAST:event_btnFacturacionActionPerformed

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
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem btnFacturacion;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuAerolinea;
    private javax.swing.JMenuItem mnuAsesor;
    private javax.swing.JMenuItem mnuAsiento;
    private javax.swing.JMenuItem mnuBoletos;
    private javax.swing.JMenuItem mnuCategVuelo;
    private javax.swing.JMenu mnuCiudades;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenuItem mnuDestino;
    private javax.swing.JMenuItem mnuFecha;
    private javax.swing.JMenuItem mnuHoraAbordaje;
    private javax.swing.JMenuItem mnuNumPuerta;
    private javax.swing.JMenuItem mnuOrigen;
    private javax.swing.JMenuItem mnuPasajero;
    private javax.swing.JMenu mnuPersona;
    // End of variables declaration//GEN-END:variables

}
