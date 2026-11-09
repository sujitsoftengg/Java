package Ch04_LoopsAndBreakContinue.Chalanges;

import java.util.Scanner;

public class PasswordChecker {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Password Checker");

        String password;
        do {
            System.out.println("Please Enter the password : ");
            password = input.next();
        }while (!PasswordCheck(password));
        System.out.println("Thank You for Enter valid password");
    }

    public static boolean PasswordCheck(String password){
        return password.length() == 6;
    }

}
