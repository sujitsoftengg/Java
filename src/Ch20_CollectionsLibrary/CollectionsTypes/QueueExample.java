package Ch20_CollectionsLibrary.CollectionsTypes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    static void main(String[] args) {

        Queue<Integer> queueList = new LinkedList<>();

        queueList.add(1);
        queueList.offer(2);

        /*
            for (Integer i : queueList){
                System.out.printf("%d ", i);  // 1 2
            }
        */
        Utility.print(queueList); // 1 2
        System.out.println("Peek : " + queueList.peek());     // 1
        System.out.println("Element :"+ queueList.element());    // 1
        System.out.println("Remove : " + queueList.remove());   // 1
        Utility.print(queueList);   // 2
        System.out.println("poll : " + queueList.poll()); //  2
        Utility.print(queueList); // Empty

        System.out.println("poll : " + queueList.poll());  // null because queue is empty
        System.out.println("remove : "+ queueList.remove());  // Exception because list empty and when not execute remove method then throw exception



    }


}


/*
=========================================================
                  JAVA QUEUE INTERFACE
=========================================================

1. QUEUE KYA HAI?
-----------------
- Queue Java Collection Framework ka ek Interface hai.
- Queue elements ko process karne ke liye use hoti hai.
- Queue generally FIFO (First In First Out) principle follow karti hai.
- FIFO ka matlab: Jo element sabse pehle insert hua,
  generally wahi sabse pehle remove hoga.
- Queue java.util package mein available hai.

Example:
Queue<String> queue = new LinkedList<>();


2. QUEUE HIERARCHY
------------------

                  Iterable
                     |
                 Collection
                     |
                   Queue
                     |
          +----------+-----------+
          |          |           |
      PriorityQueue Deque   (Other Queue
                             implementations)
                     |
                   Deque
                     |
             +-------+-------+
             |               |
         ArrayDeque      LinkedList


3. QUEUE INTERFACE IMPORTANT METHODS
------------------------------------

A. INSERTION METHODS
--------------------

1. add(E element)
- Queue mein element insert karta hai.
- Agar insertion fail hota hai, exception throw kar sakta hai.
- Return type: boolean.

2. offer(E element)
- Queue mein element insert karne ki koshish karta hai.
- Agar insertion fail hota hai, false return karta hai.
- Return type: boolean.

Difference:
- add() = Failure par exception.
- offer() = Failure par false.


B. REMOVAL METHODS
------------------

1. remove()
- Queue ke head element ko remove karta hai.
- Removed element return karta hai.
- Queue empty hone par exception throw karta hai.

2. poll()
- Queue ke head element ko remove karta hai.
- Removed element return karta hai.
- Queue empty hone par null return karta hai.

Difference:
- remove() = Empty queue par exception.
- poll() = Empty queue par null.


C. RETRIEVAL METHODS
--------------------

1. element()
- Queue ke head element ko return karta hai.
- Element remove nahi karta.
- Queue empty hone par exception throw karta hai.

2. peek()
- Queue ke head element ko return karta hai.
- Element remove nahi karta.
- Queue empty hone par null return karta hai.

Difference:
- element() = Empty queue par exception.
- peek() = Empty queue par null.


4. COLLECTION SE INHERITED METHODS
----------------------------------

Queue, Collection interface ko extend karti hai.
Isliye Collection ke methods bhi use kar sakte hain.

- size() = Total elements count.
- isEmpty() = Queue empty hai ya nahi.
- contains(Object o) = Element available hai ya nahi.
- containsAll(Collection c) = Multiple elements check.
- remove(Object o) = Specific element remove.
- removeAll(Collection c) = Matching elements remove.
- retainAll(Collection c) = Common elements retain.
- clear() = All elements remove.
- iterator() = Iterator return karta hai.
- toArray() = Array mein convert karta hai.
- addAll(Collection c) = Multiple elements add.
- removeIf(Predicate p) = Condition ke according remove.
- forEach(Consumer action) = Har element par action.
- stream() = Sequential Stream.
- parallelStream() = Parallel Stream.


5. QUEUE IMPLEMENTATIONS
------------------------

A. LINKEDLIST
-------------

- LinkedList, List aur Deque dono interfaces implement karti hai.
- FIFO Queue ki tarah use kar sakte hain.
- Insertion order maintain karti hai.
- Duplicate elements allow karti hai.
- Null elements allow karti hai.

Example:
Queue<Integer> queue = new LinkedList<>();


B. PRIORITYQUEUE
----------------

- PriorityQueue elements ko priority ke according process karti hai.
- Default natural ordering use karti hai.
- Minimum element default min-heap mein head par hota hai.
- FIFO ordering guarantee nahi hoti.
- Duplicate elements allow karti hai.
- Null elements allow nahi karti.

Example:
Queue<Integer> queue = new PriorityQueue<>();


C. ARRAYDEQUE
-------------

- ArrayDeque, Deque interface implement karti hai.
- Double Ended Queue hai.
- Dono ends se insertion aur removal possible hai.
- Queue aur Stack dono ki tarah use kar sakte hain.
- Null elements allow nahi karti.
- Generally Stack ke liye Stack class se better choice hai.

Example:
Deque<Integer> deque = new ArrayDeque<>();


6. DEQUE INTERFACE
------------------

- Deque ka full form Double Ended Queue hai.
- Ismein front aur rear dono ends par operations possible hain.

Important Methods:

Insertion:
- addFirst(E e) = Beginning mein add.
- addLast(E e) = End mein add.
- offerFirst(E e) = Beginning mein add karne ki koshish.
- offerLast(E e) = End mein add karne ki koshish.

Removal:
- removeFirst() = First element remove.
- removeLast() = Last element remove.
- pollFirst() = First element remove, empty par null.
- pollLast() = Last element remove, empty par null.

Retrieval:
- getFirst() = First element return.
- getLast() = Last element return.
- peekFirst() = First element return, empty par null.
- peekLast() = Last element return, empty par null.

Stack Operations:
- push(E e) = Beginning par element add.
- pop() = Beginning se element remove.

Other:
- descendingIterator() = Reverse direction mein iterator.
- removeFirstOccurrence(Object o) = First matching element remove.
- removeLastOccurrence(Object o) = Last matching element remove.


7. FIFO EXAMPLE
---------------

Queue<Integer> queue = new LinkedList<>();

queue.offer(10);
queue.offer(20);
queue.offer(30);

Queue:
FRONT -> 10 -> 20 -> 30 <- REAR

queue.poll();

After removal:
FRONT -> 20 -> 30 <- REAR

- 10 sabse pehle insert hua tha.
- Isliye 10 sabse pehle remove hua.


8. PRIORITYQUEUE EXAMPLE
------------------------

Queue<Integer> queue = new PriorityQueue<>();

queue.offer(30);
queue.offer(10);
queue.offer(20);

- peek() = 10
- poll() = 10
- poll() = 20
- poll() = 30

NOTE:
- PriorityQueue ka iterator sorted order guarantee nahi karta.
- Lekin poll() elements ko priority order mein return karta hai.


9. QUEUE VS DEQUE VS STACK
--------------------------

Queue:
- Generally FIFO.
- Insertion rear par.
- Removal front se.

Deque:
- Dono ends par insertion aur removal.
- FIFO aur LIFO dono implement kar sakte hain.

Stack:
- LIFO (Last In First Out).
- Last inserted element pehle remove hota hai.
- Java mein ArrayDeque ko Stack ke replacement ke
  roop mein prefer kiya jata hai.


10. IMPORTANT DIFFERENCES
-------------------------

add() vs offer()
- add() failure par exception throw kar sakta hai.
- offer() failure par false return karta hai.

remove() vs poll()
- remove() empty queue par exception.
- poll() empty queue par null.

element() vs peek()
- element() empty queue par exception.
- peek() empty queue par null.

PriorityQueue vs LinkedList
- PriorityQueue = Priority-based processing.
- LinkedList = Insertion-order based FIFO usage.


11. WHEN TO USE QUEUE?
----------------------

- CPU Task Scheduling.
- Printer Job Management.
- Customer Service Systems.
- Breadth First Search (BFS).
- Message Processing.
- Request Handling.
- Task Scheduling.
- Data Buffering.


=========================================================
                END OF QUEUE INTERFACE NOTES
=========================================================
*/
