import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    @Test
    public void testSetLabel(){
      Product product = new Product ("Sirene", 5.50, 2);
      String label = "Lukanka";
      product.setLabel (label);
      assertEquals (label, product.getLabel ());
    }
    @Test
    public void testSetPrice(){
        Product product = new Product ("Sirene", 5.50, 2);
        double price = product.getPrice () + 8;
        product.setPrice (price);
        assertEquals (price, product.getPrice (), 0.00);
    }
}