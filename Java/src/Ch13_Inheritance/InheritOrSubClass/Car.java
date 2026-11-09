package Ch13_Inheritance.InheritOrSubClass;

public class Car extends ForWheeler {
    public boolean fuelSystemAvailable = true;
    public String fuelType;

    public String getFuelType(){
        return fuelType;
    }

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
}
