package Ch14_Absctration.AbstractClass;

public class Test {

    static void main(String[] args) {
        Car SwiftDezire = new Car(7);
        SwiftDezire.commute();
        System.out.println("Nomber of Tyre is " + SwiftDezire.getNoOfTyre());

    }

}
