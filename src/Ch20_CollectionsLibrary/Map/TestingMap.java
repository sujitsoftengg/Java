package Ch20_CollectionsLibrary.Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {

    static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Sujit", 26);
        map.put("Aman", 15);
        map.put("Sumit", 65);
        map.put("Rahul", 32);
        map.put("Vivek", 25);
        map.put("Mohan", 71);
        map.put("Nikhil", 14);

        System.out.printf("Map Size %d \n", map.size());
        System.out.println("Get Method : " + map.get("Aman"));
        System.out.println("Contain Method : " + map.containsKey("Sumit"));
        System.out.println("Contain Method : " + map.containsKey("Amit"));
        System.out.println("Remove Method : " + map.remove("Rahul"));
        System.out.printf("Map Size %d \n", map.size());


        for (String key : map.keySet()){
            System.out.printf("%s : %s \n", key, map.get(key));
        }





    }


}


