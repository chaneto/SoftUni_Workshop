package onlineShop.models.products.peripherals;

import onlineShop.models.products.BaseProduct;
import onlineShop.models.products.Product;

import static onlineShop.common.constants.OutputMessages.PERIPHERAL_TO_STRING;

public abstract class BasePeripheral extends BaseProduct implements Peripheral{
    private String connectionType;
    protected BasePeripheral(int id, String manufacturer, String model, double price
            , double overallPerformance, String connectionType) {
        super (id, manufacturer, model, price, overallPerformance);
        this.connectionType = connectionType;
    }
    @Override
    public String getConnectionType() {
        return connectionType;
    }

    @Override
    public String toString() {
        return String.format ("Overall Performance: %.2f. Price: %.2f " +
                "- %s: %s %s (Id: %d) Connection Type: %s",
                getOverallPerformance (),getPrice (), this.getClass ().getSimpleName (), getManufacturer (),getModel (),
                getId (),getConnectionType ());
        //"Overall Performance: %.2f. Price: %.2f - %s: %s %s (Id: %d)";
       // "Overall Performance: {overall performance}. Price: {price} - {product type}: {manufacturer} {model} (Id: {id}) Connection Type: {connection type}"
    }
}
