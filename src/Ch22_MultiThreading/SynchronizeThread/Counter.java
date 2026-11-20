package Ch22_MultiThreading.SynchronizeThread;

public class Counter {

    private int count = 0;

    // Synchronized Method
    public synchronized void increment (){
        count++;
    }

    public int getCount (){
        return count;
    }


}
