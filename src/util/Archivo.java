package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Archivo {

    private static BufferedReader in;
    private static BufferedWriter out;
    
    public static void open(String file) {
        try {
            in = new BufferedReader(new FileReader(file));
        } catch (Exception e) {
            CD.error(e);
        }
    }
    
    public static String getLine() {
        try {
            return in.readLine();
        } catch (Exception e) {
            CD.error(e);
            return "";
        }
    }
    
    public static void close() {
        try {
            in.close();
        } catch (Exception e) {
            CD.error(e);
        }
    }
    
    public static List getLines(String file) {
        open(file);
        List<String> lista = new ArrayList<String>();
        String linea;
        try {
            while ((linea = in.readLine()) != null) {
                lista.add(linea);
            }
        } catch (Exception e) {
            CD.error(e);
        }
        close();
        return lista;
    }
    
    public static void setText(String file, String x){
        try {
            out=new BufferedWriter(new FileWriter(file));
            out.write(x);
            out.newLine();
            out.close();
        } catch (Exception e) {
            CD.error(e);
        }
    }
    
    public static void append(String file, String x){
        try {
            out=new BufferedWriter(new FileWriter(file,true));
            out.write(x);
            out.newLine();
            out.close();
        } catch (Exception e) {
            CD.error(e);
        }
    }
    
}














