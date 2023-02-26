import java.util.Date;

public class Truck extends Vehicle{
    private float loadCapacity;
    private float numberOfWheels;
    private boolean doesHaveBed;

    public Truck(String brand, String name, int number, Date prodDate, int price, int horsepower, String color, String fuelType, float tankVolume, Insurance insurance, boolean doesExpertChecked, float loadCapacity, float numberOfWheels, boolean doesHaveBed) {
        super(brand, name, number, prodDate, price, horsepower, color, fuelType, tankVolume, insurance, doesExpertChecked);
        this.loadCapacity = loadCapacity;
        this.numberOfWheels = numberOfWheels;
        this.doesHaveBed = doesHaveBed;
    }

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(float loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public float getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(float numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isDoesHaveBed() {
        return doesHaveBed;
    }

    public void setDoesHaveBed(boolean doesHaveBed) {
        this.doesHaveBed = doesHaveBed;
    }

    @Override
    public String toString() {
        return super.toString() + "->" +"Truck{" +
                "loadCapacity=" + loadCapacity +
                ", numberOfWheels=" + numberOfWheels +
                ", doesHaveBed=" + doesHaveBed +
                '}';
    }
}
