package Ch14_Absctration.Interface;

public abstract class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog Eating.......");
    }

    @Override
    public void drinking() {
        System.out.println("Dog Drinking.....");
    }

    @Override
    public void sound() {
        System.out.println("Bho Bho Bhooooo Bho Bho...");
    }

    @Override
    public void swim() {
        System.out.println("Dog Swimming in the bathtub...");
    }

    public abstract boolean Surrogacy();

}
