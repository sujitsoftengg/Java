package Ch15_Polymorphism;

public class Car implements Vehicle {

    public int noOfDors(){
        return 5;
    }

    public void start(){
        System.out.println("Car Running.......");
    }

}
