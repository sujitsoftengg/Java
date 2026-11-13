package Ch17_Exception;

public class CheckAndUnchek_Exception {


    static void main(String[] args) {
        // Build In Exception have two types

        /*
         1. Checked Exceptions
            In exceptions ko Java compiler check karta hai. Inhe handle karna (try-catch) ya declare karna (throws) zaroori hota hai.
            Exception	Kab aa sakta hai?
            IOException	Input/output operation fail hone par
            FileNotFoundException	File nahi milne par
            EOFException	Input stream mein unexpected end aane par
            SQLException	Database operation mein problem aane par
            ClassNotFoundException	Required class nahi milne par
            InterruptedException	Thread interrupt hone par
            ParseException	Text ko required format mein parse na kar paane par
            NoSuchMethodException	Reflection se required method nahi milne par
            NoSuchFieldException	Reflection se required field nahi milne par
            InstantiationException	Reflection se class ka instance create nahi kar paane par


        2.  Unchecked Exceptions
            In exceptions ko Java compiler handle ya declare karne ke liye force nahi karta. Ye aam taur par programming mistakes ya invalid operations ki wajah se aa sakte hain.
            Exception	Kab aa sakta hai?
            ArithmeticException	Integer ko zero se divide karne par
            NullPointerException	null reference se object access karne par
            ArrayIndexOutOfBoundsException	Array ki invalid index access karne par
            StringIndexOutOfBoundsException	String ki invalid index access karne par
            NumberFormatException	Invalid text ko number mein convert karne par
            InputMismatchException	Scanner ko expected type ka input na milne par
            IllegalArgumentException	Method ko invalid argument dene par
            IllegalStateException	Object ki current state mein operation invalid hone par
            ClassCastException	Invalid type casting karne par
            NegativeArraySizeException	Negative size ka array create karne par
            UnsupportedOperationException	Unsupported operation perform karne par
            IndexOutOfBoundsException	Collection ya sequence ki invalid index access karne par


         */




        /*
            * ================= JAVA EXCEPTION HIERARCHY =================
            *
            * Object
            *   |
            *   └── Throwable
            *         |
            *         ├── Error (Unchecked)
            *         |     |
            *         |     ├── OutOfMemoryError
            *         |     ├── StackOverflowError
            *         |     ├── VirtualMachineError
            *         |     └── AssertionError
            *         |
            *         └── Exception
            *               |
            *               ├── RuntimeException (Unchecked)
            *               |      |
            *               |      ├── ArithmeticException
            *               |      ├── NullPointerException
            *               |      ├── NumberFormatException
            *               |      ├── IllegalArgumentException
            *               |      └── InputMismatchException
            *               |
            *               └── Checked Exceptions
            *                      |
            *                      ├── IOException
            *                      ├── FileNotFoundException
            *                      ├── SQLException
            *                      ├── ClassNotFoundException
            *                      └── InterruptedException
            *
            * =============================================================
            *
            * IMPORTANT:
            *
            * 1. Throwable is the parent of Error and Exception.
            * 2. Error is Unchecked.
            * 3. RuntimeException is Unchecked.
            * 4. Checked Exceptions must be caught or declared using throws.
            * 5. Unchecked Exceptions do not require compulsory handling.
            *
          */

    }


}
