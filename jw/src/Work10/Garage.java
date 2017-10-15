package Work10;

import java.util.HashMap;

/**Working garage
 * Created by User on 13.10.2017.
 */
public class Garage {
    public static void main(String[] args) {
        HashMap<Car, Integer> garageCar = new HashMap<>();
        garageCar = inParking(new TypeCar("BMW", "318", 1998, "Black", "Sedan", "i"), garageCar);
        garageCar = inParking(new TypeCar("BMW", "318", 1998, "Black", "Sedan", "i"), garageCar);
        garageCar = inParking(new TypeCar("BMW", "320", 1998, "Black", "Sedan", "disel"), garageCar);
        garageCar = inParking(new TypeCar("BMW", "330", 1998, "Black", "Sedan", "disel"), garageCar);
        garageCar = inParking(new TypeCar("Mercedes", "C180", 2001, "White", "Wagon", "i"), garageCar);
        garageCar = inParking(new TypeCar("Honda", "Accord", 2008, "Gray", "Sedan", "i"), garageCar);
        garageCar = inParking(new TypeCar("Honda", "Accord", 2008, "Gray", "Sedan", "i"), garageCar);
        garageCar = inParking(new TypeCarModelTruck("Volvo", "truck", 2008, "Blue", "Dumper"), garageCar);
        garageCar = inParking(new TypeCarModelTruck("Volvo", "truck", 2008, "Blue", "Dumper"), garageCar);
        garageCar = inParking(new TypeCarModelTruck("MAZ", "truck", 1995, "Blue", "Waggon"), garageCar);
        isPrinting(garageCar);
        garageCar = outParking(new TypeCar("Honda", "Accord", 2008, "Gray", "Sedan", "i"), garageCar);
        garageCar = outParking(new TypeCar("Honda", "Accord", 2008, "Gray", "Sedan", "i"), garageCar);
        garageCar = outParking(new TypeCarModelTruck("Volvo", "truck", 2008, "Blue", "Dumper"), garageCar);
        isPrinting(garageCar);
        garageCar = inParking(new Bus("MAZ", "200", 1995, "Yelow", 70), garageCar);
        garageCar = inParking(new Bus("MAZ", "200", 1995, "Blue", 103), garageCar);
        garageCar = inParking(new Bus("Mercedes", "A140", 1995, "Blue", 140), garageCar);
        garageCar = inParking(new Bus("Mercedes", "A140", 1995, "Blue", 140), garageCar);
        garageCar = inParking(new Motorcycle("Suzuki", "Bandit", 1995, "Red", 600), garageCar);
        garageCar = inParking(new Motorcycle("Honda", "CB-1", 2001, "White", 800), garageCar);
        garageCar = inParking(new Motorcycle("Honda", "CB-1", 2001, "White", 800), garageCar);
        isPrinting(garageCar);
        System.out.println("Number of cars by enter mark  - " + getNumbersOfCarByMark("BMW", garageCar));
        garageCar = outParking(new TypeCarModelTruck("Volvo", "truck", 2008, "Blue", "Dumper"), garageCar);
        garageCar = outParking(new TypeCar("BMW", "318", 1998, "Black", "Sedan", "i"), garageCar);
        garageCar = outParking(new TypeCar("BMW", "318", 1998, "Black", "Sedan", "i"), garageCar);
        garageCar = outParking(new TypeCar("BMW", "320", 1998, "Black", "Sedan", "disel"), garageCar);
        garageCar = outParking(new TypeCarModelTruck("MAZ", "truck", 1995, "Blue", "Waggon"), garageCar);
        isPrinting(garageCar);
        System.out.println("Number of cars by enter mark  - " + getNumbersOfCarByMark("BMW", garageCar));
    }

    private static int getNumbersOfCarByMark(String mark, HashMap<Car, Integer> garageCar) {
        int count = 0;
        for (Car value: garageCar.keySet()) {
            if (value.getMark().equals(mark)) {
                count = count + garageCar.get(value);
            }
        }
        return count;
    }

    private static void isPrinting(HashMap<Car, Integer> garageCar) {
        System.out.println("\nCar in parking:");
        for (Car value: garageCar.keySet()) {
            System.out.println(value.getMark() + " : " + value.getModel() + " - " + garageCar.get(value));
        }
    }

    public static HashMap inParking (Car car, HashMap<Car, Integer> garageCar) {
        if (garageCar.isEmpty()) {
            garageCar.put(car, 1);
        } else {
            if (garageCar.containsKey(car)) {
                garageCar.put(car, garageCar.get(car) + 1);
            } else {
                garageCar.put(car, 1);
            }
        }
        return garageCar;
    }

    public static HashMap outParking (Car car, HashMap<Car, Integer> garageCar) {
        if (garageCar.containsKey(car)) {
            if (garageCar.get(car) > 1) {
                garageCar.put(car, garageCar.get(car) - 1);
            } else if (garageCar.get(car) == 1) {
                garageCar.remove(car);
            }
        } else {
            System.out.println("Car not found");
        }
        return garageCar;
    }
}
