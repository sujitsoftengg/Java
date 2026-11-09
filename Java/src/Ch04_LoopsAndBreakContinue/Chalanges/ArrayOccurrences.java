package Ch04_LoopsAndBreakContinue.Chalanges;

import java.sql.Array;
import java.util.Scanner;

public class ArrayOccurrences {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the greatest number fine from Array");
        System.out.print("Enter the Array Length : ");
        int arrayLength = input.nextInt();
        int[] myArray = inputArray(input, arrayLength);
        System.out.println(greatestNumInArray(myArray));
//       int[] myArray = new int[] {52, 50, 78, 21, 12, 52};

    }

    public static int[] inputArray (Scanner input, int arrayLength){
        int[] myArray = new int[arrayLength];
        for (int i=0; i < arrayLength; i++){
            System.out.print("Enter the " + i +" number value : ");
            myArray[i] = input.nextInt();
        }
        return myArray;
    }

    public static int greatestNumInArray(int[] Array){
        int maxNum = 0;
        for (int arr : Array){
            if (arr > maxNum){
                maxNum = arr;
            }
        }
        System.out.println("Max num is " + maxNum);
        return maxNum;
    }

}
