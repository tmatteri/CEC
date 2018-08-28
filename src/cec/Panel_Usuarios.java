/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cec;

import Entidades.Usuario;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Programación 2
 */
public class Panel_Usuarios extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Usuarios
     */
    DefaultTableModel modeloUsuarios;
    Usuario current_user = new Usuario();

    public void setCurrent_user(Usuario user) {

        this.current_user = user;
        current_user.cargaPermisos();

    }

    public Panel_Usuarios() {
        initComponents();

    }

    public void CargaUsuarios() throws IOException, SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Mail");
        modelo.addColumn("Telefono");
        modelo.addColumn("Anulado");
       

        if (current_user.getNombre() == "test") {

        } else {
            jT_Usuarios.setModel(modelo);//asignamos el model, todo lo que pase en el model se va a modificar en
            //la tabla
            ResultSet rs;
            Connection conn = null;
            JavaPostgreSQL conexion = new JavaPostgreSQL();
            conn = conexion.getConnection();
            Statement st = conn.createStatement();
            String consulta = "SELECT nombre, mail, telefono, anulado FROM usuarios";
            rs = st.executeQuery(consulta); //ejecutamos la consulta
            Object datos[] = new Object[4];//creamos un object de la cantidad de COLUMNAS

            conn.close();//cerramos conexion
            
            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
                    datos[i] = rs.getObject(i + 1);//cargamos la fila en el objeto

                }
                modelo.addRow(datos);//cargamos el objeto en el model

            }
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
        jT_Usuarios = new javax.swing.JTable();
        jB_Alta_usuario = new javax.swing.JButton();
        jB_Baja_Usuario = new javax.swing.JButton();
        jB_Modificar_Usuario = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jT_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Mail", "Telefono", "Anulado"
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
        jScrollPane1.setViewportView(jT_Usuarios);

        jB_Alta_usuario.setText("Alta");

        jB_Baja_Usuario.setText("Baja");

        jB_Modificar_Usuario.setText("Modificar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_Alta_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Baja_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Modificar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Alta_usuario)
                    .addComponent(jB_Baja_Usuario)
                    .addComponent(jB_Modificar_Usuario))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Alta_usuario;
    private javax.swing.JButton jB_Baja_Usuario;
    private javax.swing.JButton jB_Modificar_Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_Usuarios;
    // End of variables declaration//GEN-END:variables
}
