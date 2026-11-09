package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C39_ReverseArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ArrayLength = All_Utility.inputNumber(input, " array length ");
        int[] myArrayFirst = All_Utility.inputArray(input, ArrayLength);
        int[] myArraySecond = All_Utility.inputArray(input, ArrayLength);

        int[] reverseArray = All_Utility.ReverseArray(myArrayFirst);
        int[] arrayReverse = All_Utility.arrayReverse(myArraySecond);

        int[] mergeArray = All_Utility.mergeArray(reverseArray, arrayReverse);
        int[] mergeSortedArray = All_Utility.arraySorted(mergeArray, "Increasing");

        int i = 0;
        while (i < mergeSortedArray.length){
            int value = mergeSortedArray[i];
            System.out.print(value + ",");
            i++;
        }



//        int i = 0;
//        while (i < reverseArray.length){
//            int value = reverseArray[i];
//            System.out.print(value + ",");
//            i++;
//        }
//
//        System.out.println();
//
//        int j = 0;
//        while (j < arrayReverse.length){
//            int value = arrayReverse[j];
//            System.out.print(value + ",");
//            j++;
//        }

    }

}
