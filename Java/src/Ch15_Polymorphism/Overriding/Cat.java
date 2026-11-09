package Ch15_Polymorphism.Overriding;

public class Cat extends F02_Animal {
    public String breed;

    public Cat (String breed){
        super(4, 3);
        this.breed = breed;
    }

    // Method Overriding
    @Override
    public void sound() {
        System.out.println("Meau Meau Meau...........");
    }


}
