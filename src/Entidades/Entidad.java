/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Programación 2
 */
public class Entidad {

    protected int id;
    protected String nombre_fantasia;
    protected String cuit;
    protected String telefono;
    protected String celular;
    protected String domicilio;
    protected String email;
    protected boolean anulado;
    protected String tipo;
    protected LocalDate fecha_creacion;
    protected int numero_domicilio;
    protected String entre_calles;
    protected String barrio;
    protected String localidad;
    protected String horario_atencion;
    protected static final String tabla = "entidades";

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre_fantasia(String nombre_fantasia) {
        this.nombre_fantasia = nombre_fantasia;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre_fantasia() {
        return nombre_fantasia;
    }

    public String getCuit() {
        return cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public int getNumero_domicilio() {
        return numero_domicilio;
    }

    public void setNumero_domicilio(int numero_domicilio) {
        this.numero_domicilio = numero_domicilio;
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

    public String getHorario_atencion() {
        return horario_atencion;
    }

    public void setHorario_atencion(String horario_atencion) {
        this.horario_atencion = horario_atencion;
    }
    
    

}
