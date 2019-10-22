/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasSistema.VistaUsuario;

import ModuloGestionEventos.Evento;
import VistasSistema.VistaPrincipal.VentanaPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author xebae
 */
public class PanelMostrarEventos extends javax.swing.JPanel {

        /**
     * Creates new form PanelMostrarEventos
     */
    
    private VentanaPrincipalUsuario papa;
    private VentanaPrincipal papaAdoptado;
    private DefaultListModel modeloLista;
    private ArrayList<Evento> eventos;
    private boolean bandera = true;
    private Date fechaInicio;
    private Date fechaTermino;
    
    private int mes;
    private int ano;
    
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public PanelMostrarEventos(VentanaPrincipalUsuario papa) throws ParseException {
        this.papa=papa;
        this.modeloLista= new DefaultListModel();
        initComponents();
        Calendar ahoraCal = Calendar.getInstance();
        ano = ahoraCal.get(Calendar.YEAR);
        mes = ahoraCal.get(Calendar.MONTH) +1;
        String inicio = "" + ano + "-" + mes + "-1";
        String termino =  "" + ano + "-" + mes + "-31";
        fechaInicio= sdf.parse(inicio);
        fechaTermino= sdf.parse(termino);
        this.texto.setText("Eventos Disponibles - " + mes + "/" + ano);
        this.actualizarListaDeEventos();
    }
    
    public PanelMostrarEventos(VentanaPrincipal papa) throws ParseException {
        this.papaAdoptado=papa;
        this.bandera = false;
        this.modeloLista= new DefaultListModel();
        initComponents();
        Calendar ahoraCal = Calendar.getInstance();
        ano = ahoraCal.get(Calendar.YEAR);
        mes = ahoraCal.get(Calendar.MONTH) +1;
        String inicio = "" + ano + "-" + mes + "-1";
        String termino =  "" + ano + "-" + mes + "-31";
        fechaInicio= sdf.parse(inicio);
        fechaTermino= sdf.parse(termino);   
        if(mes<10){
            this.texto.setText("Eventos Disponibles -  " + mes + "/" + ano);
        }else{
            this.texto.setText("Eventos Disponibles - " + mes + "/" + ano);
        }
        this.actualizarListaDeEventos();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeEventos = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        texto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        texto.setText("Eventos Disponibles - ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VistasSistema/Imagenes/IconoEvenTinder.png"))); // NOI18N

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        listaDeEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDeEventosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaDeEventos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(texto)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(texto))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaDeEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDeEventosMouseClicked
        if(this.listaDeEventos.getSelectedIndex()<0 || this.eventos==null){
            return;
        }
        //aca pregunto si es cliente pasa ni no no
        if(this.bandera){
            papa.comprarEntrada(this.eventos.get(this.listaDeEventos.getSelectedIndex()));
        }
    }//GEN-LAST:event_listaDeEventosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
            // TODO add your handling code here:
            this.quitarUnMes();
        } catch (ParseException ex) {
            Logger.getLogger(PanelMostrarEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            this.agregarUnMes();
        } catch (ParseException ex) {
            Logger.getLogger(PanelMostrarEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaDeEventos;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables

    private void actualizarListaDeEventos(){
        if(this.bandera){
            this.eventos = this.papa.getControladorUsuario().obtenerTodosLosEventos(fechaInicio, fechaTermino);
        }else{
            this.eventos = this.papaAdoptado.getControladorUsuario().obtenerTodosLosEventos(this.fechaInicio, this.fechaTermino);
        }
        this.modeloLista.removeAllElements();
        if(eventos==null){
            this.modeloLista.addElement("No se encuentrar eventos en estas fechas");
            this.listaDeEventos.setModel(modeloLista);
            this.repaint();
            this.revalidate();
            return;
        }
        for (int i = 0; i < eventos.size(); i++){
            this.modeloLista.addElement("Nombre: " + this.eventos.get(i).getNombre() + "  FechaInicio: " + this.eventos.get(i).getFechaDeInicio() + "   FechaTermino: " + this.eventos.get(i).getFechaDeTermino());
        }
        this.listaDeEventos.setModel(modeloLista);
        this.repaint();
        this.revalidate();
    }
    
    private void agregarUnMes() throws ParseException{
        mes+=1;
        if(mes>12){
            mes=1;
            ano+=1;
        }
        String inicio = "" + ano + "-" + mes + "-1";
        String termino =  "" + ano + "-" + mes + "-31";
        fechaInicio= sdf.parse(inicio);
        fechaTermino= sdf.parse(termino);
        if(mes<10){
            this.texto.setText("Eventos Disponibles -  " + mes + "/" + ano);
        }else{
            this.texto.setText("Eventos Disponibles - " + mes + "/" + ano);
        }
        actualizarListaDeEventos();
    }
    
    private void quitarUnMes() throws ParseException{
        Calendar ahoraCal = Calendar.getInstance();
        if(ahoraCal.get(Calendar.YEAR)==ano){
            if(mes==ahoraCal.get(Calendar.MONTH) +1){
                JOptionPane.showMessageDialog(null, "No puede volver mas atras dado que la fecha no se lo permite", "Error en la seleccion de la fecha", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        mes-=1;
        if(mes<1){
            mes=12;
            ano-=1;
        }
        String inicio = "" + ano + "-" + mes + "-1";
        String termino =  "" + ano + "-" + mes + "-31";
        fechaInicio= sdf.parse(inicio);
        fechaTermino= sdf.parse(termino);
        if(mes<10){
            this.texto.setText("Eventos Disponibles -  " + mes + "/" + ano);
        }else{
            this.texto.setText("Eventos Disponibles - " + mes + "/" + ano);
        }
        actualizarListaDeEventos();
    }
}
