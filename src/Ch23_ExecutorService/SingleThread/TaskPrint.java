package Ch23_ExecutorService.SingleThread;

public class TaskPrint implements Runnable {
    private final char character;

    TaskPrint(char character){
        this.character=character;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.printf("%d%c ", i+1, character);
        }

        System.out.printf("\n %s %c Task Complete", Thread.currentThread().getName(), character);

    }
}
