package Work7;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public int getX() {
        return x;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getLength(Point p1) {
        return Math.sqrt(Math.pow((p1.getX() - getX()),2) + Math.pow((p1.getY() - getY()),2));
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
