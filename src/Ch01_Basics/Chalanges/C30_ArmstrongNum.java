package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C30_ArmstrongNum {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum = InputNum(input);
        boolean isArmstrong = CheckArmstrongNum(userNum);
        System.out.println("is Armstrong ? " + isArmstrong);
    }

    public static int InputNum(Scanner input){
        System.out.println("Enter Number : ");
        return input.nextInt();
    }

    public static int countDigitFromNumber(int num){
        int userNum = num;
        int digitCount = 0;

        if (num == 0){
            return 1;
        }

        while (userNum > 0){
            int removeDigit = userNum / 10;
            userNum = removeDigit;
            digitCount++;
        }
        return digitCount;
    }

    public static int powNumberCalculation(int actualNum, int powNumber){
        int i = 1;
        int total = 1;
        while (i <= powNumber){
            total *= actualNum;
            i++;
        }
        return total;
    }

    public static boolean CheckArmstrongNum(int num){
        int userNum = num;
        int ArmsTotal = 0;
//        int digitCount = countDigitFromNumber(num);

        while (userNum > 0){
            int lastDigit = userNum % 10;
            int removeDigit = userNum / 10;
            userNum = removeDigit;
            ArmsTotal += powNumberCalculation(lastDigit, countDigitFromNumber(num));
        }

        return num == ArmsTotal;
    }

}
