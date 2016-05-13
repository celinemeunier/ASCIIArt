package main;
import main.Algo;



public class User {
	
	/**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	soluce(args);
	
    }
    
    /**
	 * Soluce return by User
	 * @param param
	 * @return String
	 */
    static String soluce(String[] param) {
    	String result = Algo.textToAscii(param);
    	System.out.println(result);
    	return result;		
    }
    
   
    	
}