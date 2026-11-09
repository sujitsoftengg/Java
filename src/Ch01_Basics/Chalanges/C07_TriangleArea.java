package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C07_TriangleArea {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Triangle Area Calculator");

        System.out.println("Enter the Triangle Height : ");
        double hieght = input.nextDouble();
        System.out.println("Enter the Triangle Breadth : ");
        double breadth = input.nextDouble();

        double totalArea = (breadth * hieght) / 2;
        System.out.println("Total Area is " + totalArea);

    }
}
