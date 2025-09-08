import java.util.ArrayList;

/**
 * Cone is the base for the ice cream.  
 * It loads in the cone shape from a text file and colors it brown. 
 */
public class Cone extends IceCream {
    private static final String ANSI_BROWN = "\u001B[38;5;130m";
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * Builds a cone by reading ASCII art from text files.  
     * If one file path doesn’t work, it tries another.  
     * Then it colors the cone lines brown and adds them to the ASCII art list.
     */
    public Cone() {
        ArrayList<String> lines = FileReader.getLines("decorator/txt/cone.txt");
        if (lines == null || lines.isEmpty()) {
            lines = FileReader.getLines("decorator/txt/cone.txt");
        }
        
        if(lines != null && !lines.isEmpty()){
            for(String line : lines){
                asciiArt.add(ANSI_BROWN + line + ANSI_RESET);
            }
        }
    }
}