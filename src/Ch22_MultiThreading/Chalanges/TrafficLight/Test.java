package Ch22_MultiThreading.Chalanges.TrafficLight;

public class Test {

    static void main(String[] args) throws InterruptedException {
        TrafficLightThread Red = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread Yellow = new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread Green = new TrafficLightThread(TrafficColor.GREEN);

        Green.start();
        Green.join();
        Yellow.start();
        Yellow.join();
        Red.start();

    }






}
