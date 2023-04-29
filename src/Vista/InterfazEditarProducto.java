/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.ConectarBD;
import Controlador.ListarProducto;
import Modelo.Producto;
import Modelo.Usuario;
import static Vista.InterfazAdministrarProducto.codProdutoLista;
import static Vista.InterfazAdministrarProducto.codigoNumero;
import static Vista.InterfazAdministrarProducto.jLabelMarca;
import static Vista.InterfazAdministrarProducto.jLabelModelo;
import static Vista.InterfazAdministrarProducto.jPanelAdministrarProducto;
import static Vista.InterfazAdministrarProducto.offset;
import static Vista.InterfazEditarUsuario.objUsuario;
import static Vista.InterfazEditarUsuario.sentencia;
import static Vista.InterfazRegistrarProducto.conexion;
import static Vista.InterfazRegistrarProducto.objProducto;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author HP
 */
public class InterfazEditarProducto extends javax.swing.JFrame {
    static Connection conexion=null;
    ConectarBD con = new ConectarBD();
     static Statement sentencia=null;
     static Producto objProducto;
    static ResultSet resultado=null;     
     static int cod=codigoNumero;
     private FileInputStream file;
     ListarProducto listaImagenes=new ListarProducto();
  
    /*
     * Creates new form InterfazRegistrarProducto
     */
    public InterfazEditarProducto() {
        initComponents();
        this.setDefaultCloseOperation(1);
        this.setLocationRelativeTo(null);
        objProducto=new Producto();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {
                
                conexion=con.establecerConexion();
                PreparedStatement pst = conexion.prepareStatement("SELECT * FROM PRODUCTO WHERE codProducto ='"+codigoNumero+"'");
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    //Datos consultados
                    jTextFieldMarca.setText(rs.getString("marcaProducto"));
                    jTextFieldModelo.setText(rs.getString("modeloProducto"));
                    jTextFieldPrecio.setText(rs.getString("precioProducto"));
                    jTextFieldStock.setText(rs.getString("stockProducto"));
                    jTextFieldCaracteristicas.setText(rs.getString("caracteristicasProducto"));
                    
                    //leer Binario
                    Blob blob = rs.getBlob("fotoProducto");
                    //pasar el binario a imagen
                    byte[] data = blob.getBytes(1, (int) blob.length());
                    //lee la imagen
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(data));
                    } catch (IOException e) {
                        Logger.getLogger(InterfazEliminarProducto.class.getName()).log(Level.SEVERE, null, e);
                    }                    
                    ImageIcon icono = new ImageIcon(img);
                    Icon imagen = new ImageIcon(icono.getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT));
                    jLabelFoto.setIcon(imagen);
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "¡Error al cargar!");
                System.out.println("Error al cargar foto: " + e);
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
        jTextFieldCaracteristicas = new javax.swing.JTextField();
        jLabelFoto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(37, 77, 116));

        jPanel1.setBackground(new java.awt.Color(37, 77, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Caracteristicas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));
        jPanel1.add(jTextFieldMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 288, -1));

        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 288, -1));
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 288, -1));
        jPanel1.add(jTextFieldStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 288, -1));

        jTextFieldCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCaracteristicasActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 288, 110));

        jLabelFoto.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFoto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFoto.setText("             fotografia");
        jLabelFoto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFotoMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 140, 250));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EDITAR PRODUCTO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jButtonGuardar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 170, -1));

        jButtonCancelar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeloActionPerformed

    private void jTextFieldCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCaracteristicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCaracteristicasActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
     
       

    try {
        sentencia = conexion.createStatement();
        objProducto.marca = jTextFieldMarca.getText();
        objProducto.modelo = jTextFieldModelo.getText();
        objProducto.precio = jTextFieldPrecio.getText();
        objProducto.stock = Integer.parseInt(jTextFieldStock.getText());
        objProducto.caracteristicas = jTextFieldCaracteristicas.getText();

        // Obtener el codProducto anterior
        String codProductoAnterior = null;
        String sentenciaSQLSelect = "SELECT codProducto FROM producto WHERE codProducto=" + cod;
        ResultSet resultadoSelect = sentencia.executeQuery(sentenciaSQLSelect);

        if (resultadoSelect.next()) {
            codProductoAnterior = resultadoSelect.getString("codProducto");
        }

        String sentenciaSQL = "UPDATE producto SET marcaProducto = ?, modeloProducto = ?, precioProducto = ?, stockProducto = ?, caracteristicasProducto = ?";
        PreparedStatement ps = null;
        if (file != null) {
            sentenciaSQL += ", fotoProducto = ?";
            ps = conexion.prepareStatement(sentenciaSQL);
            ps.setBlob(4, file, objProducto.foto);
        } else {
            ps = conexion.prepareStatement(sentenciaSQL);
        }
        sentenciaSQL += " WHERE codProducto = " + codProductoAnterior;
        ps = conexion.prepareStatement(sentenciaSQL);

        ps.setString(1, objProducto.marca);
        ps.setString(2, objProducto.modelo);
        ps.setString(3, objProducto.precio);
        ps.setInt(4, objProducto.stock);
        ps.setString(5, objProducto.caracteristicas);

        if (file != null) {
            ps.setBlob(6, file, objProducto.foto);
        }

        int resultado = ps.executeUpdate();

        if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "Producto actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el producto.");
        }

        dispose();
    } catch (SQLException e) {
        Logger.getLogger(InterfazEditarProducto.class.getName()).log(Level.SEVERE, null, e);
    }
offset=0;
        listaImagenes.mostrarFotoInicio(jLabelFoto, jLabelMarca, jLabelModelo, jPanelAdministrarProducto, codProdutoLista);

                                  
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jLabelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseClicked
        // TODO add your handling code here:
        
        JFileChooser se = new JFileChooser();
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = se.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {

                file = new FileInputStream(se.getSelectedFile());
                
                objProducto.foto = (int) se.getSelectedFile().length();
                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT);
                jLabelFoto.setIcon(new ImageIcon(icono));
                jLabelFoto.updateUI();            
            } catch (IOException e) {                
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_jLabelFotoMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazEditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEditarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCaracteristicas;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldStock;
    // End of variables declaration//GEN-END:variables
}
