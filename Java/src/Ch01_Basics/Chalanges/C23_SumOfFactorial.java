package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C23_SumOfFactorial {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factorialNum = inputnumber(input);
        int total = factorial(factorialNum);
        System.out.println(total);
    }

    public static int inputnumber(Scanner input){
        System.out.println("Enter the Number :");
        return input.nextInt();
    }

    public static int factorial(int num){

        int total = 1;

        if (num == 0){
           return 1;
        }else if (num > 0){
            int i = 1;
            while (i <= num){
                total *= i;
                i++;
            }
        }
        return total;
    };

}
