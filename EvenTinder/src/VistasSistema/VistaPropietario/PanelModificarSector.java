/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaPropietario;

import ModuloGestionPropiedades.Propiedad;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelModificarSector extends javax.swing.JPanel {

    /**
     * Creates new form PanelModificarSector
     */
    
    VentanaPrincipalPropietario papa;
     private int id;
    private ArrayList<Propiedad> propiedades;
            
            
    public PanelModificarSector(VentanaPrincipalPropietario papa, int id) {
        this.papa=papa;
        this.id=id;
        initComponents();
        this.actualizarMenuSectores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardarCambios = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        capacidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        listaSectores = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        guardarCambios.setText("Guardar Cambios");
        guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú modificar sector");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jLabel12.setText("Capacidad");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("2. Ingrese los siguientes datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("1. Seleccione un sector");

        listaSectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSectoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(listaSectores, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(listaSectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardarCambios)
                        .addGap(18, 18, 18)
                        .addComponent(volver))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(287, Short.MAX_VALUE))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarCambios)
                    .addComponent(volver))
                .addContainerGap(261, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosActionPerformed
        int resp = validarEntrada(this.nombre.getText(), this.capacidad.getText());
        int capacidad=0;
        if(resp==0){
            if(listaSectores.getSelectedIndex()==-1 || listaSectores.getSelectedIndex()==0 ){
                JOptionPane.showMessageDialog(null, "No se a seleccionado el sector a modificar", "Error al seleccioanr sector", JOptionPane.WARNING_MESSAGE);
                return;
            }
            for (int i = 0; i < this.propiedades.get(this.id).getListaSectores().size(); i++) {
                if(listaSectores.getSelectedIndex()-1!=i){
                    if(this.propiedades.get(this.id).getListaSectores().get(i).getNombre().equals(this.nombre.getText())){
                        JOptionPane.showMessageDialog(null, "El nombre del sector ya se encuentra registrado", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }
            boolean bandera = false;
            try {
                capacidad=Integer.parseInt(this.capacidad.getText()) - this.propiedades.get(id).getListaSectores().get(listaSectores.getSelectedIndex()-1).getCapacidadDelSector();
                bandera = this.papa.getControladorPropietario().modificarSector(this.propiedades.get(id).getId(), this.propiedades.get(id).getListaSectores().get(listaSectores.getSelectedIndex()-1).getNombre(), Integer.parseInt(this.capacidad.getText()), this.nombre.getText());
            } catch (SQLException ex) {
                Logger.getLogger(PanelModificarSector.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(bandera){
                //si se pudo
                JOptionPane.showMessageDialog(null, "Se a añadido el sector correctamente");
                try {
                    this.papa.getControladorPropietario().modifcarPropiedad(this.propiedades.get(id).getId(), this.propiedades.get(id).getNombre(), this.propiedades.get(id).getUbicacion(), this.propiedades.get(id).getFechaDePublicacion(), (this.propiedades.get(id).getCapacidadTotal() + capacidad), this.propiedades.get(id).getValorArriendo(), this.propiedades.get(id).getDescripcion());
                } catch (SQLException ex) {
                    Logger.getLogger(PanelModificarSector.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.nombre.setText("");
                this.capacidad.setText("");
                this.actualizarMenuSectores();
            }else{
                //no se pudo
                JOptionPane.showMessageDialog(null, "No se a podido añadir el sector a la base de datos", "Error al guardar sector", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(resp==1){
            JOptionPane.showMessageDialog(null, "Se espera que el nombre del sector sea solo letras: \n"
                    + "Ej: Galeria", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resp==2){
            JOptionPane.showMessageDialog(null, "Se espera que la capacidad del sector sea mayor que 0 \n" + 
                    "Ej: 10", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_guardarCambiosActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        this.papa.volverAModificarPropiedad();
    }//GEN-LAST:event_volverActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void listaSectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSectoresActionPerformed
        // TODO add your handling code here:
        if(listaSectores.getSelectedIndex()==-1){
            return;
        }
        if(listaSectores.getSelectedIndex()==0){
            this.nombre.setText("");
            this.capacidad.setText("");
            return;
        }
        this.nombre.setText(this.propiedades.get(id).getListaSectores().get(listaSectores.getSelectedIndex()-1).getNombre());
        this.capacidad.setText(Integer.toString(this.propiedades.get(id).getListaSectores().get(listaSectores.getSelectedIndex()-1).getCapacidadDelSector()));
    }//GEN-LAST:event_listaSectoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capacidad;
    private javax.swing.JButton guardarCambios;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> listaSectores;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton volver;
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
    public int validarEntrada(String nombre, String capacidad) {
        if(!nombre.equals("")){
            char[] aux = nombre.toCharArray();
            for(char c : aux){                
                int ascii = (int) c;
                if(!((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <= 122) || ascii == 32 ) || (ascii >=160 && ascii <=165) || ascii==130) {
                    return 1;
                }
            }
        }
        else{
            return 1;
        }
        if(!capacidad.equals("") || !isNumero(capacidad)){
            try{
                Integer.parseInt(capacidad);                
            }
            catch(NumberFormatException nfe){
                return 2;
            }
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

    //no se puede hacer tdd
    private void actualizarMenuSectores(){
        this.propiedades = this.papa.getControladorPropietario().mostrarInformacionDePropiedades();
        this.listaSectores.removeAllItems();
        this.listaSectores.addItem("");
        if(this.propiedades!=null){
            for(int i=0; i<this.propiedades.get(id).getListaSectores().size(); i++){
                this.listaSectores.addItem("Nombre Sector: " + this.propiedades.get(id).getListaSectores().get(i).getNombre());
            }
            this.repaint();
            this.revalidate();
        }
    }
}
