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
public class PanelInicioSesion extends javax.swing.JPanel {

    /**
     * Creates new form VistaInicioSesion
     */
    
    private VentanaPrincipal papa;
    private String tipoUsuario="";
    
    
    public PanelInicioSesion(VentanaPrincipal papa) {
        this.papa=papa;
        initComponents();
        this.actualizarMenuOpciones();
    }
    
    public PanelInicioSesion() {
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

        jLabel13 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        botonIniciarSesion = new javax.swing.JButton();
        rut = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelTipoUsuario = new javax.swing.JLabel();
        listaTipoUsuario = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel13.setText("Clave");

        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });

        botonIniciarSesion.setText("Iniciar Sesion");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Inicio de sesión");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("2. Ingrese los siguientes datos");

        jLabel12.setText("Rut");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("1. Seleccione el tipo de usuario con el que quiere ingresar");

        labelTipoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        listaTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTipoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel1)
                            .addComponent(listaTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonIniciarSesion)
                                .addGap(18, 18, 18)
                                .addComponent(labelTipoUsuario)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(listaTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonIniciarSesion)
                    .addComponent(labelTipoUsuario))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_claveActionPerformed

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        int resp = validarDatosIniciarSesion(this.tipoUsuario, this.rut.getText(),this.clave.getText());
        // TODO add your handling code here:
        if(resp==0){
            boolean respuesta = false;
            try {
                respuesta = this.papa.getControlador().solicitudDeAcceso(tipoUsuario, this.rut.getText(), this.clave.getText());
            } catch (SQLException ex) {
                Logger.getLogger(PanelInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(respuesta){
                if("cliente".equals(this.tipoUsuario)){
                    this.papa.derivarAVentanaPrincipalUsuario();
                }
                if("propietario".equals(this.tipoUsuario)){
                    try {
                        this.papa.derivarAVentanaPrincipalPropietario();
                    } catch (SQLException ex) {
                        Logger.getLogger(PanelInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if("organizador".equals(this.tipoUsuario)){
                    try {
                        this.papa.derivarAVentanaPrincipalOrganizador();
                    } catch (SQLException ex) {
                        Logger.getLogger(PanelInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra registrado en el sistema");
            }
        }
        if(resp==2){
            JOptionPane.showMessageDialog(null, "Se espera que el rut tenga entre entre sea: nnn nnn nnn - nok \n" + 
                    "Ej: 11.111.111-1", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==3){
            JOptionPane.showMessageDialog(null, "Se espera que la clave tenga minimo 8 digitos \n" + 
                    "Ej: 12345678", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp == 1){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de usuario", "Error al seleccionar el tipo de usuario", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void listaTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTipoUsuarioActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(this.listaTipoUsuario.getSelectedIndex()==-1){
            return;
        }
        if(this.listaTipoUsuario.getSelectedIndex()==0){
            this.tipoUsuario="cliente";
        }
        if(this.listaTipoUsuario.getSelectedIndex()==1){
            this.tipoUsuario="organizador";
        }
        if(this.listaTipoUsuario.getSelectedIndex()==2){
            this.tipoUsuario="propietario";
        }
    }//GEN-LAST:event_listaTipoUsuarioActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonIniciarSesion;
    private javax.swing.JTextField clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelTipoUsuario;
    private javax.swing.JComboBox<String> listaTipoUsuario;
    private javax.swing.JTextField rut;
    // End of variables declaration//GEN-END:variables

    //Aca abajo van a estar los metodos que se tienen que hacer 
    
    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */

    /**
     * 
     * @param tipoUsuario
     * @param rut
     * @param clave
     * @return 
     */
    public int validarDatosIniciarSesion(String tipoUsuario, String rut, String clave){
        if("".equals(tipoUsuario)){
            return 1;
        }
        if("".equals(rut)){
            return 2;
        }
        if("".equals(clave)){
            return 3;
        }
        return 0;
    }

    
    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */

    //
    // no se puede hacer tdd ya que necesita otro metodo
    public void actualizarMenuOpciones(){
        this.listaTipoUsuario.removeAllItems();
        this.listaTipoUsuario.addItem("Cliente");
        this.listaTipoUsuario.addItem("Organizador");
        this.listaTipoUsuario.addItem("Propietario");
        this.repaint();
        this.revalidate();
    }
}
