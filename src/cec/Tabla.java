
package cec;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import util.Log;

public class Tabla {
    private static Connection conn;
    private static Statement sentencia;
    private static String consulta;
    
    public static void connect(){
        JavaPostgreSQL conexion = new JavaPostgreSQL();
        try{
            conn=conexion.getConnection();
            sentencia=conn.createStatement();
        }catch(Exception e){
            Log.setLog(e);
        }
    }
    
    public static void close(){
        try {
            sentencia.close();
            conn.close();
        } catch (Exception e) {
            Log.setLog(e);
        }
    }
         
    public static void execute(String consulta){
        // insert delete update
        connect();
        try{
        sentencia.execute(consulta);
        }catch(Exception e){
            Log.setLog(e);
        }
        close();
    }
    
    private static int execute(){
        int x=0;
        connect();
        System.out.println(consulta);
        try{
        x=sentencia.executeUpdate(consulta);
        }catch(Exception e){
            Log.setLog(e);
        }
        close();
        return x;
    }
    
    public static int delete(String tabla,int id){
        consulta="delete from "+tabla+" where id="+id;
        return execute();
    }
    
    public static int insert(String tabla,String campos,String valores){
        consulta="insert into "+tabla+" ("+campos+") values ("+valores+")";
        return execute();
    }
    
    public static int update(String tabla,int id, String campo,String valor){
        consulta="update "+tabla+" set "+campo+"='"+valor+"' where id="+id;
        return execute();
    }
    
    public static ResultSet select(String tabla){
        return select (tabla,"1=1");
    }
    
    public static ResultSet select(String tabla,String filtro){
        ResultSet rs=null;
        consulta="select * from "+tabla+" where "+filtro;
        connect();
        try{
            rs=sentencia.executeQuery(consulta);
        }catch(Exception e){
            Log.setLog(e);
        }
        //close(); //El usuario es responsable de cerrar el result set
        //no puedo cerrar la conexion por que se pierde el enlace al rs
        return rs;
    }
    
}

