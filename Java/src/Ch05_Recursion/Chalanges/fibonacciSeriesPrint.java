package Ch05_Recursion.Chalanges;

import java.util.Scanner;

public class fibonacciSeriesPrint {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the fibonacci Series Print");
        System.out.print("Enter the number for fibonacci print : ");
        int userInputNum = input.nextInt();

        for (int i = 0; i < userInputNum; i++){
            System.out.print(fibonnaci(i) + " ");;
        }

    }

    public static int fibonnaci(int num){
        int userNum = num;
        if (userNum <= 1){
            return userNum;
        }
        return fibonnaci(userNum - 1) + fibonnaci(userNum-2);
    }

}
