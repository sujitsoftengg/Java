package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C10_PerimeterArea {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Rectangle Perimeter Calculator");
        System.out.println("Enter the length of Rectangle : ");
        float length = input.nextFloat();
        System.out.println("Enter the Breadth of Rectangle : ");
        float breadth = input.nextFloat();

        // then
        float perimeter = 2 * (length * breadth);
        System.out.println("Total Perimeter = " + perimeter);

    }
}
