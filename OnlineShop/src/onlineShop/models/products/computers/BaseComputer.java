package onlineShop.models.products.computers;

import onlineShop.models.BaseProduct;
import onlineShop.models.products.Product;
import onlineShop.models.products.components.Component;
import onlineShop.models.products.peripherals.Peripheral;

import java.util.ArrayList;
import java.util.List;

import static onlineShop.common.constants.ExceptionMessages.*;
import static onlineShop.common.constants.OutputMessages.COMPUTER_COMPONENTS_TO_STRING;
import static onlineShop.common.constants.OutputMessages.COMPUTER_PERIPHERALS_TO_STRING;

public abstract class BaseComputer extends BaseProduct implements Computer {
    private List<Component> components;
    private List<Peripheral> peripherals;
    protected BaseComputer(int id, String manufacturer, String model, double price, double overallPerformance) {
        super (id, manufacturer, model, price, overallPerformance);
        this.components = new ArrayList<> ();
        this.peripherals = new ArrayList<> ();
    }
    @Override
    public double getOverallPerformance(){
        double average = 0;
        if(!this.components.isEmpty ()){
            for(Component out: this.components){
                average += out.getOverallPerformance ();
            }
            average =  (average / components.size ()) + super.getOverallPerformance ();
        }
        else {
            average = super.getOverallPerformance ();
        }return average;
    }@Override
    public double getPrice(){
        double sum = 0;
        for(Component out: this.components){
            sum += out.getPrice ();
        }
        for(Peripheral out: this.peripherals){
            sum += out.getPrice ();
        }
        return sum + super.getPrice ();
    }
    @Override
    public List<Component> getComponents() {
        return this.components;
    }
    @Override
    public List<Peripheral> getPeripherals() {
        return this.peripherals;
    }
    @Override
    public void addComponent(Component component){
        if(this.components.contains (component)){
            throw new IllegalArgumentException(String.format (EXISTING_COMPONENT,
                    component.getClass ().getSimpleName (),this.getClass ().getSimpleName (),getId ()));
            //"Component {component type} already exists in {computer type} with Id {id}."
        }this.components.add (component);
    }@Override
    public Component removeComponent(String componentType) {
        int count  = 0;
        Component component = null;
        for(Component out: this.components){
            if(out.getClass ().getSimpleName ().equals (componentType)){
                count++;
                component = out;
            }
        }
        if(this.components.isEmpty () || count == 0){
            throw new IllegalArgumentException(String.format (NOT_EXISTING_COMPONENT,
                    componentType, this.getClass ().getSimpleName (), getId ()));
            // Component {component type} does not exist in {computer type} with Id {id}."
        }this.components.remove (component);
        return component;
    }@Override
    public void addPeripheral(Peripheral peripheral){
        if(this.peripherals.contains (peripheral)){
            throw new IllegalArgumentException(String.format (EXISTING_PERIPHERAL,
                    peripheral.getClass ().getSimpleName (), this.getClass ().getSimpleName (), getId ()));
            // Peripheral {peripheral type} already exists in {computer type} with Id {id}."
        }this.peripherals.add (peripheral);
    }@Override
    public Peripheral removePeripheral(String peripheralType){
        Peripheral peripheral = null;
        int count = 0;
        for(Peripheral out: this.peripherals){
            if(out.getClass ().getSimpleName ().equals (peripheralType)){
                count++;
                peripheral = out;
            }
        }if(this.peripherals.isEmpty () || count == 0){
            throw new IllegalArgumentException(String.format (NOT_EXISTING_PERIPHERAL,
                    peripheralType, this.getClass ().getSimpleName (), getId ()));
            //Peripheral {peripheral type} does not exist in {computer type} with Id {id}."
        }this.peripherals.remove (peripheral);
        return peripheral;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder ();
        st.append (String.format ("Overall Performance: %.2f. Price: %.2f" +
                        " - %s: %s %s (Id: %d)",getOverallPerformance (), getPrice (),
                this.getClass ().getSimpleName (),getManufacturer (),getModel (),getId ()));
        st.append (System.lineSeparator ());
        st.append (String.format (" " + COMPUTER_COMPONENTS_TO_STRING, components.size ()));
        st.append (System.lineSeparator ());
        for(Component out: components){
            st.append ("  " + out);
            st.append (System.lineSeparator ());
        }
        double average = 0;
        if(!this.peripherals.isEmpty ()){
            for(Peripheral out: peripherals){
                average += out.getOverallPerformance ();
            }average = average / peripherals.size ();
        }

        st.append (String.format (" " + COMPUTER_PERIPHERALS_TO_STRING, peripherals.size (),average));
        //" Peripherals ({peripherals count}); Average Overall Performance ({average overall performance peripherals}):"
        st.append (System.lineSeparator ());
        for(Peripheral out: peripherals){
            st.append ("  " + out);
            st.append (System.lineSeparator ());
        } st.trimToSize ();
        return (st.toString ().trim ());
    }
}
