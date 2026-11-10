package Ch02_ObjectAndClass.Lesson.Car;

public class Car {
    // Instance Variable or Attributes with static
    static int minAgeForDriving = 18;

    // Instance Variable or Attributes without static
    int noOfWheels;
    int age;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    double carPrice;
    static int totalCarSold;

    // Initializing Block {}
    static {
        totalCarSold = 0;
    }

    // Default without parameter Constructor
    Car() {
        noOfSeats = 7;
        maxSpeed = 260;
        currentFuelInLiters = 2;
        noOfWheels = 4;
    }

    // Default with parameter Constructor
    Car(int noOfSeat, int maxSpeed, int refuel) {
        this.noOfSeats = noOfSeat;
        this.maxSpeed = maxSpeed;
        currentFuelInLiters = refuel;
        noOfWheels = 4;
    }

    // Constructor Chaining with this keyword
    Car(String Color) {
        this(7, 240, 5);
        carPrice = 5000000;
        this.color = Color;
    }

    //

    // Instance Method with static
    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }

    // Instance Method without static
    // In This Method return This Class with this keyword;
    public Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Please refuel the cars");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car Current Fuel is " + currentFuelInLiters + " Car is Running Under Reserve");
            currentFuelInLiters--;
        } else {
            System.out.println("Car Driving");
            currentFuelInLiters--;
        }
        return this;
    }

    public void drive() {
        if (currentFuelInLiters < 1) {
            System.out.println("Please Refule");
        } else {
            currentFuelInLiters--;
            System.out.println("Car is Driving");
        }
    }

    public void addFuel(float currentFuelInLiters) {
        System.out.println("Car Refule " + currentFuelInLiters + " liter");
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        System.out.println("Current Fuel Level : " + currentFuelInLiters);
        return currentFuelInLiters;
    }

}
