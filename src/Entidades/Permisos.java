/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Tomas
 */
public class Permisos {
    
    private int id;
    private int id_usuario;
    private int id_funcion;
    private boolean modificar;
    private boolean anular;
    private boolean entrar;
    private boolean crear;

    public boolean isCrear() {
        return crear;
    }

    public void setCrear(boolean crear) {
        this.crear = crear;
    }
    

    public Permisos(int id, int id_usuario, int id_funcion, boolean modificar, boolean anular, boolean entrar) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.id_funcion = id_funcion;
        this.modificar = modificar;
        this.anular = anular;
        this.entrar = entrar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_funcion() {
        return id_funcion;
    }

    public void setId_funcion(int id_funcion) {
        this.id_funcion = id_funcion;
    }

    public boolean isModificar() {
        return modificar;
    }

    public void setModificar(boolean modificar) {
        this.modificar = modificar;
    }

    public boolean isAnular() {
        return anular;
    }

    public void setAnular(boolean anular) {
        this.anular = anular;
    }

    public boolean isEntrar() {
        return entrar;
    }

    public void setEntrar(boolean entrar) {
        this.entrar = entrar;
    }
    
    
    
}
