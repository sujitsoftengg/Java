package Ch14_Absctration.AbstractMethod;

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

    public void makeStartSound(){
        System.out.println("Vrommmm.....Vroom......");
    }

}
