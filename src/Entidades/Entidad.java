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
public class Entidad {

    protected int id;
    protected String nombre;
    protected String cuit;
    protected String telefono;
    protected String mail;
    protected boolean anulado;

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

}
