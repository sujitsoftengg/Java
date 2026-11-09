package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C15_GradeCheck {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade Checker");

        System.out.println("Enter the marks % : ");
        float userMarksPer = input.nextFloat();

        if (userMarksPer >= 90){
            System.out.println("Grade A");
        } else if (userMarksPer >= 75 ) {
            System.out.println("Grade B");
        } else if (userMarksPer >= 60) {
            System.out.println("Grade C");
        } else if (userMarksPer >= 30) {
            System.out.println("Grade D");
        } else if (userMarksPer < 30) {
            System.out.println("Grade F");
        }
    }
}
