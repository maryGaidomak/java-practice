package Test;

import java.util.ArrayList;

public class BaseTest {
    private static ArrayList<String> testResults = new ArrayList<>();

    public static void AddResult(String result) {
        testResults.add(result);
    }

    public static void ReturnResult(String testName, int testCount) {
        String result = testName + "test passed. ";
        if (testCount > 0)
            result += "Checked "+ testCount  + " times";
        else
            System.out.println(result);
        if (testResults.isEmpty())
            System.out.println(result);
        else
            testResults.forEach(System.out::println);
    }
}
