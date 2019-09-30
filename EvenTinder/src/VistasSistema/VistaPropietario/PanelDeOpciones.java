/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaPropietario;

/**
 *
 * @author xebae
 */
public class PanelDeOpciones extends javax.swing.JPanel {

    /**
     * Creates new form PabelDeOpciones
     */
    
    private VentanaPrincipalPropietario papa;
    
    public PanelDeOpciones(VentanaPrincipalPropietario papa) {
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
        botoCrearPropiedad = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonHome1 = new javax.swing.JPanel();
        botonListaDeEventos2 = new javax.swing.JLabel();
        botoModificarPropiedad = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botoEliminarPropiedad = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        botoListaDePropiedades = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        botoSolicitudDeEventos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/icons8-propiedad-50 v2.png"))); // NOI18N
        jLabel21.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Propietario");

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

        botoCrearPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        botoCrearPropiedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botoCrearPropiedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoCrearPropiedadMouseClicked(evt);
            }
        });
        botoCrearPropiedad.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Registrar propiedad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 105, 12, 115);
        botoCrearPropiedad.add(jLabel2, gridBagConstraints);

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

        botoModificarPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        botoModificarPropiedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botoModificarPropiedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoModificarPropiedadMouseClicked(evt);
            }
        });
        botoModificarPropiedad.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Modificar propiedad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 105, 12, 115);
        botoModificarPropiedad.add(jLabel3, gridBagConstraints);

        botoEliminarPropiedad.setBackground(new java.awt.Color(255, 255, 255));
        botoEliminarPropiedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botoEliminarPropiedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoEliminarPropiedadMouseClicked(evt);
            }
        });
        botoEliminarPropiedad.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Eliminar propiedad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 105, 12, 115);
        botoEliminarPropiedad.add(jLabel4, gridBagConstraints);

        botoListaDePropiedades.setBackground(new java.awt.Color(255, 255, 255));
        botoListaDePropiedades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botoListaDePropiedades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoListaDePropiedadesMouseClicked(evt);
            }
        });
        botoListaDePropiedades.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Lista de propiedades");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 105, 12, 115);
        botoListaDePropiedades.add(jLabel5, gridBagConstraints);

        botoSolicitudDeEventos.setBackground(new java.awt.Color(255, 255, 255));
        botoSolicitudDeEventos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botoSolicitudDeEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoSolicitudDeEventosMouseClicked(evt);
            }
        });
        botoSolicitudDeEventos.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Solicitudes de eventos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 105, 12, 115);
        botoSolicitudDeEventos.add(jLabel6, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(botonContactenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonModificarCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botoSolicitudDeEventos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botoListaDePropiedades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botoEliminarPropiedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botoModificarPropiedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botoCrearPropiedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(105, 105, 105))))
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
                .addGap(43, 43, 43)
                .addComponent(botonHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonModificarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoCrearPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoModificarPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoEliminarPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoListaDePropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoSolicitudDeEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(botonContactenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarCuentaMouseClicked
        // TODO add your handling code here:
        this.papa.modificarCuenta();
    }//GEN-LAST:event_botonModificarCuentaMouseClicked

    private void botonCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarSesionMouseClicked
        // TODO add your handling code here:
        this.papa.cerrarSesion();
    }//GEN-LAST:event_botonCerrarSesionMouseClicked

    private void botonContactenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonContactenosMouseClicked
        // TODO add your handling code here:
        this.papa.contactenos();
    }//GEN-LAST:event_botonContactenosMouseClicked

    private void botonEliminarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarCuentaMouseClicked
        // TODO add your handling code here:
        this.papa.eliminarCuenta();
    }//GEN-LAST:event_botonEliminarCuentaMouseClicked

    private void botoCrearPropiedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoCrearPropiedadMouseClicked
        // TODO add your handling code here:
        this.papa.RegistrarPropiedad();
    }//GEN-LAST:event_botoCrearPropiedadMouseClicked

    private void botonHome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHome1MouseClicked
        // TODO add your handling code here:
        this.papa.ventanaHome();
    }//GEN-LAST:event_botonHome1MouseClicked

    private void botoModificarPropiedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoModificarPropiedadMouseClicked
        // TODO add your handling code here:
        this.papa.ModificarPropiedad();
    }//GEN-LAST:event_botoModificarPropiedadMouseClicked

    private void botoEliminarPropiedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoEliminarPropiedadMouseClicked
        // TODO add your handling code here:
        this.papa.EliminarPropiedad();
    }//GEN-LAST:event_botoEliminarPropiedadMouseClicked

    private void botoListaDePropiedadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoListaDePropiedadesMouseClicked
        // TODO add your handling code here:
        this.papa.ListaDePropiedades();
    }//GEN-LAST:event_botoListaDePropiedadesMouseClicked

    private void botoSolicitudDeEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoSolicitudDeEventosMouseClicked
        // TODO add your handling code here:
        this.papa.SolicitudDeEventos();
    }//GEN-LAST:event_botoSolicitudDeEventosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoCrearPropiedad;
    private javax.swing.JPanel botoEliminarPropiedad;
    private javax.swing.JPanel botoListaDePropiedades;
    private javax.swing.JPanel botoModificarPropiedad;
    private javax.swing.JPanel botoSolicitudDeEventos;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
