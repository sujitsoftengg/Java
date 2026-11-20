package Ch22_MultiThreading.Chalanges.TrafficLight;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);
//
//    public String action;
//
//    TrafficColor(String action){
//        this.action = action;
//    }

    private int onTimeInMilliS;

    public int getOnTimeInMilliS() {
        return onTimeInMilliS;
    }

    TrafficColor(int onTimeInMilliS){
        this.onTimeInMilliS = onTimeInMilliS;
    }
}
