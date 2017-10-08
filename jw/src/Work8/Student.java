package Work8;

/**
 * Created by User on 08.10.2017.
 */
public class Student {
    private String name;
    private String lastName;
    private int age;
    private double averageRank;

    public Student(String name, String lastName, int age, double averageRank) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageRank = averageRank;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageRank() {
        return averageRank;
    }

    public void setAverageRank(double averageRank) {
        this.averageRank = averageRank;
    }
}
