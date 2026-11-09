package Ch14_Absctration.AbstractClass;

public abstract class Vehicle {
    private int noOfTyre;

    public Vehicle(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    public int getNoOfTyre() {
        return noOfTyre;
    }

    public void setNoOfTyre(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    public void commute(){
        System.out.println("Running.......");
    }

}
