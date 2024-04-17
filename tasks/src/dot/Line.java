package dot;

public class Line {
    private Dot start;
    private Dot end;

    public Line(Dot start, Dot end) {
        this.start = start;
        this.end = end;
    }

    public Line(Integer x1, Integer y1, Integer x2, Integer y2) {
        this.start = new Dot(x1, y1);
        this.end = new Dot(x2, y2);
    }

    public Dot getStart() {
        return new Dot(start.x, start.y);
    }

    public Dot getEnd() {
        return new Dot(end.x, end.y);
    }

    public void setStart(Dot start) {
        this.start = start;
    }

    public void setEnd(Dot end) {
        this.end = end;
    }

    public Integer gotLength() {
        return (int) Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }

    @Override
    public String toString() {
        return "Линия от " + start.toString() + " до " + end.toString();
    }
}
