package Ch15_Polymorphism.Final;

// Final Class not inherit in another class
final public class Person {


    static void main(String[] args) {
        VoterCard SujitTomar = new VoterCard("Sujit Tomar", 26);
        VoterCard Rahul = new VoterCard("Rahul", 12);

        SujitTomar.isEligibleForVoterID();
        Rahul.isEligibleForVoterID();

    }

}
