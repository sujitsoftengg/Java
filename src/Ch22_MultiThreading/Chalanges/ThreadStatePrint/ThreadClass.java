package Ch22_MultiThreading.Chalanges.ThreadStatePrint;

public class ThreadClass extends Thread {

    public ThreadClass(){

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Thread Printing No of %d \n", i+1);
        }
    }

    /*

        @Override
        public void run() {
           try {
               Thread.sleep(5000);
               getState());
           }catch (InterruptedException e){
               throw new RuntimeException();
           }
        }

     */

}
