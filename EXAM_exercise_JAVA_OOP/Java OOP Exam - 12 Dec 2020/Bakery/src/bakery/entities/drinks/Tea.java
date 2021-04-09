package bakery.entities.drinks;

import bakery.entities.drinks.interfaces.Drink;

public class Tea extends BaseDrink {
private static final double PRICE = 2.50;
    public Tea(String name, int portion, String brand) {
        super (name, portion, PRICE, brand);
    }
}
