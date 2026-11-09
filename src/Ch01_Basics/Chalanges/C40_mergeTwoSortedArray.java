package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C40_mergeTwoSortedArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fristArrayLength = All_Utility.inputNumber(input, "First Array Lenth");
        int[] firstArray = All_Utility.inputArrayValue(fristArrayLength, input);

        int secondArrayLength = All_Utility.inputNumber(input, "Second Array Lenth");
        int[] secondArray = All_Utility.inputArrayValue(secondArrayLength, input);

        int[] mergeTwoSortedArray = All_Utility.mergeSortedArray(firstArray, secondArray);

        int i = 0;
        while (i < mergeTwoSortedArray.length){
            System.out.print(mergeTwoSortedArray[i] + " ");
            i++;
        }
    }
}
