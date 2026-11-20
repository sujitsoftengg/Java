package Ch22_MultiThreading.ThreadClass.Second;

public class ThreadTask extends Thread {
    private final char character;

    public ThreadTask (char character){
        this.character = character;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d%c ", i, character);
        }
        System.out.println("\n");
    }
}
