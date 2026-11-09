package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C31_CheckPalindrome {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum = inputNum(input);
        int oppositNum = OppositNum(userNum);
        boolean isPalindrom = userNum == oppositNum;

        System.out.print("is Palindrom " + isPalindrom);

    }

    public static int inputNum(Scanner input){
        System.out.print("Enter Number : ");
        return input.nextInt();
    }

    public static int OppositNum(int num){
        int actualNum = num;
        int currentValue = actualNum;
        String reverseNum = "";
        int reverseNumber = 0;
        while(currentValue > 0){
            int digit = currentValue % 10;
            reverseNum += digit;  // With String
            reverseNumber = reverseNumber * 10 + digit;  // with integer
            currentValue /= 10;
        }
        System.out.println("Reverse Number is " + reverseNumber);
        return Integer.parseInt(reverseNum);
    }
}
