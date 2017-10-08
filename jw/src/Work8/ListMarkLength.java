package Work8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 08.10.2017.
 */
public class ListMarkLength {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("ddf");
        list.add("1234");
        list.add("a");
        list.add("qwerty");
        printList(list);
        markLength4(list);
    }

    private static void printList(List<String> list) {
        for (Object listStr: list) {
            System.out.print(listStr + "   ");
        }
    }

    private static void markLength4(List<String> list) {
        int i = 0;
        List<String> listCopy = new ArrayList<>();
        listCopy.addAll(list);
        System.out.println();
        for (String listStr: listCopy) {
            if (listStr.length() == 4) {
                list.add(i, "****");
                i++;
            }
            i++;
        }
        printList(list);
    }
}
