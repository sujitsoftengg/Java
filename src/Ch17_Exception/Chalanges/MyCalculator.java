package Ch17_Exception.Chalanges;
import java.util.Scanner;

public class MyCalculator {



    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To the division calculator");

        try {
            System.out.print("Enter First Number : ");
            int numA = input.nextInt();
            System.out.print("Enter Second Number : ");
            int numB = input.nextInt();

            int result = numA / numB;
            System.out.println("Result is " + result);

        }catch (ArithmeticException e){
            System.out.println("Exception : " + e.getMessage());
        }



    }



}
