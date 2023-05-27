/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.ConectarBD;
import Modelo.Usuario;
import Controlador.ListarProveedores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class InterfazAdministrarProveedor extends javax.swing.JFrame {
    static Connection conexion=null;
    static Statement sentencia=null;    
    static Usuario objUsuario;
    ConectarBD con = new ConectarBD();
    private DefaultTableModel modeloTabla;
    public static int idUsuarioTabla;
    public static javax.swing.JButton bEditar;
    public static javax.swing.JButton bEliminar;
    public static javax.swing.JButton bRegistrar;
    
    public InterfazAdministrarProveedor() {
        initComponents();
        this.setDefaultCloseOperation(1);
        this.setLocationRelativeTo(null);
        ListarProveedores Administrar=new ListarProveedores();
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
        jButtonHome = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(37, 77, 116));
        jPanel1.setPreferredSize(new java.awt.Dimension(1042, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRAR PROVEEDORES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de Proveedor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 137, -1, -1));

        jTableUsuario.setBackground(new java.awt.Color(240, 240, 240));
        jTableUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nombre", "NIT/CI", "Telefono", "email", "Dirección", "Descripción"
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableUsuarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 226, 959, 230));

        jButtonEditar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonEditar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(245, 245, 245));
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
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 528, -1, -1));

        jButtonEliminar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(245, 245, 245));
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
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 528, -1, -1));

        jButtonRegistrar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(245, 245, 245));
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
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 528, -1, -1));

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
        jPanel1.add(jTextFieldBuscarCoincidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 183, 284, -1));

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
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 182, -1, -1));

        jButtonHome.setBackground(new java.awt.Color(95, 143, 169));
        jButtonHome.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHome.setText("HOME");
        jButtonHome.setToolTipText("");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user.png"))); // NOI18N
        jLabel6.setText("   JUAN CARLOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 38, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nombre usuario.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscarCoincidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarCoincidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarCoincidenciaActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        ListarProveedores Administrar=new ListarProveedores();
        Administrar.MostrarTablaBuscar(jTableUsuario,jTextFieldBuscarCoincidencia.getText());    
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        deshabilitar();
        InterfazEliminarProveedor ventanaEliminar=new InterfazEliminarProveedor();
        ventanaEliminar.setVisible(true);
        ventanaEliminar.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        deshabilitar();
        InterfazEditarProveedores ventadaEditar=new InterfazEditarProveedores();
        ventadaEditar.setVisible(true);
        ventadaEditar.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        deshabilitar();
        InterfazRegistrarProveedor ventanaProv=new InterfazRegistrarProveedor();
        ventanaProv.setVisible(true);
        ventanaProv.setLocationRelativeTo(null);

        
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
        
    }//GEN-LAST:event_jButtonRegistrarMouseClicked

    private void jButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseClicked
        
    }//GEN-LAST:event_jButtonEditarMouseClicked

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        
    }//GEN-LAST:event_jButtonEliminarMouseClicked

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTableUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMousePressed
     if (evt.getClickCount() == 2) {
        int seleccionar = jTableUsuario.rowAtPoint(evt.getPoint());
        idUsuarioTabla = Integer.parseInt(String.valueOf(jTableUsuario.getValueAt(seleccionar, 0)));
        habilitarBotonEditar_Eliminar(idUsuarioTabla);

        // Abre la ventana de mensaje con la información de la celda seleccionada
        int columnaSeleccionada = jTableUsuario.columnAtPoint(evt.getPoint());
        int filaSeleccionada = jTableUsuario.rowAtPoint(evt.getPoint());
        String informacion = jTableUsuario.getValueAt(filaSeleccionada, columnaSeleccionada).toString();
        JOptionPane.showMessageDialog(this, informacion, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_jTableUsuarioMousePressed

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
            java.util.logging.Logger.getLogger(InterfazAdministrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdministrarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldBuscarCoincidencia;
    // End of variables declaration//GEN-END:variables
}
