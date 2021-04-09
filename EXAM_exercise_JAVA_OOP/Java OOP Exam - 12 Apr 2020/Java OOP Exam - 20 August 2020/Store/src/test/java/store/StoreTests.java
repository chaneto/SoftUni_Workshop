package store;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StoreTests {
    Store store;
    Product product1;
    Product product2;
    Product product3;
    Product product4;
    Product product5;
    @Before
    public void setup(){
        store = new Store ();
        product1 = new Product ("Gosho", 20, 50);
        product2 = new Product ("Peshp", 30, 60);
        product3 = new Product ("Gencho", 40, 70);
        product4 = new Product ("Mencho", -40, 70);
        product5 = null;
    }
    @Test
    public void testAddProduct(){
        store.addProduct (product1);
        store.addProduct (product2);
        store.addProduct (product3);
        Assert.assertEquals (3, store.getCount ());
        List<Product> products = store.getProducts ();
        Assert.assertEquals (products, store.getProducts ());
        Assert.assertEquals (products.size (), store.getProducts ().size ());
        String name = "Gosho";
        int quantity = 20;
        double product = store.buyProduct (name,quantity);
        Assert.assertEquals (product, product1.getPrice () * quantity,0);

    }
    @Test(expected = IllegalArgumentException.class)
    public void testWhitNullProduuct() {
        store.addProduct (product5);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWhitInvalidQuantityProduuct(){
        store.addProduct (product4);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testByProductWhitNullProduct(){
        store.addProduct (product1);
        String name = null;
        int quantity = 33;
       double sum = store.buyProduct (name, quantity);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testByProductWhitSmallQuantitytProduct(){
        store.addProduct (product1);
        String name = "Gosho";
        int quantity = 33;
       double sum = store.buyProduct (name, quantity);
    }
    @Test
    public void testgetTheMostExpensiveProduct(){
        store.addProduct (product1);
        store.addProduct (product2);
        store.addProduct (product3);
        Product product = store.getTheMostExpensiveProduct ();
        Assert.assertEquals (product.getPrice (), product3.getPrice (), 0);
    }
}