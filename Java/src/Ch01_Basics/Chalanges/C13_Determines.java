package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C13_Determines {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println( "Determine Positive or Negative Number press 1, \n" +
                            "Determine the Odd or Even Number Press 2 \n" +
                            "Determine the gretest number from three input number press 3");

        System.out.println("Enter the Operation Number : ");
        int userOperationNumber = input.nextInt();

        if (userOperationNumber == 1){
            System.out.println("Welcome to the Determine Positive or Negative Number");

            System.out.println("Enter the Number : ");
            double userInputNum = input.nextDouble();

            if (userInputNum >= 0){
                System.out.println("Number is Positive");
            }else if(userInputNum < 0){
                System.out.println("Number is Negative");
            }else {
                System.out.println("Please Enter Numeric Value");
            }
        } else if(userOperationNumber == 2){
            System.out.println("Welcome to the Determine Odd or Even Number");
            System.out.println("Enter the Number : ");
            double userInputNum = input.nextDouble();

            if (userInputNum % 2 == 0){
                System.out.println("Number is Even");
            } else if(!(userInputNum % 2 == 0)) {
                System.out.println("Number is Odd");
            }else {
                System.out.println("Please Enter Numeric Value");
            }
        } else if (userOperationNumber == 3) {
            System.out.println("Welcome to the Determine greatest Number from three input Number");

            System.out.println("Enter the Number 01 : ");
            double userInputNum1 = input.nextDouble();
            System.out.println("Enter the Number 02 : ");
            double userInputNum2 = input.nextDouble();
            System.out.println("Enter the Number 03 : ");
            double userInputNum3 = input.nextDouble();

            if (userInputNum1 >= userInputNum2 && userInputNum2 >= userInputNum3){
                System.out.println("Greatest Number is " + userInputNum1);
            } else if (userInputNum2 >= userInputNum3 && userInputNum3 >= userInputNum1) {
                System.out.println("Greatest Number is " + userInputNum2);
            } else if (userInputNum3 >= userInputNum1 && userInputNum1 >= userInputNum2) {
                System.out.println("Greatest Number is " + userInputNum3);
            }
        }

    }
}
