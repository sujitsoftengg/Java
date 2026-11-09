package Ch01_Basics.Lesson;

public class R04_TypeConversion {
    static void main(String[] args) {
        // Implicit (in this scenario container is big and value is small)
        long myAge = 25;
        float myRank = 2;
        double marks = 92.56f;
        // Explicit (In this scenario container is small but value type is big but forcely contend)
        float pi = (float) 3.14;
        long myPI = (long) 3.14;
        int newPI = (int) 3.14;

        System.out.println(myAge);
        System.out.println(myRank);
        System.out.println(marks);

        System.out.println(pi);
        System.out.println(myPI);
        System.out.println(newPI);

    }

}