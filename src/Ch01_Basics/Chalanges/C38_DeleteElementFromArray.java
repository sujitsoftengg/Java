package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C38_DeleteElementFromArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userArrayLength = inputNumber(input, " Array Length ");
        int[] userArray =  inputArray(input, userArrayLength);
        int userWantDeleteNumber = inputNumber(input, " want to delete ");
        int[] newArrayAfterDelete = deleteElementFromArray(userArray, userWantDeleteNumber);

        int i =0;
        while (i < newArrayAfterDelete.length){
            System.out.print(newArrayAfterDelete[i] + " ");
            i++;
        }

    }

    public static int inputNumber(Scanner input, String Msg){
        System.out.print("Enter the" + Msg + "Number : ");
        return input.nextInt();
    }

    public static int[] inputArray(Scanner input, int ArrayLength){
        int userArrayLength = ArrayLength;
        int[] myArray = new int[userArrayLength];
        int i = 0;
        while (i < userArrayLength){
            myArray[i] = inputNumber(input, " " +i+ " ");
            i++;
        }
        return myArray;
    }

    public static int elementOccurrencesInArray(int[] Array, int matchNum){
        int[] userArray = Array;
        int userMatchNumber = matchNum;
        int numOccurrences = 0;
        int i = 0;
        while (i < userArray.length){
            if (userArray[i] == userMatchNumber){
                numOccurrences += 1;
            }
            i++;
        }return  numOccurrences;
    }

    public static int[] deleteElementFromArray(int[] myArray, int deleteNumber){
        int[] userArray = myArray;
        int userWantToDeledeNumber = deleteNumber;

        int deleteNumOccurrences = elementOccurrencesInArray(userArray, userWantToDeledeNumber);
        int[] newArray = new int[userArray.length - deleteNumOccurrences];

        int i = 0;
        int j = 0;
        while (i < userArray.length){
            if (userArray[i] != userWantToDeledeNumber){
                newArray[j] = userArray[i];
                j++;
            }
            i++;
        }
        return newArray;
    }

}
