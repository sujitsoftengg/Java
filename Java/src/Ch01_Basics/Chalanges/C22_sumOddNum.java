package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C22_sumOddNum {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fromNum = inputNumber(input, "From Number");
        int tillNum = inputNumber(input,"Till Number");

        int total = addOddNum(fromNum, tillNum);

        System.out.println("Total sum of odd Num is " + total);

        input.close();

    }

    public static int inputNumber(Scanner input, String comment){
        System.out.print("Enter Number " + comment + " : ");
        return input.nextInt();
    }

    public static boolean isOdd(int num){
        return num % 2 != 0;
    }

    public static int addOddNum(int fromNum, int tillNum){
        int i = fromNum;
        int t = tillNum;
        int total = 0;
        while (i <= tillNum){
            if (isOdd(i)){
               total += i;
            }
            i++;
        }

        return total;
    }

}
