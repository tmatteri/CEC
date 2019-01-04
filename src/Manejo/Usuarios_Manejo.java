/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejo;

import Inputs.Input_Usuarios;
import Outputs.Panel_Productos;
import Outputs_New.Out_Vista_Usuarios;
import cec.Tabla;
import java.io.IOException;
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
public class Usuarios_Manejo {
    
    
    public static void  Cargar(JTable table) throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        table.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Mail");
        modelo.addColumn("Anulado");
       
        ResultSet rs = Tabla.select("id,nombre,email,anulado", "usuarios", "1=1");
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
               try {
                int selectedRow = table.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) table.getModel();

                int selectedID = (int) model.getValueAt(selectedRow, 0);

                Input_Usuarios JframeUsuarios = new Input_Usuarios();

                JframeUsuarios.Modificacion(selectedID);
                JframeUsuarios.setVisible(true);
                JframeUsuarios.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                JframeUsuarios.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        try {
                           Cargar(table);
                            // your code
                        } catch (SQLException ex) {
                            Logger.getLogger(Panel_Productos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            } catch (SQLException ex) {
                Logger.getLogger(Out_Vista_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    public static void Crear(JTable table){
        try {
                Input_Usuarios JframeUsuarios = new Input_Usuarios();
                JframeUsuarios.Alta();
                JframeUsuarios.setVisible(true);
                JframeUsuarios.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

                JframeUsuarios.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        

                       
                        try {
                            Cargar(table);
                            // your code
                        } catch (SQLException ex) {
                            Logger.getLogger(Out_Vista_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                       
                        
                        
                    }
                });
            } catch (SQLException ex) {
                Logger.getLogger(Out_Vista_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }

        
    }
    
    public static void Salvar(){
        
    }
    
    public static void Borrar(){
        
    }
    
    
}
