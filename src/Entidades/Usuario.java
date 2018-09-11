/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import cec.Tabla;
import java.sql.ResultSet;

/**
 *
 * @author Programación 2
 */
public class Usuario extends Entidad {

    private String pass;
    private Permisos permisos[];
    private static final String tabla = "usuarios";

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void cargaPermisos() {

    }

    public boolean verificaPermisos() {

        return true;

    }

    public Usuario() {

    }
    
    
    

    public static int insert(int id,String nombre, String contrasena, String email,boolean activo) {
        String campos = "id,nombre,contrasena,email,anulado";
        String valores = id + ",'" + nombre + "','" + contrasena + "','" + email + "'," + activo;
        return Tabla.insert(tabla, campos, valores);
    }
    public  void Guardar(){
        Usuario.insert(this.id, this.nombre, this.pass,this.mail,this.anulado);
               
    }

     public static int updateAll(int id,String nombre, String contrasena, String email,boolean activo) {
        String campos = "id<>nombre<>contrasena<>email<>anulado";
        String valores = id + "<>'" + nombre + "'<>'" + contrasena + "'<>'" + email + "'<>" + activo;
        return Tabla.updateAll(tabla,id, campos, valores);
    }
    
    
    public static int delete(int id) {
        return Tabla.delete(tabla, id);
    }

    public static int update(int id, String campo, String valor) {
        return Tabla.update(tabla, id, campo, valor);
    }
    

    public static ResultSet select() {
        return Tabla.select(tabla);
    }

}
