package Ch17_Exception.ThrowAndThrows;

import com.sun.jdi.connect.Connector;

public class ThrowsExample {

    public void printName(String name) throws Exception  {
            if (name.contains("-")){
               throw new Exception("Name cannot contain (-)");
            }
            System.out.println("name : " + name);
    }

        public void checkAge (String age) {
            try {
                int userAge = Integer.parseInt(age);
                if (userAge <= 0){
                    throw new IllegalArgumentException("Age must be positive integer");
                }
                System.out.println("age: " + age);
            }catch (NumberFormatException e){
                System.out.println("Only integer input allowed");
            }catch (IllegalArgumentException ex){
                System.out.println("Age Message : " + ex.getMessage());
            }
        }



    static void main(String[] args) {

        ThrowsExample myObj = new ThrowsExample();
        try {
            myObj.printName("Sujit-Tomar");
        }catch (Exception e){
            System.out.println("Name Message : " + e.getMessage());
        }
        myObj.checkAge("kljj");
        myObj.checkAge("-50");

    }


}
