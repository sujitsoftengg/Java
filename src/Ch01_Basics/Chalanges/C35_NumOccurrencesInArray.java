package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C35_NumOccurrencesInArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userArrayLength = inputNumber(input, " Array Length ");
        int[] userArray = inputArray(userArrayLength, input);
        int userWantsSearchNumber = inputNumber(input, " your searching ");
        int numOccurrences = NumOccurrences(userArray, userWantsSearchNumber);

    }
    public static int inputNumber(Scanner input, String Comment){
        System.out.print("Enter the" + Comment + "Number : ");
        return input.nextInt();
    }

    public static int[] inputArray(int arrayLength, Scanner input){
        int userArrayLength = arrayLength;
        int[] userArray = new int [arrayLength];
        int i = 0;
        while (i < arrayLength){
            userArray[i] = inputNumber(input, " " + (i+1) +" ");
            i++;
        }
        return userArray;
    }

    public static int NumOccurrences(int[] Array, int check_number){
        int[] userArray = Array;
        int userNumber = check_number;
        int howManyTimes = 0;
        int i = 0;
        while(i < userArray.length){
            if (userArray[i] == userNumber){
                howManyTimes++;
            }
            i++;
        }

        if (howManyTimes != 0){
            System.out.print("Yes Number is Matched in this Array " + howManyTimes + " Times");
        }else {
            System.out.print("No Number is Not Matched in this Array");
        }
        return howManyTimes;
    }
}
