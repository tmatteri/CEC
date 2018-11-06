/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outputs;

import Entidades.CONSTANT;
import Entidades.Usuario;
import Inputs.Input_Clientes;
import cec.JavaPostgreSQL;
import cec.Tabla;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import util.CD;

/**
 *
 * @author martin
 */
public class Panel_Clientes extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Clientes
     */
    public Panel_Clientes() {
        initComponents();
        
    }
    Usuario current_user = new Usuario();
    
    public void setCurrent_user(Usuario user) {

        this.current_user = user;
        current_user.cargaPermisos();
        
    }

    public void Cargar() throws SQLException, IOException {
        DefaultTableModel modelo = new DefaultTableModel();
        jT_Clientes.setModel(modelo);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Clientes = new javax.swing.JTable();
        jB_Alta_Cliente = new javax.swing.JButton();
        jB_Modificar_Cliente = new javax.swing.JButton();

        jT_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Mail", "Telefono", "Direccion", "Recorrido", "Cobrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jT_Clientes);

        jB_Alta_Cliente.setText("Alta");
        jB_Alta_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Alta_ClienteActionPerformed(evt);
            }
        });

        jB_Modificar_Cliente.setText("Modificar");
        jB_Modificar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Modificar_ClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_Alta_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Modificar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Alta_Cliente)
                    .addComponent(jB_Modificar_Cliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jB_Modificar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Modificar_ClienteActionPerformed
        if (current_user.VerificoPermisos(CONSTANT.CLIENTES, CONSTANT.MODIFICACION)) {
            int selectedRow = jT_Clientes.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jT_Clientes.getModel();

            int selectedID = (int) model.getValueAt(selectedRow, 0);

            Input_Clientes JframeClientes = new Input_Clientes();

            try {
                JframeClientes.Modificacion(selectedID);
            } catch (SQLException ex) {
                Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            JframeClientes.setVisible(true);
            JframeClientes.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            JframeClientes.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    try {
                        Cargar();
                        // your code
                    } catch (SQLException ex) {
                        Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            });

        }

    }//GEN-LAST:event_jB_Modificar_ClienteActionPerformed

    private void jB_Alta_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Alta_ClienteActionPerformed

        if (current_user.VerificoPermisos(CONSTANT.CLIENTES, CONSTANT.ALTA)) {
            int selectedRow = jT_Clientes.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jT_Clientes.getModel();

            //int selectedID = (int) model.getValueAt(selectedRow, 0);
            Input_Clientes JframeClientes = new Input_Clientes();

            try {
                JframeClientes.Alta();
            } catch (SQLException ex) {
                Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            JframeClientes.setVisible(true);
            JframeClientes.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            JframeClientes.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    try {
                        Cargar();
                        // your code
                    } catch (SQLException ex) {
                        Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Panel_Clientes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }

    }//GEN-LAST:event_jB_Alta_ClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Alta_Cliente;
    private javax.swing.JButton jB_Modificar_Cliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_Clientes;
    // End of variables declaration//GEN-END:variables
}
