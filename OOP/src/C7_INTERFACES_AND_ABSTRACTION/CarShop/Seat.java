package C7_INTERFACES_AND_ABSTRACTION.CarShop;

public class Seat extends CarImpl implements Sellable{
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super (model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString () + String.format ("%n%s sells for %f",getModel (),getPrice ());
    }
}
