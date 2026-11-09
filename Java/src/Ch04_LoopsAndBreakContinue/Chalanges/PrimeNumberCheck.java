package Ch04_LoopsAndBreakContinue.Chalanges;

import java.util.Scanner;

public class PrimeNumberCheck {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Check Prime Number");
        System.out.println("Enter Number : ");
        int userNum = input.nextInt();

        boolean isPrime = true;

        for (int i=2; i<userNum; i++){
            if (userNum % i == 0){
                isPrime = false;
                System.out.println("Number is Not Prime");
                break;
            }
        }
        if (isPrime){
            System.out.println("Number is Prime");
        }


    }
}
