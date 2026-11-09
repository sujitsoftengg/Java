package Ch01_Basics.Lesson;

public class R08_UnaryOp {
    static void main(String[] args) {
        // Unary Operator

        int val01 = 5;
        int val02 = 5;

        System.out.println(val01); // 05
        System.out.println(val02); // 05

        // Pre Increment and Decrement
        int val03 = ++val01;
        int val04 = --val02;

        System.out.println(val03); // 6
        System.out.println(val04); // 4

        // Post Increment & Decrement
        int val05 = val03++;
        int val06 = val04--;

        System.out.println(val05); // 06
        System.out.println(val06); // 04

        System.out.println(val03); // 07
        System.out.println(val04); // 03



    }
}
