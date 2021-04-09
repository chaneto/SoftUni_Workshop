package C4_Encapsulation_Ex.C3_Shopping_Spre;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName (name);
        setMoney (money);
        this.products = new ArrayList<> ();
    }

    public String getName() {
        return name;
    }


    public double getMoney() {

        return money;
    }

    private void setName(String name) {
        if(name == null || name.trim ().isEmpty ()){
            throw new IllegalArgumentException ("Name cannot be empty");
        }else {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException ("Money cannot be negative");
        }
        this.money = money;
    }
    public void buyProduct(Product product){
        if(getMoney () >= product.getCost ()){
            products.add (product);
            this.money -= product.getCost ();
        }else {
            throw new IllegalArgumentException (getName () + " can't afford " + product.getName ());
        }
    }

    @Override
    public String toString() {
        if(this.products.isEmpty ()){
            return String.format ("%s – Nothing bought%n",this.name);
        }else {
            String output = String.format ("%s - ",this.name);
            for(Product out : products){
                output += out.getName () + ", ";
            }output = output.substring (0, output.length () - 2);
            return output;
        }
    }
}
