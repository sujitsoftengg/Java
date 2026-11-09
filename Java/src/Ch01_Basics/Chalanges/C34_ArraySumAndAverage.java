package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C34_ArraySumAndAverage {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayLength = inputNum(input, "array length");
        int[] myNewArray = inputArrayValue(arrayLength, input);

        int totalSum_of_ArrayElements = sumOfArrayElement(myNewArray) ;
        System.out.println("Total sum of Array = " + totalSum_of_ArrayElements);

        int averageOfArrayElement = totalSum_of_ArrayElements / arrayLength;
        System.out.println("Average of Array Elements = " + averageOfArrayElement);

    }

    public static int inputNum(Scanner input, String comment){
        System.out.print("Enter the " + comment + " number : ");
        return input.nextInt();
    }

    public static int[] inputArrayValue(int ArrayLength, Scanner input){
        int arrayLength = ArrayLength;
        int[] myArray = new int [arrayLength];
        int i = 0;
        while (i < arrayLength){
            System.out.print("Enter the "+ (i+1) +" number :");
            int inputNumber = input.nextInt();
            myArray[i] = inputNumber;
            i++;
        }
        return myArray;
    }

    public static int sumOfArrayElement(int[] myArray){
        int[] newArray = myArray;
        int totalofArrayElement =0;
        int i = 0;
        while (i < newArray.length){
            totalofArrayElement += newArray[i] ;
            i++;
        }
        return totalofArrayElement;
    }

}
