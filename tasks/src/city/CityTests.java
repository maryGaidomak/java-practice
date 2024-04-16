package city;

import test.BaseTest;

public class CityTests extends BaseTest {

    public CityTests() {
        super("City", 5);
    }

    @Override
    public void Test() {
        City cityA = new City("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new City("D");
        City cityE = new City("E");

        cityA.addRoute(cityB, 6);
        cityA.addRoute(cityD, 1);

        cityB.addRoute(cityD, 2);
        cityB.addRoute(cityE, 2);
        cityB.addRoute(cityC, 5);
        cityC.addRoute(cityE, 5);
        cityD.addRoute(cityE, 1);

        if (!cityA.toString().equals("A -> D: 1, B: 6"))
            AddResult("Test failed on city print " + cityA);
        if (!cityB.toString().equals("B -> D: 2, E: 2, C: 5"))
            AddResult("Test failed on city print " + cityB);
        if (!cityC.toString().equals("C -> E: 5"))
            AddResult("Test failed on city print " + cityC);
        if (!cityD.toString().equals("D -> E: 1"))
            AddResult("Test failed on city print " + cityD);
        if (!cityE.toString().equals("E"))
            AddResult("Test failed on city print " + cityE);
        super.Test();
    }
}
