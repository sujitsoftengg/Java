package Ch05_Recursion.Chalanges;

import java.util.Scanner;

public class PalindromeCheck {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the String Palindrome Check");
        System.out.print("Enter the string : ");
        String userStr = input.nextLine();

        System.out.println(checkStringPalindrome(userStr));

        input.close();

    }

    public static boolean checkStringPalindrome(String str){

        if (str.length() <= 1) {
            return true;
        }

        int lastPostion = str.length()-1;

        if (str.charAt(0) != str.charAt(lastPostion)){
           return  false;
        }

        String newString = str.substring(1, lastPostion);
        return checkStringPalindrome(newString);
    }

}
