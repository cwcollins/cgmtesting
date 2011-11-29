
import java.util.*;

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
     * Indicates test mode
     */
    int testMode;
    
    
    /**
     * Keeps track of the time for each test
     */
    StopWatch timer;
    
    /**
     * Random number generator for gestures, keys, buttons
     */
    Random randomizer;
    
    /**
     * Random selection for each trial
     */
    int selection;
    
    /**
     * The number of trials for each test
     */
    final int numTrials = 40;
    
    /**
     * The options for each test
     */
    String[] gestures = {"Up", "Down", "Left", "Right"};
    String[] keys = {"Alt+Right", "Alt+Left", "Esc", "T"};
    String[] buttons = {"Back", "Fwd", "Home", "Close"};
    
    /**
     * Constructor to set up all the instances
     */
    public TestController() {
        writer = new TestWriter();
        timer = new StopWatch();
        randomizer = new Random();
        tests = new ArrayList<EvaluationTest>();
    }
    
    public void setTestMode(int mode) {
        testMode = mode;
    }
    
    /**
     * Starts the selected test
     */
    public void startTest(String type) {
        
        // Create a test to insert data into
        EvaluationTest test = new EvaluationTest(type);
        
        for(int i=0; i<numTrials; i++){
            
        }
        
        
    }
    
    /**
     * Generates a random selection for each trial
     */
    public void randomize() {
        selection =  randomizer.nextInt();
    }
}
