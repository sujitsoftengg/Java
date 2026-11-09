package Ch01_Basics.Chalanges;

public class C18_RightHalfPyramid {
    static void main(String[] args) {

        int i = 0;
        while (i < 5) {

            int j = 0;

            while (j <= i){
                System.out.print("*");
                System.out.print(" ");
                j++;
            }

            System.out.println();
            i++;
        }

    }
}
