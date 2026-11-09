package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class All_Utility {
    static void main(String[] args) {

    }

    public static int inputNumber(Scanner input, String Msg){
        System.out.print("Enter the " + Msg + " Number : ");
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

    public static int[] arrayReverse(int[] array){
        int[] userArray = array;
        int arrayLength = userArray.length;
        int[] reverseArray = new int[userArray.length];
        int i = 0;
        while (i < arrayLength){
            reverseArray[i] = userArray[arrayLength-1-i];
            i++;
        }

        return reverseArray;
    }

    public static int[] ReverseArray(int[] array){
        int[] userArray = array;
        int userArrayLength = userArray.length;

        int i = 0;
        while (i < userArrayLength/2){
            int temp = userArray[i];
            userArray[i] = userArray[userArrayLength-1-i];
            userArray[userArrayLength-1-i] = temp;
            i++;
        }
        return userArray;
    }

    public static boolean palindromeCheck(int[] array){
        int[] userArray = java.util.Arrays.copyOf(array, array.length);
        int arrayLength = userArray.length;
        int i = 0;
        while (i < arrayLength/2){
            if (userArray[i] != userArray[arrayLength-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static int[] mergeArray(int[] arrayFirst, int[] arraySecond){
        int[] userArrayFirst = java.util.Arrays.copyOf(arrayFirst, arrayFirst.length);
        int[] userArraySecond = java.util.Arrays.copyOf(arraySecond, arraySecond.length);
        int[] mergeArray = new int[userArrayFirst.length + userArraySecond.length];

        // Array Merge Logic
        int i = 0;
        while (i < userArrayFirst.length){
            mergeArray[i] = userArrayFirst[i] ;
            i++;
        }
        int j = 0;
        int startIndex = userArrayFirst.length;
        while (j < userArraySecond.length){
            mergeArray[startIndex+j] = arraySecond[j];
            j++;
        }
        return mergeArray;
    }

    public static int[] arraySorted(int[] Array, String sortingType){
        String method = sortingType;
//        int[] sortedArray = new int[Array.length];

        if (method.equalsIgnoreCase("Increasing")){
            // Increasing Order
            int i = 0;
            while (i < Array.length){
                int j = 0;
                while (j < Array.length -1){
                    int tempValuePrev = Array[j];
                    int tempValueNext = Array[j+1];
                    if (tempValuePrev > tempValueNext){
                        Array[j+1] =tempValuePrev ;
                        Array[j] = tempValueNext;
                    }
                    j++;
                }
                i++;
            }

        } else if (method.equalsIgnoreCase("Decreasing")){
            // Decreasing Order
            int i = 0;
            while (i < Array.length){
                int j = 0;
                while (j < Array.length -1){
                    int tempValuePrev = Array[j];
                    int tempValueNext = Array[j+1];
                    if (tempValuePrev < tempValueNext){
                        Array[j+1] = tempValuePrev ;
                        Array[j] = tempValueNext;
                    }
                    j++;
                }
                i++;
            }

        }else{
            System.out.println("Invalid Input");
        }
        return Array;
    }

    public static boolean SearchElementIn2DArray(int[][] array, int searchNum){
        int[][] user2DArray = array;
        int row = 0;
        while (row < user2DArray.length){
            int column = 0;
            while (column < user2DArray[row].length){
                if (user2DArray[row][column] == searchNum){
                    return true;
                }
            }
            row++;
        }
        return false;
    }

    public static int[][] input2DArray(Scanner input, int row, int column){
        int[][] userArray = new int[row][column];
        int i = 0;
        while (i < userArray.length){
            int j = 0;
            while (j < userArray[i].length){
                System.out.println("Enter the row " + (i+1) + " And column " + (j+1) + " Number : ");
                userArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        return userArray;
    }


    public static int sumOf2DArray(int[][] array){
        int[][] user2DArray = array;
        int totalSum = 0;

        int row = 0;
        while (row < user2DArray.length){
            int column = 0;
            while (column < user2DArray[row].length){
                totalSum += user2DArray[row][column];
                column++;
            }
            row++;
        }
        return totalSum;
    }

    public static int avgOf2DArray(int[][] array, int arrayRow, int arrayColumn){
        int[][] user2DArray = array;
        int totalSum = 0;
        int row = 0;
        while (row < user2DArray.length){
            int column = 0;
            while (column < user2DArray[row].length){
                totalSum += user2DArray[row][column];
                column++;
            }
            row++;
        }
        return totalSum / (arrayRow * arrayColumn);
    }

    public static int[] mergeSortedArray(int[] arrayFirst, int[] arraySecond){
        int[] myArray = new int[arrayFirst.length + arraySecond.length];

        int indextArrayFirst = 0;
        int indexArraySecond = 0;
        int indexMyArrayNew = 0;
        while (indextArrayFirst < arrayFirst.length || indexArraySecond < arraySecond.length){
            if (indexArraySecond == arraySecond.length ||
            (indextArrayFirst < arrayFirst.length &&
            arrayFirst[indextArrayFirst] <= arraySecond[indexArraySecond])){
                myArray[indexMyArrayNew] = arrayFirst[indextArrayFirst];
                indextArrayFirst++;
                indexMyArrayNew++;
            }else{
                myArray[indexMyArrayNew] = arraySecond[indexArraySecond];
                indexMyArrayNew++;
                indexArraySecond++;
            }

        }
        return myArray;
    }

    public static int sumOfDiagonal(int[][] Array){
        int totalSum = 0;

        int leftSum = sumOfLeftDiagonal(Array);
        int rightSum = sumOfRightDiagonal(Array);

        totalSum = leftSum + rightSum;
        if (Array.length % 2 != 0){
            int index = Array.length/2;
            totalSum -= Array[index][index];
        }
        return totalSum;
    }

    public static int sumOfLeftDiagonal(int[][] Array){
        int sumOfLeftDiagonal = 0;
        int i = 0;
        while (i < Array.length){
            sumOfLeftDiagonal += Array[i][i];
            i++;
        }
        return sumOfLeftDiagonal;
    }

    public static int sumOfRightDiagonal(int[][] Array){
        int sumOfRightDiagonal = 0;
        int i = 0;
        while (i < Array.length){
            sumOfRightDiagonal += Array[i][Array.length-1-i];
            i++;
        }
        return sumOfRightDiagonal;
    }



}
