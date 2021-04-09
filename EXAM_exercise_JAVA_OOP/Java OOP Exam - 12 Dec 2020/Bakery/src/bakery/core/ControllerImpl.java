package bakery.core;

import bakery.common.ExceptionMessages;
import bakery.common.OutputMessages;
import bakery.core.interfaces.Controller;
import bakery.entities.bakedFoods.Bread;
import bakery.entities.bakedFoods.Cake;
import bakery.entities.bakedFoods.interfaces.BakedFood;
import bakery.entities.drinks.Tea;
import bakery.entities.drinks.Water;
import bakery.entities.drinks.interfaces.Drink;
import bakery.entities.tables.InsideTable;
import bakery.entities.tables.OutsideTable;
import bakery.entities.tables.interfaces.Table;
import bakery.repositories.interfaces.*;

public class ControllerImpl implements Controller {
    private FoodRepository<BakedFood> foodRepository;
    private DrinkRepository<Drink> drinkRepository;
    private TableRepository<Table> tableTableRepository;
    private double getTotalPrice;

    public ControllerImpl(FoodRepository<BakedFood> foodRepository,
                          DrinkRepository<Drink> drinkRepository, TableRepository<Table> tableRepository) {
        this.foodRepository = foodRepository;
        this.drinkRepository = drinkRepository;
        this.tableTableRepository = tableRepository;
        this.getTotalPrice = 0;

    }
    @Override
    public String addFood(String type, String name, double price) {
        BakedFood bakedFood = this.foodRepository.getByName (name);
        if(bakedFood != null){
            throw new IllegalArgumentException (String.format ("%s %s is already in the menu", type, name));
        }
        if(type.equals ("Bread")){
            bakedFood = new Bread (name, price);
        }else if(type.equals ("Cake")){
            bakedFood = new Cake (name, price);
        }this.foodRepository.add (bakedFood);
        return String.format ("Added %s (%s) to the menu", name, type);
    }
    @Override
    public String addDrink(String type, String name, int portion, String brand) {
        Drink drink = this.drinkRepository.getByNameAndBrand (name, brand);
        if(drink != null){
            throw new IllegalArgumentException (String.format ("%s %s is already in the menu",type, name));
        }
        if(type.equals ("Tea")){
            drink = new Tea (name, portion, brand);
        }else if(type.equals ("Water")){
            drink = new Water (name, portion, brand);
        }
        this.drinkRepository.add (drink);
        return String.format ("Added %s (%s) to the drink menu", name, brand);
    }
    @Override
    public String addTable(String type, int tableNumber, int capacity) {
        Table table = this.tableTableRepository.getByNumber (tableNumber);
        if(table != null){
            throw new IllegalArgumentException (String.format ("Table %d is already added to the restaurant",tableNumber));
        }
        if(type.equals ("InsideTable")){
            table = new InsideTable (tableNumber, capacity);
        }
        else if(type.equals ("OutsideTable")){
            table = new OutsideTable (tableNumber, capacity);
        }
        this.tableTableRepository.add (table);
        return String.format ("Added table number %d in the bakery", tableNumber);
    }

    @Override
    public String reserveTable(int numberOfPeople) {
        String mesage = "";
        Table table = null;
        for(Table out: this.tableTableRepository.getAll ()){
            if(!out.isReserved () && out.getCapacity () >= numberOfPeople){
                table = out;
                break;
            }
        }if(table == null){
            mesage = String.format ("No available table for %d people",numberOfPeople);
        }else {
            table.reserve (numberOfPeople);
            mesage = String.format ("Table %d has been reserved for %d people",table.getTableNumber (), numberOfPeople);
        }
        return mesage;
    }

    @Override
    public String orderFood(int tableNumber, String foodName) {
        String mesage = "";
        Table table = this.tableTableRepository.getByNumber (tableNumber);
        BakedFood bakedFood = this.foodRepository.getByName (foodName);
        if(table == null || !table.isReserved ()){
            mesage = String.format ("Could not find table %d",tableNumber);
        }
        else if(bakedFood == null){
            mesage = String.format ("No %s in the menu",foodName);
        }else {
            table.orderFood (bakedFood);
            mesage = String.format ("Table %d ordered %s",tableNumber, foodName);
        }
        return mesage;
    }

    @Override
    public String orderDrink(int tableNumber, String drinkName, String drinkBrand) {
        String message = "";
        Table table = this.tableTableRepository.getByNumber (tableNumber);
        Drink drink = this.drinkRepository.getByNameAndBrand (drinkName, drinkBrand);
        if(table == null){
            message = String.format ("Could not find table %d",tableNumber);
        }
        else if(drink == null){
            message = String.format ("There is no %s %s available",drinkName, drinkBrand);
        }
        else {
            table.orderDrink (drink);
            message = String.format ("Table %s ordered %s %s",tableNumber, drinkName, drinkBrand);
        }
        return message;

    }

    @Override
    public String leaveTable(int tableNumber) {
        Table table = this.tableTableRepository.getByNumber (tableNumber);
        double bill = table.getBill ();
        this.getTotalPrice += bill;
        table.clear ();
        return String.format ("Table: %d%nBill: %.2f",tableNumber, bill);
    }

    @Override
    public String getFreeTablesInfo() {
        StringBuilder sb = new StringBuilder ();
        for(Table out: this.tableTableRepository.getAll ()){
            if(!out.isReserved ()){
                sb.append (out.getFreeTableInfo ());
                sb.append (System.lineSeparator ());
            }
        }
        return sb.toString ().trim ();
    }

    @Override
    public String getTotalIncome() {

        return String.format ("Total income: %.2flv", this.getTotalPrice);
    }
}
