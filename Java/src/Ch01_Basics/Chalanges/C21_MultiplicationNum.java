package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C21_MultiplicationNum {
    static void main(String[] args) {
        int inputNumber = inputNum();
        multiplicationTable(inputNumber);


    }

    public static void multiplicationTable(int num){
        int i = 1;
        while (i <= 10){
            String msgPrint = "%d * %d and total is %d".formatted(i, num, i * num);
            System.out.println(msgPrint);
//            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }

    public static int inputNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int num = input.nextInt();
        return num;
    }


}
