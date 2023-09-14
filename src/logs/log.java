package logs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class log {
	private static String path_log="./G3Domotica/logs/"+ new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date()) + "_G3Domotica.log";
	 private static String path_log_calefa="./G3Domotica/logs/calefaccion/"+ new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date()) + "_G3Domotica.log";
	 private static String path_log_alarma ="./G3Domotica/logs/alarmas/"+ new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date()) + "_G3Domotica.log";
	 private static String path_log_login="./G3Domotica/logs/login"+ new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date()) + "_G3Domotica.log";
	 
	 
	 public static boolean logAlarma(String text) {   
	        String prefix = "[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] ";
	        try {
	            FileWriter fileWriter = new FileWriter(path_log_alarma, true);
	            PrintWriter opened = new PrintWriter(fileWriter);
	            
	            opened.println(prefix + text);
	            
	            opened.close();
	        } catch (IOException ioe) {
//	            ioe.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	 public static boolean logLogin(String text) {   
	        String prefix = "[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] ";
	        try {
	            FileWriter fileWriter = new FileWriter(path_log_login, true);
	            PrintWriter opened = new PrintWriter(fileWriter);
	            
	            opened.println(prefix + text);
	            
	            opened.close();
	        } catch (IOException ioe) {
//	            ioe.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	 public static boolean logCal(String text) {   
	        String prefix = "[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] ";
	        try {
	            FileWriter fileWriter = new FileWriter(path_log_calefa, true);
	            PrintWriter opened = new PrintWriter(fileWriter);
	            
	            opened.println(prefix + text);
	            
	            opened.close();
	        } catch (IOException ioe) {
//	            ioe.printStackTrace();
	            return false;
	        }
	        return true;
	    }
}
