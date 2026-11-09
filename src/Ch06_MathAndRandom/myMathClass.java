package Ch06_MathAndRandom;

public class myMathClass {
    static void main(String[] args) {

        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.min(10, 20)); // 10
        System.out.println(Math.abs(-7.5));   // 7.5
        System.out.println(Math.pow(2, 10));  // 1024.0
        System.out.println(Math.sqrt(144));   // 12.0
        System.out.println(Math.ceil(4.1));   // 5
        System.out.println(Math.floor(4.9));  // 4
        System.out.println(Math.round(4.5));  // 5

        // Constant
        System.out.println(Math.PI);          // 3.141592653589793


        for (int i = 0; i < 10; i++) {
            int randomNum = (int) Math.round(Math.random() * 100);
            System.out.println(randomNum);
        }

    }
}
