package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C43_SumOfDigonal {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayRowLength = All_Utility.inputNumber(input, "array row length");
        int arrayColumnLength = All_Utility.inputNumber(input, "array column length");
        int[][] array = All_Utility.input2DArray(input, arrayRowLength, arrayColumnLength);

        int sumOfDiagonals = All_Utility.sumOfDiagonal(array);
        System.out.print("sumOfDiagonals : " + sumOfDiagonals);
    }
}
