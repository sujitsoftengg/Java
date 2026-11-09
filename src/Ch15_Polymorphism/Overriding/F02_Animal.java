package Ch15_Polymorphism.Overriding;

public abstract class F02_Animal implements F01_Creature {
    public int numberOfLeg;
    public int age;

    F02_Animal(int numberOfLeg, int age){
        this.numberOfLeg = numberOfLeg;
        this.age = age;
    }

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public int getAge() {
        return age;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Animal Eating ..........");
    }

    @Override
    public void walk() {
        System.out.println("Animal walking..........with " + numberOfLeg );
    }

    @Override
    public void run() {
        System.out.println("Animal running..........with " + numberOfLeg );
    }

    @Override
    public void sound() {
        System.out.println("Ghun Ghun Ghun .............");
    }
}
