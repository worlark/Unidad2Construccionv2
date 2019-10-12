/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaOrganizador;


import ControladorUsuarios.ControladorOrganizador;
import ControladorUsuarios.ControladorPrincipal;
import ControladorUsuarios.ControladorPropietario;
import VistasSistema.VistaPrincipal.PanelNosotros;
import VistasSistema.VistaPrincipal.VentanaPrincipal;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xebae
 */
public class VentanaPrincipalOrganizador extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipalUsuario
     */
    
    private Component componenteAnterior= null;
    private ControladorOrganizador controladorOrganizador;
    private ControladorPropietario controladorPropietario;
    private ControladorPrincipal controladorPrincipal;
    
    
    public VentanaPrincipalOrganizador() throws SQLException {
        this.controladorPropietario= new ControladorPropietario();
        this.controladorOrganizador= new ControladorOrganizador();
        this.controladorPrincipal= new ControladorPrincipal();
        PanelDeOpciones panelDeOpciones=new PanelDeOpciones(this);
        initComponents();
        PanelHome home= new PanelHome();
        getContentPane().add(panelDeOpciones, java.awt.BorderLayout.EAST);
        getContentPane().add(home, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=home;
        this.repaint();
        this.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1024, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void arranque() {
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
            java.util.logging.Logger.getLogger(VentanaPrincipalOrganizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalOrganizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalOrganizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalOrganizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new VentanaPrincipalOrganizador().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaPrincipalOrganizador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    void modificarCuenta() throws SQLException {
        PanelModificarOrganizador modificar = new PanelModificarOrganizador(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(modificar, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=modificar;
        this.repaint();
        this.revalidate();
    }

    void contactenos() {
        
    }

    void eliminarCuenta() {
        PanelEliminarOrganizador eliminar = new PanelEliminarOrganizador(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(eliminar, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=eliminar;
        this.repaint();
        this.revalidate();
    }

    void cerrarSesion() {
        VentanaPrincipal nuevaVentana = new VentanaPrincipal();
        nuevaVentana.arranque();
        this.setVisible(false);
    }

    public ControladorOrganizador getControladorOrganizador() {
        return controladorOrganizador;
    }

    public ControladorPrincipal getControladorPrincipal() {
        return controladorPrincipal;
    }

    public ControladorPropietario getControladorPropietario() {
        return controladorPropietario;
    }

    public void ventanaHome() {
        PanelHome home = new PanelHome();
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(home, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=home;
        this.repaint();
        this.revalidate();
    }

    public void ventanaContactenos() {
        PanelNosotros nosotros = new PanelNosotros();
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(nosotros, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=nosotros;
        this.repaint();
        this.revalidate();
    }

    public void listaDeEventos() {
        PanelMostrarListaEventosOrganizador eventos = new PanelMostrarListaEventosOrganizador(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(eventos, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=eventos;
        this.repaint();
        this.revalidate();
    }

    public void modificarEvento() {
        PanelModificarEvento evento = new PanelModificarEvento(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(evento, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=evento;
        this.repaint();
        this.revalidate();
    }

    public void eliminarEvento() {
        PanelEliminarEvento evento = new PanelEliminarEvento(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(evento, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=evento;
        this.repaint();
        this.revalidate();
    }

    public void listaDeEventosDeOrganizador() {
        PanelMostrarListaEventosOrganizador eventos = new PanelMostrarListaEventosOrganizador(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(eventos, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=eventos;
        this.repaint();
        this.revalidate();
    }

    public  void estadisticasDeVentasPorEvento() {
        PanelMostrarEstadisticasDeVentasPorEvento evento = new PanelMostrarEstadisticasDeVentasPorEvento();
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(evento, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=evento;
        this.repaint();
        this.revalidate();
    }

    public void crearEvento() {
        PanelCrearEvento evento = new PanelCrearEvento(this);
        getContentPane().remove(this.componenteAnterior);
        getContentPane().add(evento, java.awt.BorderLayout.CENTER);
        this.componenteAnterior=evento;
        this.repaint();
        this.revalidate();
    }
    
}
