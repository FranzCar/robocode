/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ListarProveedores;
import Modelo.Proveedor;
import static Vista.InterfazAdministrarProveedor.bEditar;
import static Vista.InterfazAdministrarProveedor.bEliminar;
import static Vista.InterfazAdministrarProveedor.bRegistrar;
import static Vista.InterfazAdministrarProveedor.idUsuarioTabla;
import static Vista.InterfazAdministrarProveedor.jTableUsuario;

import Conexion.ConectarBD;
import Controlador.Validaciones;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InterfazRegistrarProveedor extends javax.swing.JFrame {
    static Connection conexion=null;
    static Statement sentencia=null;
    static ResultSet resultado=null;
    static Proveedor objProveedor;
    int id;
    ConectarBD con = new ConectarBD(); 
    
    
    public InterfazRegistrarProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(1);
        
        objProveedor=new Proveedor(); 
        try {
            conexion=con.establecerConexion();
        } catch (Exception e) {   
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombreprov = new javax.swing.JTextField();
        jTextFieldCiNIT = new javax.swing.JTextField();
        jTextFieldTelefonoProv = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldDireccionprov = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        avisoNombreprov = new javax.swing.JLabel();
        avisoCIprov = new javax.swing.JLabel();
        avisoTelefonoprov = new javax.swing.JLabel();
        avisoMailprov = new javax.swing.JLabel();
        avisoDireccionprov = new javax.swing.JLabel();
        avisoDescripcionProd = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(37, 77, 116));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 245, 245));
        jLabel8.setText("REGISTRAR PROVEEDOR");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Nombre de Proveedor:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("CI/NIT:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("Teléfono:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setText("e-mail:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("Descripcion Producto: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 245, 245));
        jLabel6.setText("Dirección");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jTextFieldNombreprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreprovActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNombreprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 190, -1));

        jTextFieldCiNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCiNITKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldCiNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 190, -1));

        jTextFieldTelefonoProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoProvKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldTelefonoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 190, -1));

        jTextFieldMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 190, -1));
        jPanel2.add(jTextFieldDireccionprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 190, -1));
        jPanel2.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 200, 40));

        avisoNombreprov.setBackground(new java.awt.Color(204, 204, 255));
        avisoNombreprov.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoNombreprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 181, 30));

        avisoCIprov.setBackground(new java.awt.Color(204, 204, 255));
        avisoCIprov.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoCIprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 181, 30));

        avisoTelefonoprov.setBackground(new java.awt.Color(204, 204, 255));
        avisoTelefonoprov.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoTelefonoprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 181, 30));

        avisoMailprov.setBackground(new java.awt.Color(204, 204, 255));
        avisoMailprov.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoMailprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 181, 30));

        avisoDireccionprov.setBackground(new java.awt.Color(204, 204, 255));
        avisoDireccionprov.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoDireccionprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 181, 30));

        avisoDescripcionProd.setBackground(new java.awt.Color(204, 204, 255));
        avisoDescripcionProd.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoDescripcionProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 181, 30));

        jButtonCancelar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 190, -1));

        jButtonGuardar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.setBorderPainted(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreprovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreprovActionPerformed

    private void jTextFieldMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMailActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String NombreProv=jTextFieldNombreprov.getText().trim();
         String CiNIT=jTextFieldCiNIT.getText().trim();
         String TelefonoProv=jTextFieldTelefonoProv.getText().trim();
         String MailProv=jTextFieldMail.getText().trim();
         String DireccionProv=jTextFieldDireccionprov.getText().trim();
         String DescripcionProd=jTextFieldDescripcion.getText().trim();
         
         
        try {
            sentencia=conexion.createStatement();
            objProveedor.nombreProv=jTextFieldNombreprov.getText();
            objProveedor.ciNIT=jTextFieldCiNIT.getText();
            objProveedor.telefonoProv=jTextFieldTelefonoProv.getText();
            objProveedor.emailProv=jTextFieldMail.getText();
            objProveedor.direccionProv=jTextFieldDireccionprov.getText();
            objProveedor.descripcionProducto=jTextFieldDescripcion.getText();
            
                    
            // Se realiza el registro
            
                String sentenciaSQL1 = new String();
                sentenciaSQL1="INSERT INTO proveedor(nombreProveedor,nitProveedor,telefonoProveedor,emailProveedor,direccionProveedor,descripcionProveedor)";
                sentenciaSQL1= sentenciaSQL1+"VALUES('"+objProveedor.nombreProv+"','"+objProveedor.ciNIT+"','"+
                        objProveedor.telefonoProv+"','"+objProveedor.emailProv+"','"+objProveedor.direccionProv+"','"+objProveedor.descripcionProducto+"')";
                sentencia.execute(sentenciaSQL1); 
                
            // Se muestra mensaje de exito
            JOptionPane.showMessageDialog(this, "Guardado con exito"); 
            
            //Se actualiza la tabla de proveedores
            ListarProveedores Administrar=new ListarProveedores();
            Administrar.MostrarTabla(jTableUsuario);
            
        } catch (SQLException e) {
            Logger.getLogger(InterfazRegistrarProveedor.class.getName()).log(Level.SEVERE,null,e);
        }
         jTextFieldNombreprov.setText("");
         jTextFieldCiNIT.setText("");
         jTextFieldTelefonoProv.setText("");
         jTextFieldMail.setText("");
         jTextFieldDireccionprov.setText("");
         jTextFieldTelefonoProv.setText("");
         jTextFieldDescripcion.setText("");
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldCiNITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiNITKeyTyped
        // TODO add your handling code here:
        Validaciones.validacionNumerica(evt);
    }//GEN-LAST:event_jTextFieldCiNITKeyTyped

    private void jTextFieldTelefonoProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoProvKeyTyped
        // TODO add your handling code here:
        Validaciones.validacionNumerica(evt);
    }//GEN-LAST:event_jTextFieldTelefonoProvKeyTyped

    public void habilitarBotonProv(){
    if(jTextFieldNombreprov.getText().isEmpty()
            || jTextFieldCiNIT.getText().isEmpty()
            || jTextFieldTelefonoProv.getText().isEmpty()
            || jTextFieldMail.getText().isEmpty()
            || jTextFieldDireccionprov.getText().isEmpty()
            || jTextFieldDescripcion.getText().isEmpty()
            
            || jTextFieldNombreprov.getText().length()<3
            || jTextFieldCiNIT.getText().length()<7
            || jTextFieldTelefonoProv.getText().length()<8
            || jTextFieldMail.getText().length()<20
            || jTextFieldDireccionprov.getText().length()<10
            || jTextFieldDescripcion.getText().length()<10 ){
        
        jButtonGuardar.setEnabled(false);
    }else{
        jButtonGuardar.setEnabled(true);
    }
    }
    
        //Validar camposVacios
    public void validarCamposVacios(){
    //Nombre proveedor
    if(jTextFieldNombreprov.getText().isEmpty()){
     avisoNombreprov.setText("Campo Obligatorio");
     }else {
            if (jTextFieldNombreprov.getText().length()<3){
             avisoNombreprov.setText("Se requiere de 3 caracteres");  
        }else{
         avisoNombreprov.setText("");}
            }
    
    //CI/NIT
    if(jTextFieldCiNIT.getText().isEmpty()){
     avisoCIprov.setText("Campo Obligatorio");
    }else{
        if(jTextFieldCiNIT.getText().length()<7){
            avisoCIprov.setText("Se requiere de 7 caracteres");  
        }else{
         avisoCIprov.setText("");}
    }
    
    //Telefono
    if(jTextFieldTelefonoProv.getText().isEmpty()){
     avisoTelefonoprov.setText("Campo Obligatorio");
    }else{
        if(jTextFieldTelefonoProv.getText().length()<8){
             avisoTelefonoprov.setText("Se requiere 8 digitos");
        }else{
            avisoTelefonoprov.setText("");}        
    }
    
    //Email
    if(jTextFieldMail.getText().isEmpty()){
     avisoMailprov.setText("Campo Obligatorio");
    }else{
        if (jTextFieldMail.getText().length()<20){
            avisoMailprov.setText("Se requiere 20 digito");
        }else{
            avisoMailprov.setText("");}         
    }
    
    //DireccionProveedor
    if(jTextFieldDireccionprov.getText().isEmpty()){
    avisoDireccionprov.setText("Campo Obligatorio");
    }else{
        if(jTextFieldDireccionprov.getText().length()<10){
            avisoDireccionprov.setText("Se requiere 10 caracteres");
        }
        else{
           avisoDireccionprov.setText("");}     
    }
    
    //DescripcionProducto Prov
    if(jTextFieldDescripcion.getText().isEmpty()){
    avisoDescripcionProd.setText("Campo Obligatorio");
    }else{
        if(jTextFieldDescripcion.getText().length()<10){
            avisoDescripcionProd.setText("Se requiere 10 caracteres");
        }
        else{
           avisoDescripcionProd.setText("");}     
    }
}

                  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistrarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoCIprov;
    private javax.swing.JLabel avisoDescripcionProd;
    private javax.swing.JLabel avisoDireccionprov;
    private javax.swing.JLabel avisoMailprov;
    private javax.swing.JLabel avisoNombreprov;
    private javax.swing.JLabel avisoTelefonoprov;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCiNIT;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldDireccionprov;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNombreprov;
    private javax.swing.JTextField jTextFieldTelefonoProv;
    // End of variables declaration//GEN-END:variables
}
