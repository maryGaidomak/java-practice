package dot;

public class Dot {
    Integer x;
    Integer y;

    public Dot(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
