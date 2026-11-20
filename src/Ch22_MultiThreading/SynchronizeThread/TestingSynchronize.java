package Ch22_MultiThreading.SynchronizeThread;

public class TestingSynchronize {

    static void main() {
        long starttime = System.currentTimeMillis();
        Counter counter = new Counter();

        UpdaterThread task01 = new UpdaterThread(counter);
        UpdaterThread task02 = new UpdaterThread(counter);

//        task01.start();
//        task02.start();

        try {
            task01.start();
            task02.start();

            task01.join();
            task02.join();
        }catch (InterruptedException e){
            System.out.println("Message : " + e.getMessage());
        }

        long endtime = System.currentTimeMillis();


        System.out.printf("Final Counter value is %d and time taken %d millisecond.",
                counter.getCount(),
                (endtime-starttime)
        );

    }


}
