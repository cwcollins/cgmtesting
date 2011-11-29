/**
 *
 * @author Chet
 * The types of tests being performed
 */
public class TestTypes {
    // The evaluation tests
    String tests[] = {"Webcam gestures", "Hands on keyboard", "Hands away from keyboard", "Hands on trackpad"};
    
    /**
     * Returns the chosen test
     * @param index the selection index
     * @return the chosen test
     */
    public String getTest(int index) {
        return tests[index];
    }
}
