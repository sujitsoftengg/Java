package Ch07_toString;

public class CarObjWithoutToString {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public CarObjWithoutToString(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    static void main(String[] args) {
        CarObjWithoutToString Swift = new CarObjWithoutToString(4, 4, 120, "Swift", "2025", "Maruti");
        System.out.println(Swift.toString()); // Ch07_toString.Car@27716f4 (@27716f4 is HasCode)
        System.out.println(Swift); // Ch07_toString.Car@27716f4 (@27716f4 is HasCode)
    }


}
