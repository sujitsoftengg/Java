package Ch01_Basics.Lesson;

public class R09_RelationalOp {
    static void main(String[] args) {

        // Relational Operator <, >, <=, >=, ==, !=

        int amanAge = 25;
        int sohanAge = 32;

        boolean status01 = amanAge == sohanAge; // false
        boolean status02 = amanAge < sohanAge; // false
        boolean status03 = amanAge < sohanAge; // false
        boolean status04 = amanAge >= sohanAge; // false
        boolean status05 = amanAge <= sohanAge; // false
        boolean status06 = amanAge == sohanAge; // false

        System.out.println(status01);  // false
        System.out.println(status02); // true
        System.out.println(status03); // true
        System.out.println(status04); // false
        System.out.println(status05); //true
        System.out.println(status06); // false

    }

}
