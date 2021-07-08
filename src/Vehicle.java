public class Vehicle {

    private String make;
    private String model;
    private int fabricationAge;
    private String color;
    private double price;

    public Vehicle(String make, String model, int fabricationAge, String color, double price) {
        this.make = make;
        this.model = model;
        this.fabricationAge = fabricationAge;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFabricationAge() {
        return fabricationAge;
    }

    public void setFabricationAge(int fabricationAge) {
        this.fabricationAge = fabricationAge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", fabricationAge=" + fabricationAge +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

}
