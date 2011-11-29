
import java.util.ArrayList;

/**
 *
 * @author Chet
 */
public class TestController {
    
    /**
     * Allows writing to the testing file
     */
    TestWriter writer;
    
    /**
     * Stores the completed tests
     */
    ArrayList<EvaluationTest> tests;
    
    /**
     * The options for each test
     */
    String[] gestures = {"Up", "Down", "Left", "Right"};
    String[] keys = {"Alt+Right", "Alt+Left", "Esc", "T"};
    String[] buttons = {"Back", "Fwd", "Home", "Close"};
    
    public TestController() {
        
    }
    
    /**
     * Starts the selected test
     */
    public void startTest(String type) {
        
        
        
    }  
}
