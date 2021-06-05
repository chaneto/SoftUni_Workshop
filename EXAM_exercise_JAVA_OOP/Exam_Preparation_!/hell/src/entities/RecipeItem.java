package entities;
import interfaces.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeItem extends Items implements Recipe {
    List<String> requiredItems;

    public RecipeItem(String name, int strength, int agility, int intelligence, int hitPoints, int damage) {
        super (name, strength, agility, intelligence, hitPoints, damage);
        requiredItems = new ArrayList<> ();
    }

    @Override
    public List<String> getRequiredItems() {
        return this.requiredItems;
    }
}
