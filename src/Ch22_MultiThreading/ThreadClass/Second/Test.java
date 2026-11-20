package Ch22_MultiThreading.ThreadClass.Second;

public class Test {

    static void main(String[] args) {
        ThreadTask task01 = new ThreadTask('*');
        ThreadTask task02 = new ThreadTask('#');
        ThreadTask task03 = new ThreadTask('$');

        System.out.println(task01.getState());  // New State


//        try {
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//            System.out.println(e.getMessage());
//        }


        task01.start();
        task02.start();
        task03.start();

        System.out.println(task01.getState()); // Runnable State

    }
}
