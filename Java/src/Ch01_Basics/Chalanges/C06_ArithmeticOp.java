package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C06_ArithmeticOp {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Airthmetic Operation Calculator");
        System.out.println("You Give two number  i will give you arithmetic operation Result");

        System.out.println("Enter the first Number : ");
        int numA = input.nextInt();
        System.out.println("Enter the econd Number : ");
        int numB = input.nextInt();

        double totalAdditionVal = numA + numB;
        double totalMultipleVal = numA * numB;
        int totalMinusVal = numA-numB;
        double totalDivisionVal = numA / numB;
        int totalModulusVal = numA % numB;

        System.out.println("totalAdditionVal : " + totalAdditionVal);
        System.out.println("totalMultipleVal : " + totalMultipleVal);
        System.out.println("totalMinusVal : " + totalMinusVal);
        System.out.println("totalDivisionVal : " + totalDivisionVal);
        System.out.println("totalModulusVal : " + totalModulusVal);
    }
}
