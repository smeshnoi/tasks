package Work10;

/**
 * Created by User on 12.10.2017.
 */
public class Car {
    private String mark;
    private String model;
    private int yearOfRelease;
    private String colorCar;

    public Car(String mark, String model, int yearOfRelease, String colorCar) {
        this.mark = mark;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.colorCar = colorCar;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }
}
