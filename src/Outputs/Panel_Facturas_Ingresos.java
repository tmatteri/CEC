/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outputs;

import Entidades.CONSTANT;
import Entidades.Usuario;
import Inputs.Input_Clientes;
import Inputs.Input_Facturas_Ingresos;
import cec.JavaPostgreSQL;
import cec.Tabla;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import util.CD;

/**
 *
 * @author martin
 */
public class Panel_Facturas_Ingresos extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Clientes
     */
    public Panel_Facturas_Ingresos() {
        initComponents();
    }
    Usuario current_user = new Usuario();

    public void setCurrent_user(Usuario user) {

        this.current_user = user;
        current_user.cargaPermisos();

    }

    public void carga() throws SQLException, IOException {
        DefaultTableModel modelo = new DefaultTableModel();
        jT_Facturas_Ingresos.setModel(modelo);
        ResultSet rs;
        Connection conn = null;
        JavaPostgreSQL conexion = new JavaPostgreSQL();
        conn = conexion.getConnection();
        Statement st = conn.createStatement();

        //    ResultSet rs = Tabla.select("id,fecha_creacion,id_entidad,descripcion,total,id_cobrador", "comprobantes", "1=1");
        String consulta = "SELECT id, fecha_creacion, id_entidad, descripcion,total,id_cobrador FROM comprobantes;";
        rs = st.executeQuery(consulta); //ejecutamos la consulta

        Object[] datos = new Object[6];//creamos un object de la cantidad de COLUMNAS
        modelo.addColumn("ID");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cliente");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Total");
        modelo.addColumn("Pendiente");
        while (rs.next()) {
            for (int i = 0; i < 6; i++) {
                if (i==2) {
                    
                   datos[i] = Tabla.selectOne("nombre_fantasia","entidades","id = "+rs.getObject(i+1));
                } else {
                    datos[i] = rs.getObject(i + 1);//cargamos la fila en el objeto
                }

            }
            modelo.addRow(datos);//cargamos el objeto en el model
        }
        modelo.fireTableDataChanged();
        rs.close();
    }

    /**
     *
     * /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Facturas_Ingresos = new javax.swing.JTable();
        jB_Alta_Facturas_Ingresos = new javax.swing.JButton();
        jB_Modificar_Cliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jT_Facturas_Ingresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Cliente", "Descripción", "Total", "Pendiente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
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
        jScrollPane1.setViewportView(jT_Facturas_Ingresos);

        jB_Alta_Facturas_Ingresos.setText("Alta");
        jB_Alta_Facturas_Ingresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Alta_Facturas_IngresosActionPerformed(evt);
            }
        });

        jB_Modificar_Cliente.setText("Modificar");
        jB_Modificar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Modificar_ClienteActionPerformed(evt);
            }
        });

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Alta_Facturas_Ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jB_Alta_Facturas_Ingresos)
                    .addComponent(jB_Modificar_Cliente)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jB_Modificar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Modificar_ClienteActionPerformed
        if (current_user.VerificoPermisos(CONSTANT.CLIENTES, CONSTANT.MODIFICACION)) {
            try {
                int selectedRow = jT_Facturas_Ingresos.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) jT_Facturas_Ingresos.getModel();

                int selectedID = (int) model.getValueAt(selectedRow, 0);

                Input_Facturas_Ingresos JframeFacturasIngreso = new Input_Facturas_Ingresos();
                JframeFacturasIngreso.setVisible(true);
                JframeFacturasIngreso.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

                try {
                    JframeFacturasIngreso.Modificacion(selectedID);
                } catch (SQLException ex) {
                    Logger.getLogger(Panel_Facturas_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
                }
                JframeFacturasIngreso.setVisible(true);
                JframeFacturasIngreso.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            } catch (SQLException ex) {
                Logger.getLogger(Panel_Facturas_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jB_Modificar_ClienteActionPerformed

    private void jB_Alta_Facturas_IngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Alta_Facturas_IngresosActionPerformed

        if (current_user.VerificoPermisos(CONSTANT.CLIENTES, CONSTANT.ALTA)) {
            int selectedRow = jT_Facturas_Ingresos.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) jT_Facturas_Ingresos.getModel();

            //int selectedID = (int) model.getValueAt(selectedRow, 0);
            Input_Facturas_Ingresos JframeFacturas = null;
            try {
                JframeFacturas = new Input_Facturas_Ingresos();
            } catch (SQLException ex) {
                Logger.getLogger(Panel_Facturas_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                JframeFacturas.Alta();
            } catch (SQLException ex) {
                Logger.getLogger(Panel_Facturas_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
            }
            JframeFacturas.setVisible(true);
            JframeFacturas.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        }

    }//GEN-LAST:event_jB_Alta_Facturas_IngresosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CD.error("ERROR!!");
        Desktop desktop;/* Declaro un objeto Desktop que es una nueva API en JAVA
     Para mas detalle sobre ésta API ver la siguiente Página web > 
     http://java.sun.com/developer/technicalArticles/J2SE/Desktop/javase6/desktop_api/
         */
        File file = new File("./nota_de_pedido.html");//declaro un Objeto File que apunte a mi archivo html
        if (Desktop.isDesktopSupported()) {// si éste Host soporta esta API 
            desktop = Desktop.getDesktop();//objtengo una instancia del Desktop(Escritorio)de mi host 
            try {
                desktop.open(file);//abro el archivo con el programa predeterminado
            } catch (IOException ex) {
                Logger.getLogger(Panel_Facturas_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Lo lamento,no se puede abrir el archivo; ésta Maquina no soporta la API Desktop");
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Alta_Facturas_Ingresos;
    private javax.swing.JButton jB_Modificar_Cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_Facturas_Ingresos;
    // End of variables declaration//GEN-END:variables
}
