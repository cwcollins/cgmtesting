
import java.util.ArrayList;


/**
 *
 * @author Chet
 * Stores data about each test performed
 */
public class EvaluationTest {
    
    /**
     * The type of test performed
     */
    String type;
    
    /**
     * The times for each test
     */
    ArrayList<Long> times;
    
    /**
     * The number of total errors for each test
     */
    int errors;
    
    public EvaluationTest(String testType) {
        type = testType;
        times = new ArrayList<Long>();
        errors = 0;
    }
}
