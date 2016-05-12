package main;

/**
 * Class User, user resolve game by param
 * @author valentin
 */
public class User {
    
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