/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Usuario;
import Modelo.ConectarBD;
import Modelo.ListarUsuarios;
import static Vista.InterfazAdministrarUsuario.idUsuarioTabla;
import static Vista.InterfazAdministrarUsuario.jTableUsuario;
import java.awt.Toolkit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class InterfazEliminarUsuario extends javax.swing.JFrame {

    static Connection conexion=null;
    static Statement sentencia=null;
    static ResultSet resultado=null;     
    static Usuario objUsuario;
    ConectarBD con = new ConectarBD();
    int id=idUsuarioTabla;
    
    public InterfazEliminarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        jButtonEliminar.setEnabled(true);
        
        objUsuario=new Usuario();
              
        try {
            conexion=con.establecerConexion();           
        } catch (Exception e) {
            
        }
        
        String consultasql = new String();
        consultasql = "SELECT *FROM USUARIOS WHERE codUsuario="+id;        
        
        try{
            sentencia=conexion.createStatement();
            ResultSet rs = sentencia.executeQuery(consultasql);
            
            while(rs.next()){
                jTextFieldNombre.setText(rs.getString("nombreUsuario"));             
                jTextFieldCi.setText(rs.getString("ciUsuario"));
                jTextFieldTelefono.setText(rs.getString("telefonoUsuario"));
                jTextFieldDireccion.setText(rs.getString("direccionUsuario"));
                jTextFieldContrasenia.setText(rs.getString("contraseniaUsuario"));
                jTextFieldIdUsuario.setText(rs.getString("idUsuario"));
                java.util.Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fechaInicioUsuario"));
                jDateChooserFechaInicio.setDate(date2);                      
            }
        }catch(Exception e){
            System.out.println("ERROR AL LISTAR LOS DATOS" + e);
        }
        jTextFieldNombre.setEditable(false);
        jTextFieldCi.setEditable(false);
        jTextFieldTelefono.setEditable(false);
        jTextFieldDireccion.setEditable(false);
        jTextFieldContrasenia.setEditable(false);
        jTextFieldIdUsuario.setEditable(false);
        jDateChooserFechaInicio.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAvisoNombre = new javax.swing.JLabel();
        lbAvisoCI = new javax.swing.JLabel();
        ldAvisoTelefono = new javax.swing.JLabel();
        lbAvisoFecha = new javax.swing.JLabel();
        lbAvisoIDusuario = new javax.swing.JLabel();
        lbAvisoContrasenia = new javax.swing.JLabel();
        lbAvisoDireccion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldContrasenia = new javax.swing.JTextField();
        jTextFieldIdUsuario = new javax.swing.JTextField();
        jDateChooserFechaInicio = new com.toedter.calendar.JDateChooser();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldCi = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(610, 582));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAvisoNombre.setForeground(new java.awt.Color(245, 245, 245));
        getContentPane().add(lbAvisoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 97, 181, 33));

        lbAvisoCI.setForeground(new java.awt.Color(245, 245, 245));
        getContentPane().add(lbAvisoCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 161, 181, 33));

        ldAvisoTelefono.setForeground(new java.awt.Color(245, 245, 245));
        getContentPane().add(ldAvisoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 220, 181, 33));

        lbAvisoFecha.setForeground(new java.awt.Color(245, 245, 245));
        getContentPane().add(lbAvisoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 276, 181, 33));

        lbAvisoIDusuario.setForeground(new java.awt.Color(245, 245, 245));
        getContentPane().add(lbAvisoIDusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 327, 181, 33));

        lbAvisoContrasenia.setForeground(new java.awt.Color(245, 245, 245));
        getContentPane().add(lbAvisoContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 387, 181, 33));

        lbAvisoDireccion.setForeground(new java.awt.Color(245, 245, 245));
        getContentPane().add(lbAvisoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 444, 181, 33));

        jPanel1.setBackground(new java.awt.Color(37, 77, 116));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(630, 579));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Nombre de Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("Carnet de Identidad");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("Telefono");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setText("Fecha de inicio");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setText("Id Usuario");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("Contrasenia");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 245, 245));
        jLabel6.setText("Dirección");

        jTextFieldDireccion.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });
        jTextFieldDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDireccionKeyTyped(evt);
            }
        });

        jTextFieldContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseniaActionPerformed(evt);
            }
        });
        jTextFieldContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldContraseniaKeyReleased(evt);
            }
        });

        jTextFieldIdUsuario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdUsuarioActionPerformed(evt);
            }
        });
        jTextFieldIdUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldIdUsuarioKeyReleased(evt);
            }
        });

        jDateChooserFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserFechaInicio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jDateChooserFechaInicio.setPreferredSize(new java.awt.Dimension(80, 33));

        jTextFieldTelefono.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });

        jTextFieldCi.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiActionPerformed(evt);
            }
        });
        jTextFieldCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCiKeyTyped(evt);
            }
        });

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ELIMINAR USUARIO");

        jButtonCancelar.setBackground(new java.awt.Color(97, 150, 180));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(97, 150, 180));
        jButtonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCi)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldTelefono)
                            .addComponent(jTextFieldIdUsuario)
                            .addComponent(jTextFieldContrasenia)
                            .addComponent(jTextFieldDireccion)
                            .addComponent(jDateChooserFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButtonEliminar)
                        .addGap(110, 110, 110)
                        .addComponent(jButtonCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel9)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooserFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            sentencia=conexion.createStatement();
                   
            String sentenciaSQL1 = new String();
            sentenciaSQL1="DELETE FROM USUARIOS WHERE codUsuario="+id;
                 
            sentencia.execute(sentenciaSQL1); 
            JOptionPane.showMessageDialog(this, "Eliminado con exito"); 
            dispose();

        } catch (SQLException e) {
            Logger.getLogger(InterfazRegistrarUsuario.class.getName()).log(Level.SEVERE,null,e);
        }
        
        ListarUsuarios Administrar=new ListarUsuarios();
        Administrar.MostrarTabla(jTableUsuario);
        //dispose();

    }//GEN-LAST:event_jButtonEliminarActionPerformed

        public static boolean validar(String datos){
        return datos.matches("[0-9][1,8]");
    }
public void habilitarBoton(){
    if(jTextFieldNombre.getText().isEmpty()
            || jTextFieldCi.getText().isEmpty()
            || jTextFieldTelefono.getText().isEmpty()
            || jTextFieldIdUsuario.getText().isEmpty()
            || jTextFieldContrasenia.getText().isEmpty()
            || jTextFieldDireccion.getText().isEmpty()){
        jButtonEliminar.setEnabled(false);
    }else{
    jButtonEliminar.setEnabled(true);
    }
}
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdUsuarioActionPerformed

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jTextFieldCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiActionPerformed

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTextFieldCiKeyReleased

    private void jTextFieldCiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiKeyTyped
    }//GEN-LAST:event_jTextFieldCiKeyTyped

    private void jTextFieldTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyReleased
        habilitarBoton();
        
    }//GEN-LAST:event_jTextFieldTelefonoKeyReleased

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        if(jTextFieldTelefono.getText().length()>=8){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
         
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jTextFieldIdUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTextFieldIdUsuarioKeyReleased

    private void jTextFieldContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseniaKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTextFieldContraseniaKeyReleased

    private void jTextFieldDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTextFieldDireccionKeyReleased

    private void jTextFieldDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyTyped
    }//GEN-LAST:event_jTextFieldDireccionKeyTyped

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseniaActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEliminarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private com.toedter.calendar.JDateChooser jDateChooserFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCi;
    private javax.swing.JTextField jTextFieldContrasenia;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldIdUsuario;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JLabel lbAvisoCI;
    private javax.swing.JLabel lbAvisoContrasenia;
    private javax.swing.JLabel lbAvisoDireccion;
    private javax.swing.JLabel lbAvisoFecha;
    private javax.swing.JLabel lbAvisoIDusuario;
    private javax.swing.JLabel lbAvisoNombre;
    private javax.swing.JLabel ldAvisoTelefono;
    // End of variables declaration//GEN-END:variables
}
