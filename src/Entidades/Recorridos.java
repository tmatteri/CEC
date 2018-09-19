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
 * @author Tomas
 */
public class Recorridos {

    private int id;
    private String descripcion;
    private int id_cobrador;
    private boolean anulado;
    private final static String tabla = "recorridos";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_cobrador() {
        return id_cobrador;
    }

    public void setId_cobrador(int id_cobrador) {
        this.id_cobrador = id_cobrador;
    }

    public static int insert(int id, String nombre, int id_cobrador, boolean anulado) {
        String campos = "id,nombre,id_cobrador,anulado";
        String valores = id + ",'" + nombre + "'," + id_cobrador + "," + anulado;
        return Tabla.insert(tabla, campos, valores);
    }

    public void Guardar() {
        Recorridos.insert(this.id, this.descripcion, this.id_cobrador, this.anulado);

    }

    public static int updateAll(int id, String nombre, int id_cobrador, boolean activo) {
        String campos = "id<>nombre<>id_cobrador<>anulado";
        String valores = id + "<>'" + nombre + "'<>" + id_cobrador + "<>" + activo;
        return Tabla.updateAll(tabla, id, campos, valores);
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
