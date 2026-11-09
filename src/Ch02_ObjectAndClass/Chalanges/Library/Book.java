package Ch02_ObjectAndClass.Chalanges.Library;

public class Book {
    static int totalNoOfBooks;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    int totalBookInStock = 0 ;
    boolean isAvailable;
    int borrowedBook = 0;

    static {
        totalNoOfBooks = 0 ;
    }

    {
        totalNoOfBooks ++;
    }


    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this("Unknown", "Unknown", isbn);
    }

    static int getTotalBooks(){

        return totalNoOfBooks;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy the Book");
        }
    }

    public void returnBook (){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed please leave a review");
        }else{
            System.out.println("This is already in the library");        }

    }

}
