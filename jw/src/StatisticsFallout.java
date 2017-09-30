import java.util.Scanner;

/**
 * Created by User on 24.09.2017.
 */
public class StatisticsFallout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число дней:");
        int dayValue = scanner.nextInt();
        int falloutValue = 0, sumFallout = 0, maxFallout = 0;
        double aFallout = 0;
        System.out.println("Введите осадки за каждый день:");
        for (int i = 0; i <dayValue ; i++) {
            falloutValue = scanner.nextInt();
            sumFallout += falloutValue;
            if(falloutValue > maxFallout){
                maxFallout = falloutValue;
            }
        }
        aFallout = sumFallout / dayValue;
        System.out.println("Кол-во дней:   " + dayValue);
        System.out.println("Сумма осадков:   " + sumFallout);
        System.out.println("Среднее кол-во осадков:   " + aFallout);
        System.out.println("Максимальное кол-во осадков:   " + maxFallout);
    }
}
