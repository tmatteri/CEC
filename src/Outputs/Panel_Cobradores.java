/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outputs;
import Entidades.Usuario;
import cec.JavaPostgreSQL;
import java.awt.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.TabPane;
import javax.swing.DefaultListModel;

import javax.swing.table.DefaultTableColumnModel;
import java.util.logging.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import Inputs.*;
import cec.Tabla;
import javax.swing.WindowConstants;
/**
 *
 * @author Programación 2
 */
public class Panel_Cobradores extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Usuarios
     */
    DefaultTableModel modeloUsuarios;
    Usuario current_user = new Usuario();

    public void setCurrent_user(Usuario user) {

        this.current_user = user;
        current_user.cargaPermisos();

    }

    public Panel_Cobradores() {
        initComponents();

    }

    public void Carga() throws IOException, SQLException {
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
       String NombreUsuario = current_user.getNombre();
       

        if (NombreUsuario.equals("test")) {

        } else {
            jT_Cobradores.setModel(modelo);//asignamos el model, todo lo que pase en el model se va a modificar en
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Cobradores = new javax.swing.JTable();
        jB_Alta_Cobradores = new javax.swing.JButton();
        jB_Baja_Cobradores = new javax.swing.JButton();
        jB_Modificar_Cobradores = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jT_Cobradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Mail", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jT_Cobradores);

        jB_Alta_Cobradores.setText("Alta");
        jB_Alta_Cobradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Alta_CobradoresActionPerformed(evt);
            }
        });

        jB_Baja_Cobradores.setText("Baja");
        jB_Baja_Cobradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Baja_CobradoresActionPerformed(evt);
            }
        });

        jB_Modificar_Cobradores.setText("Modificar");
        jB_Modificar_Cobradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Modificar_CobradoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_Alta_Cobradores, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Baja_Cobradores, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Modificar_Cobradores, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Alta_Cobradores)
                    .addComponent(jB_Baja_Cobradores)
                    .addComponent(jB_Modificar_Cobradores))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jB_Modificar_CobradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Modificar_CobradoresActionPerformed
        // TODO add your handling code here:
        try {
        int selectedRow = jT_Cobradores.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jT_Cobradores.getModel();
        
        int selectedID = (int) model.getValueAt(selectedRow,0);
       
        Input_Cobradores JframeCobradores = new Input_Cobradores();
        
      
            JframeCobradores.Modificacion(selectedID);
              JframeCobradores.setVisible(true);
        JframeCobradores.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
         this.Carga();
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Cobradores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel_Cobradores.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       
           
     
        
        
    }//GEN-LAST:event_jB_Modificar_CobradoresActionPerformed

    private void jB_Alta_CobradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Alta_CobradoresActionPerformed
        // TODO add your handling code here:
           try {
        Input_Cobradores JframeCobradores = new Input_Cobradores();
        JframeCobradores.Alta();
        JframeCobradores.setVisible(true);
        JframeCobradores.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    
            this.Carga();
        } catch (IOException ex) {
            Logger.getLogger(Panel_Cobradores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Cobradores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jB_Alta_CobradoresActionPerformed

    private void jB_Baja_CobradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Baja_CobradoresActionPerformed
        try {
            // TODO add your handling code here:
            int selectedRow = jT_Cobradores.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jT_Cobradores.getModel();
            
            int selectedID = (int) model.getValueAt(selectedRow,0);
            Tabla.update("entidades", selectedID,"anulado", "True");
            this.Carga();
        } catch (IOException ex) {
            Logger.getLogger(Panel_Cobradores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Cobradores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jB_Baja_CobradoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Alta_Cobradores;
    private javax.swing.JButton jB_Baja_Cobradores;
    private javax.swing.JButton jB_Modificar_Cobradores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_Cobradores;
    // End of variables declaration//GEN-END:variables
}
