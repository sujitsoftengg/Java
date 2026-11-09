package Ch01_Basics.Lesson;

public class R12_BitwiseOperator {
    static void main(String[] args) {

        int a = 5;
        int b = 6;
        System.out.println(a & b); // 4
        System.out.println(a|b); // 7

        int numA = 4;

        System.out.println(numA >> 1); // devide by 2
        System.out.println(numA << 2); // multiple by 2

        int num1 = 6;
        System.out.println(~num1); // -7

        /*
        & -> Bitwise AND | 1 if both are 1
        | -> Bitwise OR | 1 if eiter bit is 1
        ^ -> Bitwise XOR | 1 if both bits are different
        ~ -> Bitwise NOT | Invert all bits
        << -> Left Shift | Shift bits to left
        >> -> Right Shift | Shift bits to the right.

        (: Sujit Tomar :)

       */

        System.out.println("-----------------------------");

        int myNum = 5;
        while (myNum != 0){
            int bit = myNum & 1;
            System.out.print("Bit" + bit + ",");
            System.out.println();
            myNum= myNum >> 1;
            System.out.print("MyNum" + myNum +",");
            System.out.println();
        }

    }


}
