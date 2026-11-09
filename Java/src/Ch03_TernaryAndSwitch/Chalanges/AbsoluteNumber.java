package Ch03_TernaryAndSwitch.Chalanges;

import java.util.Scanner;

public class AbsoluteNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the absolute number maker");
        System.out.print("Enter the number : ");
        int userNum = input.nextInt();
        int absoluteNum = userNum < 0 ? (-userNum) : userNum;
        System.out.println("Absolute number is " + absoluteNum);
    }
}
