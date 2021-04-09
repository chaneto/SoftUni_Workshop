package EXAM_EX.EXAM_5.parking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Parking {
    private String type;
    private int capacity;
    private List<Car> data;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<> ();
    }public void add(Car car){
        if(this.data.size () < this.capacity){
            this.data.add (car);
        }
    }public boolean remove(String manufacturer, String model){
        return this.data.removeIf (f -> f.getManufacturer ().equals (manufacturer) && f.getModel ().equals (model));
    }public Car getLatestCar(){
        Car car = this.data.stream ().max (Comparator.comparing (Car::getYear)).orElse (null);
        return car;
    }public Car getCar(String manufacturer, String model){
        Car car = null;
        for(Car out : this.data){
            if(out.getManufacturer ().equals (manufacturer) && out.getModel ().equals (model)){
                car = out;
            }
        }return car;
    }public int getCount(){
        return this.data.size ();
    }public String getStatistics (){
        String output = "";
        for(Car out: this.data){
            output += out.toString ();
            output += System.lineSeparator ();
        }
        return String.format ("The cars are parked in %s:%n%s",this.type,output);
    }
}
