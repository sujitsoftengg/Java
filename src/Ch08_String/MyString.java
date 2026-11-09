package Ch08_String;

public class MyString {
    static void main(String[] args) {

        String myName = "Sujit Kumar Singh";

        System.out.println(myName);
        System.out.println(myName.length());
        System.out.println(myName.charAt(1));
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());
        System.out.println(myName.substring(0, 4));
        System.out.println(myName.substring(12));
        System.out.println(myName.indexOf("Singh"));
        System.out.println(myName.replace("Kumar Singh", "Tomar"));
        System.out.println(myName.contains("Ajit"));

        String userName = "   Sujit Tomar   ";
        System.out.println(userName.trim());
        System.out.println(userName.trim().length());

        String userFirst = "Aman";
        String userSecond = "Shivam";
        String userThird = "Aman";
        String userFourth = new String("Aman");
        System.out.println("--------------------------------------------------");
        System.out.println("userFirst == userThird : " + userFirst == userThird); // false
        System.out.println("userFirst == userSecond : " + userFirst == userSecond); // false
        System.out.println("userFirst == userFourth : " + userFirst == userFourth); // false
        System.out.println("userFirst.equals(userThird) : " + userFirst.equals(userThird)); // true
        System.out.println("userFirst.equals(userFourth) : " + userFirst.equals(userFourth)); // true

        // printf

        String studentName = "Rohit Kumar";
        double marks = 96.56;

        System.out.println("Hello " + studentName + " Your marks is " + marks);
        System.out.printf("Hello %s your marks is %f", studentName, marks);

    /*

    Specifier	    Data Type	                        Output Example / Behavior
     %s / %S	    String / Any object	                Text representation. Capital %S prints text in UPPERCASE.
     %d	            Integer (byte, short, int, long)	Standard base-10 decimal integer.
     %f	            Floating-point (float, double)	    Decimal format (defaults to 6 decimal places).
     %b / %B	    Boolean	Prints true or false.       %B prints TRUE or FALSE.
     %c / %C	    Character	                        Unicode character. %C forces uppercase.
     %x / %X	    Integer	                            Hexadecimal representation.
     %o	            Integer	                            Octal representation.
     %e / %E	    Floating-point	                    Scientific notation.
     %g / %G	    Floating-point	                    Computer decides automatically between %e or %f.
     %n	None	    Platform-specific newline character (preferred over \n).
     %%	None	    Prints a literal percent sign (%).

    */


    /*


Flag	    Meaning	Code                                                                    Example	                            Output
-	        Left-justify text within the defined width (default is right).	                `System.out.printf("	            %-10s
+	        Explicitly include a + or - sign for numbers.	                                 System.out.printf("%+d", 42);	     +42
0	        Zero-pad numerical outputs instead of space-padding.	                         System.out.printf("%05d", 42);	    00042
,	        Add locale-specific thousands group separators.	                                 System.out.printf("%,d", 1000000);	1,000,000
            (space)	Leaves a blank space for positive numbers, - for negative numbers.	     System.out.printf("% d", 42);	      42
(	        Encloses negative numerical values inside parenthesis.	                         System.out.printf("%(d", -42);	    (42)


     */

    }
}
