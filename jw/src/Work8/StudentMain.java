package Work8;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by User on 08.10.2017.
 */
public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList();
        studentList.add(new Student("Ivan", "Petrov", 19, 5));
        studentList.add(new Student("Petr", "Petrov", 18, 4.8));
        studentList.add(new Student("Semen", "Sidorov", 19, 3.5));
        studentList.add(new Student("Anton", "Stepanov", 21, 5));
        studentList.add(new Student("Ivan", "Antonov", 21, 4.2));
        printList(studentList);
        printListBestAvg(studentList);
        Collections.sort(studentList, new SortByNameAndLastName());
        System.out.println("\nСортировка по полному имени");
        printList(studentList);
        Collections.sort(studentList, new SortByAgeAndAvg());
        System.out.println("\nСортировка по возрасту и среднему балу");
        printList(studentList);
    }

    private static void printList(List<Student> studentList) {
        for (Student list: studentList) {
            System.out.println(list.getName() + " " + list.getLastName() + " Age " + list.getAge() + " Avg " + list.getAverageRank());
        }
    }

    private static void printListBestAvg(List<Student> studentList) {
        List<Student> studentListBestAvg = new ArrayList<>();
        Student bestStudent = studentList.get(0);
        for (Student list: studentList) {
            if(list.getAverageRank() >= bestStudent.getAverageRank()) {
                studentListBestAvg.add(list);
                bestStudent = list;
            }
        }
        System.out.println("\nСписок студентов с лучшим средним балом ");
        for (Student listAvg: studentListBestAvg)
        System.out.println(listAvg.getName() + " " + listAvg.getLastName() + " Средний бал - " + listAvg.getAverageRank());
    }
}
