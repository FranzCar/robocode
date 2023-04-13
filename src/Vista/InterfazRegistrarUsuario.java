/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Controlador.Usuario;
import Modelo.ConectarBD;
import Modelo.ListarUsuarios;
import static Vista.InterfazAdministrarUsuario.jTableUsuario;
import java.awt.Toolkit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class InterfazRegistrarUsuario extends javax.swing.JFrame {

    static Connection conexion=null;
    static Statement sentencia=null;
    static ResultSet resultado=null;     
    static Usuario objUsuario;
    int id;
    ConectarBD con = new ConectarBD();    
    
    public InterfazRegistrarUsuario() {
        initComponents();
        habilitarBoton();//habilitar boton de inicio
        jTextFieldFechaInicioEncima.setBackground(new java.awt.Color(0,0,0,1));
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCi = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldFechaInicioEncima = new javax.swing.JTextField();
        jDateChooserFechaInicio = new com.toedter.calendar.JDateChooser();
        jTextFieldIdUsuario = new javax.swing.JTextField();
        jTextFieldContrasenia = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        avisoDireccion = new javax.swing.JLabel();
        avisoContrasenia = new javax.swing.JLabel();
        avisoIDusuario = new javax.swing.JLabel();
        avisoFecha = new javax.swing.JLabel();
        avisoTelefono = new javax.swing.JLabel();
        avisoCI = new javax.swing.JLabel();
        avisoNombre = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("AcadEref", 0, 24)); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(37, 77, 116));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Nombre de Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 101, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("Carnet de Identidad");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 155, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("Teléfono");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 209, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setText("Fecha de Inicio");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 262, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setText("Id Usuario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("Contraseña");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 382, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 245, 245));
        jLabel6.setText("Dirección");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 437, -1, -1));

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
        jPanel2.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 99, 300, 30));

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
        jPanel2.add(jTextFieldCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 153, 300, 30));

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
        jPanel2.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 207, 300, 30));

        jTextFieldFechaInicioEncima.setEnabled(false);
        jPanel2.add(jTextFieldFechaInicioEncima, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 262, 281, 30));

        jDateChooserFechaInicio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jDateChooserFechaInicio.setMaxSelectableDate(new java.util.Date(253370782906000L));
        jDateChooserFechaInicio.setMinSelectableDate(new java.util.Date(-62135751494000L));
        jPanel2.add(jDateChooserFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 262, 299, 30));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdUsuarioKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 320, 300, 30));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldContraseniaKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 379, 300, -1));

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
        jPanel2.add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 437, 300, -1));

        avisoDireccion.setBackground(new java.awt.Color(204, 204, 255));
        avisoDireccion.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 437, 181, 30));

        avisoContrasenia.setBackground(new java.awt.Color(204, 204, 255));
        avisoContrasenia.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 379, 181, 30));

        avisoIDusuario.setBackground(new java.awt.Color(204, 204, 255));
        avisoIDusuario.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoIDusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 320, 181, 30));

        avisoFecha.setBackground(new java.awt.Color(204, 204, 255));
        avisoFecha.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 262, 181, 30));

        avisoTelefono.setBackground(new java.awt.Color(204, 204, 255));
        avisoTelefono.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 207, 181, 30));

        avisoCI.setBackground(new java.awt.Color(204, 204, 255));
        avisoCI.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 153, 181, 30));

        avisoNombre.setBackground(new java.awt.Color(204, 204, 255));
        avisoNombre.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(avisoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 99, 181, 30));

        jButtonGuardar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/registrado.png"))); // NOI18N
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 527, 170, -1));

        jButtonCancelar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(245, 245, 245));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 527, 190, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 245, 245));
        jLabel8.setText("REGISTRAR USUARIO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 7, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed

    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiActionPerformed

    private void jTextFieldContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseniaActionPerformed

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            sentencia=conexion.createStatement();
            objUsuario.nombreDeUsuario=jTextFieldNombre.getText();
            objUsuario.carnetDeIdentidad=jTextFieldCi.getText();
            objUsuario.telefono=jTextFieldTelefono.getText();
            Date date=jDateChooserFechaInicio.getDate();
            objUsuario.fechaDeInicio=date.getTime();
            java.sql.Date fecha=new java.sql.Date(objUsuario.fechaDeInicio);
            objUsuario.idUsuario=jTextFieldIdUsuario.getText();
            objUsuario.Contrasenia=jTextFieldContrasenia.getText();
            objUsuario.direccion=jTextFieldDireccion.getText();
            
            //Para validar que el usuario no sea duplicado
            
            String sentenciaSQL2 = "SELECT COUNT(*) FROM usuarios WHERE idUsuario = '" + objUsuario.idUsuario + "'";
            ResultSet resultado = sentencia.executeQuery(sentenciaSQL2);
            resultado.next();
            int count = resultado.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "El nombre de IdUsuario ya existe. Por favor ingrese otro nombre.");
                return;
            }
            
            // Si no esta duplicado, se realiza el registro
            
                String sentenciaSQL1 = new String();
                sentenciaSQL1="INSERT INTO usuarios(nombreUsuario,ciUsuario,telefonoUsuario,fechaInicioUsuario,idUsuario,contraseniaUsuario,direccionUsuario)";
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

    
    public static boolean validar(String datos){
    return datos.matches("[0-9][1,8]");
    }
    
public void validacionCaracteres(java.awt.event.KeyEvent evento){
    if(evento.getKeyChar()>=33 && evento.getKeyChar()<=64 || 
            evento.getKeyChar()>=91 && evento.getKeyChar()<=96 ||
            evento.getKeyChar()>=123 && evento.getKeyChar()<=208||
            evento.getKeyChar()>=210 && evento.getKeyChar()<=240||
            evento.getKeyChar()>=242 && evento.getKeyChar()<=255){
    evento.consume();
    JOptionPane.showMessageDialog(this, "No se permite Caracteres Especiales");
    }
}
public void validacionCaracteresDireccion(java.awt.event.KeyEvent evento){
    if(evento.getKeyChar()>=33 && evento.getKeyChar()<=34 ||
            evento.getKeyChar()>=36 && evento.getKeyChar()<=43 ||
            evento.getKeyChar()>=60 && evento.getKeyChar()<=64 ||
            evento.getKeyChar()>=91 && evento.getKeyChar()<=96 ||
            evento.getKeyChar()>=123 && evento.getKeyChar()<=208||
            evento.getKeyChar()>=210 && evento.getKeyChar()<=240||
            evento.getKeyChar()>=242 && evento.getKeyChar()<=255){
    evento.consume();
    JOptionPane.showMessageDialog(this, "No se permite Caracteres Especiales");
    }
    
}
public void validacionNumeros(java.awt.event.KeyEvent evento){
    if(evento.getKeyChar()>=33 && evento.getKeyChar()<=47 || 
            evento.getKeyChar()>=58 && evento.getKeyChar()<=255){
        evento.consume();
    JOptionPane.showMessageDialog(this, "Solo se permiten Numeros");
    }
    
}
    
public void validarCamposVacios(){
    if(jTextFieldNombre.getText().isEmpty()){
     avisoNombre.setText("Campo Obligatorio");
    }else{
        if(jTextFieldNombre.getText().length()<=2){
             avisoNombre.setText("Minimo 3 Caracteres");  
        }
    else{avisoNombre.setText(""); } 
    }
    
    
    if(jTextFieldCi.getText().isEmpty()){
     avisoCI.setText("Campo Obligatorio");
    }else{
        if(jTextFieldCi.getText().length()<7){
             avisoCI.setText("Se requiere de 7 digitos");  
        }else{
         avisoCI.setText("");}
    
    }
    
    if(jTextFieldTelefono.getText().isEmpty()){
     avisoTelefono.setText("Campo Obligatorio");
    }else{
        if(jTextFieldTelefono.getText().length()<=7){
             avisoTelefono.setText("Se requiere 8 digitos");
        }
        else {avisoTelefono.setText("");}        
    }
    
    if(jTextFieldIdUsuario.getText().isEmpty()){
     avisoIDusuario.setText("Campo Obligatorio");
    }else{
        if (jTextFieldIdUsuario.getText().length()<=2){
            avisoIDusuario.setText("Se requiere 3 caracteres");
        }
        else{avisoIDusuario.setText("");}         
    }
    
    if(jTextFieldContrasenia.getText().isEmpty()){
     avisoContrasenia.setText("Campo Obligatorio");
    }else{
        if(jTextFieldContrasenia.getText().length()<8){
            avisoContrasenia.setText("Se requiere 8 caracteres");
        }
        else{avisoContrasenia.setText("");}     
    }
    
    if(jTextFieldDireccion.getText().isEmpty()){
     avisoDireccion.setText("Campo Obligatorio");
    }else{
        if(jTextFieldDireccion.getText().length()<=18){
            avisoDireccion.setText("Se requiere 18 caracteres");
        }
        else{avisoDireccion.setText("");}      
    }
}
public void habilitarBoton(){
    if(jTextFieldNombre.getText().isEmpty()
            || jTextFieldCi.getText().isEmpty()
            || jTextFieldTelefono.getText().isEmpty()
            || jTextFieldIdUsuario.getText().isEmpty()
            || jTextFieldContrasenia.getText().isEmpty()
            || jTextFieldDireccion.getText().isEmpty()
            || jTextFieldNombre.getText().length()<=2
            || jTextFieldCi.getText().length()<7
            || jTextFieldTelefono.getText().length()<8
            || jTextFieldIdUsuario.getText().length()<3
            || jTextFieldContrasenia.getText().length()<8
            || jTextFieldDireccion.getText().length()<18){
        jButtonGuardar.setEnabled(false);
    }else{
    jButtonGuardar.setEnabled(true);
    }
    
    
}
    
    private void jTextFieldIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdUsuarioActionPerformed

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        validacionCaracteres(evt);
        jTextFieldNombre.setText(jTextFieldNombre.getText().trim());
        if(jTextFieldNombre.getText().length()>=30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyReleased
        habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldTelefonoKeyReleased

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        validacionNumeros(evt);
        jTextFieldTelefono.setText(jTextFieldTelefono.getText().trim());
        if(jTextFieldTelefono.getText().length()>=8){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jTextFieldIdUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioKeyReleased
        habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldIdUsuarioKeyReleased

    private void jTextFieldContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseniaKeyReleased
        habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldContraseniaKeyReleased

    private void jTextFieldDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyReleased
        habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldDireccionKeyReleased

    private void jTextFieldDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyTyped
        validacionCaracteresDireccion(evt);
        jTextFieldDireccion.setText(jTextFieldDireccion.getText().trim());
        if(jTextFieldDireccion.getText().length()>=50){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
        }
    }//GEN-LAST:event_jTextFieldDireccionKeyTyped

    private void jTextFieldCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiKeyReleased
        habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldCiKeyReleased

    private void jTextFieldCiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiKeyTyped
        habilitarBoton();
        validacionNumeros(evt);
        jTextFieldCi.setText(jTextFieldCi.getText().trim());
         if(jTextFieldCi.getText().length()>=9){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
         }
    }//GEN-LAST:event_jTextFieldCiKeyTyped

    private void jTextFieldIdUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioKeyTyped
        jTextFieldIdUsuario.setText(jTextFieldIdUsuario.getText().trim());
    }//GEN-LAST:event_jTextFieldIdUsuarioKeyTyped

    private void jTextFieldContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseniaKeyTyped
        jTextFieldContrasenia.setText(jTextFieldContrasenia.getText().trim());
          jTextFieldContrasenia.setText(jTextFieldContrasenia.getText().trim());
         if(jTextFieldContrasenia.getText().length()>=20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "LLEGO AL LIMITE PERMITIDO");
         }
    }//GEN-LAST:event_jTextFieldContraseniaKeyTyped

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
            java.util.logging.Logger.getLogger(InterfazRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoCI;
    private javax.swing.JLabel avisoContrasenia;
    private javax.swing.JLabel avisoDireccion;
    private javax.swing.JLabel avisoFecha;
    private javax.swing.JLabel avisoIDusuario;
    private javax.swing.JLabel avisoNombre;
    private javax.swing.JLabel avisoTelefono;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private com.toedter.calendar.JDateChooser jDateChooserFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCi;
    private javax.swing.JTextField jTextFieldContrasenia;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldFechaInicioEncima;
    private javax.swing.JTextField jTextFieldIdUsuario;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
