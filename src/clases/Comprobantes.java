/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Tomas
 */
public class Comprobantes {
    private int id;
    private TiposDeComprobantes tipo_de_comprobante;
    private Entidades entidad;
    private String descripcion;
    private Date fecha_creacion;
    private Date fecha_vencimiento;
    private float total;
    private Cobradores id_cobrador;
    private int dias_financiacion;
    private int dias_restantes;
    private String estado;
    private String lugar_de_entrega;
    private Time hora_de_entrega;
    private Date fecha_de_entrega;

    public Comprobantes(int id, TiposDeComprobantes tipo_de_comprobante, Entidades entidad, String descripcion, Date fecha_creacion, Date fecha_vencimiento, float total, Cobradores id_cobrador, int dias_financiacion, int dias_restantes, String estado, String lugar_de_entrega, Time hora_de_entrega, Date fecha_de_entrega) {
        this.id = id;
        this.tipo_de_comprobante = tipo_de_comprobante;
        this.entidad = entidad;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.total = total;
        this.id_cobrador = id_cobrador;
        this.dias_financiacion = dias_financiacion;
        this.dias_restantes = dias_restantes;
        this.estado = estado;
        this.lugar_de_entrega = lugar_de_entrega;
        this.hora_de_entrega = hora_de_entrega;
        this.fecha_de_entrega = fecha_de_entrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TiposDeComprobantes getTipo_de_comprobante() {
        return tipo_de_comprobante;
    }

    public void setTipo_de_comprobante(TiposDeComprobantes tipo_de_comprobante) {
        this.tipo_de_comprobante = tipo_de_comprobante;
    }

    public Entidades getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidades entidad) {
        this.entidad = entidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cobradores getId_cobrador() {
        return id_cobrador;
    }

    public void setId_cobrador(Cobradores id_cobrador) {
        this.id_cobrador = id_cobrador;
    }

    public int getDias_financiacion() {
        return dias_financiacion;
    }

    public void setDias_financiacion(int dias_financiacion) {
        this.dias_financiacion = dias_financiacion;
    }

    public int getDias_restantes() {
        return dias_restantes;
    }

    public void setDias_restantes(int dias_restantes) {
        this.dias_restantes = dias_restantes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLugar_de_entrega() {
        return lugar_de_entrega;
    }

    public void setLugar_de_entrega(String lugar_de_entrega) {
        this.lugar_de_entrega = lugar_de_entrega;
    }

    public Time getHora_de_entrega() {
        return hora_de_entrega;
    }

    public void setHora_de_entrega(Time hora_de_entrega) {
        this.hora_de_entrega = hora_de_entrega;
    }

    public Date getFecha_de_entrega() {
        return fecha_de_entrega;
    }

    public void setFecha_de_entrega(Date fecha_de_entrega) {
        this.fecha_de_entrega = fecha_de_entrega;
    }
    
    
}
