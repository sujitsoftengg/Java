package Ch22_MultiThreading.ThreadClass.First;

public class TestMultiThread {

    static void main() {

        long taskStartTime = System.currentTimeMillis();

        FirstTask task1 = new FirstTask();
        SecondTask task2 = new SecondTask();
        ThirdTask task3 = new ThirdTask();

        System.out.println("Start First Thread");
        task1.start();
        System.out.println("Start Second Thread");
        task2.start();
        System.out.println("Start Third Thread");
        task3.start();

        long taskEndTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken is %d",
                Thread.currentThread().getName(),
                taskEndTime - taskStartTime);


    }

}
