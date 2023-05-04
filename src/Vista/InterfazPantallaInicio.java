/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author nando
 */
public class InterfazPantallaInicio extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPantallaInicio
     */
    public InterfazPantallaInicio() {
        initComponents();
        this.setDefaultCloseOperation(1);
        this.setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonUsuario = new javax.swing.JButton();
        jButtonkProducto = new javax.swing.JButton();
        jButtonVenta = new javax.swing.JButton();
        jButtonProveedores = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(37, 77, 116));
        jPanel2.setPreferredSize(new java.awt.Dimension(1042, 650));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido _______________");
        jLabel1.setMaximumSize(new java.awt.Dimension(431, 48));
        jLabel1.setMinimumSize(new java.awt.Dimension(431, 48));
        jLabel1.setPreferredSize(new java.awt.Dimension(431, 48));

        jButtonUsuario.setBackground(new java.awt.Color(95, 143, 169));
        jButtonUsuario.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AdministrarUsuarios.png"))); // NOI18N
        jButtonUsuario.setText("Administrar Usuarios");
        jButtonUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AdministrarUsuarios.png"))); // NOI18N
        jButtonUsuario.setVerifyInputWhenFocusTarget(false);
        jButtonUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioActionPerformed(evt);
            }
        });

        jButtonkProducto.setBackground(new java.awt.Color(95, 143, 169));
        jButtonkProducto.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonkProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AdministrarDispositivos.png"))); // NOI18N
        jButtonkProducto.setText("Administrar Productos");
        jButtonkProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonkProductoActionPerformed(evt);
            }
        });

        jButtonVenta.setBackground(new java.awt.Color(95, 143, 169));
        jButtonVenta.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/RegistroDeVentas.png"))); // NOI18N
        jButtonVenta.setText("Registro de Ventas");
        jButtonVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButtonProveedores.setBackground(new java.awt.Color(95, 143, 169));
        jButtonProveedores.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AdministrarProveedores.png"))); // NOI18N
        jButtonProveedores.setText("Administrar Proveedores");
        jButtonProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProveedores.setName(""); // NOI18N
        jButtonProveedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton5.setBackground(new java.awt.Color(60, 171, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton5.setText("Cerrar Sesión");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonkProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonkProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonkProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonkProductoActionPerformed
        InterfazAdministrarProducto administrarProducto=new InterfazAdministrarProducto();
        administrarProducto.setVisible(true);
        administrarProducto.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonkProductoActionPerformed

    private void jButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioActionPerformed
        InterfazAdministrarUsuario administrarUsuario=new InterfazAdministrarUsuario();
        administrarUsuario.setVisible(true);
        administrarUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPantallaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonProveedores;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JButton jButtonVenta;
    private javax.swing.JButton jButtonkProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
