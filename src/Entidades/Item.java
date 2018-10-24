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
public class Item {
    private int id;
    private int id_comprobante;
    private int id_producto;
    private int cantidad;
    private float precio;
    private int alicuota;
    private float total;

    public Item() {
    }

    public Item(int id, int id_comprobante, int id_producto, int cantidad, float precio, int alicuota, float total) {
        this.id = id;
        this.id_comprobante = id_comprobante;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.alicuota = alicuota;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public int getId_comprobante() {
        return id_comprobante;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public int getAlicuota() {
        return alicuota;
    }

    public float getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_comprobante(int id_comprobante) {
        this.id_comprobante = id_comprobante;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setAlicuota(int alicuota) {
        this.alicuota = alicuota;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
    
    
}
