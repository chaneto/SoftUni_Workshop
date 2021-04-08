package onlineShop.core.interfaces;

import onlineShop.models.products.Product;
import onlineShop.models.products.components.*;
import onlineShop.models.products.computers.Computer;
import onlineShop.models.products.computers.DesktopComputer;
import onlineShop.models.products.computers.Laptop;
import onlineShop.models.products.peripherals.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static onlineShop.common.constants.ExceptionMessages.*;
import static onlineShop.common.constants.ExceptionMessages.CAN_NOT_BUY_COMPUTER;
import static onlineShop.common.constants.ExceptionMessages.EXISTING_COMPUTER_ID;
import static onlineShop.common.constants.OutputMessages.*;

public class ControllerImpl implements Controller{
  private   Map<Integer, Computer> computerMap;
  private   Map<Integer, Component> componentMap;
  private   Map<Integer, Peripheral> peripheralMap;
    public ControllerImpl() {
        this.computerMap = new HashMap<> ();
        this.componentMap = new HashMap<> ();
        this.peripheralMap = new HashMap<> ();
    }

    @Override
    public String addComputer(String computerType, int id, String manufacturer, String model, double price) {
        Computer computer;
        if(computerType.equals ("Laptop")){
            computer = new Laptop (id, manufacturer, model, price);
        }else if(computerType.equals ("DesktopComputer")){
            computer = new DesktopComputer (id, manufacturer, model, price);
        }else {
            throw new IllegalArgumentException(INVALID_COMPUTER_TYPE);
        }
        if(this.computerMap.containsKey (id)){
            throw new IllegalArgumentException(EXISTING_COMPUTER_ID);
        }else {
            this.computerMap.put (computer.getId (), computer);
        }
        return String.format (ADDED_COMPUTER, id);
    }

    @Override
    public String addPeripheral(int computerId, int id, String peripheralType,
                                String manufacturer, String model, double price, double overallPerformance, String connectionType) {
        Peripheral peripheral;
        if(peripheralType.equals ("Headset")){
            peripheral = new Headset (id, manufacturer, model, price, overallPerformance, connectionType);
        }else if(peripheralType.equals ("Keyboard")){
            peripheral = new Keyboard (id, manufacturer, model, price, overallPerformance, connectionType);
        }else if(peripheralType.equals ("Monitor")){
            peripheral = new Monitor (id, manufacturer, model, price, overallPerformance, connectionType);
        }else if(peripheralType.equals ("Mouse")){
            peripheral = new Mouse (id, manufacturer, model, price, overallPerformance, connectionType);
        }else {
            throw new IllegalArgumentException(INVALID_PERIPHERAL_TYPE);
        }
        if(this.peripheralMap.containsKey (id)){
            throw new IllegalArgumentException(EXISTING_PERIPHERAL_ID);
        }else {
            if(!this.computerMap.containsKey (computerId)){
                throw new IllegalArgumentException("Computer with this id does not exist.");
            }else {
                this.peripheralMap.put (id, peripheral);
                this.computerMap.get (computerId).addPeripheral (peripheral);
                //Peripheral {peripheral type} with id {peripheral id} added successfully in computer with id {computer id}.".
                return String.format (ADDED_PERIPHERAL,peripheralType, id, computerId);
            }
        }
    }

    @Override
    public String removePeripheral(String peripheralType, int computerId) {
        if(!this.computerMap.containsKey (computerId)){
            throw new IllegalArgumentException ("Computer with this id does not exist.");
        }
        Peripheral peripheral =  this.computerMap.get (computerId).removePeripheral (peripheralType);
        this.peripheralMap.remove (peripheral.getId ());
        //"Successfully removed {peripheral type} with id { peripheral id
        return String.format (REMOVED_PERIPHERAL,peripheralType, peripheral.getId ());
    }

    @Override
    public String addComponent(int computerId, int id, String componentType,
                               String manufacturer, String model, double price, double overallPerformance, int generation) {
        Component component;
        if(componentType.equals ("CentralProcessingUnit")){
            component = new CentralProcessingUnit (id, manufacturer, model, price, overallPerformance, generation);
        }else if(componentType.equals ("Motherboard")){
            component = new Motherboard (id, manufacturer, model, price, overallPerformance, generation);
        }else  if(componentType.equals ("PowerSupply")){
            component = new PowerSupply (id, manufacturer, model, price, overallPerformance, generation);
        }else  if(componentType.equals ("RandomAccessMemory")){
            component = new RandomAccessMemory (id, manufacturer, model, price, overallPerformance, generation);
        }else  if(componentType.equals ("SolidStateDrive")){
            component = new SolidStateDrive (id, manufacturer, model, price, overallPerformance, generation);
        }else  if(componentType.equals ("VideoCard")){
            component = new VideoCard (id, manufacturer, model, price, overallPerformance, generation);
        }else {
            throw new IllegalArgumentException(INVALID_COMPONENT_TYPE);
        }if(this.componentMap.containsKey (id)){
            throw new IllegalArgumentException("Component with this id already exists.");
        }else {
            if(!this.computerMap.containsKey (computerId)){
                throw new IllegalArgumentException("Computer with this id does not exist.");
            }else {
                this.componentMap.put (id, component);
                this.computerMap.get (computerId).addComponent (component);
            }
        }
        //"Component {component type} with id {component id} added successfully in computer with id {computer id}.".
        return String.format (ADDED_COMPONENT,componentType, id, computerId);
    }

    @Override
    public String removeComponent(String componentType, int computerId) {
        if(!this.computerMap.containsKey (computerId)){
            throw new IllegalArgumentException ("Computer with this id does not exist.");
        }
        Component  component =  this.computerMap.get (computerId).removeComponent (componentType);
        this.componentMap.remove (component.getId ());
        //"Successfully removed {component type} with id {component id
        return String.format (REMOVED_COMPONENT,componentType,component.getId ());
    }

    @Override
    public String buyComputer(int id) {
        if(!this.computerMap.containsKey (id)){
            throw new IllegalArgumentException ("Computer with this id does not exist.");
        }
        Computer computer = this.computerMap.remove (id);
        return computer.toString ();
    }

    @Override
    public String BuyBestComputer(double budget) {
        double best = 0;
        List<Computer>  list = this.computerMap.values ().stream ()
                .sorted (Comparator.comparing (Computer::getOverallPerformance).reversed ()).collect(Collectors.toList());
        Computer computer = list.get (0);
        if(this.computerMap.isEmpty () || computer.getOverallPerformance () > budget ){
            //Can't buy a computer with a budget of ${budget}."
            throw new IllegalArgumentException(String.format (CAN_NOT_BUY_COMPUTER,budget));
        }
        return computer.toString ();
    }

    @Override
    public String getComputerData(int id) {
        if(!this.computerMap.containsKey (id)){
            throw new IllegalArgumentException ("Computer with this id does not exist.");
        }
        Computer computer = this.computerMap.get (id);
        return computer.toString ();
    }
}
