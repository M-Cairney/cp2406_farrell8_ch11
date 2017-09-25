/**
 * Created by jc260799 on 25/09/17.
 */
public class Fiction extends Book {

    public Fiction(){
        super("Fiction Book");
        setPrice();
    }

    public void setPrice()
    {
        super.bookPrice = 24.99;
    }
}
