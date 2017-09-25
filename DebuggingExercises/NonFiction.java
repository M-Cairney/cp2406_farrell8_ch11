/**
 * Created by jc260799 on 25/09/17.
 */
public class NonFiction extends Book {
    public NonFiction(){
        super("NonFiction Book");
        setPrice();
    }

    public void setPrice()
    {
        super.bookPrice = 37.99;
    }
}
