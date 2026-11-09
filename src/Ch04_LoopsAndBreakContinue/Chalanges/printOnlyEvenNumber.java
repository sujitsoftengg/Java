package Ch04_LoopsAndBreakContinue.Chalanges;

import java.util.Scanner;

public class printOnlyEvenNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Only Even Number Print");

        do {
            System.out.print("Enter number : ");
            int userNum = input.nextInt();
            if (userNum % 2 != 0){
                continue;
            }
            System.out.println("Your even number is " + userNum);
        }while (true);

    }
}
