package test;

import main.User;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author valentin
 */
public class TestASCIIArt {
    
    private String[] generate(Integer L, Integer H, String word) {
        String[] input = new String[3 + L + H];
        input[0] = L.toString();
        input[1] = H.toString();
        input[2] = word;
        //letter
        input[3] = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ";
        input[4] = "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ";
        input[5] = "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ";
        input[6] = "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ";
        input[7] = "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";
        return input;
    }
    
    @Test
    public void testLetterE() {
        String[] param = this.generate(4, 5, "E");
        User.textToAscii(param);
    }
    
    @Test
    public void testManhattan() {
        String[] param = this.generate(4, 5, "MANHATTAN");
        User.textToAscii(param);
    }
 
    @Test
    public void testManhattanWithLowerCase() {
        String[] param = this.generate(4, 5, "manhattan");
        User.textToAscii(param);
    }
    
    @Test
    public void testManhattanWithNoLetter() {
        String[] param = this.generate(4, 5, "M@NH@TT@N");
        User.textToAscii(param);
    }
}
