import java.util.Scanner;

/**
 * Created by User on 24.09.2017.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int numValue = scanner.nextInt();
        int fib = 0, a = 0, b = 1;
        System.out.println("Числа Фибона́ччи: ");
        for (int i = 0; i <= numValue ; i++) {
            if(i == 0) {
                System.out.print("  " + a);
            } else if(i == 1) {
                System.out.print("  " + b);
            } else {
                fib = a + b;
                System.out.print("  " + fib);
                a = b;
                b = fib;
            }
        }
        //рекурсия
        System.out.println("\nВывод через рекурсию:\n");
        for (int i = 0; i <= numValue; i++) {
            System.out.print("  " + f(i));
        }
    }

    private static int f(int i) {
        if (i <= 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else if (i == 2) {
            return 1;
        } else {
            return f(i - 1) + f(i - 2);
        }
    }
}
