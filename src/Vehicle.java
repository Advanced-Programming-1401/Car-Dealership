import java.util.Date;

public class Vehicle {
    private String brand;
    private String name;
    private int number;
    private Date prodDate;
    private int price;
    private int horsepower;
    private String color;
    private String fuelType;
    private float tankVolume;
    private Insurance insurance;
    private boolean doesExpertChecked;

    public Vehicle(String brand, String name, int number, Date prodDate, int price, int horsepower, String color, String fuelType, float tankVolume, Insurance insurance, boolean doesExpertChecked) {
        this.brand = brand;
        this.name = name;
        this.number = number;
        this.prodDate = prodDate;
        this.price = price;
        this.horsepower = horsepower;
        this.color = color;
        this.fuelType = fuelType;
        this.tankVolume = tankVolume;
        this.insurance = insurance;
        this.doesExpertChecked = doesExpertChecked;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(float tankVolume) {
        this.tankVolume = tankVolume;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isDoesExpertChecked() {
        return doesExpertChecked;
    }

    public void setDoesExpertChecked(boolean doesExpertChecked) {
        this.doesExpertChecked = doesExpertChecked;
    }

    public void buy(){
        if (this.number > 0)
            this.number -= 1;

        else
            System.err.println("Stack is empty!");
    }

    public void sell(){
        this.number += 1;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", prodDate=" + prodDate +
                ", price=" + price +
                ", horsepower=" + horsepower +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", tankVolume=" + tankVolume +
                ", insurance=" + insurance +
                ", doesExpertChecked=" + doesExpertChecked +
                '}';
    }
}
