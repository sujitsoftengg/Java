package Ch09_StringBuilderStringBuffer.Chalanges;

public class StringBuilderChalange {

    static void main(String[] args) {
        String[] myArray = new String[] {"My", "Self", "Sujit", "Kumar", "Singh"};

        StringBuilder str = new StringBuilder();

        for (String strVal : myArray){
            str.append(strVal).append(" ");
        }

        System.out.println(str.toString());
    }

}
