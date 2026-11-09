package Ch06_MathAndRandom.Chalanges;

import java.util.Scanner;

public class GuessNumGame {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the guessing number game");
        System.out.print("Enter the own guess number : ");
        int userNum = input.nextInt();
        int randomNum = randomNumberGenerate(1, 6);
        boolean result = guessingNumberGame(randomNum, userNum);
        System.out.printf("User Guessed Number = %d", userNum);
        System.out.println();
        System.out.printf("Machine Guessed Number = %d", randomNum);
        System.out.println();
        System.out.println( result ? "You Win" : "You Lost");
        input.close();
    }

    public static int randomNumberGenerate(int fromNum, int toNum){
        int range = toNum - fromNum;
        double num = Math.floor((Math.random() * range + fromNum));
        return  (int) num;
    };

    public static boolean guessingNumberGame(int randomNum, int userGuessNum){
        if (randomNum == userGuessNum){
            return true;
        }
        return false;
    }



}
