package Ch14_Absctration.Interface;

public abstract class Cow implements Animal {

    @Override
    public void eat() {
        System.out.println("Cow Eating.......");
    }

    @Override
    public void drinking() {
        System.out.println("Cow Drinking.....");
    }

    @Override
    public void sound() {
        System.out.println("Baaaaaaannnnnnnnnnn...");
    }

    @Override
    public void swim() {
        System.out.println("Cow Swimming in the rever...");
    }

    public abstract boolean Surrogacy();


}
