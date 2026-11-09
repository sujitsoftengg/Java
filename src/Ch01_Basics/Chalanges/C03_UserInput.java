package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C03_UserInput {
    static void main() {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("Enter the First Number : ");
        int numA = input.nextInt();
        System.out.println("Enter the Second Number : ");
        int numB = input.nextInt();
        int totalNo = numA + numB;
        System.out.println("Total is " + totalNo);

    }
}
