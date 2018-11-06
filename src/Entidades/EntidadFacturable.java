/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import cec.Tabla;
import java.sql.ResultSet;
import java.time.LocalDate;

/**
 *
 * @author Programación 2
 */
public class EntidadFacturable extends Entidad {

    private String condicion_de_iva;
    private String pais;
    private String provincia;
    private String localidad;
    private String codigo_postal;
    private String rubro;
    private String razon_social;
    private int local;
    private String domicilio_cobro;
    private int id_recorrido;
    private int numero_domicilio_cobro;

    public int getId_recorrido() {
        return id_recorrido;
    }

    public void setId_recorrido(int id_recorrido) {
        this.id_recorrido = id_recorrido;
    }

    public String getCondicion_de_iva() {
        return condicion_de_iva;
    }

    public String getPais() {
        return pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCondicion_de_iva(String condicion_de_iva) {
        this.condicion_de_iva = condicion_de_iva;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

    public String getDomicilio_cobro() {
        return domicilio_cobro;
    }

    public void setDomicilio_cobro(String domicilio_cobro) {
        this.domicilio_cobro = domicilio_cobro;
    }

    public int getNumero_domicilio_cobro() {
        return numero_domicilio_cobro;
    }

    public void setNumero_domicilio_cobro(int numero_domicilio_cobro) {
        this.numero_domicilio_cobro = numero_domicilio_cobro;
    }

    public static int insert(int id, LocalDate fecha_creacion, String cuit, String rubro, String nombre_fantasia, String razon_social, String domicilio, String telefono, int numero_domicilio, String celular, int local, String entre_calles, String barrio, String localidad, String horario_atencion, String domicilio_cobro, int numero_domicilio_cobro, String codigo_postal, String tipo, int id_recorrido, String email, boolean anulado) {
        String campos = "id,fecha_creacion,cuit,rubro,nombre_fantasia,razon_social,domicilio,telefono,numero_domicilio,celular,num_local,entre_calles,barrio,localidad,horario_atencion,domicilio_cobro,numero_domicilio_cobro,codigo_postal,tipo,id_recorrido,email,anulado";
        String valores = id + ",'" + fecha_creacion + "','" + cuit + "','" + rubro + "','" + nombre_fantasia + "','" + razon_social + "','" + domicilio + "','" + telefono + "'," + numero_domicilio + ",'" + celular + "'," + local + ",'" + entre_calles + "','" + barrio + "','" + localidad + "','" + horario_atencion + "','" + domicilio_cobro + "'," + numero_domicilio_cobro + ",'" + codigo_postal + "','" + tipo + "'," + id_recorrido + ",'" + email + "'," + anulado;
        return Tabla.insert(tabla, campos, valores);
    }

    public void Guardar() {
        EntidadFacturable.insert(this.id, this.fecha_creacion, this.cuit, this.rubro, this.nombre_fantasia, this.razon_social, this.domicilio, this.telefono, this.numero_domicilio, this.celular, this.local, this.entre_calles, this.barrio, this.localidad, this.horario_atencion, this.domicilio_cobro, this.numero_domicilio_cobro, this.codigo_postal, this.tipo, this.id_recorrido, this.email, this.anulado);

    }

    public static int updateAll(int id, LocalDate fecha_creacion, String cuit, String rubro, String nombre_fantasia, String razon_social, String domicilio, String telefono, int numero_domicilio, String celular, int local, String entre_calles, String barrio, String localidad, String horario_atencion, String domicilio_cobro, int numero_domicilio_cobro, String codigo_postal, String tipo, int id_recorrido, String email, boolean anulado) {
        String campos =  "id<>fecha_creacion<>cuit<>rubro<>nombre_fantasia<>razon_social<>domicilio<>telefono<>numero_domicilio<>celular<>num_local<>entre_calles<>barrio<>localidad<>horario_atencion<>domicilio_cobro<>numero_domicilio_cobro<>codigo_postal<>tipo,id_recorrido<>email<>anulado";
   
        String valores = id + "<>'" + fecha_creacion + "'<>'" + cuit + "'<>'" + rubro + "'<>'" + nombre_fantasia + "'<>'" + razon_social + "'<>'" + domicilio + "'<>'" + telefono + "'<>" + numero_domicilio + "<>'" + celular + "'<>" + local + "<>'" + entre_calles + "'<>'" + barrio + "'<>'" + localidad + "'<>'" + horario_atencion + "'<>'" + domicilio_cobro + "'<>" + numero_domicilio_cobro + "<>'" + codigo_postal + "'<>'" + tipo + "'<>" + id_recorrido + "<>'" + email + "'<>" + anulado;
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
