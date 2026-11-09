package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C08_SimpleIntrest {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Simple Interest Calculator");
        System.out.println("Enter the Principal Amount : ");
        double principalAmount = input.nextDouble();
        System.out.println("Rate of Interest : ");
        float annualRateOfInterest = input.nextFloat();
        System.out.println("Enter the Duration in Year : ");
        float durationInYear = input.nextFloat();

        double simpleInt = (principalAmount * annualRateOfInterest * durationInYear) / 100 ;

        System.out.println("Total Simple Interest = " + simpleInt);

    }

}
