package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C36_MaxAndMinNumInArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userArrayLength = inputNumber(input, " Array Length ");
        int[] userArray = inputArray(userArrayLength, input);
        int maxNumInArray = maxNumInArray(userArray);
        int minNumInArray = minNumInArray(userArray);
        System.out.println("Max Num is "+ maxNumInArray + " and Min Num is " + minNumInArray);
    }
    public static int inputNumber(Scanner input, String Comment){
        System.out.println("Enter the" + Comment + "Number :" );
        return input.nextInt();
    }

    public static int[] inputArray(int arrayLength, Scanner input){
        int userArrayLength = arrayLength;
        int[] userArray = new int[arrayLength];

        int i = 0;
        while (i < userArrayLength){
            userArray[i] =  inputNumber(input, " " + (i+1) + " ");
            i++;
        }
        return userArray;
    }

    public static int maxNumInArray(int[] Array){
        int[] userArray = Array;
        int max = 0;

        int i = 0;
        while (i < userArray.length){
            if (userArray[i] > max){
                max = userArray[i];
            }
            i++;
        }

        return max;
    }

    public static int minNumInArray(int[] Array){
        int[] userArray = Array;
        int min = userArray[0];

        int i = 0;
        while (i < userArray.length){
            if (userArray[i] < min){
                min = userArray[i];
            }
            i++;
        }
        return min;
    }

}
