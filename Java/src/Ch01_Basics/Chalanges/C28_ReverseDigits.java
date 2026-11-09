package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C28_ReverseDigits {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumber = InputNumber(input);
        int reverseNum = ReverseNum(userNumber);
        System.out.println("Reverse Number is " + reverseNum);
    }

    public static int InputNumber(Scanner input){
        System.out.print("Enter the Number : ");
        return input.nextInt();
    }

    public static int ReverseNum(int num){
        int userValue = num;
        int reverseNum = 0;

        while(userValue > 0 ){
            int digit = userValue % 10;
            reverseNum = reverseNum * 10 + digit;
            userValue /= 10;
        }
//
        return reverseNum;
    }

}
