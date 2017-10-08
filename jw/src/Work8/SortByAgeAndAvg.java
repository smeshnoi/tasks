package Work8;

import java.util.Comparator;

/**
 * Created by User on 08.10.2017.
 */
public class SortByAgeAndAvg implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(new Integer(s1.getAge()).compareTo(s2.getAge()) == 0) {
            return new Double(s1.getAverageRank()).compareTo(s2.getAverageRank());
        }
        return new Integer(s1.getAge()).compareTo(s2.getAge());
    }
}
