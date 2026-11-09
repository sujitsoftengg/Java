package Ch03_TernaryAndSwitch.Chalanges;

import java.util.Scanner;

public class MonthBasedOnNumberInput {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Month Name Known By Enter Month Number");
        System.out.print("Enter Number of Month : ");
        int monthNumber = input.nextInt();

        String[] monthName = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        String output = switch (monthNumber){
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> monthName[monthNumber-1];
            default -> "Invalid Input";
        };
        System.out.println(output);


    }
}
