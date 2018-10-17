/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Programación 2
 */
public class Entidad {

    protected int id;
    protected String nombre;
    protected String cuit;
    protected String telefono;
    protected String celular;
    protected String domicilio;
    protected String mail;
    protected boolean anulado;
    protected String tipo;

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

    public void ImportarClientes(String ruta) throws FileNotFoundException, IOException {
        String cadena;
        File archivo = new File(ruta);
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int comienzo = 0;
        int fin = 0;
        String campos[] = new String[10];

        while ((cadena = b.readLine()) != null) {

            comienzo = 0;
            fin = 0;
            for(int i = 0;i<10;i++){
            fin = cadena.indexOf("|", comienzo);
            campos[i] = (cadena.substring(comienzo, fin));
            comienzo = fin + 1;
            }
        }
        b.close();
        
        
        
        
        
    }

}
