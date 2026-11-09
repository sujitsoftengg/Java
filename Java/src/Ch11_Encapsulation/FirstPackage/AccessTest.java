package Ch11_Encapsulation.FirstPackage;

public class AccessTest {
    static void main(String[] args) {
        Car firstCar = new Car("Black", "2017", 5.2, 59000);
        Car secondCar = new Car();

        // public can access in any package
        secondCar.model = "2024";
        secondCar.color = "White";

        // default can access in same package
        secondCar.carCostOfPurchase = 60000;

        //private can not access in same or different package
        // secondCar.fuelLevel = 5.5

        System.out.println(firstCar);
        System.out.println(secondCar);
    }
}
