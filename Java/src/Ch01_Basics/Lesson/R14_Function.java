package Ch01_Basics.Lesson;

import java.util.Scanner;

public class R14_Function {
    static void main(String[] args) {
        greeting();
        int firstNum = (int) input();
        int secondNum = (int) input();

        int sum = sumTwoNumber(firstNum, secondNum);

//        double sum = firstNum + secondNum;
        System.out.print("Total Value of Sum is " + sum);
    }


    public static void greeting() {
        System.out.println("Welcome to my Website");
    }

    public static double input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        double userNumber = input.nextDouble();
        return userNumber;
    }

    public static int sumTwoNumber(int firstNumber, int secontNumber){
        int totalSum = firstNumber + secontNumber;
        return totalSum;
    }

}
