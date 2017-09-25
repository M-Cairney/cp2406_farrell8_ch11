/**
 * Created by jc260799 on 25/09/17.
 */
public class UseBook {
    public static void main(String[] args) {
        Fiction book1 = new Fiction();
        NonFiction book2 = new NonFiction();

        System.out.println(book1.getTitle());
        System.out.println("The Price of this is " + String.valueOf(book1.getPrice()));
        System.out.println(book2.getTitle());
        System.out.println("The Price of this is " + String.valueOf(book2.getPrice()));
    }
}
