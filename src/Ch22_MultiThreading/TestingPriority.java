package Ch22_MultiThreading;
import Ch22_MultiThreading.Runnable.PrintTask;

public class TestingPriority {

    static void main() {
        PrintTask tast1 = new PrintTask('*');
        PrintTask tast2 = new PrintTask('#');
        PrintTask tast3 = new PrintTask('$');

        Thread th01 = new Thread(tast1);
        th01.setPriority(Thread.MIN_PRIORITY);  // but not guarantee you can only inform to OS priority
//        th01.setPriority(1);
        Thread th02 = new Thread(tast2);
        th02.setPriority(Thread.NORM_PRIORITY);
//        th02.setPriority(5);
        Thread th03 = new Thread(tast3);
        th03.setPriority(Thread.MAX_PRIORITY);
//        th03.setPriority(10);

        th01.start();
        th02.start();
        th03.start();



    }

}
