import java.util.Scanner;

/**
 * Created by User on 22.09.2017.
 */
public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день, месяц, год: ");
        int numberValue = scanner.nextInt();
        int monthValue = scanner.nextInt();
        int yearValue = scanner.nextInt();
        boolean leapYear = isLeapYear(yearValue);
        int maxDayInMonth = getDayInMonth(monthValue, leapYear);
        boolean checkDate = isCheckDate(numberValue, maxDayInMonth);
        if (checkDate){
            System.out.println("Дата введена корректно");
            isChangeDate(numberValue, monthValue, yearValue, maxDayInMonth);
        }else {
            System.out.println("Введена неверная дата");
        }
    }

    private static void isChangeDate(int numberValue, int monthValue, int yearValue, int maxDayInMonth) {
        if (numberValue == maxDayInMonth) {
            numberValue = 1;
            if (monthValue == 12) {
                monthValue = 1;
                yearValue = yearValue + 1;
            }else {
                monthValue = monthValue + 1;
            }
        }else {
            numberValue = numberValue + 1;
        }
        String newDate = numberValue + "." + monthValue + "." + yearValue;
        System.out.println("Следующий день: \n " + newDate);
    }

    private static boolean isLeapYear(int yearValue) {
        return (yearValue % 400 == 0 || (yearValue % 4 == 0 && yearValue % 100 != 0));
    }

    private static int getDayInMonth(int monthValue, boolean leapYear) {
        switch (monthValue){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                return 31;
            }
            case 2: {
                if (leapYear) {
                    return 29;
                }else {
                    return 28;
                }
            }default:{
                return 30;
            }
        }
    }

    private static boolean isCheckDate(int numberValue, int maxDayInMonth) {
        return (numberValue <= maxDayInMonth);
    }
}
