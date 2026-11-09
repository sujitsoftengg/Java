package Ch13_Inheritance.Chalanges.Third;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOperations {
    private int[] number;

    ArrayOperations(int[] num){
        this.number = num;
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    class Statistics {

       double mean() {

           if (number == null || number.length ==0) return 0;

           double sum = 0;
           for(int num : number){
               sum += num;
           }
           return sum/number.length;
       }

       double median() {
           if (number == null || number.length ==0) return 0;
           int[] myArray = number.clone();
           Arrays.sort(myArray);

           int arrayLength = myArray.length;

           if (arrayLength % 2 == 0){
               return (myArray[arrayLength/2-1] + myArray[arrayLength/2]) / 2.0;
           }else {
               return myArray[arrayLength/2];
           }
       }
   }
}
