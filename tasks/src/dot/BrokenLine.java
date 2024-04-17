package dot;

import java.util.ArrayList;
import java.util.List;

public class BrokenLine {
    private List<Dot> dots = new ArrayList<>();

    public void addDot(Dot dot) {
        dots.add(dot);
    }

    public void addDot(Integer x, Integer y) {
        dots.add(new Dot(x, y));
    }

    public List<Dot> getDots() {
        return new ArrayList<>(dots);
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Ломаная линия: ");
        for (Dot dot : dots) {
            result.append(dot.toString()).append(" ");
        }
        return result.toString();
    }

}
