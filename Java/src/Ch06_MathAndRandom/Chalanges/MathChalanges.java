package Ch06_MathAndRandom.Chalanges;

public class MathChalanges {
    static void main(String[] args) {
        int radiusFirst = 10;
        System.out.println(circleCircumferences(radiusFirst));
        System.out.println(circleArea(radiusFirst));

    }

    public static double circleCircumferences(int radius){
        double Circumferences = 2*(Math.PI * radius);
        return  Circumferences;
    }

    public static double circleArea(int radius){
        double CircleArea = Math.PI*Math.pow(radius, 2);
        return CircleArea;
    }

}
