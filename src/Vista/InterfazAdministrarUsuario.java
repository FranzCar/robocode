/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.ConectarBD;
import Modelo.Usuario;
import Controlador.ListarUsuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class InterfazAdministrarUsuario extends javax.swing.JFrame {
    static Connection conexion=null;
    static Statement sentencia=null;    
    static Usuario objUsuario;
    ConectarBD con = new ConectarBD();
    private DefaultTableModel modeloTabla;
    public static int idUsuarioTabla;
    public static javax.swing.JButton bEditar;
    public static javax.swing.JButton bEliminar;
    public static javax.swing.JButton bRegistrar;
    
    public InterfazAdministrarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        ListarUsuarios Administrar=new ListarUsuarios();
        jButtonEditar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        Administrar.MostrarTabla(jTableUsuario);
        bEditar=jButtonEditar;
        bEliminar=jButtonEliminar;
        bRegistrar=jButtonRegistrar;
        
    }
    
    public void deshabilitar(){
        jButtonEditar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jButtonRegistrar.setEnabled(false);
    }

    public void habilitarBotonEditar_Eliminar(int codUsuario){
        if (codUsuario>=1){
            bEditar.setEnabled(true);
            bEliminar.setEnabled(true);
        }else{
            jButtonEditar.setEnabled(false);
            jButtonEliminar.setEnabled(false);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jTextFieldBuscarCoincidencia = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 77, 116));
        jPanel1.setPreferredSize(new java.awt.Dimension(1042, 650));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRAR USUARIOS");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de Usuario");

        jTableUsuario.setBackground(new java.awt.Color(240, 240, 240));
        jTableUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Usuario", "Nombre", "CI", "Telefono", "Usuario", "Fecha Inicio", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);

        jButtonEditar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonEditar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editarUser.png"))); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseClicked(evt);
            }
        });
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonRegistrar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/registrar.png"))); // NOI18N
        jButtonRegistrar.setText("REGISTRAR");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jTextFieldBuscarCoincidencia.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldBuscarCoincidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarCoincidenciaActionPerformed(evt);
            }
        });
        jTextFieldBuscarCoincidencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarCoincidenciaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarCoincidenciaKeyTyped(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(0, 102, 153));
        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseClicked(evt);
            }
        });
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jButtonBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(279, 279, 279))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldBuscarCoincidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jButtonBuscar))
                            .addComponent(jLabel1))
                        .addGap(521, 521, 521))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jButtonEditar)
                .addGap(140, 140, 140)
                .addComponent(jButtonEliminar)
                .addGap(126, 126, 126)
                .addComponent(jButtonRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscarCoincidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonRegistrar))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscarCoincidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarCoincidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarCoincidenciaActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        ListarUsuarios Administrar=new ListarUsuarios();
        Administrar.MostrarTablaBuscar(jTableUsuario,jTextFieldBuscarCoincidencia.getText());    
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        InterfazEliminarUsuario ventanaEliminar=new InterfazEliminarUsuario();
        ventanaEliminar.setVisible(true);
        ventanaEliminar.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        InterfazEditarUsuario ventadaEditar=new InterfazEditarUsuario();
        ventadaEditar.setVisible(true);
        ventadaEditar.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        InterfazRegistrarUsuario ventana=new InterfazRegistrarUsuario();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        int seleccionar=jTableUsuario.rowAtPoint(evt.getPoint());
        idUsuarioTabla=Integer.parseInt(String.valueOf(jTableUsuario.getValueAt(seleccionar,0)));
        habilitarBotonEditar_Eliminar(idUsuarioTabla);
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void jTextFieldBuscarCoincidenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarCoincidenciaKeyPressed
       
    }//GEN-LAST:event_jTextFieldBuscarCoincidenciaKeyPressed

    private void jButtonBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonBuscarKeyPressed
        
    }//GEN-LAST:event_jButtonBuscarKeyPressed

    private void jTextFieldBuscarCoincidenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarCoincidenciaKeyTyped
        
    }//GEN-LAST:event_jTextFieldBuscarCoincidenciaKeyTyped

    private void jButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseClicked
        idUsuarioTabla=0;
        habilitarBotonEditar_Eliminar(idUsuarioTabla);
    }//GEN-LAST:event_jButtonBuscarMouseClicked

    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked
        deshabilitar();
    }//GEN-LAST:event_jButtonRegistrarMouseClicked

    private void jButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseClicked
        deshabilitar();
    }//GEN-LAST:event_jButtonEditarMouseClicked

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        deshabilitar();
    }//GEN-LAST:event_jButtonEliminarMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazAdministrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdministrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldBuscarCoincidencia;
    // End of variables declaration//GEN-END:variables
}
