package Work7;

public class Line extends Point implements Length {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()),2) + Math.pow((p2.getY() - p1.getY()),2));
    }

    @Override
    public String toString() {
        return "Line";
    }
}
