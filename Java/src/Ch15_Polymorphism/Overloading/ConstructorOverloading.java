package Ch15_Polymorphism.Overloading;

public class ConstructorOverloading {
    final private String wishes;

    ConstructorOverloading(){
        this.wishes = "Welcome to Constructor Overloading";
        System.out.println("Welcome to Constructor Overloading");
    }

    ConstructorOverloading(String wishes){
        this.wishes = wishes;
        System.out.println(wishes);
    }


    static void main(String[] args) {

        ConstructorOverloading firstMethod = new ConstructorOverloading();
        ConstructorOverloading secondMethod= new ConstructorOverloading("Welcome Sir How Can I Help You!");

        System.out.println("---------------------------------Print wishes variable---------------------");
        System.out.println(firstMethod.wishes);
        System.out.println(secondMethod.wishes);




    }



}
