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
public class Productos {

    private int id;
    private String descripcion;
    private int stock;
    private float precio;
    private static final String tabla = "productos";

    public Productos(int id, String descripcion, int stock, float precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static int insert(int id, String descripcion, float precio, int stock) {
        String campos = "id,descripcion,precio,stock";
        String valores = id + ",'" + descripcion + "'," + precio + "," + stock;
        return Tabla.insert(tabla, campos, valores);
    }

    public void Guardar() {
        Productos.insert(this.id, this.descripcion, this.precio, this.stock);

    }

    public static int updateAll(int id, String descripcion, float precio, int stock) {
        String campos = "id<>descripcion<>precio<>stock";
        String valores = id + "<>'" + descripcion + "'<>" + precio + "<>" + stock;
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
