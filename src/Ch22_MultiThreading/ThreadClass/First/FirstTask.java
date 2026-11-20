package Ch22_MultiThreading.ThreadClass.First;

public class FirstTask extends Thread {

    @Override
    public void run() {
        // First Tast
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.printf("\n %s First Task Complete \n", Thread.currentThread().getName());
    }
}
