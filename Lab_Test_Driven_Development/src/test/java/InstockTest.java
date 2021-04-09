import com.sun.javafx.collections.MappingChange;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class InstockTest {
   private ProductStock products;
   private Product product;
   private Product product1;
   private Product product2;
   @Before
    public void setup(){
        products = new Instock ();
        product = new Product ("Sirene", 5.50, 2);
        product1 = new Product ("Pasti", 3.30, 3);
        product2 = new Product ("Salam", 9.00, 1);
    }
    @Test
    public void testADD(){
        products.add (product);
        assertTrue (products.contains (product));
    }
    @Test
    public void testConteinsTrue(){
        products.add (product);
        assertTrue (products.contains (product));
    }
    @Test
    public void testConteinsFalse(){
        products.add (product);
        assertFalse (products.contains (product1));
    }
    @Test
    public void testGetCount(){
        products.add (product);
        assertEquals (1, products.getCount ());
    }
    @Test
    public void testGetCountWhitEmptiList() {
        assertEquals (0, products.getCount ());
    }
    @Test
    public void testFind(){
        products.add (product);
        products.add (product1);
        int index = 1;
        assertTrue (equals (product1, products.find (index)));
    }
    @Test
    public void testFindByLabel(){
        products.add (product);
        products.add (product1);
        String label = "Sirene";
        assertTrue (equals (product, products.findByLabel (label)));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFindByInvalidLabel(){
        products.add (product);
        products.add (product1);
        String label = "Mirene";
        assertFalse (equals (product, products.findByLabel (label)));
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testFindByInvalidIndex(){
        products.add (product);
        products.add (product1);
        int index = 2;
        assertFalse (equals (product1, products.find (index)));
    }
    @Test
    public void testChangeQuantity(){
        products.add (this.product);
        int quantity = this.product.getQuantity () + 9;
        String product = "Sirene";
        products.changeQuantity (product, quantity);
        assertEquals (quantity, this.product.getQuantity ());
    }

    @Test
    public void testFindFirstbyAlphabeticalOrder(){
       products.add (product);
       products.add (product1);
       products.add (product2);
       int count = 3;
        List<Product> list = (List<Product>) products.findFirstByAlphabeticalOrder (count);
       assertEquals (3, list.size ());
    }
    @Test
    public void testFindFirstbyAlphabeticalOrderWhitInvalidCount(){
        products.add (product);
        products.add (product1);
        products.add (product2);
        int count = 4;
        List<Product> list = (List<Product>) products.findFirstByAlphabeticalOrder (count);
        assertEquals (0, list.size ());
    }
    @Test
    public void testFindAllInRangeByPriceHiLo(){
        products.add (product);
        products.add (product1);
        products.add (product2);
        double lo = 3.00;
        double hi = 22.00;
        List<Product> list = (List<Product>) products.findAllInRange (lo, hi);
        assertEquals (3, list.size ());
    }
    @Test
    public void testFindAllByPrice(){
        products.add (product);
        products.add (product1);
        products.add (product2);
        double price = 3.30;
        products.findAllByPrice (price);
        List<Product> list = (List<Product>) products.findAllByPrice (price);
        assertEquals (1, list.size ());
    }
    @Test
    public void testFindFirstMostExpensiveProducts(){
        products.add (product);
        products.add (product1);
        products.add (product2);
        int count = 3;
        List<Product> list = (List<Product>) products.findFirstMostExpensiveProducts (count);
        assertEquals (3, list.size ());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFindFirstMostExpensiveProductsWhitInvalidCount(){
        products.add (product);
        products.add (product1);
        products.add (product2);
        int count = 4;
        List<Product> list = list = (List<Product>) products.findFirstMostExpensiveProducts (count);
        assertEquals (3, list.size ());
    }
    @Test
    public void testFindAllByQuantity(){
        products.add (product);
        products.add (product1);
        products.add (product2);
        int quantity = 3;
        List<Product> list = list = (List<Product>) products.findAllByQuantity (quantity);
        assertEquals (1, list.size ());
    }
    @Test
    public void testIterator(){
        products.add (product);
        products.add (product1);
        products.add (product2);
        Iterator<Product> productIterator = products.iterator ();
        for(Product out: products){
            assertEquals (productIterator.next (), out);
        }
    }
    public static boolean equals(Product product, Product product1){
       return product.getLabel ().equals (product1.getLabel ()) &&
               product.getPrice () == product1.getPrice () &&
               product.getQuantity () == product1.getQuantity ();
    }

}