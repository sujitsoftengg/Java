package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C25_LCMOfTwoNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int UserNum1 = inputNum(input);
        int UserNum2 = inputNum(input);

        int total = LCMofTwoNumMethod01(UserNum1, UserNum2);
        System.out.println("LCM is " + total);

    }

    public static int inputNum(Scanner input){
        System.out.print("Enter the Number : ");
        return input.nextInt();
    }

    public static int LCMofTwoNumMethod01(int numA, int numB){
        int valueFirst = numA;
        int valueSecond = numB;

        int i = 1;
        int updatedValue = valueFirst * i;

        while (true){
            if (updatedValue % valueSecond == 0){
                return updatedValue;
            }
            i++;
            updatedValue = valueFirst * i;
        }


    }

}
