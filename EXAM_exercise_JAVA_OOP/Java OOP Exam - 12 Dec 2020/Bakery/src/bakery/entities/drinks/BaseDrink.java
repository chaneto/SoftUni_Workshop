package bakery.entities.drinks;

import bakery.entities.drinks.interfaces.Drink;

public abstract class BaseDrink implements Drink {
    private String name;
    private int portion;
    private double 	price;
    private String 	brand;

    protected BaseDrink(String name, int portion, double price, String brand) {
        setName (name);
        setPortion (portion);
        setPrice (price);
        setBrand (brand);
    }
    private void setName(String name) {
        if(name == null || name.trim ().isEmpty ()){
            throw new IllegalArgumentException ("Name cannot be null or white space!");
        }
        this.name = name;
    }

    private void setPortion(int portion) {
        if(portion <= 0){
            throw new IllegalArgumentException ("Portion cannot be less or equal to zero");
        }
        this.portion = portion;
    }

    private void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException ("Price cannot be less or equal to zero!");
        }
        this.price = price;
    }

    private void setBrand(String brand) {
        if(brand == null || brand.trim ().isEmpty ()){
            throw new IllegalArgumentException ("Brand cannot be null or white space!");
        }
        this.brand = brand;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPortion() {
        return this.portion;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String toString() {
        return String.format ("%s %s - %dml - %.2flv",
                getName (), getBrand (), getPortion (), getPrice ());
    }
}
