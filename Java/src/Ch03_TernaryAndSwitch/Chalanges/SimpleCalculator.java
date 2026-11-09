package Ch03_TernaryAndSwitch.Chalanges;

import java.util.Scanner;

public class SimpleCalculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculator");
        System.out.println("Enter Operation Name : ");
        String operationName = input.next();
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();


        double result = switch (operationName.toLowerCase()){
            case "addition" ->  addition(firstNum, secondNum);
            case "substraction" -> substraction(firstNum, secondNum);
            case "multiplication" -> multiplication(firstNum, secondNum);
            case "division" -> division(firstNum, secondNum);
            default -> msgPrint(operationName);
        };

        System.out.println(result);
        input.close();
    }

    public static int addition (int firstNum, int secondNum){

        return firstNum + secondNum;
    }

    public static int substraction (int firstNum, int secondNum){
        return firstNum - secondNum;
    }

    public static int multiplication (int firstNum, int secondNum){
        return firstNum * secondNum;
    }

    public static double division (int firstNum, int secondNum){
        double firstNumber = firstNum;
        double secondNumber = secondNum;
        double value = firstNumber / secondNumber;
        return value;
    }

    public static int msgPrint(String operationName){
        System.out.println("Please Enter Correct Operation Name" + operationName + " it is not match to our operations");
        return 0;
    }
}
