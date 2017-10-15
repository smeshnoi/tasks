package Work10;

/**
 * Created by User on 12.10.2017.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;


public class WordsRepeat {
    public static void main(String[] args) {
        String text = "Some words are, are, Are  repeated more more often Often than other words!";
        List<String> list = new ArrayList<>();
        int i = 0;
        for (int j = 0; j < text.length(); j++) {
            if (text.charAt(j) == ' ' || text.charAt(j) == '.' || text.charAt(j) == '!' || text.charAt(j) == '?' || text.charAt(j) == ',') {
                if (j > i) {
                    list.add(text.substring(i, j).trim());
                }
                i = j + 1;
            }
        }
        System.out.println(text + "\n");
        HashMap<String, Integer> wordsRepeat = new HashMap<>();
        String temp;
        int count;
        for (i = 0; i < list.size(); i++) {
            count = 0;
            temp = list.get(i);
            for (String value: list) {
                if (temp.equals(value)) {
                    count++;
                }
            }
            wordsRepeat.put(temp, count);
        }
        for (String value: wordsRepeat.keySet()) {
            System.out.println(value + " - " + wordsRepeat.get(value));
        }
    }
}
