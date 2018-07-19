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
public class Permisos {
    
    private String id;
    private String codigo_permiso;
    private boolean modificar;
    private boolean anular;
    private boolean ver;

    public String getId() {
        return id;
    }

    public String getCodigo_permiso() {
        return codigo_permiso;
    }

    public boolean isModificar() {
        return modificar;
    }

    public boolean isAnular() {
        return anular;
    }

    public boolean isVer() {
        return ver;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCodigo_permiso(String codigo_permiso) {
        this.codigo_permiso = codigo_permiso;
    }

    public void setModificar(boolean modificar) {
        this.modificar = modificar;
    }

    public void setAnular(boolean anular) {
        this.anular = anular;
    }

    public void setVer(boolean ver) {
        this.ver = ver;
    }
    
    
}
