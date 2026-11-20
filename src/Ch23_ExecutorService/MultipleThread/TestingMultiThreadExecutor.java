package Ch23_ExecutorService.MultipleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultiThreadExecutor {

    static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            TaskPrint task = new TaskPrint((char)('A'+i));
            service.submit(task);
        }

//        TaskPrint task1 = new TaskPrint('*');
//        TaskPrint task2 = new TaskPrint('$');
//        TaskPrint task3 = new TaskPrint('#');
//        TaskPrint task4 = new TaskPrint('^');
//        TaskPrint task5 = new TaskPrint('@');

//        service.submit(task1);
//        service.submit(task2);
//        service.submit(task3);
//        service.submit(task4);
//        service.submit(task5);

        service.shutdown(); // normal shutdown
        System.out.println("\n *************************1");

        if (!service.awaitTermination(200, TimeUnit.MILLISECONDS)){
            System.out.println("\n *************************2");
//            service.shutdownNow(); // Immediate shutdown
        }

    }


}
