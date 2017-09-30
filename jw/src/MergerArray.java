import java.util.Random;

public class MergerArray {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(5) + 1;
        int[] array = new int[size];
        size = random.nextInt(5) + 1;
        int[] array2 = new int[size];
        array = fillArray(array);
        array2 = fillArray(array2);
        output(array);
        System.out.println();
        output(array2);
        System.out.println();
        int[] array3 = merge(array,array2);
        output(array3);
    }

    private static void output(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }

    private static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(25);
        }
        return array;
    }

    private static int[] merge(int[] array, int[] array2) {
        int newSizeArray = array.length + array2.length;
        int[]array3 = new int[newSizeArray];
        int item = 0;
        for (int i = 0; i < newSizeArray;) {
            if (item < array.length) {
                array3[i] = array[item];
                i++;
            }
            if (item < array2.length) {
                array3[i] = array2[item];
                i++;
            }
            item++;
        }
        return array3;
    }
}
