/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaUsuario;

/**
 *
 * @author xebae
 */
public class VentanaPrincipalUsuario extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipalUsuario
     */
    public VentanaPrincipalUsuario() {
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

        menuAtajos = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        botonDetallesDeLaCuenta = new javax.swing.JMenuItem();
        botonModificarCuenta = new javax.swing.JMenuItem();
        botonEliminarCuenta = new javax.swing.JMenuItem();
        botonCerrarSesion = new javax.swing.JMenuItem();
        listaDeEventos = new javax.swing.JMenu();
        botonListaDeEventos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 800));

        jMenu1.setText("Cuenta");

        botonDetallesDeLaCuenta.setText("Detalles de la cuenta");
        botonDetallesDeLaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetallesDeLaCuentaActionPerformed(evt);
            }
        });
        jMenu1.add(botonDetallesDeLaCuenta);

        botonModificarCuenta.setText("Modificar cuenta");
        botonModificarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarCuentaActionPerformed(evt);
            }
        });
        jMenu1.add(botonModificarCuenta);

        botonEliminarCuenta.setText("Eliminar cuenta");
        botonEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCuentaActionPerformed(evt);
            }
        });
        jMenu1.add(botonEliminarCuenta);

        botonCerrarSesion.setText("Cerrar sesion");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(botonCerrarSesion);

        menuAtajos.add(jMenu1);

        listaDeEventos.setText("Eventos");

        botonListaDeEventos.setText("Lista de eventos");
        botonListaDeEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaDeEventosActionPerformed(evt);
            }
        });
        listaDeEventos.add(botonListaDeEventos);

        menuAtajos.add(listaDeEventos);

        setJMenuBar(menuAtajos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDetallesDeLaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetallesDeLaCuentaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_botonDetallesDeLaCuentaActionPerformed

    private void botonModificarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarCuentaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_botonModificarCuentaActionPerformed

    private void botonListaDeEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaDeEventosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_botonListaDeEventosActionPerformed

    private void botonEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarCuentaActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCerrarSesionActionPerformed


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
            java.util.logging.Logger.getLogger(VentanaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipalUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botonCerrarSesion;
    private javax.swing.JMenuItem botonDetallesDeLaCuenta;
    private javax.swing.JMenuItem botonEliminarCuenta;
    private javax.swing.JMenuItem botonListaDeEventos;
    private javax.swing.JMenuItem botonModificarCuenta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu listaDeEventos;
    private javax.swing.JMenuBar menuAtajos;
    // End of variables declaration//GEN-END:variables
}
