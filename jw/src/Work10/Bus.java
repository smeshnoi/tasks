package Work10;

/**
 * Created by User on 14.10.2017.
 */
public class Bus extends Car {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public Bus(String mark, String model, int yearOfRelease, String colorCar, int capacity) {
        super(mark, model, yearOfRelease, colorCar);
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bus bus = (Bus) o;

        return (getMark() == bus.getMark() && getModel() == bus.getModel()
                && getYearOfRelease() == bus.getYearOfRelease() && getColorCar() == bus.getColorCar()
                && this.capacity == bus.getCapacity());
    }

    @Override
    public int hashCode() {
        int result = 22;
        result = 31 * result + 6 * getMark().length();
        result = 31 * result + 6 * getModel().length();
        result = 31 * result + 6 * getYearOfRelease();
        result = 31 * result + 6 * getColorCar().length();
        result = 31 * result + 6 * getCapacity();
        return result;
    }

    @Override
    public String toString() {
        return "Bus mark " + getMark() + " capacity = " + capacity;
    }
}
