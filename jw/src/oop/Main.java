package oop;

/**
 * Created by User on 01.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,5);
        System.out.println("Distance to point: \n" + point.distance());
        point.setX(7);
        point.setY(2);
        System.out.println("Distance after change point: \n" + point.distance());
        Rectangle rectangle = new Rectangle(new Point(1,5), new Point(3,2));
        System.out.println("Square of rectangle: \n" + rectangle.getSquare());
        System.out.println("Length of diagonal: \n" + rectangle.getLengthOfDiagonal());
        rectangle.p2.setX(8);
        System.out.println("Square of rectangle(change): \n" + rectangle.getSquare());
        System.out.println("Length of diagonal(change): \n" + rectangle.getLengthOfDiagonal());
    }
}
