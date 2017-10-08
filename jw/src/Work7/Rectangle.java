package Work7;

public class Rectangle extends Line implements Length, Diagonal{
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2) {
        super(p1, p2);
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLengthOfDiagonal() {
        return super.getLength();
    }

    public double getSquare() {
        return Math.abs((p2.getX() - p1.getX()) * (p2.getY() - p1.getY()));
    }

    @Override
    public double getLength() {
        return (Math.abs(p2.getX() - p1.getX()) * 2) + (Math.abs(p2.getY() - p1.getY()) * 2);
    }

    @Override
    public String toString() {
        return "" + Rectangle.class;
    }
}
