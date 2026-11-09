package Ch12_GetterSetter.fisrtPackage;

public class Car {
    private String color;
    private String model;
    private long carPurchasePrice;
    private double fuelLevel;

    public Car(String color, String model, long carPurchasePrice, double fuelLevel){
        this.color = color;
        this.model = model;
        this.carPurchasePrice = carPurchasePrice;
        this.fuelLevel = fuelLevel;
    }


    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getModel(){
        return model;
    }

    public double getFuelLevel(){
        return fuelLevel;
    }


}
