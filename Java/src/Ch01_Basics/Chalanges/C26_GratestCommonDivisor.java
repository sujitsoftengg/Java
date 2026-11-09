package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C26_GratestCommonDivisor {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInputNum01 = userInput(input);
        int userInputNum02 = userInput(input);

        int greatestDivisorNo = GretestCommonDivisor(userInputNum01, userInputNum02);

        System.out.println("Greatest Divisor Number is " + greatestDivisorNo);

    }

    public static int userInput(Scanner input){
        System.out.println("Enter the Number : ");
        return input.nextInt();
    }

    public static int GretestCommonDivisor(int NumA, int NumB){
        int UserInputValue01 = NumA;
        int UserInputValue02 = NumB;

        int i = 1;
        int highestDivisor = 1;

        while (i <= UserInputValue01){
            if (UserInputValue01 % i == 0 && UserInputValue02 % i == 0){
                highestDivisor = i;
            }
            i++;
        }
        return  highestDivisor;
    }

}
