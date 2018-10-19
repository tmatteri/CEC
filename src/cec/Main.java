/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cec;

import Outputs.*;
import com.mxrck.autocompleter.AutoCompleter;

import Entidades.*;
import Outputs.Panel_Recorridos;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.metal.MetalTabbedPaneUI;

/**
 *
 * @author Programación 2
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    JMenuBar barraMenu = new JMenuBar();
    JMenu menu_cuenta = new JMenu("Configuración");
    JMenu menu_entidades = new JMenu("Entidades");
    JMenu menu_procesos = new JMenu("Comprobantes");
    JMenu menu_opciones = new JMenu("Contabilidad");

    JMenuItem menu_usuarios = new JMenuItem("Usuarios");
    JMenuItem menu_clientes = new JMenuItem("Clientes/Proveedores");
    JMenuItem menu_cobradores = new JMenuItem("Cobradores/Vendedores");
    JMenuItem menu_importarclientes = new JMenuItem("Importar clientes");
    JMenuItem menu_facturas = new JMenuItem("Facturas");
    JMenuItem menu_recorridos = new JMenuItem("Recorridos");
    JMenuItem menu_productos = new JMenuItem("Productos");

    private Usuario current_user = new Usuario();
    Panel_Usuarios panel_usuarios = new Panel_Usuarios();
    Panel_Clientes panel_clientes = new Panel_Clientes();
    Panel_Recorridos panel_recorridos = new Panel_Recorridos();
    Panel_Cobradores panel_cobradores = new Panel_Cobradores();
    Panel_Productos panel_productos = new Panel_Productos();
    Panel_Facturas_Ingresos panel_facturas_ingresos = new Panel_Facturas_Ingresos();
    
    public void setCurrent_user(Usuario user) {

        this.current_user = user;
        current_user.cargaPermisos();

    }

    public Main() {
        initComponents();
        CrearMenu();
        jTabbedPane1.setUI(new CustomTabbedPaneUI());
        menu_facturas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                //JOptionPane.showMessageDialog(Main.this, "click");
                panel_facturas_ingresos.setCurrent_user(current_user);
               // panel_facturas.C();
                jTabbedPane1.addTab("Facturas   ", panel_facturas_ingresos);
                
                
            }
        });
        
        
        
        menu_usuarios.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                //JOptionPane.showMessageDialog(Main.this, "click");
                panel_usuarios.setCurrent_user(current_user);
                try {
                    panel_usuarios.CargaUsuarios();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTabbedPane1.addTab("Usuarios   ", panel_usuarios);
                
                
            }
        });
        menu_clientes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                //JOptionPane.showMessageDialog(Main.this, "click");
                panel_clientes.setCurrent_user(current_user);
               // panel_usuarios.CargaUsuarios();
                jTabbedPane1.addTab("Clientes   ", panel_clientes);
                
                
            }
        });
        menu_recorridos.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                panel_recorridos.setCurrent_user(current_user);
                try {
                    panel_recorridos.cargaRecorridos();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTabbedPane1.addTab("Recorridos   ", panel_recorridos);
            }
        
        });
        menu_productos.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                panel_productos.setCurrent_user(current_user);
                try {
                    panel_productos.carga();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTabbedPane1.addTab("Productos   ", panel_productos);
            }
        
        });
        
        menu_facturas.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                panel_facturas_ingresos.setCurrent_user(current_user);
                try {
                    panel_facturas_ingresos.carga();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTabbedPane1.addTab("Facturas in   ", panel_facturas_ingresos);
            }
        
        });
        
         menu_cobradores.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    //JOptionPane.showMessageDialog(Main.this, "click");
                    panel_cobradores.setCurrent_user(current_user);
                    panel_cobradores.Carga();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTabbedPane1.addTab("Cobradores  ", panel_cobradores);
                  
            }
        });
         
         menu_importarclientes.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                String ruta = SelectFile();
                Entidad impo = new Entidad();
                try {
                    impo.ImportarClientes(ruta);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        
        });
        
    }

    private void CrearMenu() {

        menu_cuenta.add(menu_usuarios);
        menu_cuenta.add(menu_recorridos);
        menu_entidades.add(menu_clientes);
        menu_cuenta.add(menu_productos);
        menu_entidades.add(menu_cobradores);
        menu_entidades.add(menu_importarclientes);
        menu_procesos.add(menu_facturas);
        barraMenu.add(menu_cuenta);
        barraMenu.add(menu_entidades);
        barraMenu.add(menu_procesos);
        barraMenu.add(menu_opciones);
        setJMenuBar(barraMenu);

    }
    
    private String SelectFile ()
    {   String ruta = "";
    
         JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("texto", "txt");
        chooser.setFileFilter(filter);
        int returnval = chooser.showOpenDialog(this);
        if(returnval == JFileChooser.APPROVE_OPTION) {
           ruta = chooser.getSelectedFile().getPath();
        }else{
           ruta = ""; 
        }
        return ruta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("General");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    class CustomTabbedPaneUI extends MetalTabbedPaneUI
{
   Rectangle xRect;
  
   protected void installListeners() {
      super.installListeners();
      tabPane.addMouseListener((MouseListener) new MyMouseHandler());
   }
  
   protected void paintTab(Graphics g, int tabPlacement,
                           Rectangle[] rects, int tabIndex,
                           Rectangle iconRect, Rectangle textRect) {
      super.paintTab(g, tabPlacement, rects, tabIndex, iconRect, textRect);
  
      Font f = g.getFont();
      g.setFont(new Font("Courier", Font.BOLD, 10));
      FontMetrics fm = g.getFontMetrics(g.getFont());
      int charWidth = fm.charWidth('x');
      int maxAscent = fm.getMaxAscent();
      g.drawString("x", textRect.x + textRect.width - 1, textRect.y + textRect.height - 4);
      g.drawRect(textRect.x+textRect.width-3,
                 textRect.y+textRect.height-maxAscent-1, charWidth+2, maxAscent-1);
      xRect = new Rectangle(textRect.x+textRect.width-5,
                 textRect.y+textRect.height-maxAscent-1, charWidth+2, maxAscent-1);
      g.setFont(f);
      
    }
  
    public class MyMouseHandler extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            System.out.println(e);
            if (xRect.contains(e.getPoint())) {
               JTabbedPane tabPane = (JTabbedPane)e.getSource();
               int tabIndex = tabForCoordinate(tabPane, e.getX(), e.getY());
               //aca hay que validar que no tenga ventanas hijas abiertas
               tabPane.remove(tabIndex);
            }
        }
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
