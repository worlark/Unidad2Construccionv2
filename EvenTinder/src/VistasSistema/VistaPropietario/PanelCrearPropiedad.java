/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaPropietario;

import ModuloGestionPropiedades.Propiedad;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelCrearPropiedad extends javax.swing.JPanel {

    /**
     * Creates new form PanelCrearPropiedad
     */
    
    private boolean finalizar=false;
    private ArrayList<String> nombresSectores=new ArrayList<>();
    private ArrayList<Integer> capacidades=new ArrayList<>();
    private VentanaPrincipalPropietario papa;
    private DefaultListModel modeloLista;
    private int contador=0;
    
    public PanelCrearPropiedad(VentanaPrincipalPropietario papa) {
        this.papa=papa;
        initComponents();
        this.capacidadTotal.setEditable(false);
        this.capacidadTotal.setEnabled(false);
        this.modeloLista=new DefaultListModel();
        this.listaSectores1.setModel(modeloLista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        valorArriendo = new javax.swing.JTextField();
        capacidadTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ubicacion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaSectores1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botonAñadirSector = new javax.swing.JButton();
        capacidad = new javax.swing.JTextField();
        nombreSector = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setBorder(null);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Registrar propiedad");

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Valor de arriendo");

        capacidadTotal.setText("0");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Capacidad total");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Ubicación");

        ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActionPerformed(evt);
            }
        });

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane2.setViewportView(descripcion);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Descripción");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("1. Ingrese los siguientes datos");

        botonRegistrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonRegistrar.setText("Registrar Propiedad");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel19)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRegistrar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(ubicacion)
                                .addComponent(capacidadTotal)
                                .addComponent(nombre)
                                .addComponent(valorArriendo, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(valorArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));

        jPanel3.setBackground(new java.awt.Color(226, 226, 226));

        listaSectores1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(listaSectores1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Sectores actuales en el sistema");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(149, 149, 149))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(232, 232, 232));

        botonAñadirSector.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonAñadirSector.setText("Añadir Sector");
        botonAñadirSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirSectorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Capacidad");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("2. Añadir un sector");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAñadirSector)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombreSector, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(capacidad)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombreSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(botonAñadirSector)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 382, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel18)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(panel);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
        int resp = validarEntradaPropiedad(this.nombre.getText(), this.descripcion.getText(), this.ubicacion.getText(), this.capacidadTotal.getText(), this.valorArriendo.getText(), this.finalizar);
        System.out.println("respuesta:" + resp);
        if(resp==0){
            //realizar operacion
            java.util.Date fechaDePublicacion = new Date();
            int resultado = 0; 
            ArrayList<Propiedad> propiedades = null;
            try {
                propiedades = this.papa.getControladorPropietario().mostrarInformacionDePropiedadesDeUnPropietario();
            } catch (SQLException ex) {
                Logger.getLogger(PanelCrearPropiedad.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(propiedades==null){
                return;
            }
            for (int i = 0; i < propiedades.size(); i++) {
                if (propiedades.get(i).getNombre().equals(this.nombre.getText())){
                    
                    JOptionPane.showMessageDialog(null, "El nombre de la propiedad ya se encuentra registrado", "Error en el ingreso de datos", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            try {
                resultado = this.papa.getControladorPropietario().registrarPropiedad(this.nombre.getText(), this.ubicacion.getText(),fechaDePublicacion, Integer.parseInt(this.capacidadTotal.getText()), Integer.parseInt(this.valorArriendo.getText()), this.descripcion.getText());
            } catch (SQLException ex) {
                Logger.getLogger(PanelCrearPropiedad.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(resultado!=0){
                //agregando sectores
                for(int i=0; i<this.nombresSectores.size(); i++){
                    try {
                        System.out.println("agrego: " + this.capacidades.get(i) + "  " + this.nombresSectores.get(i));
                        this.papa.getControladorPropietario().añadirSector(resultado, this.capacidades.get(i),this.nombresSectores.get(i));
                    } catch (SQLException ex) {
                        Logger.getLogger(PanelCrearPropiedad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                JOptionPane.showMessageDialog(null, "Se a registrado la propiedad correctamente");
                this.nombre.setText("");
                this.descripcion.setText("");
                this.ubicacion.setText("");
                this.capacidadTotal.setText("0");
                this.contador=0;
                this.valorArriendo.setText("");
                this.finalizar=false;
                this.nombresSectores=new ArrayList<>();
                this.capacidades=new ArrayList<>();
                this.actualizarListaDeSectores();
            }else{
                //fallo
                JOptionPane.showMessageDialog(null, "Error al registrar en la base de datos", "Error BD", JOptionPane.WARNING_MESSAGE);
            }
        }
        //nombre
        if(resp==1){
            JOptionPane.showMessageDialog(null, "Se espera que el nombre tenga letras y/o numero: \n"
                    + "Ej: Grado 6", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;   
        }
        //descripcion
        if(resp==2){
            JOptionPane.showMessageDialog(null, "Se espera que la descripcion tenga letras y/o numero: \n"
                    + "Ej: Grado 6", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;   
        }
        //ubicacion
        if(resp==3){
            JOptionPane.showMessageDialog(null, "Se espera que la ubicacion tenga letras y/o numero: \n"
                    + "Ej: Aguas negras calle 14 pasaje 2", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;   
        }
        //valor de arriendo
        if(resp==5){
            JOptionPane.showMessageDialog(null, "Se espera que el valor del arriendo sea un numero mayor que 0 \n"
                    + "Ej: 1000000", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Finalizado
        if(resp==6){
            JOptionPane.showMessageDialog(null, "Para registrar la propiedad por lo menos debe haber creado un sector", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonAñadirSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirSectorActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int resp = validarEntradaSector(this.nombreSector.getText(), this.capacidad.getText());
        System.out.println("respuesta de sector:" + resp);
        if(resp==0){
            for (int i = 0; i < this.nombresSectores.size(); i++) {
                if(this.nombresSectores.get(i).equals(this.nombreSector.getText())){
                    JOptionPane.showMessageDialog(null, "El nombre del sector ya se encuentra registrado", "Error en el ingreso de datos", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            this.nombresSectores.add(this.nombreSector.getText());
            this.capacidades.add(Integer.parseInt(this.capacidad.getText()));
            JOptionPane.showMessageDialog(null, "Se a guardado un sector");
            this.finalizar=true;
            this.contador+=Integer.parseInt(this.capacidad.getText());
            this.capacidadTotal.setText(Integer.toString(this.contador));
            this.nombreSector.setText("");
            this.capacidad.setText("");
            actualizarListaDeSectores();
        }
        if(resp==1){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Nombre", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
        }
        if(resp==2){
            JOptionPane.showMessageDialog(null, "Le falto rellenar el campo: Capacidad", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonAñadirSectorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAñadirSector;
    public javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField capacidadTotal;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listaSectores1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombreSector;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField ubicacion;
    private javax.swing.JTextField valorArriendo;
    // End of variables declaration//GEN-END:variables

    //Aca abajo van a estar los metodos que se tienen que hacer 
    
    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */
    

     /**
      * 
      * @return 
      */
    public int validarEntradaSector(String nombre, String capacidad) {
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
        //nombre con letras, numeros, tildes, mayusculas y minusculas.
        if(!nombre.equals("")){
            char[] aux = nombre.toCharArray();
            for(char c : aux){                
                int ascii = (int) c;
                if(!((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || (ascii >=48 && ascii <=57)||caracteres.contains(ascii))) {
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
        // capacidad que puede ser cualquier numero aceptado por una variable tipo int  (2,147,483,647)
        if(!capacidad.equals("") && isNumero(capacidad)){
            try{
                Integer.parseInt(capacidad);                
            }
            catch(NumberFormatException nfe){
                return 2;
            }
        }else{
            return 2;
        }
        return 0;
    }


    /**
     * Metodo que valida los datos ingresados al registrar una propiedad.
     * @param nombre el nombre ingresado.
     * @param descripcion la descripcion ingresada.
     * @param ubicacion la ubicacion ingresada.
     * @param capacidadTotal La capacidad total calculada.
     * @param valorArriendo el valor de arriendo ingresado.
     * @param finalizar si el evento esta finalizado o no (siempre false).
     * @return Un numero que indica el campo que se ingreso de manera incorrecta.
     */
    
    public int validarEntradaPropiedad(String nombre, String descripcion, String ubicacion, String capacidadTotal, String valorArriendo, boolean finalizar) {
        //nombre con letras mayusculas, minusculas, numeros, tildes.
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
        if(!nombre.equals("")){ 
            char[] aux = nombre.toCharArray();            
            for(char c : aux){                
                int ascii = (int) c;                
                if( !((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || (ascii >=48 && ascii <=57)|| caracteres.contains(ascii))) {                    
                    return 1;
                }
            } 
            if(aux.length>=100){
                return 1;
            }
        }
        else{
            return 1;
        }
        //descripcion que acepta cualquier caracter. no puede superar los 500 caracteres.
        if(!descripcion.equals("")){
            char[] aux = descripcion.toCharArray();
            if(aux.length >=500){
                return 2;
            }
        }
        else{
            return 2;
        }
        //ubicacion que acepta cualquier caracter. no puede superar los 500 caracteres.
        if(!ubicacion.equals("")){
            char[] aux = ubicacion.toCharArray();
            if(aux.length >=100){
                return 3;
            }
        }
        else{
            return 3;
        }           
        //valor de arriendo, que acepta cualquier valor que acepte una variable de tipo int (2,147,483,647).
        if(!valorArriendo.equals("") ){
            try{
                if (!isNumero(valorArriendo)) {
                    return 5;
                }      
            }
            catch(NumberFormatException nfe){
                return 5;
            }
        }
        else{
            return 5;
        }
        if(!finalizar){
            return 6;
        }
        return 0;
    }
        /**
     * Método que se encarga de verificar que los numeros ingresados son numeros validos
     */
    private boolean isNumero(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        if (resultado==true) {
            int a = Integer.parseInt(cadena);
            if (a>0) {
                resultado = true;
            }
            else{
                resultado = false;
            }
        }
        return resultado;
    }
    
    
    private void actualizarListaDeSectores(){
        this.modeloLista=new DefaultListModel();
        for(int i=0;i<this.nombresSectores.size();i++){
                this.modeloLista.addElement("Nombre sector: " + this.nombresSectores.get(i) + "  Capacidad: " + this.capacidades.get(i));
            }
        this.listaSectores1.setModel(this.modeloLista);
    }
}
