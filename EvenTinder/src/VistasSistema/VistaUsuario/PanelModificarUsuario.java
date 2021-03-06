/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaUsuario;

import ModuloGestionUsuario.Cliente;
import VistasSistema.VistaPropietario.PanelModificarPropietario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelModificarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form PanelModificarUsuario
     */
    
    private VentanaPrincipalUsuario papa;
    
    public PanelModificarUsuario(VentanaPrincipalUsuario papa) throws SQLException {
        this.papa=papa;
        initComponents();
        this.actualizarInfomacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        numeroTelefonico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tarjetaDeCredito = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Modificar cuenta de cliente");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("1. Ingrese los datos que desee modificar");

        jLabel5.setText("Nombre completo");

        jLabel13.setText("Clave");

        jLabel14.setText("N° Telefónico");

        jLabel15.setText("Correo Electrónico");

        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });

        jLabel16.setText("Tarjeta de crédito");

        botonRegistrar.setText("Modificar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tarjetaDeCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonRegistrar)
                                .addGap(140, 140, 140)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addContainerGap(121, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(botonRegistrar)
                .addContainerGap(210, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_claveActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed

        int resp = validarModificarUsuario(this.nombre.getText(), this.clave.getText(), this.numeroTelefonico.getText(), this.correoElectronico.getText(), this.tarjetaDeCredito.getText());
        if(resp==0){
            boolean respuesta = false;
            try {
                respuesta = this.papa.getControladorPrincipal().modificarUsuario(this.nombre.getText(),this.clave.getText(),this.correoElectronico.getText(),this.numeroTelefonico.getText(),this.tarjetaDeCredito.getText());
            } catch (SQLException ex) {
                Logger.getLogger(PanelModificarPropietario.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(respuesta){
                JOptionPane.showMessageDialog(null, "Se a modificado correctamente");
                try {
                    this.actualizarInfomacion();
                } catch (SQLException ex) {
                    Logger.getLogger(PanelModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se a podido modificar su cuenta de usuario");
            }
        }
        if(resp==1){
            JOptionPane.showMessageDialog(null, "Se espera que el nombre sea solo letras \n"
                    + "Ej: Daniel Moreno", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==2){
            JOptionPane.showMessageDialog(null, "Se espera que el rut tenga entre entre sea: nnn nnn nnn - nok \n" + 
                    "Ej: 11111111-1", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==3){
            JOptionPane.showMessageDialog(null, "Se espera que la clave tenga minimo 8 digitos \n" + 
                    "Ej: 12345678", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==4){
            JOptionPane.showMessageDialog(null, "Se espera que el numero telefonico tenga 9 digitos \n" + 
                    "Ej: 987654321", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==5){
            JOptionPane.showMessageDialog(null, "Se espera que el correo electronico sea algo@gmail.com o sea algo@gmail.cl \n" + 
                    "Ej: elmejorproyectodelmundo@gmail.cl", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==6){
            JOptionPane.showMessageDialog(null, "Se espera que la tarjeta de credigo tenga 16 numeros \n" + 
                    "Ej: 12345678901234", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numeroTelefonico;
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
     * Metodo que verifica la correctitud de los datos ingresados en el sistema por el usuario para modificar una cuenta cliente..
     * @param nombre el nombre ingresado.
     * @param clave La clave ingresada.
     * @param numeroTelefonico El numero telefonico ingresado.
     * @param correoElectronico El correo electronico ingresado.
     * @param tarjetaDeCredito La tarjetra de credito ingresada.
     * @return Un numero que indica cual de los datos ingresados esta erroneo.
     */
    public int validarModificarUsuario(String nombre, String clave, String numeroTelefonico, String correoElectronico, String tarjetaDeCredito){                                               
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
                if(!((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || caracteres.contains(ascii))) {
                    return 1;
                }
            }
            if(aux.length >=100){
                return 1;
            }
        }
        else{
            return 1;
        }
        //clave con letras y numeros, minimo 8 caracteres
        if(!"".equals(clave)){
            char[] aux = clave.toCharArray();
            for(char c : aux){
                int ascii = (int) c;
                if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || (ascii >=48 && ascii <=57) )){
                    return 3;
                }
            }
            if(aux.length <8){
                return 3;
            }
        }
        else{
            return 3;
        }
        //numero telefonico con 9 numeros.
        if(!"".equals(numeroTelefonico)){
            char[] aux = numeroTelefonico.toCharArray();
            for(char c : aux){
                int ascii = (int) c;
                if( !((ascii >=48 && ascii <=57) )){
                    return 4;
                }
            }
            if(aux.length != 9){
                return 4;
            }
        }
        else{
            return 4;
        }
        //correo electronico. prefijo con letras, numeros. acepta 2 dominio, que pueden ser letras y numeros de cualquier largo, tambien acepta solo ".cl" y ".com"
        if("".equals(correoElectronico)){
            if(correoElectronico.contains("@")){
                String[] arroba = correoElectronico.split("@");
                if(arroba.length == 2 && !arroba[0].equals("")){
                    char[] inicio= arroba[0].toCharArray();
                    for(char c : inicio){
                        int ascii = (int) c;
                        if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || (ascii >=48 && ascii <=57) || caracteres.contains(ascii))){
                            return 5;
                        }
                    }                    
                    String[] puntos = arroba[1].split("\\.");                    
                    if((puntos.length == 2 || puntos.length == 3) && !puntos[0].equals("") && !puntos[1].equals("")){   
                        if("cl".equals(puntos[puntos.length-1])  || "com".equals(puntos[puntos.length-1])){                            
                            int i = 0;
                            while(i < puntos.length-1){
                                char[] dominio = puntos[i].toCharArray();
                                for(char c : dominio){
                                    int ascii = (int) c;
                                    if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) )){
                                        return 5;
                                    }
                                }
                                i++;
                            }
                        }
                        else{
                            return 5;
                        }
                    }
                    else{                        
                        return 5;
                    }
                }       
                else{
                    return 5;
                }
            }
            else{
                return 5;
            }    
        }
        else{
            return 5;
        }
        // tarjeta de credito de 16 numero
        if("".equals(tarjetaDeCredito)){
            tarjetaDeCredito = tarjetaDeCredito.replace(" ", "");
            char[] aux = tarjetaDeCredito.toCharArray();                
            for(char c : aux){
                int ascii = (int) c;
                if( !((ascii >=48 && ascii <=57) )){
                    return 6;
                }
            }
            if(aux.length !=16){
                return 6;
            }             
        }
        else{
            return 6;
        }
        return 0;
    }

    
    public void actualizarInfomacion() throws SQLException{
        Cliente usuario =(Cliente) this.papa.getControladorPrincipal().obtenerInformacionUsuario();
        if(usuario==null){
            return;
        }
        this.clave.setText("");
        this.tarjetaDeCredito.setText("");
        this.nombre.setText(usuario.getNombreCompleto());
        this.numeroTelefonico.setText(usuario.getTelefono());
        this.correoElectronico.setText(usuario.getCorreoElectronico());
    }
}
