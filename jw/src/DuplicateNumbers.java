import java.util.Random;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        deleteDuplicateNumbers(array);
    }

    private static void deleteDuplicateNumbers(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array2[i] = 1;
                    array2[j] = 1;
                }
            }
        }
        int count = 0;
        for (int anArray2 : array2) {
            if (anArray2 == 0) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array2[i] == 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println("\n");
        for (int numbers: newArray) {
            System.out.print(numbers + " ");
        }
    }
}
