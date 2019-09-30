/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaPrincipal;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelCreacionUsuario extends javax.swing.JPanel {

    /**
     * Creates new form VistaCreacionUsuario
     */
    
    private VentanaPrincipal papa;
    private String tipoUsuario="";
    
    
    public PanelCreacionUsuario(VentanaPrincipal papa) {
        this.papa=papa;
        initComponents();
        this.nombre.setEnabled(false);
        this.rut.setEnabled(false);
        this.clave.setEnabled(false);
        this.correoElectronico.setEnabled(false);
        this.numeroTelefonico.setEnabled(false);
        this.tarjetaDeCredito.setEnabled(false);
        this.CuentaBancaria.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tarjetaDeCredito = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        rut = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        numeroTelefonico = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CuentaBancaria = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        botonPropietario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        botonOrganizador = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setText("Tarjeta de crédito");

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        jLabel17.setText("Cuenta bancaria");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Creación de usuario");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("2. Ingrese los siguientes datos");

        jLabel5.setText("Nombre completo");

        botonCliente.setText("Cliente");
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("1. Seleccione el tipo de usuario que quiere crear");

        jLabel12.setText("Rut");

        botonPropietario.setText("Propietario");
        botonPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPropietarioActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jLabel13.setText("Clave");

        botonOrganizador.setText("Organizador");
        botonOrganizador.setMinimumSize(new java.awt.Dimension(100, 23));
        botonOrganizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrganizadorActionPerformed(evt);
            }
        });

        jLabel14.setText("N° Telefónico");

        jLabel15.setText("Correo Electrónico");

        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel3)
                    .addComponent(jLabel18)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonRegistrar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CuentaBancaria)
                                        .addComponent(tarjetaDeCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(775, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonCliente)
                            .addComponent(botonPropietario)
                            .addComponent(botonOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(numeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tarjetaDeCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(CuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonRegistrar)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOrganizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrganizadorActionPerformed
        // TODO add your handling code here:
        this.tipoUsuario="organizador";
        this.nombre.setEnabled(true);
        this.rut.setEnabled(true);
        this.clave.setEnabled(true);
        this.correoElectronico.setEnabled(true);
        this.numeroTelefonico.setEnabled(true);
        this.tarjetaDeCredito.setEnabled(true);
        this.CuentaBancaria.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Usuario Organizador");

    }//GEN-LAST:event_botonOrganizadorActionPerformed

    private void botonPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPropietarioActionPerformed
        // TODO add your handling code here:
        this.tipoUsuario="propietario";
        this.nombre.setEnabled(true);
        this.rut.setEnabled(true);
        this.clave.setEnabled(true);
        this.correoElectronico.setEnabled(true);
        this.numeroTelefonico.setEnabled(true);
        this.tarjetaDeCredito.setEnabled(false);
        this.CuentaBancaria.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Usuario Propietario");
    }//GEN-LAST:event_botonPropietarioActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        // TODO add your handling code here:
        this.tipoUsuario="cliente";
        this.nombre.setEnabled(true);
        this.rut.setEnabled(true);
        this.clave.setEnabled(true);
        this.correoElectronico.setEnabled(true);
        this.numeroTelefonico.setEnabled(true);
        this.tarjetaDeCredito.setEnabled(true);
        this.CuentaBancaria.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Usuario cliente");
    }//GEN-LAST:event_botonClienteActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
        if("".equals(this.tipoUsuario)){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de usuario", "Error al seleccionar el tipo de usuario", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("".equals(this.nombre.getText())){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Nombre completo", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("".equals(this.rut.getText())){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Rut", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("".equals(this.clave.getText())){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Clave", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("".equals(this.numeroTelefonico.getText())){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Numero Telefonico", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("".equals(this.correoElectronico.getText())){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Correo Electronico", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("organizador".equals(this.tipoUsuario) || "cliente".equals(this.tipoUsuario)){
            if("".equals(this.tarjetaDeCredito.getText())){
                JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Tarjeta De Credito", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
                return;
            }
            boolean respuesta = false;
            try {
                respuesta = this.papa.getControlador().crearUsuario(this.tipoUsuario, this.nombre.getText(), this.rut.getText(), this.clave.getText(), this.numeroTelefonico.getText(), this.correoElectronico.getText(), this.tarjetaDeCredito.getText());
            } catch (SQLException ex) {
                Logger.getLogger(PanelCreacionUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(respuesta){
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo registrado en el sistema");
            }
        }
        if("propietario".equals(this.tipoUsuario)){
            if("".equals(this.CuentaBancaria.getText())){
                JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Cuenta Bancaria", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
                return;
            }
            boolean respuesta = false;
            try {
                respuesta = this.papa.getControlador().crearUsuario(this.tipoUsuario, this.nombre.getText(), this.rut.getText(), this.clave.getText(), this.numeroTelefonico.getText(), this.correoElectronico.getText(),this.CuentaBancaria.getText());
            } catch (SQLException ex) {
                Logger.getLogger(PanelCreacionUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(respuesta){
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo registrado en el sistema");
            }
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CuentaBancaria;
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonOrganizador;
    private javax.swing.JButton botonPropietario;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numeroTelefonico;
    private javax.swing.JTextField rut;
    private javax.swing.JTextField tarjetaDeCredito;
    // End of variables declaration//GEN-END:variables
}
