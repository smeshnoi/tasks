import java.util.Scanner;

/**
 * Created by User on 23.09.2017.
 */
public class AmountsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numberValue = scanner.nextInt();
        int amount = 0;
        do {
            amount += numberValue % 10;
            numberValue = numberValue / 10;
        } while (numberValue % 10 > 0);
        System.out.println("Сумма цифр:   " + amount);

    }
}
