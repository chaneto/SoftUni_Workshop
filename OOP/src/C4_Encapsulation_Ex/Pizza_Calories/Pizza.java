package C4_Encapsulation_Ex.Pizza_Calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    Pizza (String name, int numberOfToppings){
        setName (name);
        setToppings (numberOfToppings);
        this.toppings = new ArrayList<> (numberOfToppings);
    }
    private void setName(String name){
        if(name == null || name.length() > 15 || name.trim ().isEmpty ()){
            throw new IllegalArgumentException ("Pizza name should be between 1 and 15 symbols.");
        }else {
            this.name = name;
        }
    }

    private void setToppings(int numberOfToppings) {
        if(numberOfToppings > 10 ||
                numberOfToppings < 0){
            throw new IllegalArgumentException ("Number of toppings should be in range [0..10].");
        }else{
            this.toppings = new ArrayList<> (numberOfToppings);
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }
    public void addTopping (Topping topping){
            this.toppings.add (topping);
    }
    public double getOverallCalories (){
        double sum = 0;
        double iii = this.dough.calculateCalories ();
        for(Topping out : toppings){
            sum += out.calculateCalories ();
        }
        return sum + this.dough.calculateCalories ();
    }
}
