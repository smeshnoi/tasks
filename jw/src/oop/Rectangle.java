package oop;

/**
 * Created by User on 01.10.2017.
 */
public class Rectangle {
    Point p1;
    Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getSquare() {
        return Math.abs((p2.getX() - p1.getX()) * (p2.getY() - p1.getY()));
    }

    public double getLengthOfDiagonal() {
        Point p3 = new Point(Math.abs(p2.getX() - p1.getX()), Math.abs(p2.getY() - p1.getY()));
        return p3.distance();
    }
}
