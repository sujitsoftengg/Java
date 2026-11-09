package Ch15_Polymorphism.Final;

// Final Class not inherit in another class
final public class VoterCard {
    // Final Variable not changed
    final int minimum_Age = 18;

    // normal
    private String name;
    private int age;

    VoterCard(String name, int age){
        if (age > minimum_Age){
            this.name = name;
            this.age = age;
            System.out.printf("Your name is %s and age is %d and you are eligible for voter id card.", name, age);
            System.out.println();
        }else {
            System.out.println("You are not Eligible for Voter ID Card");
        }
    }

    public int getMinimum_Age() {
        return minimum_Age;
    }

    // final method
    final boolean isEligibleForVoterID(){
        if (age > minimum_Age){
            System.out.println("You Are Eligible  for voter id");
            return true;
        }else{
            System.out.println("You are not eligible for voter id");
            return false;
        }
    }


}
