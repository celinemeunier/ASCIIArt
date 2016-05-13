package main;
import main.Algo;


public class User {
	
	/**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Game game = new Game();
    	soluce(game.generate(4, 5, "E", game.getPattern1()));
    	soluce(game.generate(4, 5, "MANHATTAN", game.getPattern1()));
    	soluce(game.generate(4, 5, "ManhAtTan", game.getPattern1()));
    	soluce(game.generate(4, 5, "M@NH@TT@N", game.getPattern1()));
    	soluce(game.generate(20, 11, "MANHATTAN", game.getPattern2()));
    }
    
    /**
	 * Soluce return by User
	 * @param param
	 * @return String
	 */
    public static String soluce(String[] param) {
    	String result = Algo.textToAscii(param);
    	System.out.println(result);
    	return result;		
    }
    
   
    	
}