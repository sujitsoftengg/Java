package Ch01_Basics.Chalanges;

public class C19_LeftHalfPyramid {

    static void main(String[] args) {

        int rows = 5;
        int i = 1;

        while (i <= rows){

            // space
            int j = 1;
            while (j <= rows-i){
                System.out.print("  ");
                j++;
            }

            // star
            int k = 1;
            while (k <= i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }

    }

}

/*
        *
      * *
    * * *
  * * * *
* * * * *

*/
