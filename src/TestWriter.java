
import java.io.*;

/**
 *
 * @author Chet
 * Runs the testing system include file i/o and timing
 */
public class TestWriter {
    
    // writes to the testing file
    private BufferedWriter out;
    
    /**
     * Creates a testing file
     * @param name the name of the file to create
     */
    public boolean createFile(String name) {
        try {
            FileWriter fstream = new FileWriter(name);
            out = new BufferedWriter(fstream);
        }
        catch(Exception ex) {}   
        return true;
    }
    
    /**
     * Writes to the testing file
     * @param line the line to be written
     */
    public void write(String line) {
        try {
            out.write(line);
        }
        catch(Exception ex) {}
        
    }
    
    
    
}
