/**
 * Created by jc260799 on 25/09/17.
 */
public abstract class Book {
    String bookTitle = new String();
    double bookPrice;

    public Book(String newTitle){

        bookTitle = newTitle;

    }

    public String getTitle(){
        return ("The title of this book is " + bookTitle);
    }

    public double getPrice(){
        return bookPrice;
    }

    public abstract void setPrice();



}
