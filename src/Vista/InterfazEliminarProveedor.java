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
import java.sql.PreparedStatement;
import Conexion.ConectarBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class InterfazEliminarProveedor extends javax.swing.JFrame {
    static Connection conexion=null;
    static Statement sentencia=null;
    static ResultSet resultado=null;
    static Proveedor objProveedor;
    int id;
    ConectarBD con = new ConectarBD(); 
     static int cod=idUsuarioTabla;
    public InterfazEliminarProveedor() {
        initComponents();
        this.setDefaultCloseOperation(1);
    this.setLocationRelativeTo(null);
    objProveedor = new Proveedor();
    
    try {
        conexion = con.establecerConexion();
        PreparedStatement pst = conexion.prepareStatement("SELECT * FROM proveedor WHERE codProveedor = '" + idUsuarioTabla + "'");
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            // Datos consultados
            jTextFieldNombre.setText(rs.getString("nombreProveedor"));
            jTextFieldNIT.setText(rs.getString("nitProveedor"));
            jTextFieldTelef.setText(rs.getString("telefonoProveedor"));
            jTextFieldEmail.setText(rs.getString("emailProveedor"));
            jTextFieldDirec.setText(rs.getString("direccionProveedor"));
            jTextAreaDescripcionProducto.setText(rs.getString("descripcionProveedor"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "¡Error al cargar!");
        System.out.println("Error al cargar los datos: " + e);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDirec = new javax.swing.JTextField();
        jTextFieldTelef = new javax.swing.JTextField();
        jTextFieldNIT = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcionProducto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(37, 77, 116));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 608));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Nombre de Proveedor:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("CI / NIT:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("Teléfono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setText("e-mail:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("Descripción producto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jTextFieldDirec.setBackground(new java.awt.Color(216, 210, 203));
        jTextFieldDirec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldDirec.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDirec.setEnabled(false);
        jTextFieldDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDirecActionPerformed(evt);
            }
        });
        jTextFieldDirec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDirecKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 300, 27));

        jTextFieldTelef.setBackground(new java.awt.Color(216, 210, 203));
        jTextFieldTelef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldTelef.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldTelef.setEnabled(false);
        jTextFieldTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefActionPerformed(evt);
            }
        });
        jTextFieldTelef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 300, 27));

        jTextFieldNIT.setBackground(new java.awt.Color(216, 210, 203));
        jTextFieldNIT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNIT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNIT.setEnabled(false);
        jTextFieldNIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNITActionPerformed(evt);
            }
        });
        jTextFieldNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNITKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNITKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 300, 27));

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setBackground(new java.awt.Color(216, 210, 203));
        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNombre.setEnabled(false);
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
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 300, 27));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ELIMINAR PROVEEDOR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton cancelar.png"))); // NOI18N
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/disable cancelar.png"))); // NOI18N
        jButtonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hover cancelar.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, -1));

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton eliminar_1.png"))); // NOI18N
        jButtonEliminar.setBorder(null);
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.setContentAreaFilled(false);
        jButtonEliminar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/disable eliminar_1.png"))); // NOI18N
        jButtonEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hover eliminar_1.png"))); // NOI18N
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 245, 245));
        jLabel6.setText("Dirección:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jTextFieldEmail.setBackground(new java.awt.Color(216, 210, 203));
        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEmail.setEnabled(false);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 300, 27));

        jTextAreaDescripcionProducto.setBackground(new java.awt.Color(216, 210, 203));
        jTextAreaDescripcionProducto.setColumns(20);
        jTextAreaDescripcionProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescripcionProducto.setRows(5);
        jTextAreaDescripcionProducto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaDescripcionProducto.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaDescripcionProducto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 300, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefActionPerformed

    private void jTextFieldTelefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefKeyReleased
      

    }//GEN-LAST:event_jTextFieldTelefKeyReleased

    private void jTextFieldTelefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefKeyTyped
       

    }//GEN-LAST:event_jTextFieldTelefKeyTyped

    private void jTextFieldNITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNITActionPerformed

    private void jTextFieldNITKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNITKeyReleased
        
    }//GEN-LAST:event_jTextFieldNITKeyReleased

    private void jTextFieldNITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNITKeyTyped

    }//GEN-LAST:event_jTextFieldNITKeyTyped

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped

    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldDirecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDirecKeyReleased
        
    }//GEN-LAST:event_jTextFieldDirecKeyReleased

    private void jTextFieldDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDirecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDirecActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar al proveedor?", "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                sentencia=conexion.createStatement();
                   
                String sentenciaSQL1 = new String();
                sentenciaSQL1="DELETE FROM proveedor WHERE codProveedor="+idUsuarioTabla;
                 
                sentencia.execute(sentenciaSQL1); 
                JOptionPane.showMessageDialog(this, "Eliminado con exito"); 
                dispose();

            } catch (SQLException e) {
                Logger.getLogger(InterfazRegistrarUsuario.class.getName()).log(Level.SEVERE,null,e);
            }
            ListarProveedores Administrar = new ListarProveedores();
            Administrar.MostrarTabla(jTableUsuario);
            bRegistrar.setEnabled(true);
            dispose(); 
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(idUsuarioTabla>0){
            bRegistrar.setEnabled(true);
            bEditar.setEnabled(true);
            bEliminar.setEnabled(true);
        }else{
            bRegistrar.setEnabled(true);
        }
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailKeyReleased

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
            java.util.logging.Logger.getLogger(InterfazEliminarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEliminarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEliminarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEliminarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEliminarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcionProducto;
    private javax.swing.JTextField jTextFieldDirec;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNIT;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelef;
    // End of variables declaration//GEN-END:variables
}
