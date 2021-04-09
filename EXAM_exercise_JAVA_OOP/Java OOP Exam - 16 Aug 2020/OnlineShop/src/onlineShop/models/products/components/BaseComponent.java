package onlineShop.models.products.components;

import onlineShop.models.products.BaseProduct;
import onlineShop.models.products.Product;

import static onlineShop.common.constants.OutputMessages.COMPONENT_TO_STRING;

public abstract class BaseComponent extends BaseProduct implements Component {
    private int generation;

    protected BaseComponent(int id, String manufacturer, String model, double price, double overallPerformance, int generation) {
        super (id, manufacturer, model, price, overallPerformance);
        this.generation = generation;
    }

    @Override
    public int getGeneration() {
        return generation;
    }

    @Override
    public String toString() {
        return String.format ("Overall Performance: %.2f. Price: %.2f" +
                " - %s: %s %s (Id: %d) Generation: %d",
                getOverallPerformance (), getPrice (), this.getClass ().getSimpleName (), getManufacturer (),
                getModel (), getId (), getGeneration ());
       // "Overall Performance: {overall performance}. Price: {price} - {product type}: {manufacturer} {model} (Id: {id}) Generation: {generation}"
    }
}
