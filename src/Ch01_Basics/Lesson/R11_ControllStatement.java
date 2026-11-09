package Ch01_Basics.Lesson;

import java.util.Scanner;

public class R11_ControllStatement {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Voting Eligible Test");

        System.out.println("Enter the Age in Years : ");
        float age = input.nextInt();

        if (age < 18){
            System.out.println("You are not eligible for vote because you are child");
        }else if (age <= 60 && age >= 18){
            System.out.println("You are young so you are eligible for vote");
        } else if (age > 60) {
            System.out.println("You are old too old so you are not eligible");
        }else {
            System.out.println("Please Enter Correct Value");
        }

    }

}
