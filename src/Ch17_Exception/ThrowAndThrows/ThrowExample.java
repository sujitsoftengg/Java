package Ch17_Exception.ThrowAndThrows;

public class ThrowExample {
    static int age;

    static boolean checkAge(int userAge){
        if (age < 18){
            throw new IllegalArgumentException(
              "Minor not allowed"
            );
        }
        System.out.println("You are eligible");
        return true;
    }

    static void makeVoterID (int userAge){
        checkAge(userAge);
        if (checkAge(userAge)){
            System.out.println("Your Voter ID Created");
        }
    }


    static void main(String[] args) {
       makeVoterID(13);
    }

}

/*

Multiple time throw exception it's called exception stack

Exception in thread "main" java.lang.IllegalArgumentException: Minor not allowed
	at Ch17_Exception.ThrowAndThrows.ThrowExample.checkAge(ThrowExample.java:9)
	at Ch17_Exception.ThrowAndThrows.ThrowExample.makeVoterID(ThrowExample.java:18)
	at Ch17_Exception.ThrowAndThrows.ThrowExample.main(ThrowExample.java:26)

*/