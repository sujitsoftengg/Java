package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C09_CompoundInt {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the compound Interest");

        System.out.println("Enter the principal Amount : ");
        double principalAmount = input.nextDouble();
        System.out.println("Enter the Annual Rate of Interest : ");
        float annualRateOfInterest = input.nextFloat();
        System.out.println("Enter the Duration (in Year) : ");
        float durationInYear = input.nextFloat();

        double compoundInterest = principalAmount * Math.pow ((1 + annualRateOfInterest / 100), durationInYear);

        System.out.println("Compound Interest is " + compoundInterest);

    }

}
