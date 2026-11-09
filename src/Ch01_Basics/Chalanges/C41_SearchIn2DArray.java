package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C41_SearchIn2DArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inpurArrayLengthRow = All_Utility.inputNumber(input, "Row");
        int inpurArrayLengthColumn = All_Utility.inputNumber(input, "Column");

        int my2DArray[][] = All_Utility.input2DArray(input, inpurArrayLengthRow, inpurArrayLengthColumn);

        int inputSearchNumber = All_Utility.inputNumber(input, "input search");

        boolean isAvailableNum = All_Utility.SearchElementIn2DArray(my2DArray, inputSearchNumber);

        if (isAvailableNum){
            System.out.println("Yes Number is Available");
        }else {
            System.out.println("No Number is Not Available");
        }

    }
}
