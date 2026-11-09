package Ch04_LoopsAndBreakContinue.Chalanges;

import java.util.Scanner;

public class OccurrencesNumInArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurrences number in array");
        System.out.print("Enter Array Length : ");
        int arrayLength = input.nextInt();
        int[] UserInputArray = inputArray(input, arrayLength);
        System.out.println("Enter which number want to search in array for occurrences : ");
        int checkOccurrencesNum = input.nextInt();
        int occureTimes = 0;
        for (int arr : UserInputArray){
            if (arr == checkOccurrencesNum){
                occureTimes += 1;
            }
        }

        System.out.println("Occurrences num times in array :" + occureTimes);

    }

    public static int[] inputArray(Scanner input, int arrayLength){
        int[] myArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            System.out.println("Enter the array num of index " + (i + 1) + ":");
            myArray[i] = input.nextInt();
        }
        return myArray;
    }

}
