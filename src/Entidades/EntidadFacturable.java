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
public class EntidadFacturable extends Entidad{
    
    private String condicion_de_iva;
    private String pais;
    private String provincia;
    private String localidad;
    private String direccion;
    private String cp;

 
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

    public String getDireccion() {
        return direccion;
    }

    public String getCp() {
        return cp;
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

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
    
    
    
    
}
