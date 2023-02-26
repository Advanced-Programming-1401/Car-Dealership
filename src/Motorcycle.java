import java.util.Date;

public class Motorcycle extends Vehicle{
    private int numberOfSeats;
    private int numberOfWheels;

    public Motorcycle(String brand, String name, int number, Date prodDate, int price, int horsepower, String color, String fuelType, float tankVolume, Insurance insurance, boolean doesExpertChecked, int numberOfSeats, int numberOfWheels) {
        super(brand, name, number, prodDate, price, horsepower, color, fuelType, tankVolume, insurance, doesExpertChecked);
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return super.toString() + "->" +"Motorcycle{" +
                "numberOfSeats=" + numberOfSeats +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
