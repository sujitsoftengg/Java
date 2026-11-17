package Ch20_CollectionsLibrary.Chalanges;

import java.util.*;

public class CollectionsChalanges {

    public static String ConcatString(String ...texts){
        String newStr = "";
        for (String str : texts){
            newStr += str + ", ";
        }
        return newStr;
    }

    public static<E> int checkFrequency(Collection<E> collections, E frequncyValue){
        return Collections.frequency(collections, frequncyValue);
    }



    static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Sujit");
        nameList.add("Amit");
        nameList.add("Rohit");
        nameList.add("Vivek");

        for (String str : nameList){
            System.out.print(str + ", ");
        }
        System.out.println();

        // Chalanges 01
        System.out.println("Manual Concat : "+ ConcatString("Amit", "Suraj", "Mohan"));


        // Chalanges 02
        nameList.sort((a,b) -> (b.compareTo(a)));
        nameList.sort(Comparator.reverseOrder());
        System.out.println(nameList);

        // Chalanges 03
        System.out.println(checkFrequency(nameList, "Sujit"));
        // or
        int count = Collections.frequency(nameList, "Sujit");
        System.out.println(count);

        // Chalanges 04
        Collections.swap(nameList, 0, 2 );
        nameList.forEach(Str -> System.out.println());

        // Chalange 05
        System.out.println("Before : " + nameList);
        Collections.reverse(nameList);
        System.out.println("After : " +nameList);



    }



}
