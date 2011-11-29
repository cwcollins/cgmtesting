
import java.io.*;

/**
 *
 * @author Chet
 * Runs the testing system include file i/o and timing
 */
public class TestController {
    
    // writes to the testing file
    private BufferedWriter out;
    
    /**
     * Creates a testing file
     * @param name the name of the file to create
     */
    public void createFile(String name) {
        try {
            FileWriter fstream = new FileWriter(name);
            out = new BufferedWriter(fstream);
        }
        catch(Exception ex) {}   
    }
    
    
    
}
