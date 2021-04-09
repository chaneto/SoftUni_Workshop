package C10_Defining_Classes_Exercises.C3_Speed_Racing;

public class Car {
   private String car;
   private double fuel;
   private double price;
   private int km;
    public Car(String car, double fuel, double price){
        this.car = car;
        this.fuel = fuel;
        this.price = price;
        this.km = 0;
    }
    public String getCar(){

        return car;
    }
    public double getFuel()
    {
        return fuel;
    }
    public double getPrice(){

        return price;
    }
    public int getKm()
    {
        return km;
    }

    public void setKm(int km){

        this.km = km;
    }
    public void setFuel(double fuel){

        this.fuel = fuel;
    }
}
