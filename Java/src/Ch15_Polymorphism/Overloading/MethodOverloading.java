package Ch15_Polymorphism.Overloading;

public class MethodOverloading {


    public int add (int numA, int numB){
        return numA+numB;
    }

    public int add (int numA, int numB, int numC){
        return numA + numB + numC;
    }

    public double add (double numA, double numB){
        return numA + numB;
    }


    static void main(String[] args) {

        MethodOverloading myNum = new MethodOverloading();
        System.out.println(myNum.add(5.5, 6.8));

        MethodOverloading myObj = new MethodOverloading();
        System.out.println(myObj.add(5, 6, 7));

    }

}
