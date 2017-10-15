package Work12;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by User on 15.10.2017.
 */
public class SortByNumber implements Comparator<Character> {

    @Override
    public int compare(Character o1, Character o2) {
        return o1.compareTo(o2);
    }
}
