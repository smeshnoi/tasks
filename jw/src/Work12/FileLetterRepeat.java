package Work12;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by User on 14.10.2017.
 */
public class FileLetterRepeat {
    public static void main(String[] args) {
        File fileIn = new File("Work12" + File.separator + "Pushkin.txt");
        File fileOut = new File("Work12" + File.separator + "LetterRepeat.txt");
        try {
            fileIn.createNewFile();
            fileOut.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        HashMap<Character, Integer> letterRepeat = new LinkedHashMap<>();
        for (int i = 0; i < alphabet.length(); i++) {
            int count = 0;
            try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(fileIn)))) {
                while (scanner.hasNext()) {
                    String string = scanner.next().toLowerCase();
                    for (int j = 0; j < string.length(); j++) {
                        if (string.charAt(j) == alphabet.charAt(i)) {
                            count++;
                        }
                    }
                }
                letterRepeat.put(alphabet.charAt(i), count);
            } catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut))) {
            for (Character charValue: letterRepeat.keySet()) {
                bufferedWriter.write(charValue + " - " + letterRepeat.get(charValue) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
