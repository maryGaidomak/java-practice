package dot;

import java.util.List;

public class Square {
    private Dot topLeft;
    private Integer longSide;

    public Square(Dot topLeft, Integer longSide) {
        this.topLeft = topLeft;
        Check(longSide);
        this.longSide = longSide;
    }

    public Square(Integer x, Integer y, Integer longSide) {
        this.topLeft = new Dot(x, y);
        Check(longSide);
        this.longSide = longSide;
    }

    public BrokenLine getDots() {
        BrokenLine result = new BrokenLine();
        result.addDot(topLeft);
        result.addDot(topLeft.x + longSide, topLeft.y);
        result.addDot(topLeft.x + longSide, topLeft.y + longSide);
        result.addDot(topLeft.x, topLeft.y + longSide);
        return result;
    }

    public void changeTopLeft(Dot newTopLeft) {
        this.topLeft = newTopLeft;
    }

    public void changeLongSide(Integer newLongSide) {
        Check(longSide);
        this.longSide = newLongSide;
    }

    public Dot getTopLeft() {
        return topLeft;
    }

    public Integer getLongSide() {
        return longSide;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + topLeft.toString() + " со стороной " + longSide;
    }

    private void Check(Integer longSide) {
        if (longSide <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть больше нуля");
        }
    }
}
