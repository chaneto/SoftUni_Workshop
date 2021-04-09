package EXAM_EX.EXAM_1.healthyHeaven;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private List<Vegetable> products;
    private String name;

    public String getName() {
        return this.name;
    }

    public Salad(String name) {
        this.products = new ArrayList<> ();
        this.name = name;
    }
    public int getTotalCalories(){
        int sum = 0;
        for (int i = 0; i < products.size (); i++) {
            sum += this.products.get (i).getCalories ();
        }
          return sum;
    }public int getProductCount()
    {
        return this.products.size ();
    }
    public void add(Vegetable product){
        this.products.add (product);

    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder ();
        for (int i = 0; i < products.size (); i++) {
            output.append (products.get (i).toString ());
            if(i < products.size () - 1){
                output.append (System.lineSeparator ());
            }
        }
        return String.format ("* Salad %s is %d calories and have %d products:%n%s"
                ,this.name,getTotalCalories (),getProductCount (),output);
    }
}
