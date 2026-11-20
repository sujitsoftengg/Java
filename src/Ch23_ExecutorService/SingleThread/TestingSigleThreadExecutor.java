package Ch23_ExecutorService.SingleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSigleThreadExecutor {

    static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        TaskPrint task1 = new TaskPrint('*');
        TaskPrint task2 = new TaskPrint('$');
        TaskPrint task3 = new TaskPrint('#');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.shutdown();
    }


}
