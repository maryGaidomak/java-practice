package time;

public class Time {
    private final int seconds;
    private final int SECONDS_IN_MINUTE = 60;
    private final int MINUTES_IN_HOUR = 60;

    public Time(int seconds) {
        if (seconds < 0)
            throw new IllegalArgumentException("Кол-во секунд не может быть отрицательным");
        int MAX_SECONDS = 60 * 60 * 24;
        this.seconds = seconds > MAX_SECONDS ? seconds % MAX_SECONDS : seconds;
    }

    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || minutes < 0 || seconds < 0)
            throw new IllegalArgumentException("Кол-во часов, минут и секунд не может быть отрицательным");
        this.seconds = hours * MINUTES_IN_HOUR * SECONDS_IN_MINUTE + minutes * SECONDS_IN_MINUTE + seconds;
    }

    public int GetHour() {
        return seconds / (SECONDS_IN_MINUTE * MINUTES_IN_HOUR);
    }

    public int GetMinute() {
        return (seconds % (SECONDS_IN_MINUTE * MINUTES_IN_HOUR)) / SECONDS_IN_MINUTE;
    }

    public int GetSecond() {
        return seconds % SECONDS_IN_MINUTE;
    }

    @Override
    public String toString() {
        int hours = seconds / (SECONDS_IN_MINUTE * MINUTES_IN_HOUR);
        int minutes = (seconds % (SECONDS_IN_MINUTE * MINUTES_IN_HOUR)) / SECONDS_IN_MINUTE;
        int sec = seconds % SECONDS_IN_MINUTE;
        return String.format("%02d:%02d:%02d", hours, minutes, sec);
    }
}
