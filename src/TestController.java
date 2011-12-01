
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
    
    MainWindow window;
    
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
     * Whether or not the last choice was correct in the trial
     */
    boolean correctChoice;
    
    EvaluationTest curTest;
    
    /**
     * The number of trials for each test
     */
    final int numTrials = 30;
    
    int trialCounter;
    
    /**
     * The options for each test
     */
    String[] gestures = {"Up", "Down", "Left", "Right"};
    String[] keys = {"Alt+Right", "Alt+Left", "Esc", "T"};
    String[] buttons = {"Home", "Back", "Fwd", "Quit"};
    
    /**
     * Constructor to set up all the instances
     */
    public TestController(MainWindow main) {
        window = main;
        writer = new TestWriter();
        timer = new StopWatch();
        randomizer = new Random();
        tests = new ArrayList<EvaluationTest>();
        trialCounter = 1;
    }
    
    /**
     * Sets the test mode
     * @param mode the mode to be set
     */
    public void setTestMode(int mode) {
        testMode = mode;
    }
    
    /**
     * Determine if the last choice was correct
     * @param val the truth value of the choice
     */
    public void isCorrect(boolean val) {
        correctChoice = val;
    }
    
    public void startTimer(){
        timer.start();
    }
    
    /**
     * Starts the selected test
     */
    public void runTest(String type) {
        // Create a test to insert data into
        if(trialCounter == 1) {
            curTest = new EvaluationTest(type);
        }
    }
    
    public void buttonPressed(String button) {
        
        if(curTest == null){
            return;
        }
        
        String[] action = keys;
        
        switch(testMode) {
            case 0:
                action = keys;
                break;
            case 1:
                action = keys;
                break;
            case 2:
                action = keys;
                break;
            case 3:
                action = buttons;
                break;
            default:
                break;
        }
        
        
        if(button.equals(action[selection])) {
            curTest.times.add(timer.getElapsedTime());
            System.out.println("time: " + timer.getElapsedTime()+ " trial: " + trialCounter);;
            timer.stop();
            trialCounter++;
            randomize();
            if(window.keyboardTesting)
            {
                window.changeLabel("Press the space bar to begin");
            }
            else {
                window.changeLabel("Click the button to begin");
            }
            runTest(curTest.type);
            
        }
        else {
           
            curTest.errors++;
        }
        
        if(trialCounter > numTrials) {
            tests.add(curTest);
            window.changeLabel("Test complete");
            writeResults();
            trialCounter = 1;
        }
    }
    
    public void writeResults() {
        String line = curTest.type;
        
        for(int i=0; i< curTest.times.size(); i++) {
            line += "," + curTest.times.get(i);
        }
        line += ","+curTest.errors+"\n";
        
        writer.createFile(window.getFileName());
        writer.write(line);
        writer.close();
    }
    
    /**
     * Generates a random selection for each trial
     */
    public void randomize() {
        selection =  randomizer.nextInt(4);
    }
}
