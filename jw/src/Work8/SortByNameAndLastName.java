package Work8;

import java.util.Comparator;

/**
 * Created by User on 08.10.2017.
 */
public class SortByNameAndLastName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getName().compareTo(s2.getName()) == 0) {
            return s1.getLastName().compareTo(s2.getLastName());
        }
        return s1.getName().compareTo(s2.getName());
    }
}
