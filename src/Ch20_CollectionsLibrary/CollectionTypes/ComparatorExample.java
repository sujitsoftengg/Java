package Ch20_CollectionsLibrary.CollectionTypes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void sortInDescending(List<String> stringList){
        // Normal Method
//        Collections.sort(stringList);
//        Collections.sort(stringList);

        // With Comparator
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                    if (o1.equals(o2)){
                        return 0;
                    } else if (o1.charAt(0) < o2.charAt(0)) {
                        return 1;
                    }else {
                        return -1;
                    }
            }
        });
    }


    static void main() {
        List<String> list = Arrays.asList("Rohit", "Amit", "Sumit", "Chandan");
//        System.out.println(list); // [Rohit, Amit, Sumit, Chandan]
//        sortInDescending(list);  // Normal Method
//        System.out.println(list);  // [Amit, Chandan, Rohit, Sumit]

        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);




    }

}
