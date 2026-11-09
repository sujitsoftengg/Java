package Ch01_Basics.Chalanges;

import java.util.Scanner;

public class C11_ProductValue {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Two Float Number Price Calculator ");
        System.out.println("Enter the first product price : ");
        double productFirstPrice = (double) input.nextDouble();
        System.out.println("Enter the Second product price : ");
        double productSecondPrice = (double) input.nextDouble();

        double totalPrice = productFirstPrice + productSecondPrice;

        System.out.println("Total Price is " + totalPrice);

    }
}
