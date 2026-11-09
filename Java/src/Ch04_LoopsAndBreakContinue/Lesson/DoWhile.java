package Ch04_LoopsAndBreakContinue.Lesson;

import java.util.Scanner;

public class DoWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Age Checker");

        ageInputUsingDoWhileLoop(input);
//        ageInputUsingWhileLoop(input);

    }

    public static void ageInputUsingWhileLoop(Scanner input){
        System.out.println("Enter the Age : ");
        int age = input.nextInt();
        while (age < 0 || age > 150){
            System.out.println("Enter the Age : ");
            age = input.nextInt();
        }
        System.out.println("Your age is : " + age);
    }

    public static void ageInputUsingDoWhileLoop(Scanner input){
        int age;
        do {
            System.out.println("Enter the Age : ");
            age = input.nextInt();
        }while (age < 0 || age > 150);
        System.out.println("Your age is : " + age);
    }



}
