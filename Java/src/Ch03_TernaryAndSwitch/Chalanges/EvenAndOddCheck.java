package Ch03_TernaryAndSwitch.Chalanges;

import java.util.Scanner;

public class EvenAndOddCheck {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int value = input.nextInt();

        boolean isEven = value % 2 == 0 ? true : false;
        System.out.println("is Even : " + isEven);
        input.close();
    }
}
