package Ch04_LoopsAndBreakContinue.Chalanges;

import java.util.Scanner;

public class NumberGuessingGame {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Number Game");
        int userNum;

        do {
            userNum = input.nextInt();

        }while (!guessingNumber(userNum, gameNumber()));

    }

    public static int gameNumber(){
        return 1;
    }

    public static boolean guessingNumber(int userNumber, int gameAutoNumber){
            if (userNumber == gameAutoNumber){
                System.out.println("You Win");
                return true;
            }else {
                System.out.println("User Number is " + userNumber);
                System.out.println("Game Auto Number Generate is " + gameAutoNumber);
                return false;
            }
    }

}
