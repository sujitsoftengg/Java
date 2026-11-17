package Ch20_CollectionsLibrary.CollectionTypes;

import java.util.PriorityQueue;

public class PriorityQueueDemo {


    static void main(String[] args) {
        PriorityQueue<Integer> pqNumber = new PriorityQueue<>();
        pqNumber.offer(52);
        pqNumber.offer(33);
        pqNumber.offer(96);
        pqNumber.offer(11);

        System.out.println(pqNumber); // [11, 33, 96, 52]





    }

}

/*
        PriorityQueue kya hota hai? 🧠
        Aam taur par Queue ka rule hota hai FIFO (First In, First Out)—yani jo line me pehle aayega,
        woh pehle bahar jayega (jaise movie ticket ki line).
        Lekin PriorityQueue isse alag hai! Iska rule yeh hai:

        "Jo sabse zyada important (highest priority) hoga,
        woh pehle bahar jayega—chahe woh line me sabse baad me hi kyun na aaya ho!"


        Real-Life Example 🏥
        Sochiye hospital ka Emergency Ward (Triage) hai:
        Agar line me ek normal patient (pehle aaya hua) khada hai, lekin
        achanak ek critical emergency patient aa jata hai, toh doctor pehle
        emergency patient ka ilaaj karega.

        Hospital ka system priority ke base par decide karta hai,
        na ki arrival time ke base par. Yahi kaam Java me PriorityQueue karta hai!

*/
