package onlineShop.models;

import onlineShop.models.products.Product;

public abstract class BaseProduct implements Product {
    private int id;
    private String manufacturer;
    private String model;
    private double price;
    private double overallPerformance;

    protected BaseProduct(int id, String manufacturer, String model, double price, double overallPerformance) {
        setId (id);
        setManufacturer (manufacturer);
        setModel (model);
        setPrice (price);
        setOverallPerformance (overallPerformance);
    }

    private void setId(int id) {
        if(id <= 0){
            throw new IllegalArgumentException ("Id can not be less or equal than 0.");
        }
        this.id = id;
    }

    private void setManufacturer(String manufacturer) {
        if(manufacturer == null || manufacturer.trim ().isEmpty ()){
            throw new IllegalArgumentException ("Manufacturer can not be empty.");
        }
        this.manufacturer = manufacturer;
    }

   private void setModel(String model) {
        if(model == null || model.trim ().isEmpty ()){
            throw new IllegalArgumentException ( "Model can not be empty.");
        }
        this.model = model;
    }

    private void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException ("Price can not be less or equal than 0.");
        }
        this.price = price;
    }

    private void setOverallPerformance(double overallPerformance) {
        if(overallPerformance <= 0){
            throw new IllegalArgumentException ("Overall Performance can not be less or equal than 0.");
        }
        this.overallPerformance = overallPerformance;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getOverallPerformance() {
        return this.overallPerformance;
    }

    @Override
    public String toString() {
        return String.format ("Overall Performance: %.2f. Price: %.2f - %s: %s %s (Id: %d)",
                getOverallPerformance (), getPrice (), this.getClass ().getSimpleName (), getManufacturer (), getModel (), getId ());
    }
}
