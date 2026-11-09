package Ch01_Basics.Lesson;

import java.util.Scanner;

public class R07_ShorthandOp {
    static void main(String[] args) {
        // shorthand assignment operator (+=, -=, *=, /=, %=)
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator Operation");
        System.out.println("Enter the Operation Name Like Addition, Multiply");
        System.out.println("Enter the Operation Name : ");
        String Operation = input.nextLine();

        if(Operation.equalsIgnoreCase("Addition")||Operation.equalsIgnoreCase("ADD")|| Operation.equals("+")){
            System.out.println("OK! You Want to ADD Number");
            System.out.println("You Are Under Addition Calculator");
            System.out.println("How Much Times You Want to Add Number?: ");
            int times = input.nextInt();

            int totalValue = 0;

            for (int i = 0; i < times; i++) {
                System.out.println("Please Enter the " + ((int) i + 1) + " Position Value: ");
                int newValue = input.nextInt();
                totalValue += newValue;
            }

            System.out.println("Your Total Value of Numbers is " + totalValue);

        } else if (Operation.equalsIgnoreCase("Multiply")||Operation.equalsIgnoreCase("Multiplication")|| Operation.equals("*")) {
            System.out.println("OK! You Want to Multiplication Number");
            System.out.println("You Are Under Multiplication Calculator");
            System.out.println("How Much Times You Want to Multiplication Number?: ");
            int times = input.nextInt();

            int totalValue = 1;

            for (int i = 0; i < times; i++) {
                System.out.println("Please Enter the " + ((int) i + 1) + " Position Value: ");
                int newValue = input.nextInt();
                totalValue *= newValue;
            }

            System.out.println("Your Total Multiplication Value of Numbers is " + totalValue);

        }
    }
}
