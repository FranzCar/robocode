/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;
import Conexion.ConectarBD;
import Modelo.Usuario;
import java.awt.Image;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author HP
 */
public class InterfazRegistrarProducto extends javax.swing.JFrame {
    static Connection conexion=null;
    static Statement sentencia=null;
    static ResultSet resultado=null;
    static Usuario objUsuario;
    int id;
    ConectarBD con = new ConectarBD();    
    //Date today=new Date();

    public InterfazRegistrarProducto() {
        initComponents();
        this.setDefaultCloseOperation(1);
        this.setLocationRelativeTo(null);
        
        //habilitarBoton();//habilitar boton de inicio
        this.setDefaultCloseOperation(1);
        this.setLocationRelativeTo(null);
        objUsuario=new Usuario(); 
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jTextFieldMarcaCaracteristicas = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(37, 77, 116));

        jPanel1.setBackground(new java.awt.Color(37, 77, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 152, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 209, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 255, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Caracteristicas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        jPanel1.add(jTextFieldMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 158, 288, -1));

        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 215, 288, -1));
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 261, 288, -1));
        jPanel1.add(jTextFieldStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 288, -1));

        jTextFieldMarcaCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaCaracteristicasActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldMarcaCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 288, 50));

        lblImagen.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen.setForeground(new java.awt.Color(255, 255, 255));
        lblImagen.setText("                         fotografia");
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 152, 220, 200));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REGISTRAR PRODUCTO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 22, -1, -1));

        jButtonGuardar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 525, 170, -1));

        jButtonCancelar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 525, 190, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeloActionPerformed

    private void jTextFieldMarcaCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaCaracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaCaracteristicasActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

         String Marca=jTextFieldMarca.getText().trim();
        String Modelo=jTextFieldModelo.getText().trim();
        String Precio=jTextFieldPrecio.getText().trim();
        String Stock=jTextFieldStock.getText().trim();
        String Caracteristicas=jTextFieldMarcaCaracteristicas.getText().trim();
        
        if(Marca.isEmpty()|| Marca.startsWith(" ")|| Marca.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo Marca este correcto");
            return;
        }
         if(Modelo.isEmpty()|| Modelo.startsWith(" ")|| Modelo.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo Modelo este correcto");
            return;
        }
          if(Precio.isEmpty()|| Precio.startsWith(" ")|| Precio.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo Precio este correcto");
            return;
        }
           if(Stock.isEmpty()|| Stock.startsWith(" ")|| Stock.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo Stock este correcto");
            return;
        }
            if(Caracteristicas.isEmpty()|| Caracteristicas.startsWith(" ")|| Caracteristicas.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo Caracteristicas este correcto");
            return;
        }
            
        try {
            sentencia=conexion.createStatement();
            objUsuario.Marca=jTextFieldMarca.getText();
            objUsuario.carnetDeIdentidad=jTextFieldModelo.getText();
            objUsuario.telefono=jTextFieldPrecio.getText();
            objUsuario.idUsuario=jTextFieldStock.getText();
            objUsuario.Contrasenia=jTextFieldMarcaCaracteristicas.getText();
            
            //objUsuario.direccion=jTextFieldDireccion.getText();
            
            //Para validar que el id usuario no sea duplicado
            
            String sentenciaSQL2 = "SELECT COUNT(*) FROM usuarios WHERE idUsuario = '" + objUsuario.idUsuario + "'";
            ResultSet resultado = sentencia.executeQuery(sentenciaSQL2);
            resultado.next();
            int count = resultado.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "El nombre de IdUsuario ya existe. Por favor ingrese otro idUsuario.");
                return;
            }
            
           //Para validar que el telefono de usuario no sea duplicado
            String sentenciaSQL3 = "SELECT COUNT(*) FROM usuarios WHERE telefonoUsuario = '" + objUsuario.telefono + "'";
            ResultSet resultado3 = sentencia.executeQuery(sentenciaSQL3);
            resultado3.next();
            int count2 = resultado3.getInt(1);
            if (count2 > 0) {
                JOptionPane.showMessageDialog(this, "El Telefono ya existe. Por favor ingrese otro numero.");
                return;
            }
                       
            
             //Para validar que el carnetDeIdentidad no sea duplicado
            
            String sentenciaSQLCI = "SELECT COUNT(*) FROM usuarios WHERE ciUsuario = '" + objUsuario.carnetDeIdentidad + "'";
            ResultSet resultadoCI = sentencia.executeQuery(sentenciaSQLCI);
            resultadoCI.next();
            int count4 = resultadoCI.getInt(1);
            if (count4 > 0) {
                JOptionPane.showMessageDialog(this, "El Carnet de Identidad ya existe. Por favor ingrese otro.");
                return;
            }           
            // Si no esta duplicado, se realiza el registro
            
                String sentenciaSQL1 = new String();
                sentenciaSQL1="INSERT INTO producto(marcaProducto,marcaProducto,modeloProducto,precioProducto,stockProducto,caracteristicasProducto,fotoProducto)";
                sentenciaSQL1= sentenciaSQL1+"VALUES('"+objUsuario.nombreDeUsuario+"','"+objUsuario.carnetDeIdentidad+"','"+objUsuario.telefono+
                                    "','"+fecha+"','"+objUsuario.idUsuario+"','"+objUsuario.Contrasenia+"','"+objUsuario.direccion+"')";
                sentencia.execute(sentenciaSQL1); 
                
            // Se muestra mensaje de exito
            JOptionPane.showMessageDialog(this, "Guardado con exito"); 
            
            //Se actualiza la tabla de usuarios
            ListarUsuarios Administrar=new ListarUsuarios();
            Administrar.MostrarTabla(jTableUsuario);
            
        } catch (SQLException e) {
            Logger.getLogger(InterfazRegistrarUsuario.class.getName()).log(Level.SEVERE,null,e);
        }
        jTextFieldCi.setText("");
        jTextFieldContrasenia.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldNombre.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldIdUsuario.setText("");
        jDateChooserFechaInicio.setDate(null);
    
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Ruta = "";
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JGP, PNG","jpg", "png");
        jFileChooser.setFileFilter(filtrado);
        
        int respuesta = jFileChooser.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION){
            Ruta = jFileChooser.getSelectedFile().getPath();
            
            Image mImagen = new ImageIcon(Ruta).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(mIcono);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistrarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldMarcaCaracteristicas;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldStock;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
