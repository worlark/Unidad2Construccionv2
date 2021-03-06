/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaPrincipal;

/**
 *
 * @author xebae
 */
public class PanelDeOpciones extends javax.swing.JPanel {

    /**
     * Creates new form PanelDeOpciones2
     */
    
    private VentanaPrincipal papa;
    
    public PanelDeOpciones(VentanaPrincipal papa) {
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

        botonContactenos = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        botonCrearCuenta = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        botonHome = new javax.swing.JPanel();
        botonListaDeEventos1 = new javax.swing.JLabel();
        botonIniciarSesion = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        botonListaEventos = new javax.swing.JPanel();
        botonListaDeEventos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        botonContactenos.setBackground(new java.awt.Color(0, 0, 0));
        botonContactenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonContactenosMouseClicked(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nosotros");

        javax.swing.GroupLayout botonContactenosLayout = new javax.swing.GroupLayout(botonContactenos);
        botonContactenos.setLayout(botonContactenosLayout);
        botonContactenosLayout.setHorizontalGroup(
            botonContactenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonContactenosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonContactenosLayout.setVerticalGroup(
            botonContactenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonContactenosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonCrearCuenta.setBackground(new java.awt.Color(255, 255, 255));
        botonCrearCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botonCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearCuentaMouseClicked(evt);
            }
        });
        botonCrearCuenta.setLayout(new java.awt.GridBagLayout());

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Crear cuenta");
        botonCrearCuenta.add(jLabel17, new java.awt.GridBagConstraints());

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setText("Usuario invitado");

        botonHome.setBackground(new java.awt.Color(255, 255, 255));
        botonHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonHomeMouseClicked(evt);
            }
        });
        botonHome.setLayout(new java.awt.GridBagLayout());

        botonListaDeEventos1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonListaDeEventos1.setText("EvenTinder");
        botonHome.add(botonListaDeEventos1, new java.awt.GridBagConstraints());

        botonIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        botonIniciarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMouseClicked(evt);
            }
        });
        botonIniciarSesion.setLayout(new java.awt.GridBagLayout());

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("Iniciar sesion");
        botonIniciarSesion.add(jLabel18, new java.awt.GridBagConstraints());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/icons8-decisión-50 (1).png"))); // NOI18N
        jLabel19.setToolTipText("");

        botonListaEventos.setBackground(new java.awt.Color(255, 255, 255));
        botonListaEventos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        botonListaEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonListaEventosMouseClicked(evt);
            }
        });
        botonListaEventos.setLayout(new java.awt.GridBagLayout());

        botonListaDeEventos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonListaDeEventos.setText("Lista de eventos");
        botonListaEventos.add(botonListaDeEventos, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(botonListaEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(botonCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(botonContactenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(52, 52, 52)
                .addComponent(botonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonListaEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 520, Short.MAX_VALUE)
                .addComponent(botonContactenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonContactenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonContactenosMouseClicked
        // TODO add your handling code here:
        this.papa.ventanaContactenos();
    }//GEN-LAST:event_botonContactenosMouseClicked

    private void botonCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearCuentaMouseClicked
        // TODO add your handling code here:
        this.papa.ventanaCrearUsuario();
    }//GEN-LAST:event_botonCrearCuentaMouseClicked

    private void botonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHomeMouseClicked
        // TODO add your handling code here:
        this.papa.ventanaHome();
    }//GEN-LAST:event_botonHomeMouseClicked

    private void botonIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseClicked
        // TODO add your handling code here:
        this.papa.ventanaInicioSesion();
    }//GEN-LAST:event_botonIniciarSesionMouseClicked

    private void botonListaEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListaEventosMouseClicked
        // TODO add your handling code here:
        this.papa.ventanaListaEventos();
    }//GEN-LAST:event_botonListaEventosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonContactenos;
    private javax.swing.JPanel botonCrearCuenta;
    private javax.swing.JPanel botonHome;
    private javax.swing.JPanel botonIniciarSesion;
    private javax.swing.JLabel botonListaDeEventos;
    private javax.swing.JLabel botonListaDeEventos1;
    private javax.swing.JPanel botonListaEventos;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    // End of variables declaration//GEN-END:variables
}
