package test;

import java.util.ArrayList;
import java.util.List;

public class BaseTest {
    private final String testName;
    private final int testCount;
    private final List<String> testResults = new ArrayList<>();

    public BaseTest(String testName, int testCount) {
        this.testName = testName;
        this.testCount = testCount;
    }

    public void Test() {
        String result = testName + " test passed. ";
        if (testCount > 0)
            result += "Checked "+ testCount  + " test suites.";

        if (testResults.isEmpty())
            System.out.println(result);
        else
            testResults.forEach(System.out::println);
        CleanResults();
    }

    protected void AddResult(String result) {
        testResults.add(result);
    }

    protected void CleanResults() {
        testResults.clear();
    }
}
