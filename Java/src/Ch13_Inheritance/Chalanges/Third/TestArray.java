package Ch13_Inheritance.Chalanges.Third;

public class TestArray {

    static void main(String[] args) {

        ArrayOperations myArray = new ArrayOperations(new int[]{1, 3, 5, 8});

        ArrayOperations.Statistics stats = myArray.new Statistics();

        System.out.println(stats.mean());
        System.out.println(stats.median());

    }

}
