package dot;

import test.BaseTest;

public class DotTests extends BaseTest {
    public DotTests() {
        super("Dot", 3);
    }

    @Override
    public void Test() {
        Dot dot1 = new Dot(3, 5);
        Dot dot2 = new Dot(25, 6);
        Dot dot3 = new Dot(7, 8);

        if (!dot1.toString().equals("{3;5}")) {
            AddResult("Test failed on dot: " + dot1.toString());
        }

        if (!dot2.toString().equals("{25;6}")){
            AddResult("Test failed on dot: " + dot2.toString());
        }

        if (!dot3.toString().equals("{7;8}")) {
            AddResult("Test failed on dot: " + dot3.toString());
        }

        Square square = new Square(5, 3, 23);
        if (!square.toString().equals("Квадрат в точке {5;3} со стороной 23")) {
            AddResult("Test failed on square: " + square.toString());
        }

        if (!square.getDots().toString().equals("Ломаная линия: {5;3} {28;3} {28;26} {5;26} ")) {
            AddResult("Test failed on square dots: " + square.getDots().toString());
        }

        Dot firstDot = new Dot(1, 3);
        Dot lastDot = new Dot(25, 10);

        Line line1 = new Line(firstDot, new Dot(23, 8));
        Line line2 = new Line(new Dot(5, 10), lastDot);

        if (!line1.toString().equals("Линия от {1;3} до {23;8}")) {
            AddResult("Test failed on line: " + line1.toString());
        }

        if (!line2.toString().equals("Линия от {5;10} до {25;10}")) {
            AddResult("Test failed on line: " + line2.toString());
        }

        firstDot.x = 5;
        firstDot.y = 7;

        lastDot.x = 10;
        lastDot.y = 15;

        if (!line1.toString().equals("Линия от {5;7} до {23;8}")) {
            AddResult("Test failed on line: " + line1.toString());
        }

        if (!line2.toString().equals("Линия от {5;10} до {10;15}")) {
            AddResult("Test failed on line: " + line2.toString());
        }

        Line line3 = new Line(1, 1, 10, 15);
        if (line3.gotLength() != 16) {
            AddResult("Test failed on line length: " + line3.gotLength());
        }


        super.Test();

    }
}
