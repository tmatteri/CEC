/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejo;

import Inputs.Input_Recorridos;
import Outputs.Panel_Usuarios;
import Outputs_New.Out_Vista_Recorridos;
import cec.Tabla;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author msosa
 */
public class Recorridos_Manejo {
    
    
    public static void  Cargar(JTable table) throws SQLException{
         DefaultTableModel modelo = new DefaultTableModel();
        table.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cobrador");
        modelo.addColumn("Anulado");
        ResultSet rs = Tabla.select("recorridos");
        Object[] datos = new Object[4];//creamos un object de la cantidad de COLUMNAS
        while (rs.next()) {
            for (int i = 0; i < 4; i++) {
                datos[i] = rs.getObject(i + 1);//cargamos la fila en el objeto
            }
            modelo.addRow(datos);//cargamos el objeto en el model
        }
        modelo.fireTableDataChanged();
        rs.close();
        
    }
    
    public static void Modificar(JTable table){
               
        int selectedRow = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        int selectedID = (int) model.getValueAt(selectedRow, 0);

        Input_Recorridos JframeRecorridos = new Input_Recorridos();

        try {
            JframeRecorridos.Modificacion(selectedID);
        } catch (SQLException ex) {
            Logger.getLogger(Out_Vista_Recorridos.class.getName()).log(Level.SEVERE, null, ex);
        }
        JframeRecorridos.setVisible(true);
        JframeRecorridos.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JframeRecorridos.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
     
                        try {
                            Cargar(table);
                            // your code
                        } catch (SQLException ex) {
                            Logger.getLogger(Panel_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                });
    }
    
    public static void Crear(JTable table){
        int selectedRow = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        //int selectedID = (int) model.getValueAt(selectedRow, 0);
        Input_Recorridos JframeRecorridos = new Input_Recorridos();

        try {
            JframeRecorridos.Alta();
        } catch (SQLException ex) {
            Logger.getLogger(Out_Vista_Recorridos.class.getName()).log(Level.SEVERE, null, ex);
        }
        JframeRecorridos.setVisible(true);
        JframeRecorridos.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
         JframeRecorridos.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        

                       
                        try {
                            Cargar(table);
                            // your code
                        } catch (SQLException ex) {
                            Logger.getLogger(Panel_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                       
                        
                        
                    }
                });
        
    }
    
    public static void Salvar(){
        
    }
    
    public static void Borrar(){
        
    }
    
    
}
