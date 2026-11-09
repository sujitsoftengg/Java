package Ch04_LoopsAndBreakContinue.Chalanges;

import java.util.Locale;
import java.util.Scanner;

public class readInputTillExit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the loop input till exit enter");

        for (int i = 0; i < (i+1); i++) {
            System.out.println("Enter the number : ");
            String userNum = input.nextLine();
            if (userNum.equalsIgnoreCase("exit")){
                break;
            }
        }

    }
}
