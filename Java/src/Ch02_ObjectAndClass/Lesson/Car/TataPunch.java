package Ch02_ObjectAndClass.Lesson.Car;

public class TataPunch {
    static void main(String[] args) {
        Car TataPunch = new Car();

        TataPunch.addFuel(5);
        System.out.println(TataPunch.currentFuelInLiters);
        TataPunch.drive();
        TataPunch.drive();
        System.out.println(TataPunch.currentFuelInLiters);
        TataPunch.drive();
        TataPunch.drive();
        TataPunch.drive();
        TataPunch.drive();
        System.out.println("Current Fuel : " + TataPunch.getCurrentFuelLevel());
    }
}
