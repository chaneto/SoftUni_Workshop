package C10_Polymorphism_EX.C1_Vehicles;

public abstract class Vehicles {
    private double fuelQuantity;
    private double litersPerKm;

    protected Vehicles(double fuelQuantity, double litersPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.litersPerKm = litersPerKm;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getLitersPerKm() {
        return litersPerKm;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    public boolean isDrive(double km){
       return  (km * litersPerKm <= fuelQuantity);
    }
    public double Refuel(double fuel){
        return fuelQuantity + fuel;
    }
}
