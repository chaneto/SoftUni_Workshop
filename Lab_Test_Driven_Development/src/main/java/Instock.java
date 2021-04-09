

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Instock implements ProductStock {
    private List<Product> productList;

    public Instock() {
        this.productList = new ArrayList<> ();
    }

    @Override
    public int getCount() {
        int result = 0;
        for(Product out : this.productList){
            result++;
        }return result;
    }
    @Override
    public boolean contains(Product product) {
        for(Product out : this.productList){
            if(out.getLabel ().equals (product.getLabel ()) && out.getQuantity () == product.getQuantity () &&
            out.getPrice () == product.getPrice ()){
                return true;
            }
        }return false;
    }
    @Override
    public void add(Product product) {
        this.productList.add (product);
    }
    @Override
    public void changeQuantity(String product, int quantity) {
        findByLabel (product).setQuantity (quantity);
    }
    @Override
    public Product find(int index) {
       try {
           return this.productList.get (index);
       }catch (IndexOutOfBoundsException e){
           throw new IndexOutOfBoundsException ("Invalid Index");
       }
    }
    @Override
    public Product findByLabel(String label) {
        Product product = null;
        for(Product out : this.productList){
            if(out.getLabel ().equals (label)){
                product = out;
                break;
            }
        }if(product != null){
            return product;
        }else {
            throw new IllegalArgumentException("Invalid Labael");
        }
    }
    @Override
    public Iterable<Product> findFirstByAlphabeticalOrder(int count) {
        List<Product> products = new ArrayList<> ();
        if(count > this.productList.size ()){
            return products;
        }else {
        for (int i = 0; i < count; i++) {
            products.add (this.productList.get (i));
           }
        }
        return products.stream ().sorted ((s1,s2) -> s1.getLabel ().compareTo (s2.getLabel ())).collect (Collectors.toList ());
    }
    @Override
    public Iterable<Product> findAllInRange(double lo, double hi) {
        List<Product> products = new ArrayList<> ();
        for(Product out: this.productList){
            if(out.getPrice () > lo && out.getPrice () <= hi){
                products.add (out);
            }
        }return products.stream ().sorted (Comparator.comparing (Product::getPrice)).collect (Collectors.toList ());
    }
    @Override
    public Iterable<Product> findAllByPrice(double price) {
        return this.productList.stream ()
                .filter (f -> f.getPrice () == price)
                .collect (Collectors.toList ());
    }
    @Override
    public Iterable<Product> findFirstMostExpensiveProducts(int count) {
        List<Product> products = new ArrayList<> ();
        List<Product> productsout = new ArrayList<> ();
        if(count > productList.size ()){
            throw new IllegalArgumentException("Invalid Count");
        }else {
            products = this.productList.stream ()
                    .sorted (Comparator.comparing (Product::getPrice))
                    .collect(Collectors.toList());
            for (int i = products.size () - 1; i >= 0; i--) {
                productsout.add (products.get (i));
            }
        }return productsout;
    }
    @Override
    public Iterable<Product> findAllByQuantity(int quantity) {
        List<Product> products = new ArrayList<> ();
        for(Product out: this.productList){
            if(out.getQuantity () == quantity){
                products.add (out);
            }
        }return products;
    }

    @Override
    public Iterator<Product> iterator() {
      return   productList.iterator ();
    }
}
