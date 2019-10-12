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
        this.actualizarMenuOpciones();
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
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTipoUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        listaTipoUsuario = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        clave = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tarjetaDeCredito = new javax.swing.JTextField();
        rut = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        numeroTelefonico = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CuentaBancaria = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();

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
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Creación de usuario");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        labelTipoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("1. Seleccione el tipo de usuario que quiere crear");

        listaTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTipoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(listaTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(listaTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(243, 243, 243));

        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre completo");

        jLabel12.setText("Rut");

        jLabel17.setText("Cuenta bancaria");

        jLabel13.setText("Clave");

        jLabel14.setText("N° Telefónico");

        jLabel15.setText("Correo Electrónico");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("2. Ingrese los siguientes datos");

        jLabel16.setText("Tarjeta de crédito");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CuentaBancaria)
                                    .addComponent(tarjetaDeCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(numeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tarjetaDeCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(CuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonRegistrar)
                            .addComponent(labelTipoUsuario))))
                .addContainerGap(773, Short.MAX_VALUE))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonRegistrar)
                        .addGap(61, 61, 61)
                        .addComponent(labelTipoUsuario)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
        int resp = this.validarResgistro(this.tipoUsuario, this.nombre.getText(), this.rut.getText(), this.clave.getText(), this.numeroTelefonico.getText(), this.correoElectronico.getText(),this.tarjetaDeCredito.getText() , this.CuentaBancaria.getText());
        if(resp==0){
            boolean respuesta = false;
            try {
                if("cliente".equals(this.tipoUsuario) || "organizador".equals(this.tipoUsuario)){
                    respuesta = this.papa.getControlador().crearUsuario(this.tipoUsuario, this.nombre.getText(), this.rut.getText(), this.clave.getText(), this.numeroTelefonico.getText(), this.correoElectronico.getText(),this.tarjetaDeCredito.getText());
                }
                if("propietario".equals(this.tipoUsuario)){
                    respuesta = this.papa.getControlador().crearUsuario(this.tipoUsuario, this.nombre.getText(), this.rut.getText(), this.clave.getText(), this.numeroTelefonico.getText(), this.correoElectronico.getText(),this.CuentaBancaria.getText());
                }
            
            
            } catch (SQLException ex) {
                Logger.getLogger(PanelCreacionUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(respuesta){
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                this.nombre.setText("");
                this.rut.setText("");
                this.clave.setText("");
                this.numeroTelefonico.setText("");
                this.correoElectronico.setText("");
                this.tarjetaDeCredito.setText("");
                this.CuentaBancaria.setText("");
                this.botonRegistrar.setText("Registrar");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo registrado en el sistema");
            }
        }
        if(resp==1){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de usuario", "Error al seleccionar el tipo de usuario", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==2){
            JOptionPane.showMessageDialog(null, "Se espera que el nombre sea solo letras \n"
                    + "Ej: Daniel Moreno", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==3){
            JOptionPane.showMessageDialog(null, "Se espera que el rut tenga entre entre sea: nnn nnn nnn - nok \n" + 
                    "Ej: 11111111-1", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==4){
            JOptionPane.showMessageDialog(null, "Se espera que la clave tenga minimo 8 digitos \n" + 
                    "Ej: 12345678", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==5){
            JOptionPane.showMessageDialog(null, "Se espera que el numero telefonico tenga 9 digitos \n" + 
                    "Ej: 987654321", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==6){
            JOptionPane.showMessageDialog(null, "Se espera que el correo electronico sea algo@gmail.com o sea algo@gmail.cl \n" + 
                    "Ej: elmejorproyectodelmundo@gmail.cl", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==7){
            JOptionPane.showMessageDialog(null, "Se espera que la tarjeta de credito tenga 14 digitos \n" + 
                    "Ej: 12345678901234", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==8){
            JOptionPane.showMessageDialog(null, "Se espera que la cuenta bancaria algo \n" + 
                    "Ej: no se como valido esto", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed

    private void listaTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTipoUsuarioActionPerformed
        // TODO add your handling code here:
        if(this.listaTipoUsuario.getSelectedIndex()==-1){
            return;
        }
        if(this.listaTipoUsuario.getSelectedIndex()==0){
            this.tipoUsuario="cliente";
            this.nombre.setEnabled(true);
            this.rut.setEnabled(true);
            this.clave.setEnabled(true);
            this.correoElectronico.setEnabled(true);
            this.numeroTelefonico.setEnabled(true);
            this.tarjetaDeCredito.setEnabled(true);
            this.CuentaBancaria.setEnabled(false);
        }
        if(this.listaTipoUsuario.getSelectedIndex()==1){
            this.tipoUsuario="organizador";
            this.nombre.setEnabled(true);
            this.rut.setEnabled(true);
            this.clave.setEnabled(true);
            this.correoElectronico.setEnabled(true);
            this.numeroTelefonico.setEnabled(true);
            this.tarjetaDeCredito.setEnabled(true);
            this.CuentaBancaria.setEnabled(false);
        }
        if(this.listaTipoUsuario.getSelectedIndex()==2){
            this.tipoUsuario="propietario";
            this.nombre.setEnabled(true);
            this.rut.setEnabled(true);
            this.clave.setEnabled(true);
            this.correoElectronico.setEnabled(true);
            this.numeroTelefonico.setEnabled(true);
            this.tarjetaDeCredito.setEnabled(false);
            this.CuentaBancaria.setEnabled(true);
        }
        
    }//GEN-LAST:event_listaTipoUsuarioActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CuentaBancaria;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelTipoUsuario;
    private javax.swing.JComboBox<String> listaTipoUsuario;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numeroTelefonico;
    private javax.swing.JTextField rut;
    private javax.swing.JTextField tarjetaDeCredito;
    // End of variables declaration//GEN-END:variables

    //Aca abajo van a estar los metodos que se tienen que hacer 
    
    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */

            /* 0 es ok
    1 falta tipoUsuario
    2 falta nombre
    3 falta rut
    4 falta clave
    5 falta numeroTelefonico
    6 falta correoElectronico
    7 falta tarjetaDeCredito
    8 falta CuentaBancaria 
    */
    
    /**
     * 
     * @param tipoUsuario
     * @param rut
     * @param clave
     * @param numeroTelefonico
     * @param correoElectronico
     * @param tarjetaDeCredito
     * @param CuentaBancaria
     * @return 
     */
    public int validarResgistro(String tipoUsuario, String nombre, String rut, String clave, String numeroTelefonico, String correoElectronico, String tarjetaDeCredito, String CuentaBancaria) {                                               
        
        if(!"".equals(nombre)){
            char[] aux = nombre.toCharArray();
            for(char c : aux){                
                int ascii = (int) c;
                if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || ascii == 32 )){
                    return 2;
                }
            }            
        }
        else{
            return 2;
        }
        if(!"".equals(rut)){
            boolean validacion = false;
            try {
                rut =  rut.toUpperCase();
                rut = rut.replace(".", "");
                rut = rut.replace("-", "");
                int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

                char dv = rut.charAt(rut.length() - 1);

                int m = 0, s = 1;
                for (; rutAux != 0; rutAux /= 10) {
                    s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
                }
                if (dv == (char) (s != 0 ? s + 47 : 75)) {
                    validacion = true;
                }
            } 
            catch (java.lang.NumberFormatException e) {
            } 
            catch (Exception e) {
            }
            if(!validacion){
                return 3;
            }
        }
        else{
            return 3;
        }
        if(!"".equals(clave)){
            char[] aux = clave.toCharArray();
            for(char c : aux){
                int ascii = (int) c;
                if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || (ascii >=48 && ascii <=57) )){
                    return 4;
                }
            }
            if(aux.length <8){
                return 4;
            }
        }
        else{
            return 4;
        }
        if(!"".equals(numeroTelefonico)){
            char[] aux = numeroTelefonico.toCharArray();
            for(char c : aux){
                int ascii = (int) c;
                if( !((ascii >=48 && ascii <=57) )){
                    return 5;
                }
            }
            if(aux.length != 9){
                return 5;
            }
        }
        else{
            return 5;
        }
        if(!"".equals(correoElectronico)){
            if(correoElectronico.contains("@")){
                String[] arroba = correoElectronico.split("@");
                if(arroba.length == 2 && !arroba[0].equals("")){
                    char[] inicio= arroba[0].toCharArray();
                    for(char c : inicio){
                        int ascii = (int) c;
                        if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || (ascii >=48 && ascii <=57) )){
                            return 6;
                        }
                    }                    
                    String[] puntos = arroba[1].split("\\.");                    
                    if((puntos.length == 2 || puntos.length == 3) && !puntos[0].equals("") && !puntos[1].equals("")){   
                        if("cl".equals(puntos[puntos.length-1])){                            
                            int i = 0;
                            while(i < puntos.length-1){
                                char[] dominio = puntos[i].toCharArray();
                                for(char c : dominio){
                                    int ascii = (int) c;
                                    if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) )){
                                        return 6;
                                    }
                                }
                                i++;
                            }
                        }
                        else{
                            return 6;
                        }
                    }
                    else{                        
                        return 6;
                    }
                }       
                else{
                    return 6;
                }
            }
            else{
                return 6;
            }            
        }
        else{
            return 6;
        }
        if("organizador".equals(tipoUsuario) || "cliente".equals(tipoUsuario)){
            if(!"".equals(tarjetaDeCredito)){
                tarjetaDeCredito = tarjetaDeCredito.replace(" ", "");
                char[] aux = tarjetaDeCredito.toCharArray();                
                for(char c : aux){
                    int ascii = (int) c;
                    if( !((ascii >=48 && ascii <=57) )){
                        return 7;
                    }
                }
                if(aux.length !=16){
                    return 7;
                }                                                    
            }
            else{
                return 7;
            }            
        }
        if("propietario".equals(tipoUsuario)){
            if(!"".equals(CuentaBancaria)){
                
            }
            else{
                return 8;
            }
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
