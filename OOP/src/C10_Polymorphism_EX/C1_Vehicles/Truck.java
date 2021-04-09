package C10_Polymorphism_EX.C1_Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicles{

    public Truck(double fuelQuantity, double litersPerKm) {
        super (fuelQuantity, litersPerKm + 1.6);
    }@Override
    public double Refuel(double fuel)
    {
        return getFuelQuantity () + (fuel * 0.95);
    }
    public String Drive(Double km){
        if(isDrive (km)){
            DecimalFormat patern = new DecimalFormat ("#.##");
            setFuelQuantity (getFuelQuantity () - getLitersPerKm () * km);
            return String.format ("Truck travelled %s km",patern.format (km));
        }else {
            return "Truck needs refueling";
        }
    }

    @Override
    public String toString() {
        return String.format ("Truck: %.2f",getFuelQuantity ());
    }
}
