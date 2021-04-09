package C10_Polymorphism_EX.C1_Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicles{

    public Car(double fuelQuantity, double litersPerKm) {
        super (fuelQuantity, litersPerKm + 0.9);
    }
    public String Drive(Double km){
        if(isDrive (km)){
            DecimalFormat patern = new DecimalFormat ("0.##");
            setFuelQuantity (getFuelQuantity () - getLitersPerKm () * km);
            return String.format ("Car travelled %s km",patern.format (km));
        }else {
            return "Car needs refueling";
        }
    }

    @Override
    public String toString() {
        return String.format ("Car: %.2f",getFuelQuantity ());
    }
}
