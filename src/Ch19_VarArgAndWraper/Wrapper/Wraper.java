package Ch19_VarArgAndWraper.Wrapper;

public class Wraper {

    static void main(String[] args) {

        // Autoboxing in Integer to Object for Multiple method use
        Integer myNum = new Integer(85);
        // Upper method use before java version 9. but due to everytime new object create now use like below.

        Integer firstNum = Integer.valueOf("66"); // in this way you can use also string integer.
        Integer age = 26;
        Integer ramAge = 26;

        System.out.println(age.compareTo(ramAge)); // 0;
        System.out.println(age.compareTo(myNum)); // -1;

        // Auto Unboxing object to integer
         int myAge = age; // unboxing because before age is behave like object but now myAge is Integer



    }

}
