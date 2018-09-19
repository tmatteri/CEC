/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Programación 2
 */
public class Web_Settings {
    
    private String ip;
    private String user;
    private String pass;

    public String getIp() {
        return ip;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Web_Settings() throws FileNotFoundException, IOException {
        
      String cadena;
      String ruta = "./webconfig.txt";
      File archivo = new File(ruta);
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      int comienzo = 0;
      int fin = 0;
               
      while((cadena = b.readLine())!=null) {
          fin = cadena.indexOf("|");
          this.setIp(cadena.substring(comienzo,fin));
          comienzo = fin+1;
          fin = cadena.indexOf("|",comienzo);
          this.setUser(cadena.substring(comienzo,fin));
           comienzo = fin+1;
          fin = cadena.indexOf("|",comienzo);
          this.setPass(cadena.substring(comienzo));
      }
      b.close();
       
    }
    
    
    



}
