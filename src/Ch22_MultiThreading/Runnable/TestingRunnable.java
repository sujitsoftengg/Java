package Ch22_MultiThreading.Runnable;

public class TestingRunnable {

    static void main() {
        PrintTask tast1 = new PrintTask('*');
        PrintTask tast2 = new PrintTask('#');
        PrintTask tast3 = new PrintTask('$');

        Thread th01 = new Thread(tast1);
        Thread th02 = new Thread(tast2);
        Thread th03 = new Thread(tast3);

        th01.start();
        th02.start();
        th03.start();



    }

}
