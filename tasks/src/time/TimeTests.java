package time;

import java.util.ArrayList;
import java.util.List;

public class TimeTests {
    public static void Test() {
        List<String> testResults = new ArrayList<>();

        Time time = new Time(12000);
        if (!time.toString().equals("03:20:00"))
            testResults.add("Test failed on time " + time);

        time = new Time(91800);
        if (!time.toString().equals("01:30:00"))
            testResults.add("Test failed on time " + time);

        time = new Time(10000 );
        if (!time.toString().equals("02:46:40"))
            testResults.add("Test failed on time " + time);

        time = new Time(100000 );
        if (!time.toString().equals("03:46:40"))
            testResults.add("Test failed on time " + time);

        time = new Time(2, 3, 5);
        if (!time.toString().equals("02:03:05"))
            testResults.add("Test failed on time " + time);

        if (time.GetHour() != 2)
            testResults.add("Test failed on check get hour " + time + " hour");
        if (time.GetMinute() != 3)
            testResults.add("Test failed on check get minute " + time + " minute");
        if (time.GetSecond() != 5)
            testResults.add("Test failed on check get second " + time + " second");

        time = new Time(34056);
        if (time.GetHour() != 9)
            testResults.add("Test failed on check get hour " + time + " hour");
        if (time.GetMinute() != 27)
            testResults.add("Test failed on check get minute " + time + " minute");
        if (time.GetSecond() != 36)
            testResults.add("Test failed on check get second " + time + " second");

        if (testResults.isEmpty())
            System.out.println("Time test passed. Checked 6 times");
        else
            testResults.forEach(System.out::println);
    }
}
