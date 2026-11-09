package Ch04_LoopsAndBreakContinue.Lesson;

import java.util.Scanner;

public class sumAllPositiveNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to positive number addition");

        int total = 0;

        do {
            System.out.println("Enter the num : ");
            int userNum = input.nextInt();
            if (userNum < 0){
                continue;
            }else {
                total += userNum;
                System.out.println("total positive value = " + total);
            }
        }while (true);

    }

}
