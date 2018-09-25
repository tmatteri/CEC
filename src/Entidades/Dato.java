/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.SQLException;
import javax.swing.JTextField;
import util.Help;

/**
 *
 * @author Programación 2
 */
public class Dato {
     private int id = 0;
            private String texto;

            public Dato(int a , String b) {
                this.id = a;
                this.texto = b;
                
            }
            public Dato() {
                
                
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
     
    
}
