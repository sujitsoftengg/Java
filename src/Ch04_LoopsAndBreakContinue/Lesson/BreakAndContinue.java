package Ch04_LoopsAndBreakContinue.Lesson;

public class BreakAndContinue {
    static void main(String[] args) {

        // Break
        for (int i = 0; i < 500; i++){
            if (i == 5){
                break; // exit
            }
            System.out.println("I reach at lower loop" + i);
        }
        System.out.println("Out of Loop");

        // Continue
        for (int i= 0; i < 10; i++){
            if (i == 2){
                continue; // Skip
            }
            System.out.println("I reach at lower loop" + i);
        }
        System.out.println("Out of Loop");

    }
}
