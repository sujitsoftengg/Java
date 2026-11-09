package Ch04_LoopsAndBreakContinue.Chalanges;

import java.util.Scanner;

public class Multiplecation {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the table print");
        System.out.println("Enter table print number :");
        int userTableNum = input.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(userTableNum + " * " + i + " = " + i* userTableNum);
        }


    }
}
