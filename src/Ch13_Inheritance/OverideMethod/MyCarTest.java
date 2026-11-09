package Ch13_Inheritance.OverideMethod;

public class MyCarTest {
    static void main(String[] args) {
        MyCar SwiftDezire = new MyCar(60000, "Red");
        MyCar Punch = new MyCar(90000, "Black");
        MyCar Ertiga = new MyCar(90000, "Black");

        System.out.println(SwiftDezire);
        System.out.println(Punch);
        System.out.println(Ertiga);

        System.out.println(Punch.equals(Ertiga));  // true because method overide as par requirement
        System.out.println(Ertiga.equals(SwiftDezire)); // false

        System.out.println(SwiftDezire.hashCode());
        System.out.println(Punch.hashCode());
    }

}
