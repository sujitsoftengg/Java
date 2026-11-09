package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C05_swap {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Value :");
        int numA = input.nextInt();
        System.out.println("Enter Second Value :");
        input.nextLine();
        int numB = input.nextInt();

        int valA = numA;
        int valB = numB;

        numA = valB;
        numB = valA;

        System.out.println("Num A = " + numA);
        System.out.println("Num B = " + numB);

    }
}
