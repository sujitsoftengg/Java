package Ch20_CollectionsLibrary.CollectionsTypes;

public class AboutCollection {
    static void main(String[] args) {


/*
=========================================================
             JAVA COLLECTION FRAMEWORK
=========================================================

1. COLLECTION KYA HAI?
----------------------
- Collection Java mein objects ke group ko store aur
  manage karne ka framework hai.
- Iska use multiple objects ko ek saath store karne ke liye hota hai.
- Collection ka size dynamically increase ya decrease ho sakta hai.
- Collection Framework java.util package mein available hai.

Example:
ArrayList<String> names = new ArrayList<>();


2. COLLECTION FRAMEWORK HIERARCHY
---------------------------------

                  Iterable (Interface)
                       |
                   Collection (Interface)
                       |
          +------------+------------+
          |            |            |
         List         Set         Queue
          |            |            |
      ArrayList     HashSet     PriorityQueue
      LinkedList    LinkedHashSet
      Vector         TreeSet
      Stack

Map (Interface) is separate from Collection.
     |
     +-- HashMap
     +-- LinkedHashMap
     +-- TreeMap
     +-- Hashtable


3. LIST INTERFACE
-----------------
- List duplicate elements allow karti hai.
- Elements insertion order mein maintain hote hain.
- Index ke through elements access kar sakte hain.
- Null elements generally allowed hote hain.

Implementations:

A. ArrayList
------------
- Dynamic array par based hai.
- Fast random access (get(index)).
- Middle mein insertion/deletion comparatively slow ho sakta hai.

Example:
List<String> names = new ArrayList<>();

B. LinkedList
------------
- Doubly linked list par based hai.
- Elements nodes ke form mein store hote hain.
- Index-based access comparatively slow hota hai.
- Beginning/end par insertion aur deletion useful ho sakta hai.

C. Vector
---------
- Dynamic array par based hai.
- Synchronized methods provide karta hai.
- ArrayList ke comparison mein generally slower hota hai.

D. Stack
--------
- LIFO (Last In First Out) principle follow karta hai.
- push() = Element add karna.
- pop() = Top element remove karna.
- peek() = Top element dekhna.

Example:
Stack<Integer> stack = new Stack<>();


4. SET INTERFACE
----------------
- Duplicate elements allow nahi karta.
- Generally unique elements store karta hai.
- Index-based access nahi hota.

Implementations:

A. HashSet
----------
- Elements ka fixed insertion order maintain nahi karta.
- Average add(), remove(), contains() operations fast hote hain.
- Generally one null element allow karta hai.

B. LinkedHashSet
----------------
- Insertion order maintain karta hai.
- Duplicate elements allow nahi karta.
- HashSet se extra ordering information maintain karta hai.

C. TreeSet
----------
- Elements sorted order mein maintain karta hai.
- Duplicate elements allow nahi karta.
- Natural ordering ya Comparator use karta hai.
- Generally null elements allow nahi karta.


5. QUEUE INTERFACE
------------------
- Queue generally FIFO (First In First Out) principle follow karti hai.
- First inserted element generally first remove hota hai.
- Different implementations mein ordering alag ho sakti hai.

Important Methods:
- offer() = Element add karna.
- poll() = Head element remove aur return karna.
- peek() = Head element dekhna.
- remove() = Head element remove karna.
- element() = Head element dekhna.

Implementations:

A. PriorityQueue
----------------
- Elements priority ke according process hote hain.
- Default natural ordering use hoti hai.
- FIFO ordering guarantee nahi hoti.

B. ArrayDeque
-------------
- Double Ended Queue hai.
- Dono ends se insertion aur deletion possible hai.
- Queue aur Stack dono ki tarah use kar sakte hain.
- Null elements allow nahi karta.


6. MAP INTERFACE
----------------
- Map data ko Key-Value pairs mein store karta hai.
- Keys unique hoti hain.
- Values duplicate ho sakti hain.
- Map Collection interface ko extend nahi karta.

Important Methods:
- put(key, value) = Entry add/update karna.
- get(key) = Key se value lena.
- remove(key) = Entry remove karna.
- containsKey(key) = Key check karna.
- containsValue(value) = Value check karna.
- keySet() = All keys ka Set.
- values() = All values ka Collection.
- entrySet() = All key-value entries ka Set.

Implementations:

A. HashMap
----------
- Insertion order maintain nahi karta.
- One null key allow karta hai.
- Multiple null values allow karta hai.
- Generally fast lookup provide karta hai.

B. LinkedHashMap
----------------
- Insertion order maintain karta hai by default.
- One null key allow karta hai.
- Multiple null values allow karta hai.

C. TreeMap
----------
- Keys sorted order mein maintain hoti hain.
- Natural ordering ya Comparator use karta hai.
- Null keys generally allow nahi hoti.

D. Hashtable
------------
- Synchronized hai.
- Null key aur null values allow nahi karta.
- Legacy class hai.


7. IMPORTANT COLLECTION METHODS
-------------------------------
- add() = Element add karna.
- addAll() = Multiple elements add karna.
- remove() = Element remove karna.
- removeAll() = Multiple elements remove karna.
- contains() = Element available hai ya nahi.
- containsAll() = Multiple elements check karna.
- size() = Total elements count.
- isEmpty() = Collection empty hai ya nahi.
- clear() = All elements remove karna.
- toArray() = Collection ko array mein convert karna.
- iterator() = Elements traverse karna.


8. ITERATION / TRAVERSING
-------------------------

A. For Loop (Index-based, List)
-------------------------------
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

B. Enhanced For Loop
--------------------
for (String name : names) {
    System.out.println(name);
}

C. Iterator
-----------
Iterator<String> itr = names.iterator();

while (itr.hasNext()) {
    System.out.println(itr.next());
}

- hasNext() = Next element available hai ya nahi.
- next() = Next element return karta hai.
- remove() = Current element safely remove karta hai.


9. COLLECTIONS UTILITY CLASS
----------------------------
- Collections java.util package ki utility class hai.
- Ismein collection operations ke static methods hote hain.

Important Methods:
- Collections.sort(list) = List sort karna.
- Collections.reverse(list) = List reverse karna.
- Collections.shuffle(list) = Elements shuffle karna.
- Collections.max(list) = Maximum element.
- Collections.min(list) = Minimum element.
- Collections.frequency(list, element) = Frequency count.
- Collections.swap(list, i, j) = Elements swap karna.
- Collections.unmodifiableList(list) = Unmodifiable view.


10. COMPARABLE VS COMPARATOR
----------------------------

Comparable:
- Natural ordering define karta hai.
- compareTo() method implement karna hota hai.
- Class ke andar implement hota hai.

Comparator:
- Custom ordering define karta hai.
- compare() method implement karna hota hai.
- External comparison logic provide kar sakte hain.


11. ARRAY VS COLLECTION
-----------------------
Array:
- Fixed size hota hai.
- Primitive aur objects dono store kar sakta hai.
- Direct indexing supported hai.

Collection:
- Dynamic size hota hai.
- Primitive values directly store nahi karta.
- Wrapper classes use hoti hain.
- Example: Integer, Double, Character.


12. WRAPPER CLASSES
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
numbers.add(10); // Autoboxing


=========================================================
                  END OF COLLECTION NOTES
=========================================================
*/




    }



}
