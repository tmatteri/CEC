/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejo;

import Entidades.CONSTANT;
import Inputs.Input_Clientes;
import Outputs_New.Out_Vista_Clientes;
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
public class Clientes_Manejo {
    
    
    public static void  Cargar(JTable table) throws SQLException, IOException{
        
         DefaultTableModel modelo = new DefaultTableModel();
        table.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cobrador");
        modelo.addColumn("Anulado");
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
            
            int selectedRow = table.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int selectedID = (int) model.getValueAt(selectedRow, 0);
            Input_Clientes JframeClientes = new Input_Clientes();

            try {
                JframeClientes.Modificacion(selectedID);
            } catch (SQLException ex) {
                Logger.getLogger(Out_Vista_Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            JframeClientes.setVisible(true);
            JframeClientes.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            JframeClientes.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    try {
                        Cargar(table);
                    } catch (SQLException ex) {
                        Logger.getLogger(Clientes_Manejo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Clientes_Manejo.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }

              
            });

        }

        
    
    
   public static void Crear(JTable table){
        int selectedRow = table.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            //int selectedID = (int) model.getValueAt(selectedRow, 0);
            Input_Clientes JframeClientes = new Input_Clientes();

            try {
                JframeClientes.Alta();
            } catch (SQLException ex) {
                Logger.getLogger(Out_Vista_Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            JframeClientes.setVisible(true);
            JframeClientes.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            JframeClientes.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    try {
                      Cargar(table);
                        // your code
                    } catch (SQLException ex) {
                        Logger.getLogger(Out_Vista_Clientes.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Out_Vista_Clientes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        
    }
    
    public static void Salvar(){
        
    }
    
    public static void Borrar(){
        
    }
    
}
