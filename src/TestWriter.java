
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            FileWriter fstream = new FileWriter(name,true);
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
            out.write(line+"\n");
        }
        catch(Exception ex) {}
        
    }
    
    public void close() {
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(TestWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
