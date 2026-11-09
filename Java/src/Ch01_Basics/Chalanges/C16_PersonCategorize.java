package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C16_PersonCategorize {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Person Categorize Portal");

        System.out.println("Enter the age : ");
        float userInputAge = input.nextFloat();

        if (userInputAge >= 60){
            System.out.println("You are Senior");
        } else if (userInputAge >= 20){
            System.out.println("You are Adult");
        } else if (userInputAge >= 13 && userInputAge < 20) {
            System.out.println("You are Teen");
        } else if (userInputAge < 13) {
            System.out.println("You are Child");
        }


    }

}
