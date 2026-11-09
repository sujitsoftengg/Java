package Ch06_MathAndRandom.Chalanges;

public class MathRandom {
    static void main(String[] args) {
        numberAutoGenerte(10, 20);
        System.out.println("----------------------------------------------------------------");

    }




    public static void numberAutoGenerte(int fromNum, int toNum){
        int range = toNum - fromNum + 1;
        for (int i = 0; i <100 ; i++) {
            System.out.print((Math.floor(Math.random()* range + fromNum)) + ",");
        }
    }
}
