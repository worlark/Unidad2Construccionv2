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
public class PanelAgregarSector extends javax.swing.JPanel {

    /**
     * Creates new form PanelAgregarSector
     */
    
    VentanaPrincipalPropietario papa;
    private int id;
    private DefaultListModel modeloLista;
    private ArrayList<Propiedad> propiedades;
    
    public PanelAgregarSector(VentanaPrincipalPropietario papa, int id) throws SQLException {
        this.papa=papa;
        this.id=id;
        initComponents();
        this.modeloLista=new DefaultListModel();
        this.actualizarListaDeSectores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        capacidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        guardarCambios = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSectores = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú Agregar sectores");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jLabel5.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese los siguientes datos");

        jLabel12.setText("Capacidad");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(guardarCambios)
                                .addGap(18, 18, 18)
                                .addComponent(volver)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarCambios)
                    .addComponent(volver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Lista de sectores actuales en el sistema");

        jScrollPane1.setViewportView(listaSectores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(408, Short.MAX_VALUE))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosActionPerformed
        // TODO add your handling code here:
        int resp = validarEntrada(this.nombre.getText(), this.capacidad.getText());
        if(resp==0){
            boolean bandera = false;
            for (int i = 0; i < this.propiedades.get(this.id).getListaSectores().size(); i++) {
                if(this.propiedades.get(this.id).getListaSectores().get(i).getNombre().equals(this.nombre.getText())){
                    JOptionPane.showMessageDialog(null, "El nombre del sector ya se encuentra registrado", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            try {
                bandera = this.papa.getControladorPropietario().añadirSector(this.propiedades.get(id).getId(), Integer.parseInt(this.capacidad.getText()), this.nombre.getText());
            } catch (SQLException ex) {
                Logger.getLogger(PanelAgregarSector.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(bandera){
                //si se pudo
                JOptionPane.showMessageDialog(null, "Se a añadido el sector correctamente");
                try {
                    this.papa.getControladorPropietario().modifcarPropiedad(this.propiedades.get(id).getId(), this.propiedades.get(id).getNombre(), this.propiedades.get(id).getUbicacion(), this.propiedades.get(id).getFechaDePublicacion(), (this.propiedades.get(id).getCapacidadTotal()+Integer.parseInt(this.capacidad.getText())), this.propiedades.get(id).getValorArriendo(), this.propiedades.get(id).getDescripcion());
                } catch (SQLException ex) {
                    Logger.getLogger(PanelAgregarSector.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.nombre.setText("") ;
                this.capacidad.setText("");
                try {
                    this.actualizarListaDeSectores();
                } catch (SQLException ex) {
                    Logger.getLogger(PanelAgregarSector.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                //no se pudo
                JOptionPane.showMessageDialog(null, "No se a podido añadir el sector a la base de datos", "Error al guardar sector", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(resp==1){
            JOptionPane.showMessageDialog(null, "Se espera que el nombre del sector tenga letras y/o numero \n"
                    + "Ej: Platea", "Error al llenado de datos", JOptionPane.WARNING_MESSAGE);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capacidad;
    private javax.swing.JButton guardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaSectores;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    //Aca abajo van a estar los metodos que se tienen que hacer 
    
    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */
    
    public void actualizarListaDeSectores() throws SQLException{
        this.modeloLista=new DefaultListModel();
        this.propiedades= this.papa.getControladorPropietario().mostrarInformacionDePropiedadesDeUnPropietario();
        for(int i=0;i<this.propiedades.get(id).getListaSectores().size();i++){
                this.modeloLista.addElement("Nombre sector: " + this.propiedades.get(id).getListaSectores().get(i).getNombre() + "  Capacidad: " + this.propiedades.get(id).getListaSectores().get(i).getCapacidadDelSector());
            }
            this.listaSectores.setModel(this.modeloLista);
    }
    
    
     /**
      * 
      * @param nombre
      * @param capacidad
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
            if(aux.length <=100){
                return 1;
            }
        }
        else{
            return 1;
        }
        if(!capacidad.equals("") && isNumero(capacidad)){
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
}
