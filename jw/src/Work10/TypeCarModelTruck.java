package Work10;

/**
 * Created by User on 13.10.2017.
 */
public class TypeCarModelTruck extends Car {
    private Car car;
    private String modelTruck;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeCarModelTruck that = (TypeCarModelTruck) o;

        return (getMark() == that.getMark() && getModel() == that.getModel()
                && getYearOfRelease() == that.getYearOfRelease() && getColorCar() == that.getColorCar()
                && this.modelTruck == that.getModelTruck());
    }

    public String getModelTruck() {
        return modelTruck;
    }

    public void setModelTruck(String modelTruck) {
        this.modelTruck = modelTruck;
    }

    @Override
    public int hashCode() {
        int result = 20;
        result = 31 * result + 6 * getMark().length();
        result = 31 * result + 6 * getModel().length();
        result = 31 * result + 6 * getYearOfRelease();
        result = 31 * result + 6 * getColorCar().length();
        result = 31 * result + 6 * getModelTruck().length();
        return result;
    }

    public TypeCarModelTruck(String mark, String model, int yearOfRelease, String colorCar, String modelTruck) {
        super(mark, model, yearOfRelease, colorCar);
        this.modelTruck = modelTruck;
    }

    @Override
    public String toString() {
        return "Truck " + getMark() + " modelTruck = " + modelTruck;
    }
}