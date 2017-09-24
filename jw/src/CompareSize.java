import java.util.Scanner;

/**
 * Created by User on 23.09.2017.
 */
public class CompareSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны первого дома");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Введите стороны второго дома");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = 25;
        double f = 30;


        if ((e >= a + c) && (f >= Math.max(b,d))){
            System.out.println("Развещение возможно");
        }else if ((e >= a + d) && (f >= Math.max(b,c))){
            System.out.println("Развещение возможно");
        }else if ((e >= b + c) && (f >= Math.max(a,d))){
            System.out.println("Развещение возможно");
        }else if ((e >= b + d) && (f >= Math.max(a,c))){
            System.out.println("Развещение возможно");
        }else if ((f >= a + c) && (f >= Math.max(b,d))){
            System.out.println("Развещение возможно");
        }else if ((f >= a + d) && (e >= Math.max(b,c))){
            System.out.println("Развещение возможно");
        }else if ((f >= b + c) && (e >= Math.max(a,d))){
            System.out.println("Развещение возможно");
        }else if ((f >= b + d) && (e >= Math.max(a,c))) {
            System.out.println("Развещение возможно");
        }else {
            System.out.println("Развещение невозможно");
        }
    }
}
