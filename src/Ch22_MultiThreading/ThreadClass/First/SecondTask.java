package Ch22_MultiThreading.ThreadClass.First;

public class SecondTask extends Thread {

    @Override
    public void run() {
        // Second Tast
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.printf("\n %s Second Task Complete \n", Thread.currentThread().getName());
    }
}
