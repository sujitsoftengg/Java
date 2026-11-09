package Ch07_toString;

public class BikeObjWithToString {
    int price;
    int speed;
    int milage;
    String color;
    String model;
    String fuelType;

    // Constructor use for initialize new object and set the initial state.
    public BikeObjWithToString(int price, int speed, int milage, String model, String fuelType) {
        this.price = price;
        this.speed = speed;
        this.milage = milage;
        this.model = model;
        this.fuelType = fuelType;
        this.color = "Balck";
    }

    // toString use for human readable representation of an object.


    @Override
    public String toString() {
        return "Bike{" +
                "price=" + price +
                ", speed=" + speed +
                ", milage=" + milage +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    static void main(String[] args) {
        BikeObjWithToString Splender = new BikeObjWithToString(65000, 60, 60, "2026", "Petrol");
        System.out.println(Splender.color);
        System.out.println(Splender);
    }

}
