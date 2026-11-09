package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C29_FibonacciSeries {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = userInput(input);
        fibonacciSeries(userInput);
    }

    public static int userInput(Scanner input){
        System.out.println("Enter Number : ");
        return input.nextInt();
    }

    public static void fibonacciSeries(int num){
        int userNum = num;
        System.out.println("While Loop");
        int firstTerm = 0;
        int secondTerm = 1;
        int count = 0;

        while (count <= userNum){
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            count++;
        }

        System.out.println("For Loop");


        int prevNum = 0;
        int currentNum = 1;

        for (int i=0; i<= userNum; i++){
            System.out.print(prevNum + " ");
            int nextNum = prevNum + currentNum;
            prevNum = currentNum;
            currentNum = nextNum;
        }



    }

}
