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
public class Contactos {

    private int id;
    private int id_entidad;
    private int dni;
    private LocalDate fecha_nacimiento;
    private String nacionalidad;
    private String estado_civil;
    private String nombre_completo;
    private String nombre_conyugue;
    private String email;
    private String domicilio;
    private int numero_domicilio;
    private int piso_domicilio;
    private String departamento_domicilio;
    private String entre_calles;
    private String barrio;
    private String localidad;
    private String codigo_postal;
    private LocalDate reside_desde;
    private String telefono;
    private String celular;
    private boolean anulado;
    final static private String tabla = "contactos";

    public Contactos(int id, int id_entidad, int dni, LocalDate fecha_nacimiento, String nacionalidad, String estado_civil, String nombre_completo, String nombre_conyugue, String email, String domicilio, int numero_domicilio, int piso_domicilio, String departamento_domicilio, String entre_calles, String barrio, String localidad, String codigo_postal, LocalDate reside_desde, String telefono, String celular, boolean anulado) {
        this.id = id;
        this.id_entidad = id_entidad;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
        this.estado_civil = estado_civil;
        this.nombre_completo = nombre_completo;
        this.nombre_conyugue = nombre_conyugue;
        this.email = email;
        this.domicilio = domicilio;
        this.numero_domicilio = numero_domicilio;
        this.piso_domicilio = piso_domicilio;
        this.departamento_domicilio = departamento_domicilio;
        this.entre_calles = entre_calles;
        this.barrio = barrio;
        this.localidad = localidad;
        this.codigo_postal = codigo_postal;
        this.reside_desde = reside_desde;
        this.telefono = telefono;
        this.celular = celular;
        this.anulado = anulado;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_entidad() {
        return id_entidad;
    }

    public void setId_entidad(int id_entidad) {
        this.id_entidad = id_entidad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNombre_conyugue() {
        return nombre_conyugue;
    }

    public void setNombre_conyugue(String nombre_conyugue) {
        this.nombre_conyugue = nombre_conyugue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getNumero_domicilio() {
        return numero_domicilio;
    }

    public void setNumero_domicilio(int numero_domicilio) {
        this.numero_domicilio = numero_domicilio;
    }

    public int getPiso_domicilio() {
        return piso_domicilio;
    }

    public void setPiso_domicilio(int piso_domicilio) {
        this.piso_domicilio = piso_domicilio;
    }

    public String getDepartamento_domicilio() {
        return departamento_domicilio;
    }

    public void setDepartamento_domicilio(String departamento_domicilio) {
        this.departamento_domicilio = departamento_domicilio;
    }

    public String getEntre_calles() {
        return entre_calles;
    }

    public void setEntre_calles(String entre_calles) {
        this.entre_calles = entre_calles;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public LocalDate getReside_desde() {
        return reside_desde;
    }

    public void setReside_desde(LocalDate reside_desde) {
        this.reside_desde = reside_desde;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }
    
    

    public static int insert(int id, int id_entidad, int dni, LocalDate fecha_nacimiento, String nacionalidad, String estado_civil, String nombre_completo, String nombre_conyugue, String email, String domicilio, int numero_domicilio, int piso_domicilio, String departamento_domicilio, String entre_calles, String barrio, String localidad, String codigo_postal, LocalDate reside_desde, String telefono, String celular, boolean anulado) {
        String campos = "id,id_entidad,dni,fecha_nacimiento,nacionalidad,estado_civil,nombre_completo,nombre_conyugue,email,domicilio,numero_domicilio,piso_domicilio,departamento_domicilio,entre_calles,barrio,localidad,codigo_postal,reside_desde,telefono,celular,anulado";
        String valores = id + "," + id_entidad + "," + dni + ",'" + fecha_nacimiento + "','" + nacionalidad + "','" + estado_civil + "','" + nombre_completo + "','" + nombre_conyugue + "','" + email + "','" + domicilio + "'," + numero_domicilio + "," + piso_domicilio + ",'" + departamento_domicilio + "','" + entre_calles + "','" + barrio + "','" + localidad + "','" + codigo_postal + "','" + reside_desde + "','" + telefono + "','" + celular + "'," + anulado;
        return Tabla.insert(tabla, campos, valores);
    }

    public void Guardar() {
        Contactos.insert(this.id,this.id_entidad,this.dni,this.fecha_nacimiento,this.nacionalidad,this.estado_civil,this.nombre_completo,this.nombre_conyugue,this.email,this.domicilio,this.numero_domicilio,this.piso_domicilio,this.departamento_domicilio,this.entre_calles,this.barrio,this.localidad,this.codigo_postal,this.reside_desde,this.telefono,this.celular,this.anulado);
    }

    public static int updateAll(int id, int id_entidad, int dni, LocalDate fecha_nacimiento, String nacionalidad, String estado_civil, String nombre_completo, String nombre_conyugue, String email, String domicilio, int numero_domicilio, int piso_domicilio, String departamento_domicilio, String entre_calles, String barrio, String localidad, String codigo_postal, String reside_desde, String telefono, String celular, boolean anulado) {
        String campos = "id<>id_entidad<>dni<>fecha_nacimiento<>nacionalidad<>estado_civil<>nombre_completo<>nombre_conyugue<>email<>domicilio<>numero_domicilio<>piso_domicilio<>departamento_domicilio<>entre_calles<>barrio<>localidad<>codigo_postal<>reside_desde<>telefono<>celular<>anulado";
        String valores = id + "<>" + id_entidad + "<>" + dni + "<>'" + fecha_nacimiento + "'<>'" + nacionalidad + "'<>'" + estado_civil + "'<>'" + nombre_completo + "'<>'" + nombre_conyugue + "'<>'" + email + "'<>'" + domicilio + "'<>" + numero_domicilio + "<>" + piso_domicilio + "<>'" + departamento_domicilio + "'<>'" + entre_calles + "'<>'" + barrio + "'<>'" + localidad + "'<>'" + codigo_postal + "'<>'" + reside_desde + "'<>'" + telefono + "'<>'" + celular + "'<>" + anulado;
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
