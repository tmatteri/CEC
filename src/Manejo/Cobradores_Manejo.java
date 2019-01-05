/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejo;

import Inputs.Input_Cobradores;
import Outputs.Panel_Usuarios;
import Outputs_New.Out_Vista_Cobradores;
import cec.JavaPostgreSQL;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author msosa
 */
public class Cobradores_Manejo {
    
    
    public static void  Cargar(JTable table) throws IOException, SQLException{
        
             DefaultTableModel modelo = new DefaultTableModel()
         {@Override
     public boolean isCellEditable (int fila, int columna) {
         return false;
     }
 };
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Mail");
        modelo.addColumn("Anulado");
       
      
            table.setModel(modelo);//asignamos el model, todo lo que pase en el model se va a modificar en
            //la tabla
            ResultSet rs;
            Connection conn = null;
            JavaPostgreSQL conexion = new JavaPostgreSQL();
            conn = conexion.getConnection();
            Statement st = conn.createStatement();
            String consulta = "SELECT id, nombre_fantasia, email, anulado FROM entidades;";
            rs = st.executeQuery(consulta); //ejecutamos la consulta
            Object[] datos = new Object[4];//creamos un object de la cantidad de COLUMNAS

            conn.close();//cerramos conexion
            
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
        
        int selectedID = (int) model.getValueAt(selectedRow,0);
       
        Input_Cobradores JframeCobradores = new Input_Cobradores();
        
      
            JframeCobradores.Modificacion(selectedID);
              JframeCobradores.setVisible(true);
        JframeCobradores.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
          JframeCobradores.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        

                       
                        try {
                            Cargar(table);
                            // your code
                        } catch (SQLException ex) {
                            Logger.getLogger(Panel_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(Out_Vista_Cobradores.class.getName()).log(Level.SEVERE, null, ex);
                        }
                      
                    }
                });
          
        } catch (SQLException ex) {
            Logger.getLogger(Out_Vista_Cobradores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void Crear(JTable table){
        try {
        Input_Cobradores JframeCobradores = new Input_Cobradores();
        JframeCobradores.Alta();
        JframeCobradores.setVisible(true);
        JframeCobradores.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
          JframeCobradores.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        

                       
                        try {
                            Cargar(table);
                            // your code
                        } catch (SQLException ex) {
                            Logger.getLogger(Panel_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(Out_Vista_Cobradores.class.getName()).log(Level.SEVERE, null, ex);
                        }  
                    }
                });
          
        } catch (SQLException ex) {
            Logger.getLogger(Out_Vista_Cobradores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void Salvar(){
        
    }
    
    public static void Borrar(){
        
    }
    
    
}