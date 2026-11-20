package Ch23_ExecutorService.MultipleThread;

public class TaskPrint implements Runnable {
    private final char character;

    TaskPrint(char character){
        this.character=character;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ", i+1, character);
        }

        System.out.printf("\n %s %c Task Complete\n", Thread.currentThread().getName(), character);

    }
}
