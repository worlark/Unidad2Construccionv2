/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaPrincipal;

import java.sql.SQLException;
import java.util.ArrayList;
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
                    respuesta = this.papa.getControlador().crearUsuario(this.tipoUsuario, this.nombre.getText(), this.rut.getText(), this.correoElectronico.getText(), this.clave.getText(), this.numeroTelefonico.getText(),this.tarjetaDeCredito.getText());
                }
                if("propietario".equals(this.tipoUsuario)){
                    respuesta = this.papa.getControlador().crearUsuario(this.tipoUsuario, this.nombre.getText(), this.rut.getText(), this.correoElectronico.getText(), this.clave.getText(), this.numeroTelefonico.getText(),this.CuentaBancaria.getText());
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
                    "Ej: 11.111.111-1", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Se espera que la tarjeta de credito tenga 16 digitos \n" + 
                    "Ej: 12345678901234", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==8){
            JOptionPane.showMessageDialog(null, "Se espera que la cuenta bancaria tenga 20 digitos \n" + 
                    "Ej: 12345678901234567890", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
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
            this.CuentaBancaria.setText("");
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
            this.CuentaBancaria.setText("");
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
            this.tarjetaDeCredito.setText("");
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
     * Metodo que verifica la correctitud de los datos ingresados en el sistema por el usuario para crear una cuenta.
     * @param tipoUsuario El tipo de usuario que se desea crear.
     * @param rut El rut ingresado.
     * @param clave La clave ingresada.
     * @param numeroTelefonico El numero telefonico ingresado.
     * @param correoElectronico El correo electronico ingresado.
     * @param tarjetaDeCredito La tarjetra de credito ingresada.
     * @param CuentaBancaria La cuenta bancaria ingresada.
     * @return Un numero que indica cual de los datos ingresados esta erroneo.
     */
    public int validarResgistro(String tipoUsuario, String nombre, String rut, String clave, String numeroTelefonico, String correoElectronico, String tarjetaDeCredito, String CuentaBancaria) {                                               
        ArrayList<Integer> caracteres = new ArrayList();
        caracteres.add(193);
        caracteres.add(201);
        caracteres.add(205);
        caracteres.add(211);
        caracteres.add(218);
        caracteres.add(225);
        caracteres.add(233);
        caracteres.add(237);
        caracteres.add(243);
        caracteres.add(250);
        caracteres.add(209);
        caracteres.add(241);
        caracteres.add(32);
        //Nombre con letras mayusculas, minusculas, tildes, y n con colita.
        if(!"".equals(nombre)){
            char[] aux = nombre.toCharArray();
            for(char c : aux){                
                int ascii = (int) c;
                System.out.println(ascii);
                if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || caracteres.contains(ascii)  )   ){
                    return 2;
                }
            }    
            if(aux.length >=100){
                return 2;
            }
        }
        else{
            return 2;
        }
        //rut con el formato 12.345.678-9, acepta k y 0 en el digito verificador.
        if(!"".equals(rut)){
            String[] guion = rut.split("-");
            if(guion.length == 2){
                char[] digVerificador = guion[1].toCharArray();
                if(digVerificador.length == 1){
                    if(!(( digVerificador[0] >=48 && digVerificador[0]<=57)  || digVerificador[0]==   107 || digVerificador[0] == 75 )){
                        System.out.println("digito verificador invalido");
                        return 3;
                    }                                         
                }
                else{
                    System.out.println("largo digito verificador invalido");
                    return 3;
                }                
                if( (guion[0].charAt(guion[0].length()-4 ) == '.')  && (guion[0].charAt(guion[0].length()-8 ) == '.') ){
                    String[] puntos = guion[0].split("\\.");
                    char[] puntos1 = puntos[0].toCharArray();
                    char[] puntos2 = puntos[1].toCharArray();
                    char[] puntos3 = puntos[2].toCharArray();
                    if(puntos.length == 3 && puntos2.length == 3 && puntos3.length ==3 && puntos1.length >=1 && puntos1.length <=3){                                  
                        char[] numeros = guion[0].replace(".","").toCharArray();                           
                        if(numeros.length >=7 && numeros.length <=9 && !guion[0].startsWith("0") && !guion[0].startsWith("00") && !guion[0].startsWith("000")){
                            for(char c:numeros){                                
                                if( !(c>=48 && c<=57) ){
                                    return 3;
                                }
                            }
                        }
                        else{
                            System.out.println("numeros muy grandes");
                            return 3;
                        }
                    }
                    else{
                        System.out.println("error de puntuacion");
                        return 3;
                    } 
                }   
                else{
                    System.out.println("puntos mal ubicados");
                    return 3;
                }
            }
            else{
                System.out.println("formato invalido");
                return 3;
            }                
        }
        else{
            System.out.println("rut vacio");
            return 3;
        }
        //clave con letras y numeros, minimo 8 caracteres
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
        //numero telefonico con 9 numeros.
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
        //correo electronico. prefijo con letras, numeros. acepta 2 dominio, que pueden ser letras y numeros de cualquier largo, tambien acepta solo ".cl" y ".com"
        if(!"".equals(correoElectronico)){
            if(correoElectronico.contains("@")){
                
                String[] arroba = correoElectronico.split("@");
                if(arroba.length == 2 && !arroba[0].equals("")){
                    char[] inicio= arroba[0].toCharArray();
                    for(char c : inicio){
                        int ascii = (int) c;
                        if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || (ascii >=48 && ascii <=57) || caracteres.contains(ascii))){
                            return 6;
                        }
                    }                    
                    String[] puntos = arroba[1].split("\\.");                    
                    if((puntos.length == 2 || puntos.length == 3) && !puntos[0].equals("") && !puntos[1].equals("")){   
                        if("cl".equals(puntos[puntos.length-1]) || "com".equals(puntos[puntos.length-1]) ){                            
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
        // tarjeta de credito de 16 numero
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
        //cuenta bancaria de 20 digitos.
        if("propietario".equals(tipoUsuario)){            
            if(!"".equals(CuentaBancaria)){
                CuentaBancaria = CuentaBancaria.replace(" ", "");
                char[] aux = CuentaBancaria.toCharArray();
                for(char c : aux){
                    int ascii = (int) c;
                    if( !((ascii >=48 && ascii <=57) )){
                        return 8;
                    }
                }
                if(aux.length !=20){
                    return 8;
                }         
                
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
