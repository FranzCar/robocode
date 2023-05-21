/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author nando
 */
public class InterfazEliminarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form InterfazEliminarProveedor
     */
    public InterfazEliminarProveedor() {
        initComponents();
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
        lblNombreProveedor = new javax.swing.JLabel();
        lblCiONit = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDescripcionProducto = new javax.swing.JLabel();
        txtEmailProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtNitProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCancelarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        lblDireccion = new javax.swing.JLabel();
        txtDireccionProveedor = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcionProveedor = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(37, 77, 116));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 608));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreProveedor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblNombreProveedor.setForeground(new java.awt.Color(245, 245, 245));
        lblNombreProveedor.setText("Nombre de Proveedor:");
        jPanel1.add(lblNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        lblCiONit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblCiONit.setForeground(new java.awt.Color(245, 245, 245));
        lblCiONit.setText("CI / NIT:");
        jPanel1.add(lblCiONit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(245, 245, 245));
        lblTelefono.setText("Teléfono");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(245, 245, 245));
        lblEmail.setText("e-mail:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        lblDescripcionProducto.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblDescripcionProducto.setForeground(new java.awt.Color(245, 245, 245));
        lblDescripcionProducto.setText("Descripción producto:");
        jPanel1.add(lblDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        txtEmailProveedor.setBackground(new java.awt.Color(165, 221, 251));
        txtEmailProveedor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtEmailProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailProveedorActionPerformed(evt);
            }
        });
        txtEmailProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailProveedorKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmailProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 300, 27));

        txtTelefonoProveedor.setBackground(new java.awt.Color(165, 221, 251));
        txtTelefonoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtTelefonoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoProveedorActionPerformed(evt);
            }
        });
        txtTelefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 300, -1));

        txtNitProveedor.setBackground(new java.awt.Color(165, 221, 251));
        txtNitProveedor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNitProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitProveedorActionPerformed(evt);
            }
        });
        txtNitProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtNitProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 300, 27));

        txtNombreProveedor.setBackground(new java.awt.Color(165, 221, 251));
        txtNombreProveedor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });
        txtNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 300, 27));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ELIMINAR PROVEEDOR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        btnCancelarProveedor.setBackground(new java.awt.Color(97, 150, 180));
        btnCancelarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCancelarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelarProveedor.setText("CANCELAR");
        btnCancelarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, -1, -1));

        btnEliminarProveedor.setBackground(new java.awt.Color(97, 150, 180));
        btnEliminarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnEliminarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminarProveedor.setText("ELIMINAR");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(245, 245, 245));
        lblDireccion.setText("Dirección:");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        txtDireccionProveedor.setBackground(new java.awt.Color(165, 221, 251));
        txtDireccionProveedor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtDireccionProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 300, 32));

        txtAreaDescripcionProveedor.setBackground(new java.awt.Color(165, 221, 251));
        txtAreaDescripcionProveedor.setColumns(20);
        txtAreaDescripcionProveedor.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcionProveedor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 300, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoProveedorActionPerformed

    private void txtTelefonoProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorKeyReleased
      

    }//GEN-LAST:event_txtTelefonoProveedorKeyReleased

    private void txtTelefonoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorKeyTyped
       

    }//GEN-LAST:event_txtTelefonoProveedorKeyTyped

    private void txtNitProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitProveedorActionPerformed

    private void txtNitProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitProveedorKeyReleased
        
    }//GEN-LAST:event_txtNitProveedorKeyReleased

    private void txtNitProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitProveedorKeyTyped

    }//GEN-LAST:event_txtNitProveedorKeyTyped

    private void txtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProveedorActionPerformed

    private void txtNombreProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProveedorKeyReleased
        
    }//GEN-LAST:event_txtNombreProveedorKeyReleased

    private void txtNombreProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProveedorKeyTyped

    }//GEN-LAST:event_txtNombreProveedorKeyTyped

    private void txtEmailProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailProveedorKeyReleased
        
    }//GEN-LAST:event_txtEmailProveedorKeyReleased

    private void txtEmailProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
      
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnCancelarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProveedorActionPerformed

    }//GEN-LAST:event_btnCancelarProveedorActionPerformed

    private void txtDireccionProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionProveedorActionPerformed

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
    private javax.swing.JButton btnCancelarProveedor;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCiONit;
    private javax.swing.JLabel lblDescripcionProducto;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombreProveedor;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextArea txtAreaDescripcionProveedor;
    private javax.swing.JPasswordField txtDireccionProveedor;
    private javax.swing.JTextField txtEmailProveedor;
    private javax.swing.JTextField txtNitProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
