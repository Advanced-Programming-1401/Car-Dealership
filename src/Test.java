import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        ArrayList<Vehicle> storage = new ArrayList<Vehicle>();
        Insurance insurance = new Insurance(new Date(), "Full", "Iran Insurance");
        Car car = new Car("BMW", "528", 3, new Date(), 50000, 5000, "Black", "Gasoline", 20, insurance, true, 5, true, true);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 12345, new Date(), 8000, 120, "Red", "Gasoline", 4.5f, insurance, true, 1, 2);
        Truck truck = new Truck("Ford", "F-150", 67890, new Date(), 35000, 300, "Blue", "Gasoline", 20.0f, insurance, true, 1500.0f, 4.0f, true);
        storage.add(car);
        storage.add(motorcycle);
        storage.add(truck);
    }
}
