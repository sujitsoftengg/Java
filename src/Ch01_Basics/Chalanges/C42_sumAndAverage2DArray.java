package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C42_sumAndAverage2DArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inpurArrayLengthRow = All_Utility.inputNumber(input, "Row");
        int inpurArrayLengthColumn = All_Utility.inputNumber(input, "Column");

        int my2DArray[][] = All_Utility.input2DArray(input, inpurArrayLengthRow, inpurArrayLengthColumn);

        int sumOf2DArray = All_Utility.sumOf2DArray(my2DArray);
        int avgOf2DArray = All_Utility.avgOf2DArray(my2DArray, inpurArrayLengthRow, inpurArrayLengthColumn);

        System.out.println("Total :" + sumOf2DArray);
        System.out.println("Average :" + avgOf2DArray);

    }
}
