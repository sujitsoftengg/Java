package Ch12_GetterSetter.secondPackage;

import Ch12_GetterSetter.fisrtPackage.Car;

public class AccessTest {
    static void main(String[] args) {
        Car SwiftDezire = new Car("Neon", "2026", 56000, 5.36);
        System.out.printf("Car Color %s And Car Model is %s", SwiftDezire.getColor(), SwiftDezire.getModel());

        SwiftDezire.setColor("Black");
        System.out.printf("Car Color : %s, Model : %s, Fuel Level: %s", SwiftDezire.getColor(), SwiftDezire.getModel(), SwiftDezire.getFuelLevel());
    }
}
