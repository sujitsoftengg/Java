package Ch22_MultiThreading.Runnable;

public class PrintTask implements Runnable {
    private final char character;

    public PrintTask(char character){
        this.character = character;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d%c ", i, character);
        }
        System.out.printf("\n %s %c task complete", Thread.currentThread().getName(), character);
    }
}
