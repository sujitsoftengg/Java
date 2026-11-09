package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C32_PaternPrint {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = inputNum(input);
        RightHalfPyramid(userInput);
        LeftHalfPyramid(userInput);
        ReverseLeftHalfPyramid(userInput);
        ReverseRightHalfPyramid(userInput);
    }

    public static int inputNum(Scanner input){
        System.out.print("Enter Number : ");
        return input.nextInt();
    }

    public static void RightHalfPyramid(int num){
        System.out.println("----------------Right Half Pyramid Pattern----------------");
        int userInputRow = num;
        int i = 0;
        while (i <= userInputRow){
            int j = 0;
            while (j < i){
                System.out.print("*");
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public static void LeftHalfPyramid(int num){
        System.out.println("----------------Left Half Pyramid Pattern----------------");
        int userInputRow = num;
        int i = 1;
        while (i <= userInputRow){

            int j = 1;
            while (j <= userInputRow-i){
                System.out.print("  ");
                j++;
            }

            int k = 1;
            while(k <= i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }

    public static void ReverseLeftHalfPyramid(int num){
        System.out.println("----------------Reverse Left Half Pyramid Pattern----------------");
    }

    public static void ReverseRightHalfPyramid(int num){
        System.out.println("----------------Reverse Right Half Pyramid Pattern----------------");
    }

    public static void FullPyramid(int num){
        System.out.println("----------------Full Pyramid Pattern----------------");
    }

}
