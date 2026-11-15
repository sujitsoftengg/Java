package Ch20_CollectionsLibrary.CollectionTypes;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

    static void main() {

        Set<String> mySetCollection = new HashSet<>();
        System.out.println("Add : " + mySetCollection.add("Sujit"));
        System.out.println("Add : " + mySetCollection.add("Amit"));
        System.out.println("Add : " + mySetCollection.add("Rohit"));
        System.out.println("Size : " + mySetCollection.size());
        System.out.println("Add : " + mySetCollection.add("Sujit"));
        Utility.print(mySetCollection);

        System.out.println("Size : " + mySetCollection.size());
        System.out.println("Remove : "+ mySetCollection.remove("Amit"));
        System.out.println("Size : " + mySetCollection.size());
        Utility.print(mySetCollection);
        System.out.println("Remove : "+ mySetCollection.remove("Amit"));  // false
    };


};

/*
================ SET METHODS ================

add(E e)
addAll(Collection<? extends E> c)

remove(Object o)
removeAll(Collection<?> c)
retainAll(Collection<?> c)
removeIf(Predicate<? super E> filter)
clear()

contains(Object o)
containsAll(Collection<?> c)

size()
isEmpty()

iterator()

toArray()
toArray(T[] array)
toArray(IntFunction<T[]> generator)

forEach(Consumer<? super E> action)
spliterator()
stream()
parallelStream()

equals(Object o)
hashCode()
*/



/*
=========================================================
                    JAVA SET INTERFACE
=========================================================

1. SET KYA HAI?
---------------
- Set Java Collection Framework ka ek Interface hai.
- Set unique elements ka group store karta hai.
- Duplicate elements allow nahi karta.
- Index-based access support nahi karta.
- Insertion order implementation par depend karta hai.
- Set java.util package mein available hai.

Example:
Set<String> names = new HashSet<>();


2. SET INTERFACE HIERARCHY
--------------------------

                  Iterable
                     |
                 Collection
                     |
                    Set
                     |
          +----------+-----------+
          |          |           |
       HashSet   LinkedHashSet  SortedSet
                                  |
                              NavigableSet
                                  |
                               TreeSet

Additional:
- EnumSet bhi Set interface implement karta hai.
- CopyOnWriteArraySet concurrent collection hai.
- ConcurrentSkipListSet sorted concurrent Set hai.


3. SET IMPLEMENTATIONS
----------------------

A. HASHSET
----------

- HashSet internally HashMap ka use karta hai.
- Duplicate elements allow nahi karta.
- Insertion order maintain nahi karta.
- Generally one null element allow karta hai.
- add(), remove(), contains() operations average
  constant time O(1) mein perform ho sakte hain.
- Elements hashCode() aur equals() ke basis par
  uniqueness determine karte hain.
- Synchronized nahi hota.

Example:
Set<String> names = new HashSet<>();


B. LINKEDHASHSET
----------------

- LinkedHashSet, HashSet ka subclass hai.
- Duplicate elements allow nahi karta.
- Insertion order maintain karta hai.
- Generally one null element allow karta hai.
- HashSet ke comparison mein extra ordering information
  maintain karta hai.
- Synchronized nahi hota.

Example:
Set<String> names = new LinkedHashSet<>();


C. TREESET
----------

- TreeSet elements ko sorted order mein maintain karta hai.
- Duplicate elements allow nahi karta.
- Natural ordering ya Comparator use karta hai.
- Generally null elements allow nahi karta.
- add(), remove(), contains() operations O(log n) time
  mein perform hote hain.
- NavigableSet interface implement karta hai.
- Synchronized nahi hota.

Example:
Set<Integer> numbers = new TreeSet<>();


D. ENUMSET
----------

- EnumSet sirf enum type ke elements store karta hai.
- Duplicate elements allow nahi karta.
- Enum declaration order maintain karta hai.
- Null elements allow nahi karta.
- Generally very efficient hota hai.

Example:
EnumSet<Day> days = EnumSet.allOf(Day.class);


4. SET INTERFACE IMPORTANT METHODS
----------------------------------

A. INSERTION METHODS
--------------------

1. add(E element)
- Set mein element add karta hai.
- Duplicate element add karne par false return karta hai.
- Successful insertion par true return karta hai.

2. addAll(Collection<? extends E> c)
- Dusri collection ke unique elements add karta hai.
- Return type: boolean.


B. REMOVAL METHODS
------------------

1. remove(Object o)
- Given element remove karta hai.
- Element present hone par true return karta hai.
- Element absent hone par false return karta hai.

2. removeAll(Collection<?> c)
- Dusri collection mein present matching elements remove karta hai.

3. retainAll(Collection<?> c)
- Sirf common elements retain karta hai.

4. removeIf(Predicate<? super E> filter)
- Given condition ke according elements remove karta hai.

5. clear()
- Set ke saare elements remove karta hai.


C. SEARCH METHODS
-----------------

1. contains(Object o)
- Element Set mein present hai ya nahi check karta hai.

2. containsAll(Collection<?> c)
- Dusri collection ke saare elements available hain ya nahi
  check karta hai.


D. SIZE METHODS
---------------

1. size()
- Total elements ki count return karta hai.

2. isEmpty()
- Set empty hai ya nahi check karta hai.


E. ITERATION METHODS
--------------------

1. iterator()
- Iterator return karta hai.

2. forEach(Consumer action)
- Har element par given action perform karta hai.

3. spliterator()
- Spliterator return karta hai.


F. ARRAY CONVERSION
-------------------

1. toArray()
- Set ko Object array mein convert karta hai.

2. toArray(T[] array)
- Set ko specified type ke array mein convert karta hai.

3. toArray(IntFunction<T[]> generator)
- Array generator ki help se typed array create karta hai.


G. STREAM METHODS
-----------------

1. stream()
- Sequential Stream return karta hai.

2. parallelStream()
- Parallel Stream return karta hai.


5. SORTEDSET INTERFACE
----------------------

- SortedSet, Set ka child interface hai.
- Elements sorted order mein maintain karta hai.
- Natural ordering ya Comparator use karta hai.

Important Methods:

1. first()
- Set ka first/smallest element return karta hai.

2. last()
- Set ka last/largest element return karta hai.

3. headSet(E toElement)
- Given element se chhote elements ka view return karta hai.
- toElement excluded hota hai.

4. tailSet(E fromElement)
- Given element aur usse bade elements ka view return karta hai.
- fromElement included hota hai.

5. subSet(E from, E to)
- Given range ka view return karta hai.
- from included aur to excluded hota hai.

6. comparator()
- Set ka Comparator return karta hai.
- Natural ordering use hone par null return karta hai.


6. NAVIGABLESET INTERFACE
-------------------------

- NavigableSet, SortedSet ka child interface hai.
- SortedSet se additional navigation methods provide karta hai.

Important Methods:

1. lower(E e)
- Given element se strictly chhota greatest element return karta hai.

2. floor(E e)
- Given element se chhota ya equal greatest element return karta hai.

3. ceiling(E e)
- Given element se bada ya equal smallest element return karta hai.

4. higher(E e)
- Given element se strictly bada smallest element return karta hai.

5. pollFirst()
- First element remove karke return karta hai.
- Empty hone par null return karta hai.

6. pollLast()
- Last element remove karke return karta hai.
- Empty hone par null return karta hai.

7. descendingSet()
- Reverse-order view return karta hai.

8. descendingIterator()
- Reverse order mein iteration karta hai.

9. headSet(E to, boolean inclusive)
- Given element tak ka view return karta hai.

10. tailSet(E from, boolean inclusive)
- Given element se aage ka view return karta hai.

11. subSet(E from, boolean fromInclusive,
           E to, boolean toInclusive)
- Specified range ka view return karta hai.


7. SET OPERATIONS
-----------------

Set mathematical operations support karne ke liye useful hai.

A. UNION
--------
- Dono Sets ke saare unique elements.
- addAll() use kar sakte hain.

B. INTERSECTION
---------------
- Dono Sets ke common elements.
- retainAll() use kar sakte hain.

C. DIFFERENCE
-------------
- First Set ke woh elements jo second Set mein nahi hain.
- removeAll() use kar sakte hain.

D. SUBSET
---------
- Check karna ki ek Set ke saare elements dusre Set mein hain.
- containsAll() use kar sakte hain.


8. SET EXAMPLES
---------------

A. HASHSET EXAMPLE
------------------

Set<Integer> numbers = new HashSet<>();

numbers.add(10);
numbers.add(20);
numbers.add(10);
numbers.add(30);

- Duplicate 10 store nahi hoga.
- Output ka order guaranteed nahi hai.


B. LINKEDHASHSET EXAMPLE
------------------------

Set<String> names = new LinkedHashSet<>();

names.add("Sujit");
names.add("Rahul");
names.add("Amit");
names.add("Sujit");

- Duplicate Sujit store nahi hoga.
- Insertion order maintain hoga.

Expected order:
Sujit, Rahul, Amit


C. TREESET EXAMPLE
------------------

Set<Integer> numbers = new TreeSet<>();

numbers.add(30);
numbers.add(10);
numbers.add(20);
numbers.add(10);

Expected order:
10, 20, 30

- Duplicate 10 store nahi hoga.
- Elements sorted order mein maintain honge.


9. SET VS LIST
--------------

LIST:
- Duplicate elements allow karti hai.
- Insertion order maintain karti hai.
- Index-based access support karti hai.

SET:
- Duplicate elements allow nahi karta.
- Index-based access support nahi karta.
- Ordering implementation par depend karti hai.


10. HASHSET VS LINKEDHASHSET VS TREESET
--------------------------------------

HashSet:
- No guaranteed iteration order.
- Hashing use karta hai.
- Average O(1) basic operations.

LinkedHashSet:
- Insertion order maintain karta hai.
- Hashing + linked structure use karta hai.
- Average O(1) basic operations.

TreeSet:
- Sorted order maintain karta hai.
- Tree structure use karta hai.
- O(log n) basic operations.


11. HASHCODE() AND EQUALS()
---------------------------

- HashSet uniqueness determine karne ke liye
  hashCode() aur equals() use karta hai.
- Agar do objects equals() ke according equal hain,
  toh unka hashCode() bhi equal hona chahiye.
- Same hashCode hone ka matlab objects equal hona zaroori nahi.
- Custom objects ke liye equals() aur hashCode()
  properly override karna chahiye.


12. WHEN TO USE SET?
--------------------

- Duplicate values remove karna.
- Unique usernames store karna.
- Unique IDs maintain karna.
- Common elements find karna.
- Mathematical set operations.
- Sorted unique values maintain karna.
- Membership checking.


=========================================================
                  END OF SET INTERFACE NOTES
=========================================================
*/




