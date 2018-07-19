/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Programación 2
 */
public class Usuario extends Entidad{


    
    private String pass;
    private Permisos permisos[];

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public void cargaPermisos(){
        
    }
    
    public boolean verificaPermisos(){
        
        return true;
        
    }
    
    public Usuario() {
                
    }

    
    
    
}
