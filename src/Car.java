import java.util.Date;

public class Car extends Vehicle{
    private int seatsNumber;
    private boolean doesHaveTrunk;
    private boolean isLeftSteeringWheel;

    public Car(String brand, String name, int number, Date prodDate, int price, int horsepower, String color, String fuelType, float tankVolume, Insurance insurance, boolean doesExpertChecked, int seatsNumber, boolean doesHaveTrunk, boolean isLeftSteeringWheel) {
        super(brand, name, number, prodDate, price, horsepower, color, fuelType, tankVolume, insurance, doesExpertChecked);
        this.seatsNumber = seatsNumber;
        this.doesHaveTrunk = doesHaveTrunk;
        this.isLeftSteeringWheel = isLeftSteeringWheel;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public boolean isDoesHaveTrunk() {
        return doesHaveTrunk;
    }

    public void setDoesHaveTrunk(boolean doesHaveTrunk) {
        this.doesHaveTrunk = doesHaveTrunk;
    }

    public boolean isLeftSteeringWheel() {
        return isLeftSteeringWheel;
    }

    public void setLeftSteeringWheel(boolean leftSteeringWheel) {
        isLeftSteeringWheel = leftSteeringWheel;
    }

    @Override
    public String toString() {
        return super.toString() + "->" +"Car{" +
                "seatsNumber=" + seatsNumber +
                ", doesHaveTrunk=" + doesHaveTrunk +
                ", isLeftSteeringWheel=" + isLeftSteeringWheel +
                '}';
    }
}
