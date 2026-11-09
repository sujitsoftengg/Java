package Ch04_LoopsAndBreakContinue.Lesson;

public class ForEach {
    static void main(String[] args) {

        String[] myArray = new String[] {"Sujit", "Amit", "Sumit", "Rohit", "Shivam", "Aman"};

        printWithForEach(myArray);
        System.out.println();
        printArrayWithFor(myArray);

    }

    public static void printArrayWithFor(String[] myArray){
        for (int i =0; i < myArray.length; i++){
            System.out.print(myArray[i] + ", ");
        }
    }

    public static void printWithForEach(String[] myArray){
        for (String name : myArray){
            System.out.print(name + ", ");
        }
    }

}
