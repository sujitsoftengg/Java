package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C33_ArraySearching {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userArrayLength = inputNumber(input, "Array Length");
        int[] myArray = ArrayReturn(input, userArrayLength);

        int searchNum = inputNumber(input, "Searching");
        boolean isNumContain = ArraySearch(myArray, searchNum);
        System.out.println("is Number Available in Array : " + isNumContain);

    }

    public static int inputNumber(Scanner input, String type){
        System.out.print("Enter the " + type + " number : ");
        return input.nextInt();
    }

    public static int[] ArrayReturn(Scanner input, int arrayLength){
        int[] newArray = new int[arrayLength];
        int i = 0;
        while (i < arrayLength){
            System.out.print("Enter the "+ (i+1) + " number Value :");
            int value = input.nextInt();
            newArray[i] = value;
            i++;
        }
        return newArray;
    }

    public static boolean ArraySearch(int[] IntArray, int userNumber){
        int i = 0;
        while (i < IntArray.length){
            if(IntArray[i] == userNumber){
                return true;
            }
            i++;
        }
        return false;
    }


}
