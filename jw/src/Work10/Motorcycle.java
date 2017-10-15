package Work10;

/**
 * Created by User on 13.10.2017.
 */
public class Motorcycle extends Car {
    private Car car;
    private int engineCapacity;

    public Motorcycle(String mark, String model, int yearOfRelease, String colorCar, int engineCapacity) {
        super(mark, model, yearOfRelease, colorCar);
        this.engineCapacity = engineCapacity;
    }


    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Motorcycle that = (Motorcycle) o;

        return (getMark() == that.getMark() && getModel() == that.getModel()
                && getYearOfRelease() == that.getYearOfRelease() && getColorCar() == that.getColorCar()
                && this.engineCapacity == that.getEngineCapacity());
    }

    @Override
    public int hashCode() {
        int result = 21;
        result = 31 * result + 8 * getMark().length();
        result = 31 * result + 8 * getModel().length();
        result = 31 * result + 8 * getYearOfRelease();
        result = 31 * result + 8 * getColorCar().length();
        result = 31 * result + 8 * getEngineCapacity();
        return result;
    }

    @Override
    public String toString() {
        return "Motorcycle mark " + getMark() + " model " + getModel() + " engineCapacity = " + engineCapacity;
    }
}
