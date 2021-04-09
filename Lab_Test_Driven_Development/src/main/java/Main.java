import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product ("Petko", 8.0, 10);
        Product product1 = new Product ("Aetko", 4.0, 11);
        Product product2 = new Product ("Cetko", 9.0, 10);
        Instock instock = new Instock ();
        instock.add (product);
        instock.add (product1);
        instock.add (product2);
        instock.find (3);
        System.out.println ();
    }
}
