package Ch09_StringBuilderStringBuffer;

public class Car {
    int price;
    int noOfDoor;
    int noOfWheels;
    String model;
    String color;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("price=").append(price);
        sb.append(", noOfDoor=").append(noOfDoor);
        sb.append(", noOfWheels=").append(noOfWheels);
        sb.append(", model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Car(int price, int noOfDoor, int noOfWheels, String model) {
        this.price = price;
        this.noOfDoor = noOfDoor;
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.color = "Black";
    }

    static void main(String[] args) {

        Car Swift = new Car(50000, 4, 4, "2026");
        System.out.println(Swift);  // Car{price=50000, noOfDoor=4, noOfWheels=4, model='2026', color='Black'}

    }
}
