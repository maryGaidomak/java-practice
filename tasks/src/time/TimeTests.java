package time;

import test.BaseTest;

public class TimeTests extends BaseTest {

    public TimeTests() {
        super("Time", 6);
    }

    @Override
    public void Test() {
        Time time = new Time(12000);
        if (!time.toString().equals("03:20:00"))
            AddResult("Test failed on time " + time);

        time = new Time(91800);
        if (!time.toString().equals("01:30:00"))
            AddResult("Test failed on time " + time);

        time = new Time(10000 );
        if (!time.toString().equals("02:46:40"))
            AddResult("Test failed on time " + time);

        time = new Time(100000 );
        if (!time.toString().equals("03:46:40"))
            AddResult("Test failed on time " + time);

        time = new Time(2, 3, 5);
        if (!time.toString().equals("02:03:05"))
            AddResult("Test failed on time " + time);

        if (time.GetHour() != 2)
            AddResult("Test failed on check get hour " + time + " hour");
        if (time.GetMinute() != 3)
            AddResult("Test failed on check get minute " + time + " minute");
        if (time.GetSecond() != 5)
            AddResult("Test failed on check get second " + time + " second");

        time = new Time(34056);
        if (time.GetHour() != 9)
            AddResult("Test failed on check get hour " + time + " hour");
        if (time.GetMinute() != 27)
            AddResult("Test failed on check get minute " + time + " minute");
        if (time.GetSecond() != 36)
            AddResult("Test failed on check get second " + time + " second");

        super.Test();
    }
}
