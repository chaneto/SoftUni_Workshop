package bakery.entities.bakedFoods;

import bakery.entities.bakedFoods.interfaces.BakedFood;

public abstract class BaseFood implements BakedFood {
    private String name;
    private double portion;
    private double price;

    protected BaseFood(String name, double portion, double price) {
        setName (name);
        setPortion (portion);
        setPrice (price);
    }

    private void setName(String name) {
        if(name == null || name.trim ().isEmpty ()){
            throw new IllegalArgumentException ("Name cannot be null or white space!");
        }
        this.name = name;
    }

    private void setPortion(double portion) {
        if(portion <= 0){
            throw new IllegalArgumentException ("Portion cannot be less or equal to zero!");
        }
        this.portion = portion;
    }

    private void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException ("Price cannot be less or equal to zero!");
        }
        this.price = price;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public double getPortion() {
        return this.portion;
    }
    @Override
    public double getPrice() {
        return this.price;
    }
    @Override
    public String toString() {
        return String.format ("%s: %.2fg - %.2f",
                getName (), getPortion (), getPrice ());
    }
}
