package house;

public class HouseTests extends test.BaseTest {

    public HouseTests() {
        super("House", 100);
    }

    @Override
    public void Test() {
        for (int i = 0; i < 100; i++) {
            String ending = getEnding(i);
            House house = new House(i);
            if (!house.toString().endsWith(ending))
                AddResult("Test failed on floor " + i + " with ending " + ending + " got " + house);
        }
        super.Test();
    }

    // Create private method to return ending by number of floors
    private static String getEnding(int floors) {
        String end = "этажами";
        if (floors == 1 || (floors % 10 == 1 && floors != 11))
            end = "этажом";
        return end;
    }
}
