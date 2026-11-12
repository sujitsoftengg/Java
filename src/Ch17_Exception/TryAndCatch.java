package Ch17_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {
    static int numA;
    static int numB;

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator");

        try {
            System.out.println("Enter the First Num A : ");
                numA = input.nextInt();
            System.out.println("Enter the First Num B : ");
                numB = input.nextInt();

                int divisionValue = numA / numB;
                System.out.printf("Division Value is %d", divisionValue);

        }catch (InputMismatchException ie){
            // Input mismatch exception handle
            System.out.println("Input mismatch please check again input.");
        }catch (ArithmeticException e) {
            // if user division by zero like exception or other than show error ArithmeticException which is handle in this block
            System.out.printf("Arithmetic Exception %s", e + " Please Try Again Proper");
        }catch (Exception e){
            // any Exception handle with it
            System.out.printf("Exception %s", e);
        }catch (Error e){
            // any error handle with it
            System.out.printf("Error %s", e);
        }catch (Throwable th){
            // this is parents object of exception and error handle in this catch block
            System.out.printf("Throwable %s", th);

            /*
            Throwable, Exception aur Error dono ka parent hai. Pehle hi Exception aur Error catches unke respective objects
            ko handle kar sakte hain. Isliye unke baad Throwable catch tak koi naya Throwable object pahunch hi nahi sakta.

             */

        }


    }

}
