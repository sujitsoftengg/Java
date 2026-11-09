package Ch16_PassBy;

public class PassByReference {

    /*

     Pass by reference change the value of actual object because it is connect with reference like object, array
     Objects and Arrays: Method ko object ya array ke reference ki copy milti hai.
     Is reference ke through object ya array ka data change karne par original object/array mein bhi change dikh sakta hai.

     Reassigning the reference: Agar method ke andar reference ko kisi naye object ya array se assign kar dein, to
     caller ka original reference change nahi hota.

    */

    static void change(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20};
        change(numbers);
        System.out.println(numbers[0]); // 100
    }

}
