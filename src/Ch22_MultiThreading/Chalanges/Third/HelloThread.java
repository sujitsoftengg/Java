package Ch22_MultiThreading.Chalanges.Third;

public class HelloThread extends Thread {
    private final int threadNumber;

    public HelloThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

//    @Override
//    public void run() {
//        for (int i = 0; i < 500; i++) {
//            System.out.printf("%d Hello from thread %d \n", i+1, threadNumber);
//        }
//    }


    @Override
    public void run() {
        System.out.printf("%s Thread Starting  %d \n", Thread.currentThread().getName(), threadNumber);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Starting  %d \n", Thread.currentThread().getName(), threadNumber);

    }



}

