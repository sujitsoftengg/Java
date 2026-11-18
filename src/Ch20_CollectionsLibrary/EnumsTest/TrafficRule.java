package Ch20_CollectionsLibrary.EnumsTest;

import Ch20_CollectionsLibrary.EnumsTest.Chalanges.Grade;

public class TrafficRule {

    private TrafficLight color;

    static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;

        Grade grade = Grade.valueOf("D");
        for (Grade value : Grade.values()) {
            System.out.print(value + " ");
        }




    }

}
