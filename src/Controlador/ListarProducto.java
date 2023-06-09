/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.ConectarBD;
import java.awt.Color;
import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.ResultSet;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author PC
 */
public class ListarProducto {
    static Connection conexion=null;
    public int contador=0;
    public int aux=0;
    ConectarBD con = new ConectarBD();
    
    public int mostrarFotoInicio(JLabel a,JLabel b, JLabel c, JPanel d, int [] f){
        int i=0;
        int j=0;
        //int contador=0;
        try {
            conexion=con.establecerConexion();
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM PRODUCTO ORDER BY modeloProducto ASC LIMIT 10");
            ResultSet rs = pst.executeQuery();
            for(int k=0;k<10;k++){
                if(rs.next()){
                    a=(JLabel) d.getComponent(28+i);
                    b=(JLabel) d.getComponent(29+i);
                    c=(JLabel) d.getComponent(30+i);
                    i=i+3;
                    f[j]=rs.getInt("codProducto");
                    j++;
                    b.setText(rs.getString("marcaProducto"));
                    c.setText(rs.getString("modeloProducto"));

                    Blob blob = rs.getBlob("fotoProducto");
                    //pasar el binario a imagen
                    byte[] data = blob.getBytes(1, (int) blob.length());
                    //lee la imagen
                    BufferedImage img = null;
                    
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(data));
                    } catch (IOException e) {
                        System.out.println("Error al cargar foto: " + e);
                    }                    
                    ImageIcon icono = new ImageIcon(img);
                    Icon imagen = new ImageIcon(icono.getImage().getScaledInstance(a.getWidth(), a.getHeight(), Image.SCALE_DEFAULT));
                    a.setIcon(imagen);
                }else{
                    a=(JLabel) d.getComponent(28+i);
                    b=(JLabel) d.getComponent(29+i);
                    c=(JLabel) d.getComponent(30+i);
                    i=i+3;
                    a.setIcon(null);
                    b.setText("");
                    c.setText("");

                    
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error al cargar!");
            System.out.println("Error al cargar foto: " + e);
        }
        return contador;
    }
    
    public void paginarFotoInicio(JLabel a,JLabel b, JLabel c, JPanel d, int [] f, int offset){
        int i=0;
        int j=0;
        try {
            conexion=con.establecerConexion();
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM PRODUCTO ORDER BY modeloProducto ASC LIMIT 10 OFFSET "+offset);
            ResultSet rs = pst.executeQuery();
            for(int k=0;k<10;k++){
                if(rs.next()){
                    a=(JLabel) d.getComponent(28+i);
                    b=(JLabel) d.getComponent(29+i);
                    c=(JLabel) d.getComponent(30+i);
                    i=i+3;
                    f[j]=rs.getInt("codProducto");
                    j++;
                    b.setText(rs.getString("marcaProducto"));
                    c.setText(rs.getString("modeloProducto"));

                    Blob blob = rs.getBlob("fotoProducto");
                    //pasar el binario a imagen
                    byte[] data = blob.getBytes(1, (int) blob.length());
                    //lee la imagen
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(data));
                    } catch (IOException e) {
                        System.out.println("Error al cargar foto: " + e);
                    }                    
                    ImageIcon icono = new ImageIcon(img);
                    Icon imagen = new ImageIcon(icono.getImage().getScaledInstance(a.getWidth(), a.getHeight(), Image.SCALE_DEFAULT));
                    a.setIcon(imagen);
                }else{
                    a=(JLabel) d.getComponent(28+i);
                    b=(JLabel) d.getComponent(29+i);
                    c=(JLabel) d.getComponent(30+i);
                    i=i+3;
                    a.setIcon(null);
                    b.setText("");
                    c.setText("");
                   
                }                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error al cargar!");
            System.out.println("Error al cargar foto: " + e);
        }
    }
    
    public void limpiarFotoInicio(JLabel a,JLabel b, JLabel c, JPanel d){
        int i=0;
        for(int j=0;j<10;j++){
            a=(JLabel) d.getComponent(28+i);
            b=(JLabel) d.getComponent(29+i);
            c=(JLabel) d.getComponent(30+i);
            i=i+3;
            a.setIcon(null);
            b.setText("");
            c.setText("");
        }        
    }
    public int buscarImagenInicio(JLabel a,JLabel b, JLabel c, JPanel d, int [] f, String palabra){
        int i=0;
        int j=0;
        try {
            conexion=con.establecerConexion();
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM PRODUCTO WHERE modeloProducto LIKE \"%"+palabra+"%\" ORDER BY modeloProducto ASC LIMIT 10");
            ResultSet rs = pst.executeQuery();
            for(int k=0;k<10;k++){
                if(rs.next()){
                    a=(JLabel) d.getComponent(28+i);
                    b=(JLabel) d.getComponent(29+i);
                    c=(JLabel) d.getComponent(30+i);
                    i=i+3;
                    f[j]=rs.getInt("codProducto");
                    j++;
                    contador++;
                    b.setText(rs.getString("marcaProducto"));
                    c.setText(rs.getString("modeloProducto"));

                    Blob blob = rs.getBlob("fotoProducto");
                    //pasar el binario a imagen
                    byte[] data = blob.getBytes(1, (int) blob.length());
                    //lee la imagen
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(data));
                    } catch (IOException e) {
                        System.out.println("Error al cargar foto: " + e);
                    }                    
                    ImageIcon icono = new ImageIcon(img);
                    Icon imagen = new ImageIcon(icono.getImage().getScaledInstance(a.getWidth(), a.getHeight(), Image.SCALE_DEFAULT));
                    a.setIcon(imagen);
                }else{
                    a=(JLabel) d.getComponent(28+i);
                    b=(JLabel) d.getComponent(29+i);
                    c=(JLabel) d.getComponent(30+i);
                    i=i+3;
                    a.setIcon(null);
                    b.setText("");
                    c.setText("");                 
                }
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error al cargar!");
            System.out.println("Error al cargar foto: " + e);
        }
        aux=contador;
        contador=0;
        return aux;
    }
}
