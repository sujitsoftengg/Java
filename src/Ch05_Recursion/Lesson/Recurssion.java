package Ch05_Recursion.Lesson;

import javax.swing.*;
import java.util.Scanner;

public class Recurssion {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the factorial calculation : ");
        System.out.println("Enter the number for factorial : ");
        int userInputNumber = input.nextInt();

        System.out.println("factorialWithRecursion : " + factorialWithRecursion(userInputNumber));
        System.out.println("factorialWithLoop : " + factorialWithLoop(userInputNumber));

    }

    public static long factorialWithLoop(int userNum){
        long total = 1;
        for (int i = 1; i <= userNum; i++){
            total *= i;
        }
        return total;
    }

    public static long factorialWithRecursion(int userNum){
        if (userNum == 1){
            return 1;
        }
        return userNum * factorialWithRecursion(userNum-1);
    }

}
