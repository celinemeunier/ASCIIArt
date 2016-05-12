package test;

import main.User;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author valentin
 */
public class TestASCIIArt {
    
    private String[] generate(Integer L, Integer H, String word) {
        String[] input = new String[3 + L + H];
        input[0] = L.toString();
        input[1] = H.toString();
        input[2] = word;
        //letter
        //input[3] = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ";
        //input[4] = "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ";
        //input[5] = "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ";
        //input[6] = "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ";
        //input[7] = "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";
        input[3] = " .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .-----------------. .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------. ";
        input[4] = "| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |";
        input[5] = "| |      __      | || |   ______     | || |     ______   | || |  ________    | || |  _________   | || |  _________   | || |    ______    | || |  ____  ____  | || |     _____    | || |     _____    | || |  ___  ____   | || |   _____      | || | ____    ____ | || | ____  _____  | || |     ____     | || |   ______     | || |    ___       | || |  _______     | || |    _______   | || |  _________   | || | _____  _____ | || | ____   ____  | || | _____  _____ | || |  ____  ____  | || |  ____  ____  | || |   ________   | || |    ______    | |";
        input[6] = "| |     /  \\     | || |  |_   _ \\    | || |   .' ___  |  | || | |_   ___ `.  | || | |_   ___  |  | || | |_   ___  |  | || |  .' ___  |   | || | |_   ||   _| | || |    |_   _|   | || |    |_   _|   | || | |_  ||_  _|  | || |  |_   _|     | || ||_   \\  /   _|| || ||_   \\|_   _| | || |   .'    `.   | || |  |_   __ \\   | || |  .'   '.     | || | |_   __ \\    | || |   /  ___  |  | || | |  _   _  |  | || ||_   _||_   _|| || ||_  _| |_  _| | || ||_   _||_   _|| || | |_  _||_  _| | || | |_  _||_  _| | || |  |  __   _|  | || |   / _ __ `.  | |";
        input[7] = "| |    / /\\ \\    | || |    | |_) |   | || |  / .'   \\_|  | || |   | |   `. \\ | || |   | |_  \\_|  | || |   | |_  \\_|  | || | / .'   \\_|   | || |   | |__| |   | || |      | |     | || |      | |     | || |   | |_/ /    | || |    | |       | || |  |   \\/   |  | || |  |   \\ | |   | || |  /  .--.  \\  | || |    | |__) |  | || | /  .-.  \\    | || |   | |__) |   | || |  |  (__ \\_|  | || | |_/ | | \\_|  | || |  | |    | |  | || |  \\ \\   / /   | || |  | | /\\ | |  | || |   \\ \\  / /   | || |   \\ \\  / /   | || |  |_/  / /    | || |  |_/____) |  | |";
        input[8] = "| |   / ____ \\   | || |    |  __'.   | || |  | |         | || |   | |    | | | || |   |  _|  _   | || |   |  _|      | || | | |    ____  | || |   |  __  |   | || |      | |     | || |   _  | |     | || |   |  __'.    | || |    | |   _   | || |  | |\\  /| |  | || |  | |\\ \\| |   | || |  | |    | |  | || |    |  ___/   | || | | |   | |    | || |   |  __ /    | || |   '.___`-.   | || |     | |      | || |  | '    ' |  | || |   \\ \\ / /    | || |  | |/  \\| |  | || |    > `' <    | || |    \\ \\/ /    | || |     .'.' _   | || |    /  ___.'  | |";
        input[9] = "| | _/ /    \\ \\_ | || |   _| |__) |  | || |  \\ `.___.'\\  | || |  _| |___.' / | || |  _| |___/ |  | || |  _| |_       | || | \\ `.___]  _| | || |  _| |  | |_  | || |     _| |_    | || |  | |_' |     | || |  _| |  \\ \\_  | || |   _| |__/ |  | || | _| |_\\/_| |_ | || | _| |_\\   |_  | || |  \\  `--'  /  | || |   _| |_      | || | \\  `-'  \\_   | || |  _| |  \\ \\_  | || |  |`\\____) |  | || |    _| |_     | || |   \\ `--' /   | || |    \\ ' /     | || |  |   /\\   |  | || |  _/ /'`\\ \\_  | || |    _|  |_    | || |   _/ /__/ |  | || |    |_|       | |";
        input[10] = "| ||____|  |____|| || |  |_______/   | || |   `._____.'  | || | |________.'  | || | |_________|  | || | |_____|      | || |  `._____.'   | || | |____||____| | || |    |_____|   | || |  `.___.'     | || | |____||____| | || |  |________|  | || ||_____||_____|| || ||_____|\\____| | || |   `.____.'   | || |  |_____|     | || |  `.___.\\__|  | || | |____| |___| | || |  |_______.'  | || |   |_____|    | || |    `.__.'    | || |     \\_/      | || |  |__/  \\__|  | || | |____||____| | || |   |______|   | || |  |________|  | || |    (_)       | |";
        input[11] = "| |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |";
        input[12] = "| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |";
        input[13] = " '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' ";
        return input;
    }
    
    @Test
    public void testLetterE() {
        String[] param = this.generate(20, 11, "E");
        User.textToAscii(param);
    }
    
    @Test
    public void testManhattan() {
        String[] param = this.generate(20, 11, "MANHATTAN");
        User.textToAscii(param);
    }
 
    @Test
    public void testManhattanWithLowerCase() {
        String[] param = this.generate(20, 11, "manhattan");
        User.textToAscii(param);
    }
    
    @Test
    public void testManhattanWithNoLetter() {
        String[] param = this.generate(20, 11, "M@NH@TT@N");
        User.textToAscii(param);
    }
}
