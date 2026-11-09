package Ch16_PassBy;

public class PassByValue {

    /*
    Pass by value not change the actual value of primitive data type variable like int, double, float etc

    Primitive data types (int, double, float, etc.): Method ko variable ki value ki copy milti hai. Copy ko change
    karne se original variable change nahi hota.

    */


    static void change(int num) {
        num = 100;
    }

    public static void main(String[] args) {
        int value = 10;
        change(value);
        System.out.println(value); // 10
    }



}
