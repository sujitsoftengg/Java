package Ch01_Basics.Lesson;

import java.util.Scanner;

public class R03_UserInput {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entr your Name");
        String userName = input.nextLine();
        System.out.println("Entr your Age");
        int age = input.nextInt();
        System.out.println("Welcome " + userName + " and age is " + age);
    }
}
