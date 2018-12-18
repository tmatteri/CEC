/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Entidades.Cobradores;
import Entidades.Entidad;
import cec.Tabla;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Tomas
 */
public class Comprobantes {
    private static final String tabla = "comprobantes";
    private int id;
    private TiposDeComprobantes tipo_de_comprobante;
    private Entidad entidad;
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

    public Comprobantes(int id, TiposDeComprobantes tipo_de_comprobante, Entidad entidad, String descripcion, Date fecha_creacion, Date fecha_vencimiento, float total, Cobradores id_cobrador, int dias_financiacion, int dias_restantes, String estado, String lugar_de_entrega, Time hora_de_entrega, Date fecha_de_entrega) {
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

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
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
  
    
      public static int insert(int id,int id_tipo_de_comprobante, int id_entidad, String descripcion,String fecha_creacion,String fecha_vencimiento
              ,double total,int id_cobrador,String dias_financiacion,String dias_restantes,boolean estado,String lugar_de_entrega,String hora_de_entrega,String fecha_de_entrega) {
         
          
        String campos = "id,id_tipo_de_comprobante,id_entidad,descripcion,fecha_creacion,fecha_vencimiento,total,id_cobrador,dias_financiacion,"
                + "dias_restantes,estado,lugar_de_entrega,hora_de_entrega,fecha_de_entrega";
        
        String valores = id + "," + id_tipo_de_comprobante + "," + id_entidad + ",'" + descripcion + "','"+ fecha_creacion + "','"
                + fecha_vencimiento+"',"+total + ","+ id_cobrador + ",'" + dias_financiacion +"','" + dias_restantes+"'," + estado+",'" 
                + lugar_de_entrega+"','" + hora_de_entrega+"','" + fecha_de_entrega;
        
        return Tabla.insert(tabla, campos, valores);
    }
    
    
         public static int updateAll(int id,int id_tipo_de_comprobante, int id_entidad, String descripcion,String fecha_creacion,String fecha_vencimiento
              ,double total,int id_cobrador,String dias_financiacion,String dias_restantes,boolean estado,String lugar_de_entrega,String hora_de_entrega,String fecha_de_entrega) {
         
        String campos = "id<>id_tipo_de_comprobante<>id_entidad<>descripcion<>fecha_creacion<>fecha_vencimiento<>total<>id_cobrador<>dias_financiacion<>"
                + "dias_restantes<>estado<>lugar_de_entrega<>hora_de_entrega<>fecha_de_entrega";
        
        String valores = id + "<>" + id_tipo_de_comprobante + "<>" + id_entidad + "<>" + descripcion + "<>"+ fecha_creacion + "<>"
                + fecha_vencimiento+ "<>"+total + "<>"+ id_cobrador + "<>" + dias_financiacion +"<>" + dias_restantes+"<>" + estado+"<>" 
                + lugar_de_entrega+"<>" + hora_de_entrega+"<>" + fecha_de_entrega;
        
        return Tabla.insert(tabla, campos, valores);
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
