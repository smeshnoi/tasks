import java.util.Random;

public class TransformationArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[random.nextInt(4) + 1][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[random.nextInt(7) + 1];
        }
       for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
        for (int[] anArray : array) {
            for (int anAnArray : anArray) {
                System.out.print(anAnArray + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int numbers: linearize(array)) {
            System.out.print(numbers + " ");
        }
    }

    private static int[] linearize(int[][] array) {
        int size = 0;
        for (int[] anArray : array) {
            size += anArray.length;
        }
        int[] array2 = new int[size];
        int k = 0;
        for (int[] anArray : array) {
            for (int anAnArray : anArray) {
                array2[k] = anAnArray;
                k++;
            }
        }
        return array2;
    }
}
