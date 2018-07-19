/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Tomas
 */
public class TiposDeComprobantes {
    private int id;
    private String codigo;
    private int numeracion;
    private String tipo_de_comprobante;

    public TiposDeComprobantes(int id, String codigo, int numeracion, String tipo_de_comprobante) {
        this.id = id;
        this.codigo = codigo;
        this.numeracion = numeracion;
        this.tipo_de_comprobante = tipo_de_comprobante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public String getTipo_de_comprobante() {
        return tipo_de_comprobante;
    }

    public void setTipo_de_comprobante(String tipo_de_comprobante) {
        this.tipo_de_comprobante = tipo_de_comprobante;
    }
    
    
}
