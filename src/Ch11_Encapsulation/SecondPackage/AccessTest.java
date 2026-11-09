package Ch11_Encapsulation.SecondPackage;
import Ch11_Encapsulation.FirstPackage.Car;

public class AccessTest {

    static void main(String[] args) {
        Car TataPunch = new Car("Red", "2026", 5.6, 560000);
        Car SwiftDezire = new Car();

        // public can access in any package
        SwiftDezire.color = "Red";
        SwiftDezire.model = "2024";

        //default can not access in different package
//        SwiftDezire.carCostOfPurchase = 69000;

        //private can not access in same or different package
//        SwiftDezire.fuelLevel = 5.5

        System.out.println(SwiftDezire);
        System.out.println(TataPunch);

    }
}
