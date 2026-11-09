package Ch01_Basics.Chalanges;

public class C20_CenterPyramid {
    static void main() {

        int row = 5;
        int i = 1;

        while(i <= row){

            // Space Print
            int j = 1;
            while (j <= (row-i)){
                System.out.print("  ");
                j++;
            }

            // Star Print
            int k = 1;
            while (k <= i){
                System.out.print(" * ");
                k++;
            }
            i++;
            System.out.println();
        }

    }
}
