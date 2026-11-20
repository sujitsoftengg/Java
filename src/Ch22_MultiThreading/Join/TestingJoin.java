package Ch22_MultiThreading.Join;

import Ch22_MultiThreading.Runnable.PrintTask;

public class TestingJoin {

    static void main() throws InterruptedException {
        PrintTask tast1 = new PrintTask('*');
        PrintTask tast2 = new PrintTask('#');
        PrintTask tast3 = new PrintTask('$');

        System.out.println("First Task Started");
        Thread th01 = new Thread(tast1);

        System.out.println("Second Task Started");
        Thread th02 = new Thread(tast2);
        // if you use Join then all work stoped till join used method not complete
        th02.join();
//        th02.join(545);
//        th02.join(3626, 12);

        System.out.println("Third Task Started");
        Thread th03 = new Thread(tast3);



        th01.start();
        th02.start();
        th03.start();



    }

}
