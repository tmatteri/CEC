/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import Entidades.Dato;
import com.mxrck.autocompleter.*;
import java.sql.ResultSet;
import cec.Tabla;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author Programación 2
 */
public class Help {
    
      private int id = 0;
            private String texto;

            public Help(int a , String b) {
                this.id = a;
                this.texto = b;
                
            }
            public Help() {
                
                
            }

    public void setId(int id) {
        this.id = id;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
        @Override
    public String toString() {
        return this.texto;
    }    

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }
    
    
    public void Autocompletar(JTextField campo, String table) throws SQLException{
        
        TextAutoCompleter textAutoCompleter = new TextAutoCompleter(campo, new AutoCompleterCallback() {
    @Override
    public void callback(Object selectedItem) {
        System.out.println("El usuario seleccionó: " + selectedItem);
        Dato datid = (Dato) selectedItem;
       // return datid;
       id = datid.getId();
       texto = datid.getTexto();
      
         }
        });
        
        ResultSet rs =Tabla.select(table, "anulado = false");
        while (rs.next()) {
            int a = rs.getInt("id");
            String b = rs.getString("nombre");
            Dato dat = new Dato(a,b);
            
            textAutoCompleter.addItem(dat);
           
            
        }
        rs.close();
        textAutoCompleter.setMode(0);
        
    }
    
    
    
    
    
    
    
    
    
}
