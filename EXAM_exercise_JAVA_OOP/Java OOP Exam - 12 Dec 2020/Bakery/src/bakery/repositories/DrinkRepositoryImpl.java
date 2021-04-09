package bakery.repositories;

import bakery.entities.drinks.interfaces.Drink;
import bakery.repositories.interfaces.DrinkRepository;

import java.util.ArrayList;
import java.util.Collection;

public class DrinkRepositoryImpl implements DrinkRepository<Drink> {
    private Collection<Drink> drinks = new ArrayList<> ();


    @Override
    public Drink getByNameAndBrand(String drinkName, String drinkBrand) {
        Drink drink = null;
        for(Drink out: this.drinks){
            if(out.getBrand ().equals (drinkBrand) && out.getName ().equals (drinkName)){
                drink = out;
                break;
            }
        }
        return drink;
    }

    @Override
    public Collection<Drink> getAll() {
        return this.drinks;
    }

    @Override
    public void add(Drink drink) {
        this.drinks.add (drink);
    }
}
