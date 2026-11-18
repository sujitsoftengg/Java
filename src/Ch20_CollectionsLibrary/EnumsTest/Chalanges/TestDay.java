package Ch20_CollectionsLibrary.EnumsTest.Chalanges;

public class TestDay {

    static void main() {

        for (Day day : Day.values()){
            System.out.printf("%S : %s \n" , day, day.getType().toUpperCase());
        }



    }



}
