package main;

public class Algo {

	/**
	 * Generate ASCII Art
	 * @param String[] param
	 * @return String
	 */
	public static String textToAscii(String[] param) {
		Integer L = Integer.parseInt(param[0]);
        Integer H = Integer.parseInt(param[1]);
        String word = param[2].toUpperCase();
        String exit = "";
        
        //check nbParam
        if (H != param.length - 3)
        	return "Invalid number of param by height";
        
        //check length
        if (L < 0 || L > 30)
        	return "Invalid number for width";
        if (H < 0 || H > 30)
        	return "Invalid number for height";
        
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String[][] character = new String[alphabet.length + 1][H];
        
        //create letter
        Integer nbLetter = 0;
        for (int i = 0; i < L * (alphabet.length + 1); i += L) {
            //for line
            for (int j = 0; j < H; j++) {
                character[nbLetter][j] = param[3 + j].substring(i, i + L);
            }
            nbLetter++;
        }
        
        char[] tabWord = word.toCharArray();
        //for line
        for (int l = 0; l < H; l++ ) {
            //for letter
            for (int i = 0; i < tabWord.length; i++) {
                //search a letter
                Integer index = 26;
                for (int j = 0; j < alphabet.length; j++) {
                    if (tabWord[i] == alphabet[j]) {
                        index = j;
                        break;
                    }
                }
                //write letter for this line
                exit += character[index][l];
            }
            exit += "\n";
        }
        return exit;
	}
	
}
