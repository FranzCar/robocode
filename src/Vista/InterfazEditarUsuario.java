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
import java.awt.event.KeyEvent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InterfazEditarUsuario extends javax.swing.JFrame {
   
    static Connection conexion=null;
    static Statement sentencia=null;
    static ResultSet resultado=null;     
    static Usuario objUsuario;
    ConectarBD con = new ConectarBD();
    int id=idUsuarioTabla;
    public InterfazEditarUsuario() {
        initComponents();
       
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(1);
        jButtonEditar.setEnabled(false);
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
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //comentario
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldIdUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldContrasenia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jDateChooserFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCi = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbAvisoDirec = new javax.swing.JLabel();
        lbAvisoContra = new javax.swing.JLabel();
        lbAvisoIdUsuario = new javax.swing.JLabel();
        lbAvisoFeIni = new javax.swing.JLabel();
        lbAvisoTel = new javax.swing.JLabel();
        lbAvisoCi = new javax.swing.JLabel();
        lbAvisoNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(803, 630));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(790, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(37, 77, 116));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel1.setPreferredSize(new java.awt.Dimension(803, 608));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(245, 245, 245));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Nombre de Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

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
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 320, 30));

        jLabel7.setBackground(new java.awt.Color(245, 245, 245));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setText("Id Usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

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
        jPanel1.add(jTextFieldIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 320, 30));

        jLabel5.setBackground(new java.awt.Color(245, 245, 245));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

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
        jPanel1.add(jTextFieldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 320, 30));

        jLabel3.setBackground(new java.awt.Color(245, 245, 245));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("Teléfono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jTextFieldTelefono.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 320, 30));

        jLabel4.setBackground(new java.awt.Color(245, 245, 245));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setText("Fecha de inicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jTextFieldDireccion.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldDireccion.setMaximumSize(new java.awt.Dimension(7, 38));
        jTextFieldDireccion.setMinimumSize(new java.awt.Dimension(7, 38));
        jTextFieldDireccion.setPreferredSize(new java.awt.Dimension(7, 38));
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
        jPanel1.add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 320, 30));

        jDateChooserFechaInicio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jPanel1.add(jDateChooserFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 320, 30));

        jLabel6.setBackground(new java.awt.Color(245, 245, 245));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 245, 245));
        jLabel6.setText("Dirección");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        jLabel2.setBackground(new java.awt.Color(245, 245, 245));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("Carnet de Identidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jTextFieldCi.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCiKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 320, 30));

        jButtonEditar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonEditar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editarUser.png"))); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, -1, -1));

        jButtonCancelar.setBackground(new java.awt.Color(95, 143, 169));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EDITAR USUARIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        lbAvisoDirec.setBackground(new java.awt.Color(204, 204, 255));
        lbAvisoDirec.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(lbAvisoDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 190, 32));

        lbAvisoContra.setBackground(new java.awt.Color(204, 204, 255));
        lbAvisoContra.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(lbAvisoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 190, 32));

        lbAvisoIdUsuario.setBackground(new java.awt.Color(204, 204, 255));
        lbAvisoIdUsuario.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(lbAvisoIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 190, 32));

        lbAvisoFeIni.setBackground(new java.awt.Color(204, 204, 255));
        lbAvisoFeIni.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(lbAvisoFeIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 190, 32));

        lbAvisoTel.setBackground(new java.awt.Color(204, 204, 255));
        lbAvisoTel.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(lbAvisoTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 190, 32));

        lbAvisoCi.setBackground(new java.awt.Color(204, 204, 255));
        lbAvisoCi.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(lbAvisoCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 190, 32));

        lbAvisoNombre.setBackground(new java.awt.Color(204, 204, 255));
        lbAvisoNombre.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(lbAvisoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 190, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseniaActionPerformed

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        String nombre=jTextFieldNombre.getText().trim();
        String ci=jTextFieldCi.getText().trim();
        String tel=jTextFieldTelefono.getText().trim();
        String direc=jTextFieldDireccion.getText().trim();
        String contra=jTextFieldContrasenia.getText().trim();
        String idusuario=jTextFieldIdUsuario.getText().trim();
        if(nombre.isEmpty()|| nombre.startsWith(" ")|| nombre.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo nombre este correcto");
            return;
        }
         if(ci.isEmpty()|| ci.startsWith(" ")|| ci.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo carnet de identidad este correcto");
            return;
        }
          if(tel.isEmpty()|| tel.startsWith(" ")|| tel.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo tel este correcto");
            return;
        }
           if(direc.isEmpty()|| direc.startsWith(" ")|| direc.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo direccion este correcto");
            return;
        }
            if(contra.isEmpty()|| contra.startsWith(" ")|| contra.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo contrasenia este correcto");
            return;
        }
             if(idusuario.isEmpty()|| idusuario.startsWith(" ")|| idusuario.startsWith("-")){
            JOptionPane.showMessageDialog(null, "Asegurese que el campo idusuario este correcto");
            return;
        }
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
                String sentenciaSQL1 = new String();
                sentenciaSQL1="update USUARIOS set nombreUsuario='"+objUsuario.nombreDeUsuario+"', ciUsuario='"+objUsuario.carnetDeIdentidad+"', telefonoUsuario='"+objUsuario.telefono+
                        "', fechaInicioUsuario='"+fecha+"', idUsuario='"+objUsuario.idUsuario+"', contraseniaUsuario='"+objUsuario.Contrasenia+
                        "', direccionUsuario='"+objUsuario.direccion+"' where codUsuario='"+id+"'";
                
                sentencia.execute(sentenciaSQL1); 
            JOptionPane.showMessageDialog(this, "Editado Correctamente"); 
            dispose();
                
        } catch (SQLException e) {
            Logger.getLogger(InterfazRegistrarUsuario.class.getName()).log(Level.SEVERE,null,e);
        }
        
        ListarUsuarios Administrar=new ListarUsuarios();
        Administrar.MostrarTabla(jTableUsuario);
        dispose();
      
    }//GEN-LAST:event_jButtonEditarActionPerformed

    public static boolean validar(String datos){
        return datos.matches("[0-9][1,8]");
    }
    
    public void validacionCaracteres(java.awt.event.KeyEvent evento){
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
            JOptionPane.showMessageDialog(this, "Solo Se Permiten Numeros");
        }
    }

public void validarCamposVacios(){
     
if(jTextFieldNombre.getText().isEmpty()){
     lbAvisoNombre.setText("Campo Obligatorio");
    }else{
        if(jTextFieldNombre.getText().length()<=2){
             lbAvisoNombre.setText("Minimo 3 Caracteres");  
        }   
         else{lbAvisoNombre.setText(""); } 
        
    }
    if(jTextFieldCi.getText().isEmpty()){
     lbAvisoCi.setText("Campo Obligatorio");
    }else{
        if(jTextFieldCi.getText().length()<7){
             lbAvisoCi.setText("Se requiere de 7 digitos");  
        }else{
         lbAvisoCi.setText(""); 
                     
    }
    
    }
    if(jTextFieldTelefono.getText().isEmpty()){
     lbAvisoTel.setText("Campo Obligatorio");
    }else{
        if(jTextFieldTelefono.getText().length()<=7){
             lbAvisoTel.setText("Minimo 8 Caracteres");  
        }   
         else{lbAvisoTel.setText(""); }
    
    }
    //if(jDateChooserFechaInicio.getDate().{
     //lbAvisoFeIni.setText("Campo Obligatorio");
    //}else{
            // lbAvisoFeIni.setText("");         
    if(jTextFieldIdUsuario.getText().isEmpty()){
     lbAvisoIdUsuario.setText("Campo Obligatorio");
    }else{
             lbAvisoIdUsuario.setText("");         
    }
    if(jTextFieldContrasenia.getText().isEmpty()){
     lbAvisoContra.setText("Campo Obligatorio");
    }else{
        if(jTextFieldContrasenia.getText().length()>=8){
             lbAvisoContra.setText("Solo se permiten 8 caracteres");  
        }
    else{lbAvisoContra.setText(""); }
        if(jTextFieldContrasenia.getText().length()<=3){
             lbAvisoContra.setText("Minimo 4 Caracteres");  
        }   
         else{lbAvisoContra.setText(""); } 
    }
    
    if(jTextFieldDireccion.getText().isEmpty()){
     lbAvisoDirec.setText("Campo Obligatorio");
    }else{
        if(jTextFieldDireccion.getText().length()>=18){
             lbAvisoDirec.setText("Solo se permiten 18 caracteres");  
        }
    else{lbAvisoDirec.setText(""); }
    
    }
}
public void validacionEspacio(java.awt.event.KeyEvent evento){
    if (jTextFieldNombre.getText().startsWith(" ")
         ||jTextFieldCi.getText().startsWith(" ")
         ||jTextFieldTelefono.getText().startsWith(" ")
         ||jTextFieldIdUsuario.getText().startsWith(" ")
         ||jTextFieldContrasenia.getText().startsWith(" ")
         ||jTextFieldDireccion.getText().startsWith(" ")){
    evento.consume();
            JOptionPane.showMessageDialog(this, "No puedes ingresar Espacio como primer caracter");
}
}


public void habilitarBoton(){
    if(jTextFieldNombre.getText().isEmpty()
            || jTextFieldCi.getText().isEmpty()
            || jTextFieldTelefono.getText().isEmpty()
            || jTextFieldIdUsuario.getText().isEmpty()
            || jTextFieldContrasenia.getText().isEmpty()
            || jTextFieldDireccion.getText().isEmpty()
            ||jTextFieldNombre.getText().length()<=2
            ||jTextFieldTelefono.getText().length()<=7
            ||jTextFieldContrasenia.getText().length()<=3
            ||jTextFieldCi.getText().length()<7){
        
        jButtonEditar.setEnabled(false);
    }else{
    jButtonEditar.setEnabled(true);
    }
}
    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed

    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdUsuarioActionPerformed

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        // TODO add your handling code here:
        validacionEspacio(evt);
        validacionNumeros(evt);
        if(jTextFieldTelefono.getText().length()>=8){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
        validarCamposVacios();
    }//GEN-LAST:event_jPanel1KeyReleased
 
    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
        validarCamposVacios();
        
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        // TODO add your handling code here:
        validacionEspacio(evt);
        validacionCaracteres(evt);
        
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiKeyReleased
        // TODO add your handling code here:
          habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldCiKeyReleased

    private void jTextFieldTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyReleased
        // TODO add your handling code here:
          habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldTelefonoKeyReleased

    private void jTextFieldIdUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioKeyReleased
        // TODO add your handling code here:
          habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldIdUsuarioKeyReleased

    private void jTextFieldContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseniaKeyReleased
        // TODO add your handling code here:
          habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldContraseniaKeyReleased

    private void jTextFieldDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyReleased
        // TODO add your handling code here:
          habilitarBoton();
        validarCamposVacios();
    }//GEN-LAST:event_jTextFieldDireccionKeyReleased

    private void jTextFieldDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyTyped
        validacionEspacio(evt);  
        validacionCaracteres(evt);
           if(jTextFieldDireccion.getText().length()>=18){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldDireccionKeyTyped

    private void jTextFieldCiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiKeyTyped
        validacionEspacio(evt);
       validacionNumeros(evt);
        if(jTextFieldCi.getText().length()>=9){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldCiKeyTyped

    private void jTextFieldContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseniaKeyTyped
        // TODO add your handling code here:
        validacionEspacio(evt);
         if(jTextFieldContrasenia.getText().length()>=8){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldContraseniaKeyTyped

    private void jTextFieldIdUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioKeyTyped
        // TODO add your handling code here:
        validacionEspacio(evt);
    }//GEN-LAST:event_jTextFieldIdUsuarioKeyTyped

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
            java.util.logging.Logger.getLogger(InterfazEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private com.toedter.calendar.JDateChooser jDateChooserFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCi;
    private javax.swing.JTextField jTextFieldContrasenia;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldIdUsuario;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JLabel lbAvisoCi;
    private javax.swing.JLabel lbAvisoContra;
    private javax.swing.JLabel lbAvisoDirec;
    private javax.swing.JLabel lbAvisoFeIni;
    private javax.swing.JLabel lbAvisoIdUsuario;
    private javax.swing.JLabel lbAvisoNombre;
    private javax.swing.JLabel lbAvisoTel;
    // End of variables declaration//GEN-END:variables
}
