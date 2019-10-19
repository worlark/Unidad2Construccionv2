/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaUsuario;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xebae
 */
public class PanelDeOpciones extends javax.swing.JPanel {

    /**
     * Creates new form PabelDeOpciones
     */
    
    private VentanaPrincipalUsuario papa;
    
    public PanelDeOpciones(VentanaPrincipalUsuario papa) {
        this.papa=papa;
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        botonCerrarSesion = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        botonModificarCuenta = new javax.swing.JPanel();
        botonListaDeEventos = new javax.swing.JLabel();
        botonContactenos = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        botonEliminarCuenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botoListaDeEventos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonHome1 = new javax.swing.JPanel();
        botonListaDeEventos2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/icons8-conocimiento-del-cliente-50 (1).png"))); // NOI18N
        jLabel21.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setText("Cliente");

        botonCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        botonCerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botonCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarSesionMouseClicked(evt);
            }
        });
        botonCerrarSesion.setLayout(new java.awt.GridBagLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Cerrar sesión");
        botonCerrarSesion.add(jLabel20, new java.awt.GridBagConstraints());

        botonModificarCuenta.setBackground(new java.awt.Color(255, 255, 255));
        botonModificarCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botonModificarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarCuentaMouseClicked(evt);
            }
        });
        botonModificarCuenta.setLayout(new java.awt.GridBagLayout());

        botonListaDeEventos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonListaDeEventos.setText("Modificar cuenta");
        botonModificarCuenta.add(botonListaDeEventos, new java.awt.GridBagConstraints());

        botonContactenos.setBackground(new java.awt.Color(0, 0, 0));
        botonContactenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonContactenosMouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nosotros");

        javax.swing.GroupLayout botonContactenosLayout = new javax.swing.GroupLayout(botonContactenos);
        botonContactenos.setLayout(botonContactenosLayout);
        botonContactenosLayout.setHorizontalGroup(
            botonContactenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonContactenosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonContactenosLayout.setVerticalGroup(
            botonContactenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonContactenosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonEliminarCuenta.setBackground(new java.awt.Color(255, 255, 255));
        botonEliminarCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botonEliminarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarCuentaMouseClicked(evt);
            }
        });
        botonEliminarCuenta.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Eliminar cuenta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 104, 12, 114);
        botonEliminarCuenta.add(jLabel1, gridBagConstraints);

        botoListaDeEventos.setBackground(new java.awt.Color(255, 255, 255));
        botoListaDeEventos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botoListaDeEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoListaDeEventosMouseClicked(evt);
            }
        });
        botoListaDeEventos.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Lista de eventos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 105, 12, 115);
        botoListaDeEventos.add(jLabel2, gridBagConstraints);

        botonHome1.setBackground(new java.awt.Color(255, 255, 255));
        botonHome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botonHome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonHome1MouseClicked(evt);
            }
        });
        botonHome1.setLayout(new java.awt.GridBagLayout());

        botonListaDeEventos2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonListaDeEventos2.setText("EvenTinder");
        botonHome1.add(botonListaDeEventos2, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonHome1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botoListaDeEventos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(botonContactenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(botonHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonModificarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoListaDeEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 493, Short.MAX_VALUE)
                .addComponent(botonContactenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarCuentaMouseClicked
        try {
            // TODO add your handling code here:
            this.papa.modificarCuenta();
        } catch (SQLException ex) {
            Logger.getLogger(PanelDeOpciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonModificarCuentaMouseClicked

    private void botonCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarSesionMouseClicked
        // TODO add your handling code here:
        this.papa.cerrarSesion();
    }//GEN-LAST:event_botonCerrarSesionMouseClicked

    private void botonContactenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonContactenosMouseClicked
        // TODO add your handling code here:
        this.papa.ventanaContactenos();
    }//GEN-LAST:event_botonContactenosMouseClicked

    private void botonEliminarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarCuentaMouseClicked
        // TODO add your handling code here:
        this.papa.eliminarCuenta();
    }//GEN-LAST:event_botonEliminarCuentaMouseClicked

    private void botoListaDeEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoListaDeEventosMouseClicked
        // TODO add your handling code here:
        this.papa.listaDeEventos();
    }//GEN-LAST:event_botoListaDeEventosMouseClicked

    private void botonHome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHome1MouseClicked
        // TODO add your handling code here:
        this.papa.ventanaHome();
    }//GEN-LAST:event_botonHome1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoListaDeEventos;
    private javax.swing.JPanel botonCerrarSesion;
    private javax.swing.JPanel botonContactenos;
    private javax.swing.JPanel botonEliminarCuenta;
    private javax.swing.JPanel botonHome1;
    private javax.swing.JLabel botonListaDeEventos;
    private javax.swing.JLabel botonListaDeEventos2;
    private javax.swing.JPanel botonModificarCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    // End of variables declaration//GEN-END:variables
}
