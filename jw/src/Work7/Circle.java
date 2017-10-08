package Work7;

public class Circle extends Point implements Square, Length{

    private int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public double getSquare() {
        return Math.PI * r * r;
    }

    public double getLength() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle";
    }

    public int getR() {
        return r;
    }
}
