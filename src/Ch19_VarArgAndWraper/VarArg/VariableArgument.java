package Ch19_VarArgAndWraper.VarArg;

public class VariableArgument {

    public static int sum(int a, int b){
        return a + b;
    }


    public static int sumWithArray (int[] array){
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        return sum;
    }

    // with variable argument you can use
    public static int sumWithVarArg(int ...arg){
        int sum = 0;
        for (int num : arg){
            sum += num;
        }
        return sum;
    }

    // you can set minimum two integer after that you can decide how much number want to add.

    public static int sumVarArgWitMinTwoInt(int a, int b, int ...nums){
        int sum = a + b;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }



    static void main(String[] args) {
        System.out.println( sum(4, 5));
        System.out.println(sumWithArray(new int[] {5, 6, 8, 10}));
        System.out.println(sumWithVarArg(5, 6, 8, 10 ));
        System.out.println(sumVarArgWitMinTwoInt(5, 6, 4,8,5,5));
        System.out.println(sumVarArgWitMinTwoInt(4,5));
    }

}
