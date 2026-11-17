package Ch20_CollectionsLibrary.Chalanges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacterInSet {


    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Character> unique = new HashSet<>();

        System.out.println("Welcome to the Count Character : ");
        System.out.println("Please Enter your string : ");
        String userStr = input.next();

        for (char ch : userStr.toCharArray()){
            unique.add(ch);
        }

        System.out.printf("Your String has %d unique character", unique.size());




    }

}
