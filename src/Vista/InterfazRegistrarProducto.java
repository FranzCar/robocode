/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.ConectarBD;
import Controlador.ListarProducto;
import Controlador.Validaciones;
import Modelo.Producto;

import static Vista.InterfazAdministrarProducto.codProdutoLista;
import static Vista.InterfazAdministrarProducto.jLabelFoto;
import static Vista.InterfazAdministrarProducto.jLabelMarca;
import static Vista.InterfazAdministrarProducto.jLabelModelo;
import static Vista.InterfazAdministrarProducto.offset;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static Vista.InterfazAdministrarProducto.jPanelAdministrarProducto;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class InterfazRegistrarProducto extends javax.swing.JFrame {
    
    static Connection conexion=null;
    static Statement sentencia=null;
    private FileInputStream file;
    static Producto objProducto;
    ConectarBD con = new ConectarBD();
    ListarProducto listaImagenes=new ListarProducto();
    
    public InterfazRegistrarProducto() {
        
        initComponents();
        this.setDefaultCloseOperation(1);
        this.setLocationRelativeTo(null);
        
        objProducto=new Producto();
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
        jTextFieldCaracteristicas = new javax.swing.JTextField();
        jLabelFoto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        avisoMarca = new javax.swing.JLabel();
        avisoModelo = new javax.swing.JLabel();
        avisoPrecio = new javax.swing.JLabel();
        avisoStock = new javax.swing.JLabel();
        avisoCaracteristicas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(37, 77, 116));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(37, 77, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Caracteristicas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jTextFieldMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMarcaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMarcaKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 288, -1));

        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });
        jTextFieldModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldModeloKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldModeloKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 288, -1));

        jTextFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 288, -1));

        jTextFieldStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldStockKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldStockKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 288, -1));

        jTextFieldCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCaracteristicasActionPerformed(evt);
            }
        });
        jTextFieldCaracteristicas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCaracteristicasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCaracteristicasKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 288, 100));

        jLabelFoto.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFoto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFoto.setText("             fotografia");
        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFotoMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 150, 258));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REGISTRAR PRODUCTO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jButtonGuardar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.setBorderPainted(false);
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jButtonGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonGuardarKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 170, -1));

        jButtonCancelar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 190, -1));

        avisoMarca.setBackground(new java.awt.Color(255, 255, 255));
        avisoMarca.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(avisoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 290, 20));

        avisoModelo.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(avisoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 290, 20));

        avisoPrecio.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(avisoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 290, 20));

        avisoStock.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(avisoStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 290, 20));

        avisoCaracteristicas.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(avisoCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 290, 20));

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
        String marca=jTextFieldMarca.getText().trim();
        String modelo=jTextFieldModelo.getText().trim();
        String precio=jTextFieldPrecio.getText().trim();
        String stock=jTextFieldStock.getText().trim();
        String caract=jTextFieldCaracteristicas.getText().trim();
      
        
        if(marca.isEmpty()|| marca.startsWith(" ")|| marca.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo nombre este correcto");
            return;
        }
         if(modelo.isEmpty()|| modelo.startsWith(" ")|| modelo.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo carnet de identidad este correcto");
            return;
        }
          if(precio.isEmpty()|| precio.startsWith(" ")|| precio.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo tel este correcto");
            return;
        }
           if(stock.isEmpty()|| stock.startsWith(" ")|| stock.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo direccion este correcto");
            return;
        }
             if(caract.isEmpty()|| caract.startsWith(" ")|| caract.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo idusuario este correcto");
            return;
        }
        
        try{
            
            objProducto.marca=jTextFieldMarca.getText();
            objProducto.modelo=jTextFieldModelo.getText();
            objProducto.precio=jTextFieldPrecio.getText();
            objProducto.stock=Integer.parseInt(jTextFieldStock.getText());
            objProducto.caracteristicas=jTextFieldCaracteristicas.getText();
            PreparedStatement pst = conexion.prepareStatement("INSERT INTO producto(marcaProducto,modeloProducto,precioProducto,stockProducto,caracteristicasProducto,fotoProducto) VALUES (?,?,?,?,?,?)");
            pst.setString(1, objProducto.marca);
            pst.setString(2, objProducto.modelo);
            pst.setString(3, objProducto.precio);
            pst.setInt(4, objProducto.stock);
            pst.setString(5, objProducto.caracteristicas);            
            pst.setBlob(6, file, objProducto.foto);
            pst.executeUpdate();
            jTextFieldMarca.setText("");
            jTextFieldModelo.setText("");
            jTextFieldPrecio.setText("");
            jTextFieldStock.setText("");
            jTextFieldCaracteristicas.setText("");        
            jLabelFoto.setIcon(null);
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        }catch(SQLException e){
            Logger.getLogger(InterfazRegistrarUsuario.class.getName()).log(Level.SEVERE,null,e);
        }
        offset=0;
        listaImagenes.mostrarFotoInicio(jLabelFoto, jLabelMarca, jLabelModelo, jPanelAdministrarProducto, codProdutoLista);
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jLabelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseClicked
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

    private void jTextFieldMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMarcaKeyTyped
         validacionEspacio(evt);
        validacionCaracteres(evt);
        
        if(jTextFieldMarca.getText().length()>=10){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        } 
    }//GEN-LAST:event_jTextFieldMarcaKeyTyped

    private void jButtonGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonGuardarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarKeyPressed

    private void jTextFieldModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldModeloKeyTyped
      validacionCaracteresES(evt);
        
        jTextFieldModelo.setText(jTextFieldModelo.getText());
        if(jTextFieldModelo.getText().length()>=50){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
         }
    }//GEN-LAST:event_jTextFieldModeloKeyTyped

    private void jTextFieldPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioKeyTyped
       validacionNumeros(evt);
        jTextFieldPrecio.setText(jTextFieldPrecio.getText().trim());
        if(jTextFieldPrecio.getText().length()>=5){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldPrecioKeyTyped

    private void jTextFieldStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStockKeyTyped
    validacionNumeros(evt);
        jTextFieldStock.setText(jTextFieldStock.getText().trim());
        if(jTextFieldStock.getText().length()>=4){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldStockKeyTyped

    private void jTextFieldCaracteristicasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCaracteristicasKeyTyped

        validacionEspacio(evt); 
        validacionCaracteresDireccion(evt);
        
        if(jTextFieldCaracteristicas.getText().length()>=200){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldCaracteristicasKeyTyped

    private void jTextFieldMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMarcaKeyReleased
        validarCamposVacios();
        habilitarBotonP();
    }//GEN-LAST:event_jTextFieldMarcaKeyReleased

    private void jTextFieldModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldModeloKeyReleased
        validarCamposVacios();
        habilitarBotonP();
    }//GEN-LAST:event_jTextFieldModeloKeyReleased

    private void jTextFieldPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioKeyReleased
        validarCamposVacios();
        habilitarBotonP();
    }//GEN-LAST:event_jTextFieldPrecioKeyReleased

    private void jTextFieldStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStockKeyReleased
        validarCamposVacios();
        habilitarBotonP();
    }//GEN-LAST:event_jTextFieldStockKeyReleased

    private void jTextFieldCaracteristicasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCaracteristicasKeyReleased
        validarCamposVacios();
        habilitarBotonP();
    }//GEN-LAST:event_jTextFieldCaracteristicasKeyReleased

   

    
    public void habilitarBotonP(){
    if(jTextFieldMarca.getText().isEmpty()
            || jTextFieldModelo.getText().isEmpty()
            || jTextFieldPrecio.getText().isEmpty()
            || jTextFieldStock.getText().isEmpty()
            || jTextFieldCaracteristicas.getText().isEmpty()
            //|| jTextFieldDireccion.getText().isEmpty()
            //| isEmptyFecha(jDateChooserFechaInicio.getDate())
            || jTextFieldMarca.getText().length()<=3
            || jTextFieldModelo.getText().length()<=3
            || jTextFieldPrecio.getText().length()<=2
            || jTextFieldStock.getText().length()<=1
            || jTextFieldCaracteristicas.getText().length()<=10){
        
        jButtonGuardar.setEnabled(false);
       
        }else{
        
        jButtonGuardar.setEnabled(true);
 }
    }
    
       
public void validacionEspacio(java.awt.event.KeyEvent evento){
    if (jTextFieldMarca.getText().startsWith(" ")
         ||jTextFieldModelo.getText().startsWith(" ")
         ||jTextFieldPrecio.getText().startsWith(" ")
         ||jTextFieldStock.getText().startsWith(" ")
         ||jTextFieldCaracteristicas.getText().startsWith(" ")){
    evento.consume();
            JOptionPane.showMessageDialog(this, "No puedes ingresar Espacio como primer caracter");
}
}
    
public void validarCamposVacios(){
    //marca
    if(jTextFieldMarca.getText().isEmpty()){
     avisoMarca.setText("Campo Obligatorio");
     }else {
            if (jTextFieldMarca.getText().length()<3){
             avisoMarca.setText("Se requiere de 3 caracteres");  
        }else{
         avisoMarca.setText("");}
            }
    
    //Modelo
    if(jTextFieldModelo.getText().isEmpty()){
     avisoModelo.setText("Campo Obligatorio");
    }else{
        if(jTextFieldModelo.getText().length()<3){
            avisoModelo.setText("Se requiere de 3 caracteres");  
        }else{
         avisoModelo.setText("");}
    }
    
    //Precio
    if(jTextFieldPrecio.getText().isEmpty()){
     avisoPrecio.setText("Campo Obligatorio");
    }else{
        if(jTextFieldPrecio.getText().length()<2){
             avisoPrecio.setText("Se requiere 2 digito");
        }else{
            avisoPrecio.setText("");}        
    }
    
    //Stock
    if(jTextFieldStock.getText().isEmpty()){
     avisoStock.setText("Campo Obligatorio");
    }else{
        if (jTextFieldStock.getText().length()<1){
            avisoStock.setText("Se requiere 1 digito");
        }else{
            avisoStock.setText("");}         
    }
    
    //Caracteristicas
    if(jTextFieldCaracteristicas.getText().isEmpty()){
    avisoCaracteristicas.setText("Campo Obligatorio");
    }else{
        if(jTextFieldCaracteristicas.getText().length()<10){
            avisoCaracteristicas.setText("Se requiere 10 caracteres");
        }
        else{
           avisoCaracteristicas.setText("");}     
    }
}




public static boolean validar(String datos){
        return datos.matches("[0-9][1,8]");
    }
    
    public void validacionCaracteres(java.awt.event.KeyEvent evento){
        if((evento.getKeyChar()<97 || evento.getKeyChar()>122)&&
           (evento.getKeyChar()<65 || evento.getKeyChar()>90)&&
            evento.getKeyChar()!=209&&evento.getKeyChar()!=241&&
            evento.getKeyChar()!=8&&evento.getKeyChar()!=32&&
            evento.getKeyChar()!=225&&evento.getKeyChar()!=233&&
            evento.getKeyChar()!=237&&evento.getKeyChar()!=243&&
            evento.getKeyChar()!=250&&evento.getKeyChar()!=193&&
            evento.getKeyChar()!=201&&evento.getKeyChar()!=205&&
            evento.getKeyChar()!=211&&evento.getKeyChar()!=218){
            evento.consume();
  
                JOptionPane.showMessageDialog(null, "No se permite Caracteres Especiales");
                }
}

public void validacionCaracteresDireccion(java.awt.event.KeyEvent evento){
    if((evento.getKeyChar()<97 || evento.getKeyChar()>122)&& //a-z
        (evento.getKeyChar()<65 || evento.getKeyChar()>90)&& //A-Z
        (evento.getKeyChar()<48 || evento.getKeyChar()>57)&& //0-9
        evento.getKeyChar()!=209&&evento.getKeyChar()!=241&&
        evento.getKeyChar()!=8&&evento.getKeyChar()!=32&&
        evento.getKeyChar()!=225&&evento.getKeyChar()!=233&&
        evento.getKeyChar()!=237&&evento.getKeyChar()!=243&&
        evento.getKeyChar()!=250&&evento.getKeyChar()!=193&&
        evento.getKeyChar()!=201&&evento.getKeyChar()!=205&&
        evento.getKeyChar()!=211&&evento.getKeyChar()!=218){
        evento.consume();
  
           JOptionPane.showMessageDialog(null, "No se permite Caracteres Especiales");
        }
    
}
public void validacionNumeros(java.awt.event.KeyEvent evento){
    if((evento.getKeyChar()<48 || evento.getKeyChar()>57)&&evento.getKeyChar()!=8){
        evento.consume();
    JOptionPane.showMessageDialog(null, "Solo se permiten Numeros");
    }
    
}
public void validacionCaracteresES(java.awt.event.KeyEvent evento){
    if((evento.getKeyChar()<97 || evento.getKeyChar()>122)&& //a-z
        (evento.getKeyChar()<65 || evento.getKeyChar()>90)&& //A-Z
        (evento.getKeyChar()<48 || evento.getKeyChar()>57)&& //0-9
        evento.getKeyChar()!=8){
    evento.consume();
    JOptionPane.showMessageDialog(null, "No se permite Caracteres Especiales");
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
    private javax.swing.JLabel avisoCaracteristicas;
    private javax.swing.JLabel avisoMarca;
    private javax.swing.JLabel avisoModelo;
    private javax.swing.JLabel avisoPrecio;
    private javax.swing.JLabel avisoStock;
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
