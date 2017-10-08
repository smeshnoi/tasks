package Work7;

public class Ring extends Circle{
    public Ring(int x, int y, int r, int r2) {
        super(x, y, r);
        this.r2 = r2;
    }

    private int r2;

    @Override
    public double getSquare() {
        return Math.PI * Math.abs((getR() * getR()) - (r2 * r2));
    }

    @Override
    public String toString() {
        return "Ring";
    }
}
