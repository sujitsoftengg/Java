package Ch14_Absctration.AbstractClass;

public class Car extends Vehicle {
    private int noOfSeat;

    public Car (int noOfSeat){
        super(4);
        this.noOfSeat = noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

}
