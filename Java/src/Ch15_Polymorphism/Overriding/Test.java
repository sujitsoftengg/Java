package Ch15_Polymorphism.Overriding;

public class Test {

    static void main(String[] args) {

        Dog labrdor = new Dog("Labrador");
        labrdor.sound();
        labrdor.run();


        Cat indianCat = new Cat("Indian Cat");
        indianCat.sound();
        indianCat.run();

    }


}
