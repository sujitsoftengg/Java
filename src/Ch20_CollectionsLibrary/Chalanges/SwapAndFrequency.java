package Ch20_CollectionsLibrary.Chalanges;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SwapAndFrequency {

    // Self Made Swap Method
    public static <E>void SelfSwap(List<E> list, int indexFirst, int indexSecond){
        E temp = list.get(indexFirst);
        list.set(indexFirst, list.get(indexSecond));
        list.set(indexSecond, temp);
    }

    static void main(String[] args) {

        List<Integer> myList = Arrays.asList(5, 8, 6, 8, 6, 8, 5, 8, 8, 8, 7, 8, 9, 7, 7);
        System.out.println(myList);
        Collections.swap(myList, 0, 1); // [5, 8, 6, 8, 6, 8, 5, 8, 8, 8, 7, 8, 9, 7, 7]

        System.out.println(myList); // [8, 5, 6, 8, 6, 8, 5, 8, 8, 8, 7, 8, 9, 7, 7]

        System.out.println("Frequency :" + Collections.frequency(myList, 8));
        SelfSwap(myList, 0, 1);
        System.out.println(myList);
    }

}
