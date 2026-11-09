package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C37_ArrayIsShorted {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userArrayLength = inputNumber(input, " Array Length ");
        int[] userArray = inputArray(input, userArrayLength);

        if (isArrayShortedIncreasing(userArray)){
            System.out.println("Yes Array is Shorted in Increasing Order");
        } else if (isArrayShortedDecreasing(userArray)) {
            System.out.println("Yes Array is Shorted in Decreasing Order");
        }else {
            System.out.println("Array Not Shorted");
        }
    }
    public static int inputNumber(Scanner input, String Msg){
        System.out.print("Enter the" + Msg + "Number : ");
        return input.nextInt();
    }

    public static int[] inputArray(Scanner input, int ArrayLength){
        int userArraySize = ArrayLength;
        int[] myArray = new int[userArraySize];

        int i = 0;
        while (i < userArraySize){
            System.out.print("Enter the " + (i+1) + " Number : ");
            int userValue = input.nextInt();
            myArray[i] = userValue;
            i++;
        }

        return myArray;
    }

    public static boolean isArrayShortedIncreasing(int[] array){
        int[] userArray = array;
        boolean isShorted = true;

        int i = 1;

        while (i < userArray.length){
            int currentNumber = userArray[i];
            int prevNumber = userArray[i-1];

            if(currentNumber < prevNumber) {
                return false;
            }
            i++;
        }
        return isShorted;
    }

    public static boolean isArrayShortedDecreasing(int[] array){
        int[] userArray = array;
        boolean isShorted = true;

        int i = 1;

        while (i < userArray.length){
            int currentNumber = userArray[i];
            int prevNumber = userArray[i-1];

            if(currentNumber > prevNumber) {
                return false;
            }
            i++;
        }
        return isShorted;
    }

}
