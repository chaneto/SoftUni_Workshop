package bakery.entities.tables;

import bakery.entities.bakedFoods.interfaces.BakedFood;
import bakery.entities.drinks.interfaces.Drink;
import bakery.entities.tables.interfaces.Table;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseTable implements Table {
    private Collection<BakedFood> foodOrders;
    private Collection<Drink> drinkOrders;
    private int tableNumber;
    private int capacity;
    private int numberOfPeople;
    private double 	pricePerPerson;
    private boolean isReserved;
    private double 	price;

    protected BaseTable(int tableNumber, int capacity, double pricePerPerson) {
        this.tableNumber = tableNumber;
        setCapacity (capacity);
        this.pricePerPerson = pricePerPerson;
        this.isReserved = false;
        this.foodOrders = new ArrayList<> ();
        this.drinkOrders = new ArrayList<> ();
    }

    private void setCapacity(int capacity) {
        if(capacity < 0){
            throw new IllegalArgumentException ("Capacity has to be greater than 0");
        }
        this.capacity = capacity;
    }

    private void setNumberOfPeople(int numberOfPeople) {
        if(numberOfPeople <= 0){
          throw new   IllegalArgumentException("Cannot place zero or less people!");
        }
        this.numberOfPeople = numberOfPeople;
    }

    private void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public int getTableNumber() {
        return this.tableNumber;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public int getNumberOfPeople() {
        return this.numberOfPeople;
    }

    @Override
    public double getPricePerPerson() {
        return this.pricePerPerson;
    }

    @Override
    public boolean isReserved() {
        return this.isReserved;
    }

    @Override
    public double getPrice() {
        return getPricePerPerson () * getNumberOfPeople ();
    }

    @Override
    public void reserve(int numberOfPeople) {

        if(getCapacity () >= numberOfPeople){
            setNumberOfPeople (numberOfPeople);
        setReserved (true);
        this.numberOfPeople = numberOfPeople;
        }
    }

    @Override
    public void orderFood(BakedFood food) {
        this.foodOrders.add (food);
    }

    @Override
    public void orderDrink(Drink drink) {
        this.drinkOrders.add (drink);
    }

    @Override
    public double getBill() {
        double sum = 0;
      sum += this.foodOrders.stream ().mapToDouble (BakedFood::getPrice).sum ();
      sum += this.drinkOrders.stream ().mapToDouble (Drink::getPrice).sum ();
        return sum + getPrice ();
    }

    @Override
    public void clear() {
        this.foodOrders.clear ();
        this.drinkOrders.clear ();
        setReserved (false);
        this.numberOfPeople = 0;
        this.price = 0;
    }

    @Override
    public String getFreeTableInfo() {
        return String.format ("Table: %d%nType: %s%nCapacity: %d%nPrice per Person: %.2f",
               getTableNumber (), this.getClass ().getSimpleName (), getCapacity (), getPricePerPerson () );
    }
}
