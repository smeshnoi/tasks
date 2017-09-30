import java.util.Arrays;
import java.util.Random;

public class ArrayCycleShift {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(5) + 5;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("Смещение одномерного массива");
        for (int number: array) {
            System.out.print(number + " ");
        }
        System.out.println();
        int temp = array[0];
        int tempNext;
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                array[0] = temp;
            } else {
                tempNext = array[i + 1];
                array[i + 1] = temp;
                temp = tempNext;
            }
        }
        for (int number: array) {
            System.out.print(number + " ");
        }
        System.out.println("\n\n Смещение двумерного массива");
        int[][] array2 = new int[3][5];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = random.nextInt(20);
            }
        }
        for (int[] anArray2 : array2) {
            for (int anAnArray2 : anArray2) {
                System.out.print(anAnArray2 + " ");
            }
            System.out.println();
        }
        temp = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if(i == array2.length - 1 && j == array2[i].length - 1){
                    array2[0][0] = temp;
                } else if (j == array2[i].length - 1) {
                    tempNext = array2[i + 1][0];
                    array2[i + 1][0] = temp;
                    temp = tempNext;
                } else {
                    tempNext = array2[i][j + 1];
                    array2[i][j + 1] = temp;
                    temp = tempNext;
                }
            }
        }
        System.out.println();
        for (int[] anArray2 : array2) {
            for (int anAnArray2 : anArray2) {
                System.out.print(anAnArray2 + " ");
            }
            System.out.println();
        }
    }
}
