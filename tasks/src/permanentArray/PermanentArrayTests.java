package permanentArray;

import test.BaseTest;

public class PermanentArrayTests extends BaseTest {
    public PermanentArrayTests() {
        super("PermanentArray", 3);
    }

    @Override
    public void Test() {
        PermanentArray permanentArray = new PermanentArray(1,2,3,4,5);
        //System.out.println(permanentArray.toString());
        if (!permanentArray.toString().equals("[ 1, 2, 3, 4, 5 ]")) {
            AddResult("Test failed on array: " + permanentArray.toString());
        }
        int[] test = {1, 7, 8, 9, 10};
        permanentArray = new PermanentArray(test);
        //System.out.println(permanentArray.toString());
        if (!permanentArray.toString().equals("[ 1, 7, 8, 9, 10 ]")) {
            AddResult("Test failed on array: " + permanentArray.toString());
        }
        PermanentArray secondArray = new PermanentArray(permanentArray);
        //System.out.println(secondArray.toString());
        if (!secondArray.toString().equals("[ 1, 7, 8, 9, 10 ]")) {
            AddResult("Test failed on array: " + secondArray.toString());
        }
        super.Test();
    }
}
