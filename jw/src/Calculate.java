import java.util.Scanner;

/**
 * Created by User on 23.09.2017.
 */
public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = getdiscriminant(a, b, c);
        double x1,x2;
        System.out.println(discriminant);
        if(isPositive(discriminant)){
            System.out.println("+");
            if(isZero(discriminant)){
                x1 = (-b) / (2 * a);
                System.out.println("Дискриминант = 0");
                System.out.println("X1 = " + x1);
            }else {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Дискриминант > 0");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }else {
            System.out.println("Дискриминант < 0");
        }
    }

    private static boolean isZero(double discriminant) {
        return discriminant == 0;
    }

    private static boolean isPositive(double discriminant) {
        return discriminant >=0;
    }

    private static double getdiscriminant(double a, double b, double c) {
        double d = (b * b) - (4 * a * c);
        return d;
    }
}
