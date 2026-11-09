package Ch02_ObjectAndClass.Chalanges.Library;

public class myBook {
    static void main(String[] args) {

        Book Python = new Book("Python Basics", "Sujit Tomar", "55025220");
        Book PythonOpps = new Book("Python Oops", "Sujit Tomar", "55025220");
        Book Java = new Book("Java Basics", "Sujit Tomar", "55025220");
        Book JavaOops = new Book("Java Oops", "Sujit Tomar", "55025220");

        System.out.println(Book.getTotalBooks());
        System.out.println(Book.totalNoOfBooks);
        Java.borrowBook();
        Python.returnBook();
        System.out.println(Java.isBorrowed);
    }
}
