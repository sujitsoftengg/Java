package Ch15_Polymorphism.Super;

public abstract class Animal {
    private int noOfLeg;

    Animal(){
        this.noOfLeg = 0;
    }

    Animal(int noOfLeg){
        this.noOfLeg = noOfLeg;
    }

    public int getNoOfLeg() {
        return noOfLeg;
    }
}
