package Ch22_MultiThreading.Chalanges.TwoThreadPrint;

public class Test {

    static void main(String[] args) {
        HelloThread thread1 = new HelloThread(1);
        HelloThread thread2 = new HelloThread(2);

        thread1.start();
        thread2.start();

        /*
        try {
            thread1.start();
            thread1.join();

            thread2.start();
            thread2.join();
        }catch (InterruptedException e){
            System.out.println("Message :" + e.getMessage());
        }
         */

    }

}
