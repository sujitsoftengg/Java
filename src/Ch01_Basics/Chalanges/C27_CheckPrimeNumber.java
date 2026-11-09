package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C27_CheckPrimeNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInputNumber = userInput(input);
        boolean isPrime = checkPrimeNumber(userInputNumber);
        System.out.println("Is Prime Number ? " + isPrime);
    }

    public static int userInput(Scanner input){
        System.out.println("Enter the Number : ");
        return input.nextInt();
    }

    public static boolean checkPrimeNumber(int num){
        int userNumber = num;
        boolean isPrime = true;
        int i = 2;

        while (i < num){
            if(userNumber % i == 0){
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }

}
