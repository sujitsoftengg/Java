package Ch14_Absctration.AbstractMethod;

public abstract class Vehicle {
    private int noOfTyre;

    public Vehicle(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    // Abstract Method without definition or body for child class
    public abstract void makeStartSound();

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

