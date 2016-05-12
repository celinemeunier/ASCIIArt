package main;

/**
 * @author valentin
 */
public class User {
    
    public static String textToAscii(String[] param) {
        Integer L = Integer.parseInt(param[0]);
        Integer H = Integer.parseInt(param[1]);
        String word = param[2].toUpperCase();
        
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String[][] character = new String[alphabet.length + 1][H];
        
        //création des lettres
        Integer nbLetter = 0;
        for (int i = 0; i < L * (alphabet.length + 1); i += L) {
            //par ligne
            for (int j = 0; j < H; j++) {
                character[nbLetter][j] = param[3 + j].substring(i, i + (L - 1));
            }
            nbLetter++;
        }
        
        char[] tabWord = word.toCharArray();
        //pour chaque ligne
        for (int l = 0; l < H; l++ ) {
            //pour chaque lettre
            for (int i = 0; i < tabWord.length; i++) {
                //recherche de lettre
                Integer index = 26;
                for (int j = 0; j < alphabet.length; j++) {
                    if (tabWord[i] == alphabet[j]) {
                        index = j;
                        break;
                    }
                }
                //ecriture de la lettre pour cette ligne
                System.out.print(character[index][l] + " ");
            }
            System.out.print("\n");
        }
        return "";
    }
    
}
