package Ch22_MultiThreading.ThreadClass.First;

public class ThirdTask extends Thread {

    @Override
    public void run() {
        // Third Tast
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.printf("\n %s Third Task Complete \n", Thread.currentThread().getName());
    }
}
