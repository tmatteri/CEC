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
public class Cobradores  extends Entidad{
    
        private static final String tabla = "entidades";
    
     public static int insert(int id,String nombre, String email, String cuit,String telefono,String celular,String domicilio,boolean activo) {
         
        String campos = "id,nombre_fantasia,email,cuit,telefono,celular,domicilio,anulado";
        String valores = id + ",'" + nombre + "','" + email + "','" + cuit + "',"+ telefono + "',"+ celular + "',"+ domicilio + "'," + activo;
        return Tabla.insert(tabla, campos, valores);
    }
    public  void Guardar(){
        Cobradores.insert(this.id, this.nombre_fantasia, this.email,this.cuit,this.telefono,this.celular,this.domicilio,this.anulado);
               
    }

     public static int updateAll(int id,String nombre, String email, String cuit,String telefono,String celular,String domicilio,boolean activo) {
        
        String campos = "id<>nombre_fantasia<>email<>cuit<>telefono<>celular<>domicilio<>anulado";
        String valores = id + "<>'" + nombre + "'<>'" + email + "'<>'" + cuit + "'<>"+ telefono + "'<>"+ celular + "'<>"+ domicilio + "'<>" + activo;

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
