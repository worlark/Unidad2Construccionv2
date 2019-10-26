/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaOrganizador;

import ModuloGestionEventos.Evento;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelEliminarEvento extends javax.swing.JPanel {

    /**
     * Creates new form PanelEliminarEvento
     */
    
    private VentanaPrincipalOrganizador papa;
    private ArrayList<Evento> eventos;
    
    public PanelEliminarEvento(VentanaPrincipalOrganizador papa){
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

        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        listaOpciones = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        listaEventos = new javax.swing.JComboBox<>();
        botonEliminarEvento = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Menú cancelar de evento");

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("1. Seleccione una opcion de listado de eventos");

        listaOpciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        listaOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaOpcionesMouseClicked(evt);
            }
        });
        listaOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listaOpciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(listaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("2. Selecciones el evento que desea cancelar");

        listaEventos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        listaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEventosActionPerformed(evt);
            }
        });

        botonEliminarEvento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonEliminarEvento.setText("Eliminar evento");
        botonEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaEventos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(botonEliminarEvento)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(listaEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEliminarEvento)
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
                    .addComponent(jLabel18)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(381, Short.MAX_VALUE))
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarEventoActionPerformed
        // TODO add your handling code here:
        if(this.listaOpciones.getSelectedIndex()<=0){
            JOptionPane.showMessageDialog(null, "No a seleccionado un tipo de filtrado", "Error al filtrar eventos", JOptionPane.WARNING_MESSAGE);    
            return;
        }
        if(this.listaEventos.getSelectedIndex()<=0){
            JOptionPane.showMessageDialog(null, "No a seleccionado la propiedad a modificar", "Error al seleccionar propiedad", JOptionPane.WARNING_MESSAGE);    
            return;
        }
        boolean resultado = false;
        System.out.println("this.eventos.get(this.listaEventos.getSelectedIndex()-1" + this.eventos.get(this.listaEventos.getSelectedIndex()-1));
        if(this.listaOpciones.getSelectedIndex()==1){
            int numero = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere eliminar este evento publicado? \n" + "Nota: no se le rembolsara el dinero del arriendo", "Confirmar eliminar evento", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(numero==1){
                return ;
            }
            this.papa.getControladorOrganizador().devolverTodasLasEntradasDelEvento(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdEvento());
            resultado = this.papa.getControladorOrganizador().eliminarEvento(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdEvento());
        }else{
            resultado = this.papa.getControladorOrganizador().eliminarEvento(this.eventos.get(this.listaEventos.getSelectedIndex()-1).getIdEvento());
        }
        System.out.println("resultado:" + resultado);
        if(resultado){
            //agregando sectores
            JOptionPane.showMessageDialog(null, "Se a eliminado correctamente");
            this.actualizarMenuOpciones();
            return;
        }else{
            //fallo
            JOptionPane.showMessageDialog(null, "Error al registrar en la base de datos", "Error BD", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_botonEliminarEventoActionPerformed

    private void listaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEventosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_listaEventosActionPerformed

    private void listaOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaOpcionesActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(this.listaOpciones.getSelectedIndex()<=0){
            return;
        }
        if(this.listaOpciones.getSelectedIndex()==1){
            this.actualizarMenuEventosPublicados();
        }
        if(this.listaOpciones.getSelectedIndex()==2){
            this.actualizarMenuEventosNoPublicados();
        }
    }//GEN-LAST:event_listaOpcionesActionPerformed

    private void listaOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaOpcionesMouseClicked

    }//GEN-LAST:event_listaOpcionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarEvento;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> listaEventos;
    private javax.swing.JComboBox<String> listaOpciones;
    // End of variables declaration//GEN-END:variables

    //Aca abajo van a estar los metodos que se tienen que hacer 
    
    /**
     * Este va a ser el formato de las consultas para ser luego testeadas en el junit
     * 0 = Correcto
     * numeros mayores que 0 son errores
     */
 
    public void actualizarMenuOpciones(){
        this.listaOpciones.removeAllItems();
        this.listaOpciones.addItem("");
        this.listaOpciones.addItem("Eventos Publicados");
        this.listaOpciones.addItem("Eventos No Publicados");
        this.repaint();
        this.revalidate();
    }
    
    // no se puede hacer tdd ya que necesita otro metodo
    private void actualizarMenuEventosPublicados(){
        eventos = this.papa.getControladorOrganizador().obtenerInformacionDeEventosPublicadosDeUnOrganizador();
        listaEventos.removeAllItems();
        listaEventos.addItem("");
        if(this.eventos!=null){
            for(int i=0; i<this.eventos.size(); i++){
                listaEventos.addItem("Id evento: " + eventos.get(i).getIdEvento() + "   Nombre evento: " + eventos.get(i).getNombre());
            }
            this.repaint();
            this.revalidate();
        }
    }
    
    // no se puede hacer tdd ya que necesita otro metodo
    private void actualizarMenuEventosNoPublicados(){
        eventos = this.papa.getControladorOrganizador().obtenerInformacionDeEventosNoPublicadosDeUnOrganizador();
        listaEventos.removeAllItems();
        listaEventos.addItem("");
        if(this.eventos!=null){
            for(int i=0; i<this.eventos.size(); i++){
                listaEventos.addItem("Id evento: " + eventos.get(i).getIdEvento() + "   Nombre evento: " + eventos.get(i).getNombre());
            }
            this.repaint();
            this.revalidate();
        }
    }

}
