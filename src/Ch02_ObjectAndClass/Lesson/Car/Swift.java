package Ch02_ObjectAndClass.Lesson.Car;

public class Swift {
    static void main(String[] args) {
        Car swiftCar = new Car();
//        swiftCar.addFuel(5);
        swiftCar.start().drive();
        swiftCar.getCurrentFuelLevel();
    }

}
