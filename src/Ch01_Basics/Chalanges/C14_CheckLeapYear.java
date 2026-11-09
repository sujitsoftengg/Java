package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C14_CheckLeapYear {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year check portal");

        System.out.println("Enter the year : ");
        int userYear = input.nextInt();

        boolean checkLeap = ((userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0));

        if (checkLeap){
            System.out.println("Yes " + userYear + " is a leap year");
        }else {
            System.out.println("No " + userYear + " is not a leap year");

        }
    }
}
