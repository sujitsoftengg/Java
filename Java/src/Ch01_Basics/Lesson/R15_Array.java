package Ch01_Basics.Lesson;

public class R15_Array {
    static void main(String[] args) {

        int[] myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 50;
        myArray[3] = 30;
        myArray[4] = 410;

        System.out.println(myArray[4]);

        // Array Traversal
        int[] myNewArray = {80, 20, 35, 25, 69};
        int i = 0;
        while (i < myNewArray.length){
            System.out.print(myNewArray[i] + ",");
            i++;
        }

        String[] stringArray = new String[3];
        stringArray[0] = "Sujit";
        stringArray[1] = "Amit";
        stringArray[2] = "Ronit";


    }
}
