package Ch01_Basics.Chalanges;

public class C04_TypeCasting {
    static void main() {

        // general way
        int roll = 33;
        float marks = 99.56f;

        System.out.println(roll);           // 33
        System.out.println(marks);          // 99.56

        // implicit type casting
        double myRoll= 33;
        float myNewRoll= 33;
        double myMarks = 99.56;

        System.out.println(myRoll);         // 33.0
        System.out.println(myNewRoll);      // 33.0
        System.out.println(myMarks);        // 99.56

        // explicit
        int myMarksA = (int) 96.56;
        float myMarksB = (float) 98.5655555556d;

        System.out.println(myMarksA);       // 96
        System.out.println(myMarksB);       // 98.56555

    }
}
