package Ch13_Inheritance.ObjectClassAndNestedClass;

class PersonalCar {
    double carPrice;
    String color;


    PersonalCar(double carPrice, String color){
        this.carPrice = carPrice;
        this.color = color;
    }

    // Inner Class
    public static class PersonalCarTest {

        static void main(String[] args) {
            PersonalCar SwiftDezire = new PersonalCar(56000, "Red");
            PersonalCar TataPunch = new PersonalCar(90000, "Black");

            // Object Class
            System.out.println(SwiftDezire.getClass());     // class Ch14_ObjectClass.Car
            System.out.println(SwiftDezire.hashCode());     // 149928006
            System.out.println(SwiftDezire.toString());  // Ch14_ObjectClass.Car@8efb846
            System.out.println(SwiftDezire.equals(TataPunch)); // False

            PersonalCar Baleno = new PersonalCar(60000, "Neo");
            PersonalCar Tiago = Baleno;

            System.out.println(Baleno); // Ch14_ObjectClass.Car@2a84aee7
            System.out.println(Tiago);  // Ch14_ObjectClass.Car@2a84aee7
            System.out.println(Baleno.equals(Tiago)); // True
            System.out.println(Baleno.hashCode());  // 713338599
            System.out.println(Tiago.hashCode());  // 713338599


        }

    }
}
