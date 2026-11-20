package Ch22_MultiThreading.Chalanges.ThreadStatePrint;

public class ThreadStateTest {

    static void main(String[] args) {

        ThreadClass myThread = new ThreadClass();

        try {
            System.out.println(myThread.getState());  // New

            myThread.start();
            System.out.println(myThread.getState()); // Runnable

            myThread.sleep(500);
            System.out.println(myThread.getState()); // Terminated


        }catch (InterruptedException e){
            System.out.println("Message : " + e.getMessage());
        }



    }




}
