package Work7;

/**
 * Created by User on 08.10.2017.
 */
public class Triangle extends Line{
    private Point p3;
    private double a;
    private double b;
    private double c;
    private double halfPerimetr;

    public double getHalfPerimetr() {
        return getLength() / 2;
    }

    public Triangle(Point p1, Point p2, Point p3) {
        super(p1, p2);
        this.p3 = p3;
        this.a = p1.getLength(p2);
        this.b =  p2.getLength(p3);
        this.c = p3.getLength(p1);
        System.out.println(a + " " + b + " " + c);
    }

    @Override
    public double getLength() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "" + Triangle.class;
    }

    public double getSquare() {
        halfPerimetr = getHalfPerimetr();
        return Math.sqrt(halfPerimetr * (halfPerimetr - a) * (halfPerimetr - b) * (halfPerimetr - c));
    }

}
