package Ch03_TernaryAndSwitch.Chalanges;

import java.util.Scanner;

public class MinimumNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int userNumFirst = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int userNumSecond = input.nextByte();

        int minValue = userNumFirst < userNumSecond ? userNumFirst : userNumSecond;
        System.out.println("Min Value is : " + minValue);

        input.close();
    }
}
