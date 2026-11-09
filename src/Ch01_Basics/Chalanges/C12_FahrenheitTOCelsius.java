package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C12_FahrenheitTOCelsius {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fahrenheit to Celsius Converters");
        System.out.println("Enter the Fahrenheit : ");
        float fahrenheit = input.nextFloat();

        float fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Your Celsius Value is " + fahrenheitToCelsius);

    }

}
