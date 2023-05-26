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
import Controlador.Validaciones;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InterfazEditarProveedores extends javax.swing.JFrame {
    static Connection conexion=null;
    static Statement sentencia=null;
    static ResultSet resultado=null;
    static Proveedor objProveedor;
    int id;
    ConectarBD con = new ConectarBD(); 
     static int cod=idUsuarioTabla;
    
    
    public InterfazEditarProveedores() {
  
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

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldNIT = new javax.swing.JTextField();
        jTextFieldTelef = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldDirec = new javax.swing.JTextField();
        avisoNombreprov = new javax.swing.JLabel();
        avisoCIprov = new javax.swing.JLabel();
        avisoTelefonoprov = new javax.swing.JLabel();
        avisoMailprov = new javax.swing.JLabel();
        avisoDireccionprov = new javax.swing.JLabel();
        avisoDescripcionProd = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcionProducto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(37, 77, 116));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 245, 245));
        jLabel8.setText("EDITAR PROVEEDOR");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Nombre de Proveedor:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("CI/NIT:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("Teléfono:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setText("e-mail:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("Descripción Producto: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 245, 245));
        jLabel6.setText("Dirección");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jPanel2.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 300, 27));

        jTextFieldNIT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNITKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNITKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 300, 27));

        jTextFieldTelef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldTelef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 300, 27));

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 300, 27));

        jTextFieldDirec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldDirec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDirecKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDirecKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 300, 27));

        avisoNombreprov.setBackground(new java.awt.Color(204, 204, 255));
        avisoNombreprov.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoNombreprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 181, 30));

        avisoCIprov.setBackground(new java.awt.Color(204, 204, 255));
        avisoCIprov.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoCIprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 181, 30));

        avisoTelefonoprov.setBackground(new java.awt.Color(204, 204, 255));
        avisoTelefonoprov.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoTelefonoprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 181, 30));

        avisoMailprov.setBackground(new java.awt.Color(204, 204, 255));
        avisoMailprov.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoMailprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 181, 30));

        avisoDireccionprov.setBackground(new java.awt.Color(204, 204, 255));
        avisoDireccionprov.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoDireccionprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 181, 30));

        avisoDescripcionProd.setBackground(new java.awt.Color(204, 204, 255));
        avisoDescripcionProd.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoDescripcionProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 181, 30));

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

        jTextAreaDescripcionProducto.setColumns(20);
        jTextAreaDescripcionProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescripcionProducto.setRows(5);
        jTextAreaDescripcionProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaDescripcionProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaDescripcionProductoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaDescripcionProducto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 300, -1));

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

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

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

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
                                                  
    String correo = jTextFieldEmail.getText();
    boolean esValido = validarCorreoElectronico(correo);
    if (esValido) {
        // El correo electrónico es válido
        try {
            sentencia = conexion.createStatement();
            objProveedor.nombreProv = jTextFieldNombre.getText();
            objProveedor.ciNIT = jTextFieldNIT.getText();
            objProveedor.telefonoProv = jTextFieldTelef.getText();
            objProveedor.emailProv = jTextFieldEmail.getText();
            objProveedor.direccionProv = jTextFieldDirec.getText();
            objProveedor.descripcionProducto = jTextAreaDescripcionProducto.getText();
            
            String sentenciaSQL1 = "UPDATE proveedor SET nombreProveedor = '" + objProveedor.nombreProv +
                                    "', nitProveedor = '" + objProveedor.ciNIT +
                                    "', telefonoProveedor = '" + objProveedor.telefonoProv +
                                    "', emailProveedor = '" + objProveedor.emailProv +
                                    "', direccionProveedor = '" + objProveedor.direccionProv +
                                    "', descripcionProveedor = '" + objProveedor.descripcionProducto +
                                    "' WHERE codProveedor = " + idUsuarioTabla;
            
            sentencia.execute(sentenciaSQL1); 
            JOptionPane.showMessageDialog(this, "Editado correctamente"); 
            dispose();
        } catch (SQLException e) {
            Logger.getLogger(InterfazEditarProveedores.class.getName()).log(Level.SEVERE, null, e);
        }
        
        ListarProveedores Administrar = new ListarProveedores();
        Administrar.MostrarTabla(jTableUsuario);
        bRegistrar.setEnabled(true);
        dispose(); 
    } else {
        // El correo electrónico no es válido
        JOptionPane.showMessageDialog(this, "Correo electrónico no válido", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

   

    
    private void jTextFieldNITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNITKeyTyped
        //Validaciones.validacionNumerica(evt);
        validacionEspacio(evt);
       Validaciones.validacionNumerica(evt);
        //validacionCaracteres(evt);

        if(jTextFieldNIT.getText().length()>=10){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldNITKeyTyped

    private void jTextFieldTelefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefKeyTyped
        Validaciones.validacionNumerica(evt);
        //Validaciones.validacionNumerica(evt);
        validacionEspacio(evt);
        //validacionCaracteres(evt);

        if(jTextFieldTelef.getText().length()>=8){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldTelefKeyTyped

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
       validarCamposVacios();
       habilitarBotonProv();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldNITKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNITKeyReleased
        validarCamposVacios();
        habilitarBotonProv();
    }//GEN-LAST:event_jTextFieldNITKeyReleased

    private void jTextFieldTelefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefKeyReleased
        validarCamposVacios();
        habilitarBotonProv();
    }//GEN-LAST:event_jTextFieldTelefKeyReleased

    private void jTextFieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyReleased
        validarCamposVacios();
        habilitarBotonProv();
    }//GEN-LAST:event_jTextFieldEmailKeyReleased

    private void jTextFieldDirecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDirecKeyReleased
        validarCamposVacios();
        habilitarBotonProv();
    }//GEN-LAST:event_jTextFieldDirecKeyReleased

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
    validacionEspacio(evt);
    Validaciones.validacionCaracteres(evt);

        if(jTextFieldNombre.getText().length()>=30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyTyped
        

        if(jTextFieldEmail.getText().length()>=30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldEmailKeyTyped

    private void jTextFieldDirecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDirecKeyTyped
        validacionEspacio(evt);
      // Validaciones.validacionCaracteres(evt);

        if(jTextFieldDirec.getText().length()>=30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldDirecKeyTyped

    private void jTextAreaDescripcionProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionProductoKeyReleased
        validarCamposVacios();
        habilitarBotonProv();
    }//GEN-LAST:event_jTextAreaDescripcionProductoKeyReleased

    private void jTextAreaDescripcionProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionProductoKeyTyped
       validacionEspacio(evt);
        validacionCaracteresEnter(evt);

        if(jTextAreaDescripcionProducto.getText().length()>=50){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextAreaDescripcionProductoKeyTyped

    public void habilitarBotonProv(){
    if(jTextFieldNombre.getText().isEmpty()
            || jTextFieldNIT.getText().isEmpty()
            || jTextFieldTelef.getText().isEmpty()
            || jTextFieldEmail.getText().isEmpty()
            || jTextFieldDirec.getText().isEmpty()
            || jTextAreaDescripcionProducto.getText().isEmpty()
            
            || jTextFieldNombre.getText().length()<3
            || jTextFieldNIT.getText().length()<7
            || jTextFieldTelef.getText().length()<8
            || jTextFieldEmail.getText().length()<20
            || jTextFieldDirec.getText().length()<10
            || jTextAreaDescripcionProducto.getText().length()<10 ){
        
        jButtonGuardar.setEnabled(false);
    }else{
        jButtonGuardar.setEnabled(true);
    }
    }
    
        //Validar camposVacios
    public void validarCamposVacios(){
    //Nombre proveedor
    if(jTextFieldNombre.getText().isEmpty()){
     avisoNombreprov.setText("Campo Obligatorio");
     }else {
            if (jTextFieldNombre.getText().length()<3){
             avisoNombreprov.setText("Se requiere de 3 caracteres");  
        }else{
         avisoNombreprov.setText("");}
            }
    
    //CI/NIT
    if(jTextFieldNIT.getText().isEmpty()){
     avisoCIprov.setText("Campo Obligatorio");
    }else{
        if(jTextFieldNIT.getText().length()<7){
            avisoCIprov.setText("Se requiere de 7 caracteres");  
        }else{
         avisoCIprov.setText("");}
    }
    
    //Telefono
    if(jTextFieldTelef.getText().isEmpty()){
     avisoTelefonoprov.setText("Campo Obligatorio");
    }else{
        if(jTextFieldTelef.getText().length()<8){
             avisoTelefonoprov.setText("Se requiere 8 digitos");
        }else{
            avisoTelefonoprov.setText("");}        
    }
    
    //Email
    if(jTextFieldEmail.getText().isEmpty()){
     avisoMailprov.setText("Campo Obligatorio");
    }else{
        if (jTextFieldEmail.getText().length()<20){
            avisoMailprov.setText("Se requiere 20 digito");
        }else{
            avisoMailprov.setText("");}         
    }
    
    //DireccionProveedor
    if(jTextFieldDirec.getText().isEmpty()){
    avisoDireccionprov.setText("Campo Obligatorio");
    }else{
        if(jTextFieldDirec.getText().length()<10){
            avisoDireccionprov.setText("Se requiere 10 caracteres");
        }
        else{
           avisoDireccionprov.setText("");}     
    }
    
    //DescripcionProducto Prov
    if(jTextAreaDescripcionProducto.getText().isEmpty()){
    avisoDescripcionProd.setText("Campo Obligatorio");
    }else{
        if(jTextAreaDescripcionProducto.getText().length()<10){
            avisoDescripcionProd.setText("Se requiere 10 caracteres");
        }
        else{
           avisoDescripcionProd.setText("");}     
    }
}
    public void validacionEspacio(java.awt.event.KeyEvent evento){
    if (jTextFieldNombre.getText().startsWith(" ")
         ||jTextFieldNIT.getText().startsWith(" ")
         ||jTextFieldTelef.getText().startsWith(" ")
         ||jTextFieldEmail.getText().startsWith(" ")
         ||jTextFieldDirec.getText().startsWith(" ")
         ||jTextAreaDescripcionProducto.getText().startsWith(" ")){
    evento.consume();
            JOptionPane.showMessageDialog(this, "No puedes ingresar Espacio como primer caracter");
    }
}
    
     public boolean validarCorreoElectronico(String correo) {
    // Verificar si el correo contiene un "@"
    if (!correo.contains("@")) {
        return false;
    }
    
    // Verificar si el correo tiene espacios o cadenas cortadas
    if (correo.contains(" ") || correo.startsWith("@") || correo.endsWith("@")) {
        return false;
    }
    
    // Verificar otros detalles del correo electrónico
    // Puedes agregar más validaciones según tus necesidades, como verificar el formato del dominio, la extensión, etc.
    // Aquí se utiliza una expresión regular básica para verificar la estructura general del correo electrónico
    String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    return correo.matches(regex);
}
        
        public void validacionCaracteresEnter(java.awt.event.KeyEvent evento){
        if((evento.getKeyChar()<97 || evento.getKeyChar()>122)&&
           (evento.getKeyChar()<65 || evento.getKeyChar()>90)&&
            evento.getKeyChar()!=209&&evento.getKeyChar()!=241&&
            evento.getKeyChar()!=8&&evento.getKeyChar()!=32&&evento.getKeyChar()!=10&&
            evento.getKeyChar()!=225&&evento.getKeyChar()!=233&&
            evento.getKeyChar()!=237&&evento.getKeyChar()!=243&&
            evento.getKeyChar()!=250&&evento.getKeyChar()!=193&&
            evento.getKeyChar()!=201&&evento.getKeyChar()!=205&&
            evento.getKeyChar()!=211&&evento.getKeyChar()!=218){
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
            java.util.logging.Logger.getLogger(InterfazEditarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEditarProveedores().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcionProducto;
    private javax.swing.JTextField jTextFieldDirec;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNIT;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelef;
    // End of variables declaration//GEN-END:variables
}
