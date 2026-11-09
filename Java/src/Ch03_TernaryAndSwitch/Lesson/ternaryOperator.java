package Ch03_TernaryAndSwitch.Lesson;

import java.util.Scanner;

public class ternaryOperator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi i am voter eligibility checker bot");
        System.out.print("Plese Enter own age : ");
        int userAge = input.nextInt();
        System.out.println(userAge > 18 ? "You are eligible" : "You are not eligible");
        input.close();

    }
}
