package Ch22_MultiThreading;

public class Singlethread {

    static void main(String[] args) {

        // First Tast
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("First Task Complete");

        // Second Tast
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("Second Task Complete");

        // Third Tast
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("Third Task Complete");


    }


}
