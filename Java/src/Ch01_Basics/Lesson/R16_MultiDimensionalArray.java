package Ch01_Basics.Lesson;

public class R16_MultiDimensionalArray {
    static void main(String[] args) {
        int[][] newMultDimensionalArray = new int[2][3];

        newMultDimensionalArray[0][0] = 5;

        int[][] newMultiArray = {{},{},{}};
        System.out.println(newMultiArray.length);

        int[][] inArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(inArray.length);
        // Multi Dimensional Array Traversal
        System.out.println("------------------Multi Dimensional Array Traversal----------------");
        int i = 0; // 0, 1, 2
        while (i < inArray.length){
            int j = 0; // 0, 1, 2
            while (j <= inArray.length){
                System.out.print(inArray[i][j] + " "); //
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
