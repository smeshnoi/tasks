package Regex;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FileOption {

    public static List<String> readFile(String fileName) {
        System.out.println(fileName);
        File filein = new File("Regex" + File.separator + fileName);
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(filein)))) {
            while (scanner.hasNext()) {
                String string = scanner.nextLine();
                list.add(string);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(List<String> list, String fileName) {
        File fileOut = new File("Regex" + File.separator + fileName);
        try {
            fileOut.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut))){
            for (String value: list) {
                bufferedWriter.write(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDetailFile(HashMap<String, Integer> hashMap, String fileName) {
        File fileOut = new File("Regex" + File.separator + fileName);
        try {
            fileOut.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int totalTime = 0;
        double percent;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut))){
            for (String value: hashMap.keySet()) {
                totalTime += hashMap.get(value);
            }
            for (String value: hashMap.keySet()) {
                percent = Math.round((double)hashMap.get(value) * 100 / (double)totalTime);
                bufferedWriter.write(value + ": " + hashMap.get(value) + " минут  " + percent + "%\n");
            }
            bufferedWriter.write("\n" + "Общее время: " + totalTime + " минут" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
