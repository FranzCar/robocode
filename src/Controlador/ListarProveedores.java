/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.ConectarBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.Arrays;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
/**
 *
 * @author PC
 */
public class ListarProveedores {
    static Connection conexion=null;
    static Statement sentencia=null;
    JTable jTableUsuario = new JTable();
    ConectarBD con = new ConectarBD();    
    
    public void MostrarTabla(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };
                
        modelo.addColumn("Cod");
        modelo.addColumn("Nombre");
        modelo.addColumn("NIT/CI");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Email");
        modelo.addColumn("Direccion");
        modelo.addColumn("Descripción");
        String consultasql = new String();
        consultasql = "SELECT * From proveedor ORDER BY nombreProveedor ASC";
        Statement st;
        try{
            conexion=con.establecerConexion(); 
            sentencia=conexion.createStatement();
            ResultSet rs = sentencia.executeQuery(consultasql);
            while(rs.next()){
                Object [] lista = {rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.out.println("ERROR AL LISTAR LOS DATOS" + e);
        }

    }
    public void MostrarTablaBuscar(JTable tabla,String palabra){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };
    modelo.addColumn("Cod");
    modelo.addColumn("Nombre");
    modelo.addColumn("NIT/CI");
    modelo.addColumn("Teléfono");
    modelo.addColumn("Email");
    modelo.addColumn("Direccion");
    modelo.addColumn("Descripción");
    String consultasql = new String();
    consultasql = "SELECT * FROM proveedor WHERE nombreProveedor LIKE \"%"+palabra+"%\"  ORDER BY nombreProveedor";
    
    try{
        conexion=con.establecerConexion(); 
        sentencia=conexion.createStatement();
        if (sentencia != null) {  // Agregado para validar que la sentencia no es null
            ResultSet rs = sentencia.executeQuery(consultasql);
            while(rs.next()){
                Object [] lista = {rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        }
    }catch(Exception e){
        System.out.println("ERROR AL LISTAR LOS DATOS" + e);
    }   
    }
}
