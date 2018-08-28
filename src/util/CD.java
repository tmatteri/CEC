package util;

import java.awt.Component;
import javax.swing.JOptionPane;

public class CD {
    public static void box(Object obj){
        JOptionPane.showMessageDialog(null, obj);
    }
    
    public static void box(Component cmp, Object obj){
        JOptionPane.showMessageDialog(cmp, obj);
    }
    
    public static String input(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    
    public static String input(Component cmp, String msg){
        return JOptionPane.showInputDialog(cmp,msg);
    }
    
    public static int question(String msg){
        return JOptionPane.showConfirmDialog(null, msg);
    }
    
    public static int question(Component cmp, String msg){
        return JOptionPane.showConfirmDialog(cmp, msg);
    }
    
    public static void error(Object obj){
        JOptionPane.showMessageDialog(null, obj, "Error", 0);
    }
    
    public static void error(Component cmp, Object obj){
        JOptionPane.showMessageDialog(cmp, obj, "Error", 0);
    }
    
}
