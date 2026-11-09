package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C24_sumOfDigit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumber = inputNumber(input);

        int totalSumOfDigit = sumOfDigit(userNumber);
        System.out.println(totalSumOfDigit);

    }

    public static int inputNumber (Scanner input){
        System.out.print("Enter the Number : ");
        return input.nextInt();
    }

    public static int sumOfDigit(int num){
        int userNum = num;
        int sum = 0;

        while (userNum > 0){
            int digit = userNum % 10;
            System.out.println("digit = " + digit);

            sum += digit;
            userNum = userNum / 10;
            System.out.println("userNum= " + userNum);

        }

        return sum;

    }
}
