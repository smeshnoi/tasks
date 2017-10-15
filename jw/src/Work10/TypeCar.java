package Work10;

/**
 * Created by User on 12.10.2017.
 */
public class TypeCar extends Car {

    private Car car;
    private String typeCar;
    private String typeEngine;

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public TypeCar(String mark, String model, int yearOfRelease, String colorCar, String typeCar, String typeEngine) {
        super(mark, model, yearOfRelease, colorCar);
        this.typeCar = typeCar;
        this.typeEngine = typeEngine;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return getMark() + ":" + getModel() + ":" + getColorCar() + ":" + getTypeEngine();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeCar typeCar1 = (TypeCar) o;

        if (car != null ? !car.equals(typeCar1.car) : typeCar1.car != null) return false;
        if (typeCar != null ? !typeCar.equals(typeCar1.typeCar) : typeCar1.typeCar != null) return false;
        return (getMark() == typeCar1.getMark() && getModel() == typeCar1.getModel()
                && getTypeCar() == typeCar1.getTypeCar() && getYearOfRelease() == typeCar1.getYearOfRelease()
                && getColorCar() == typeCar1.getColorCar() && this.typeEngine == typeCar1.getTypeEngine());
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = 31 * result + 6 * getMark().length();
        result = 31 * result + 6 * getModel().length();
        result = 31 * result + 6 * getYearOfRelease();
        result = 31 * result + 6 * getColorCar().length();
        result = 31 * result + 6 * getTypeCar().length();
        result = 31 * result + 6 * getTypeEngine().length();
        return result;
    }
}
