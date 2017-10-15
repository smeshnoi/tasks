package Work12;

import java.io.*;
import java.util.*;

/**
 * Created by User on 15.10.2017.
 */
public class FileRandomNumber {
    public static void main(String[] args) {
        File fileRandomNumber = new File("Work12" + File.separator + "FileRandomNumber.txt");
        File sortFileRandomNumber = new File("Work12" + File.separator + "SortFileRandomNumber.txt");
        Random random = new Random();
        int randomNumber;
        try {
            fileRandomNumber.createNewFile();
            sortFileRandomNumber.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileRandomNumber))) {
            for (int i = 0; i < 1000; i++) {
                randomNumber = random.nextInt(100);
                bufferedWriter.write(Integer.toString(randomNumber));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Character> listNumber = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(fileRandomNumber)))) {
            while (scanner.hasNext()) {
                String string = scanner.next();
                for (int i =0; i < string.length(); i++) {
                    listNumber.add(string.charAt(i));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(listNumber, new SortByNumber());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(sortFileRandomNumber))) {
            for (Character numValue: listNumber) {
                bufferedWriter.write(numValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
