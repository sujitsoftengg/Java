package Ch22_MultiThreading.ThreadCommunication;

public class Testing {

    static void main(String[] args) throws InterruptedException {

        System.out.println("Before Sleep");

        Thread.sleep(5000);

        System.out.println("Woke Up");

        // yield()
        // wait()
        // notify()
        // notifyall()

    /* =====================================================================
       THREAD COMMUNICATION - QUICK REVISION NOTES
       =====================================================================

       1. sleep(long millis):
          - Current thread ko diye gaye milliseconds ke liye temporarily rok deta hai.
          - Thread "Blocked" state me jata hai aur time poora hone par wapas aata hai.
          - Note: Yeh object ka lock release nahi karta (agar synchronized block me hai).

       2. yield():
          - Current thread khud se pause/hint deta hai ki baaki same-priority threads
            ko chalne ka mauka mil sake (Running -> Runnable).
          - Guaranteed nahi hai ki CPU turant doosre thread ko hi dega.

       3. wait():
          - Current thread ko tab tak wait karwata hai jab tak kisi aur thread se
            same object par notify() ya notifyAll() call na ho.
          - Sabse zaroori point: Yeh thread ke paas jo lock/monitor hota hai,
            use RELEASE kar deta hai (taaki doosra thread lock le kar kaam kar sake).

       4. notify():
          - Us object ke monitor par wait kar rahe threads me se KISI EK thread ko
            jagata hai (kaun sa uthega, yeh JVM/scheduler decide karta hai).

       5. notifyAll():
          - Us object ke monitor par wait kar rahe SABHI threads ko jagata hai
            taaki woh lock ke liye compete kar sakein.
    ===================================================================== */


    }


}
