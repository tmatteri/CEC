package util;

import java.net.InetAddress;
import java.util.Date;

public class Log {
    private static String logFile="log.csv";
    public static void setLog(Exception e){
        String fecha=new Date().toString();
        String usuario=System.getProperty("user.name");
        InetAddress inet=null;
        try {
            inet=InetAddress.getLocalHost();
        } catch (Exception ex) {
            CD.error(ex);
        }
        String registro=fecha+";"+usuario+";"+inet+";"+e;
        Archivo.append(logFile, registro);
        CD.error("Ocurrio un error!");
    }
}
