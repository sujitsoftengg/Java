package Ch15_Polymorphism.Overriding;

public class Dog extends F02_Animal {
    public String breed;

    public Dog(String breed){
        super(4, 8);
        this.breed = breed;
    }

    // Method Overriding
    @Override
    public void eat() {
        System.out.println("Dog Eating ..........");
    }

    @Override
    public void walk() {
        System.out.println("Dog walking..........with " + numberOfLeg );
    }

    @Override
    public void run() {
        System.out.println("Dog running..........with " + numberOfLeg );
    }

    @Override
    public void sound() {
        System.out.println("Bhow Bhow Bhow .............");
    }


}
