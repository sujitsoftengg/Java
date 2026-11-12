package Ch13_Inheritance.InheritOrSubClass;

public class Test {

    static void main(String[] args) {

        Bike HeroXtream = new Bike();
        HeroXtream.vehicleStart();
        HeroXtream.setFuelType("Petrol");
        System.out.println(HeroXtream.getFuelType());

        System.out.println("tostring : " + HeroXtream.toString());
        System.out.println(HeroXtream.hashCode());
        System.out.println(HeroXtream.getClass());

    }

}
