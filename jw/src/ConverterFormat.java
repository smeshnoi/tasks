import java.util.Scanner;

public class ConverterFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);
        int number = 0;
        int lastNumber = 0;
        int numA = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            number = convertRomantToArabic(s.charAt(i));
            if (number < 0) {
                System.out.println("Числа не существует");
                return;
            }
            numA = (number >= lastNumber) ? numA + number : numA - number;
            lastNumber = number;
        }
        System.out.println(numA);
    }

    private static int convertRomantToArabic(char charCharacter) {
        switch (charCharacter) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return -1;
        }
    }
}
