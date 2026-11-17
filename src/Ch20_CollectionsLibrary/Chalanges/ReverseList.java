package Ch20_CollectionsLibrary.Chalanges;

import java.util.Arrays;
import java.util.List;

public class ReverseList {

    public static <E> void ListSwapSelfMade (List<E> list, int firstIndex, int secondIndex){
        E temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
    }


    public static <E> void reverseSelfMade (List<E> list){
        for (int i = 0; i < list.size()/2 ; i++) {
            ListSwapSelfMade(list, i, list.size()-1-i);
        }
    }

    static void main() {
        List myList = Arrays.asList(5, 6, 8, 9, 8, 10, 8, 9);
        System.out.println(myList);  //  [5, 6, 8, 9, 8, 10, 8, 9]

        ListSwapSelfMade(myList, 0, 1);
        System.out.println(myList); // [6, 5, 8, 9, 8, 10, 8, 9]

        reverseSelfMade(myList);
        System.out.println(myList); // [9, 8, 10, 8, 9, 8, 5, 6]



    }


}
