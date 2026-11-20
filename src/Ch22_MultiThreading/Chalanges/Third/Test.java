package Ch22_MultiThreading.Chalanges.Third;

public class Test {

    static void main(String[] args) throws InterruptedException {
        HelloThread thread1 = new HelloThread(1);
        HelloThread thread2 = new HelloThread(2);
        HelloThread thread3 = new HelloThread(3);

        thread1.run();
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();


//        try {
//            thread1.start();
//            thread1.join();
//
//            thread2.start();
//            thread2.join();
//
//            thread3.start();
//        }catch (InterruptedException e){
//            System.out.println("Message : " + e.getMessage());
//        }


    }

}
