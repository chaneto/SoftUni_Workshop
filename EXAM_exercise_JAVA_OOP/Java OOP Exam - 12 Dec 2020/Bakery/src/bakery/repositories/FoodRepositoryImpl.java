package bakery.repositories;

import bakery.entities.bakedFoods.interfaces.BakedFood;
import bakery.repositories.interfaces.FoodRepository;

import java.util.ArrayList;
import java.util.Collection;

public class FoodRepositoryImpl implements FoodRepository<BakedFood> {
    private Collection<BakedFood> bakedFoods = new ArrayList<> ();
    @Override
    public BakedFood getByName(String name) {
        BakedFood bakedFood = null;
        for(BakedFood out: this.bakedFoods){
            if(out.getName ().equals (name)){
                bakedFood = out;
                break;
            }
        }
        return bakedFood;
    }

    @Override
    public Collection<BakedFood> getAll() {
        return this.bakedFoods;
    }

    @Override
    public void add(BakedFood bakedFood) {
        this.bakedFoods.add (bakedFood);
    }
}
