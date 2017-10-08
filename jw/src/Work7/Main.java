package Work7;

import com.sun.org.apache.regexp.internal.RE;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(2, 2), new Point(5, 6));
        System.out.println(line.toString());
        System.out.println("Длина - " +line.getLength());
        Rectangle rectangle = new Rectangle(new Point(3, 3), new Point(5, 6));
        System.out.println( (ShapeUtils.isRectangle(rectangle)) ? rectangle.toString() + "\nДиагональ - " + rectangle.getLengthOfDiagonal() + " Периметр - " + rectangle.getLength() + " Площидь - " + rectangle.getSquare() : "Не является прямоугльником");
        ShapeUtils.isRectangle(line);
        Circle circle = new Circle(5,5,3);
        System.out.println(circle.toString());
        System.out.println("Площадь - " + circle.getSquare() + " Длина окружности - " + circle.getLength());
        Ring ring = new Ring(1, 1, 2, 5);
        System.out.println(ring.toString());
        System.out.println("Площадь - " + ring.getSquare());
        Triangle triangle = new Triangle(new Point(2, 2), new Point(5, 6), new Point(3, 6));
        System.out.println( (ShapeUtils.isTriangle(triangle)) ? triangle.toString() + "\nПериметр - " + triangle.getLength() + " Площидь - " + triangle.getSquare() : "Не является треугольником");
    }
}
