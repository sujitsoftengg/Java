package Ch15_Polymorphism.Chalanges.First;

public class Calculator {


    public int add (int a, int b){
        return a + b;
    }

    public int add (int a, int b, int c){
        return a + b+ c;
    }

    public double add (double a, double b){
        return a + b;
    }

    static void main(String[] args) {
        Calculator numAdd = new Calculator();
        System.out.println(numAdd.add(5.5, 3.6));



    }



}
