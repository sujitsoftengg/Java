package Ch11_Encapsulation.FirstPackage;

public class Car {

    // Public
    public String color;
    public String model;
    // Private
    private double fuelLevel;
    // Default
    long carCostOfPurchase;

    public Car (){

    }

    public Car(String color, String model, double fuelLevel, long carCostOfPurchase){
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.carCostOfPurchase = carCostOfPurchase;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("This is car object Details : ");
        str.append("Car Color - ").append(color);
        str.append(", Car Model - ").append(model);
        str.append(", Car Fuel Level - ").append(fuelLevel);
        str.append(", Car Cost of Purchase - ").append(carCostOfPurchase);
        return str.toString();
    }

}
