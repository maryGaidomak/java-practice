package house;

public class House {
    private final int floors;
    public House(int floors) {
        if (floors < 0)
            throw new IllegalArgumentException("Недопустимое кол-во этажей");
        this.floors = floors;
    }

    @Override
    public String toString() {
        String end = "этажами";
        if (floors == 1 || (floors % 10 == 1 && floors != 11))
            end = "этажом";
        return "Дом с " + floors + " " + end;
    }
}
