package Ch20_CollectionsLibrary.CollectionsTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListExample {

    static void main() {

        List <String> strNameList = new ArrayList <>();

        //1. Adding
        System.out.println("-------------------Adding-----------------------------");

        strNameList.add("Sujit");
        strNameList.add("Rahul");
        strNameList.add("Amit");

        System.out.println("--------------------");
//        strNameList.forEach(System.out::println);
            for (String name : strNameList) {
                System.out.println(name);
            }

        System.out.println("--------------------");
        strNameList.add(1, "Ravi");
//        strNameList.forEach(System.out::println);
            for (String name : strNameList) {
                System.out.println(name);
            }

        //2. Adding another collection
        System.out.println("-------------------Adding another collection-----------------------------");

        strNameList.addAll(Arrays.asList("Sumit", "Vijay"));
//        strNameList.forEach(System.out::println);
            for (String name : strNameList) {
                System.out.println(name);
            }
        //3. Accessing
        System.out.println("-------------------Accessing-----------------------------");
        System.out.println(strNameList.get(0)); // Sujit
//        strNameList.forEach(System.out::println);
            for (String name : strNameList) {
                System.out.println(name);
            }


        //4. Updating
        System.out.println("-------------------Updating-----------------------------");

        strNameList.set(0, "Sujit Tomar");
//        strNameList.forEach(System.out::println);

            for (String name : strNameList) {
                System.out.println(name);
            }
        //5. Searching
        System.out.println("-------------------Searching-----------------------------");

        System.out.println(strNameList.contains("Amit"));
        System.out.println(strNameList.indexOf("Amit"));
        System.out.println(strNameList.lastIndexOf("Amit"));
//        strNameList.forEach(System.out::println);

        for (String name : strNameList) {
            System.out.println(name);
        }

        //6. Size and empty check
        System.out.println("-------------------Size and empty check-----------------------------");

        System.out.println(strNameList.size());
        System.out.println(strNameList.isEmpty());
//        strNameList.forEach(System.out::println);
            for (String name : strNameList) {
                System.out.println(name);
            }


        //7. Removing
        System.out.println("-------------------Removing-----------------------------");

        strNameList.remove("Sumit");
        strNameList.remove(0);
//        strNameList.forEach(System.out::println);

            for (String name : strNameList) {
                System.out.println(name);
            }

        //8. Sorting
        System.out.println("-------------------Sorting-----------------------------");

        strNameList.sort(Comparator.naturalOrder());
//        strNameList.forEach(System.out::println);

            for (String name : strNameList) {
                System.out.println(name);
            }

        //9. Reversing
        System.out.println("-------------------Reversing-----------------------------");

        List<String> reverseStrList = strNameList.reversed();
//        reverseStrList.forEach(System.out::println);

        for (String name : reverseStrList) {
            System.out.println(name);
        }

        //10. Sublist
        System.out.println("-------------------Sublist-----------------------------");
        System.out.println(strNameList);  // [Amit, Rahul, Ravi, Vijay]

        System.out.println("................");
        List<String> subNameStr = strNameList.subList(0, 2);
        // subNameStr.forEach(System.out::println); // Amit, Rahul
        for (String name : subNameStr) {
            System.out.println(name);
        }


        //11. Iterating
        System.out.println("-------------------Iterating-----------------------------");

        strNameList.forEach(System.out::println);

        System.out.println("....OR.............");

        for (String name : subNameStr) {
            System.out.println(name);
        }


        //12. Removing by condition
        System.out.println("-------------------Removing by condition-----------------------------");

        strNameList.removeIf(newNameList -> newNameList.startsWith("V"));
        strNameList.forEach(System.out::println);

        System.out.println("....OR.............");

        for (String name : strNameList) {
            System.out.println(name);
        }


        //13. Replacing all element
        System.out.println("-------------------Replacing all element-----------------------------");

        strNameList.replaceAll(String::toUpperCase);
        strNameList.forEach(System.out::println);

        System.out.println("....OR.............");

        for (String name : strNameList) {
            System.out.println(name);
        }


        //14. Array conversion
        System.out.println("-------------------Array conversion-----------------------------");

        String[] newArray = strNameList.toArray(new String[0]);
        strNameList.forEach(System.out::println);

        System.out.println(".......AND.............");

        for (String name : newArray) {
            System.out.println(name);
        }


        //15. Stream
        System.out.println("-------------------Stream-----------------------------");

        strNameList.stream().forEach(System.out::println);
        strNameList.forEach(System.out::println);


        //16. Clearing
        System.out.println("-------------------Clearing-----------------------------");

        strNameList.clear();
        strNameList.forEach(System.out::println);


//        strNameList.remove(1);
//        for (int i = 0; i < strNameList.size(); i++) {
//            System.out.println(strNameList.get(i));
//        }

//        if (strNameList.contains("Sujit")){
//            System.out.println("Yes Sujit is exits");
//            System.out.println("Index is : " + strNameList.indexOf("Sujit"));
//        }

        

//        for (String str : strNameList){
//            System.out.println(" For Loop " + str);
//        }

    }

}



/*
=========================================================
                   JAVA LIST INTERFACE
=========================================================

1. LIST KYA HAI?
----------------
- List Java Collection Framework ka ek Interface hai.
- List elements ko ordered sequence mein store karti hai.
- Duplicate elements allow karti hai.
- Insertion order maintain karti hai.
- Index-based access support karti hai.
- Null elements generally allow karti hai.
- List java.util package mein available hai.

Example:
List<String> names = new ArrayList<>();


2. LIST INTERFACE HIERARCHY
---------------------------

                  Iterable
                     |
                 Collection
                     |
                    List
                     |
          +----------+----------+
          |          |          |
      ArrayList   LinkedList   Vector
                                |
                              Stack

NOTE:
- ArrayList, List implement karti hai.
- LinkedList, List aur Deque dono implement karti hai.
- Vector, List implement karta hai.
- Stack, Vector ko extend karta hai.


3. LIST IMPLEMENTATIONS
-----------------------

A. ARRAYLIST
------------

- ArrayList dynamic array par based hoti hai.
- Elements insertion order mein maintain hote hain.
- Duplicate elements allow karti hai.
- Null elements allow karti hai.
- Index-based access fast hota hai.
- Middle mein insertion/deletion comparatively slow ho sakta hai.
- Automatically size increase/decrease kar sakti hai.
- Synchronized nahi hoti.

Example:
List<String> names = new ArrayList<>();


B. LINKEDLIST
-------------

- LinkedList doubly linked list par based hoti hai.
- Har node mein data aur previous/next references hote hain.
- Insertion order maintain karti hai.
- Duplicate elements allow karti hai.
- Null elements allow karti hai.
- Index-based access comparatively slow hota hai.
- Beginning/end par insertion aur deletion useful ho sakta hai.
- List aur Deque dono interfaces implement karti hai.

Example:
List<Integer> numbers = new LinkedList<>();


C. VECTOR
---------

- Vector dynamic array par based hota hai.
- Insertion order maintain karta hai.
- Duplicate elements allow karta hai.
- Null elements allow karta hai.
- Methods synchronized hote hain.
- Thread-safe individual operations provide karta hai.
- ArrayList ke comparison mein generally slower hota hai.
- Legacy collection class hai.

Example:
List<String> names = new Vector<>();


D. STACK
--------

- Stack, Vector class ko extend karta hai.
- LIFO (Last In First Out) principle follow karta hai.
- Last inserted element sabse pehle remove hota hai.
- Stack ke important methods:

  push(E item) = Element add karna.
  pop()        = Top element remove karna.
  peek()       = Top element dekhna.
  empty()      = Stack empty hai ya nahi.
  search()     = Element ki position search karna.

Example:
Stack<Integer> stack = new Stack<>();

NOTE:
- Modern Java mein Stack ke replacement ke liye
  ArrayDeque generally prefer kiya jata hai.


4. LIST INTERFACE IMPORTANT METHODS
-----------------------------------

A. INSERTION METHODS
--------------------

1. add(E element)
- List ke end mein element add karta hai.
- Return type: boolean.

2. add(int index, E element)
- Given index par element insert karta hai.
- Existing elements right side shift ho jaate hain.
- Return type: void.

3. addAll(Collection<? extends E> c)
- Dusri collection ke saare elements add karta hai.

4. addAll(int index, Collection<? extends E> c)
- Given index se dusri collection ke elements add karta hai.


B. ACCESS METHODS
-----------------

1. get(int index)
- Given index ka element return karta hai.

2. indexOf(Object o)
- Element ka first occurrence index return karta hai.
- Element nahi milne par -1 return karta hai.

3. lastIndexOf(Object o)
- Element ka last occurrence index return karta hai.
- Element nahi milne par -1 return karta hai.


C. UPDATE METHODS
-----------------

1. set(int index, E element)
- Given index par existing element replace karta hai.
- Purana element return karta hai.
- List ka size change nahi hota.


D. REMOVAL METHODS
------------------

1. remove(int index)
- Given index ka element remove karta hai.
- Removed element return karta hai.

2. remove(Object o)
- Given element ka first matching occurrence remove karta hai.
- Return type: boolean.

3. removeAll(Collection<?> c)
- Dusri collection mein present matching elements remove karta hai.

4. retainAll(Collection<?> c)
- Sirf common elements retain karta hai.

5. removeIf(Predicate<? super E> filter)
- Given condition ke according elements remove karta hai.

6. clear()
- List ke saare elements remove karta hai.


E. SEARCH METHODS
-----------------

1. contains(Object o)
- Element List mein present hai ya nahi check karta hai.

2. containsAll(Collection<?> c)
- Check karta hai ki dusri collection ke saare elements
  current List mein present hain ya nahi.


F. SIZE METHODS
---------------

1. size()
- List mein total elements ki count return karta hai.

2. isEmpty()
- List empty hai ya nahi check karta hai.


G. ITERATION METHODS
--------------------

1. iterator()
- Iterator return karta hai.

2. listIterator()
- ListIterator return karta hai.
- Forward aur backward dono directions mein traverse kar sakta hai.

3. listIterator(int index)
- Given index se ListIterator return karta hai.

4. forEach(Consumer action)
- Har element par given action perform karta hai.

5. spliterator()
- Spliterator return karta hai.


H. SUBLIST METHOD
-----------------

subList(int fromIndex, int toIndex)
- List ka specified portion return karta hai.
- fromIndex included hota hai.
- toIndex excluded hota hai.
- Original List ka backed view return karta hai.


I. ARRAY CONVERSION
-------------------

1. toArray()
- List ko Object array mein convert karta hai.

2. toArray(T[] array)
- List ko specified type ke array mein convert karta hai.

3. toArray(IntFunction<T[]> generator)
- Array generator ki help se typed array create karta hai.


J. JAVA 8+ METHODS
------------------

1. replaceAll(UnaryOperator<E> operator)
- Har element ko given operation ke according replace karta hai.

2. sort(Comparator<? super E> c)
- List ko Comparator ke according sort karta hai.

3. stream()
- Sequential Stream return karta hai.

4. parallelStream()
- Parallel Stream return karta hai.


K. JAVA 21+ METHOD
------------------

1. reversed()
- List ka reverse-order view return karta hai.
- Original List ko reverse nahi karta.
- Returned view original List se connected hota hai.


5. LISTITERATOR IMPORTANT METHODS
---------------------------------

- hasNext() = Next element available hai ya nahi.
- next() = Next element return karta hai.
- hasPrevious() = Previous element available hai ya nahi.
- previous() = Previous element return karta hai.
- nextIndex() = Next element ka index.
- previousIndex() = Previous element ka index.
- add(E e) = Current position par element insert.
- set(E e) = Last returned element replace.
- remove() = Last returned element remove.


6. COLLECTIONS UTILITY CLASS
----------------------------

Collections java.util package ki utility class hai.

Important Methods:

- Collections.sort(list)
  List ko natural order mein sort karta hai.

- Collections.reverse(list)
  List ko reverse karta hai.

- Collections.shuffle(list)
  Elements ko randomly shuffle karta hai.

- Collections.max(list)
  Maximum element return karta hai.

- Collections.min(list)
  Minimum element return karta hai.

- Collections.frequency(list, element)
  Element ki frequency count karta hai.

- Collections.swap(list, i, j)
  Do elements ki positions swap karta hai.

- Collections.unmodifiableList(list)
  Unmodifiable view return karta hai.

- Collections.synchronizedList(list)
  Synchronized List wrapper return karta hai.


7. COMPARABLE VS COMPARATOR
---------------------------

Comparable:
- Natural ordering define karta hai.
- compareTo() method implement karna hota hai.
- Class ke andar implement hota hai.
- Generally ek natural ordering define karta hai.

Comparator:
- Custom ordering define karta hai.
- compare() method implement karna hota hai.
- External comparison logic provide karta hai.
- Multiple sorting orders define kar sakte hain.


8. ARRAYLIST VS LINKEDLIST
--------------------------

ArrayList:
- Dynamic array.
- Random access fast.
- Middle insertion/deletion mein shifting hoti hai.
- Generally iteration aur indexed access ke liye useful.

LinkedList:
- Doubly linked list.
- Random access slow.
- Known node/iterator position par insertion/deletion useful.
- Deque operations bhi support karti hai.


9. ARRAY VS LIST
----------------

Array:
- Fixed size hota hai.
- Primitive aur objects dono store kar sakta hai.
- Index-based access support karta hai.

List:
- Dynamic size hota hai.
- Objects store karti hai.
- Primitive values directly store nahi karti.
- Wrapper classes use hoti hain.
- Multiple useful built-in methods available hain.


10. WRAPPER CLASSES
-------------------

Primitive       Wrapper
--------------------------------
int             Integer
byte            Byte
short           Short
long            Long
float           Float
double          Double
char            Character
boolean         Boolean

Example:
List<Integer> numbers = new ArrayList<>();

numbers.add(10);

NOTE:
- Autoboxing primitive ko wrapper object mein convert karta hai.
- Unboxing wrapper object ko primitive mein convert karta hai.


11. IMPORTANT POINTS
--------------------

- List duplicate elements allow karti hai.
- List insertion order maintain karti hai.
- List index-based access provide karti hai.
- List interface ka direct object create nahi kar sakte.
- List ka object uski implementation class se create hota hai.
- List<String> generic type use karta hai.
- Raw List use karne se type-safety lose hoti hai.
- List<Integer> mein Integer values store hoti hain.
- List.of() immutable List create karta hai.
- Arrays.asList() fixed-size List provide karta hai.
- ArrayList dynamic size provide karta hai.


12. WHEN TO USE LIST?
---------------------

- Student names store karna.
- Shopping cart items manage karna.
- Employee records maintain karna.
- To-do lists create karna.
- Multiple objects ko ordered form mein store karna.
- Duplicate values maintain karna.
- Index ke through data access karna.


=========================================================
                 END OF LIST INTERFACE NOTES
=========================================================
*/

