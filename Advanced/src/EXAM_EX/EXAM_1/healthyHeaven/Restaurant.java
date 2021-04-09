package EXAM_EX.EXAM_1.healthyHeaven;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Restaurant {
    private String name;
    private List<Salad> data;

    public Restaurant(String name) {
        this.name = name;
        this.data = new ArrayList<> ();

    }
    public void add(Salad salad){
        this.data.add (salad);

    }public boolean buy(String name){
        return this.data.removeIf (f -> f.getName ().equals (name));
    }
    public Salad getHealthiestSalad(){

     return  this.data.stream ().min (Comparator.comparing (Salad::getTotalCalories)).orElse (null);
    }
    public String generateMenu(){
        String output = "";
        for(Salad out: this.data){
            output += out.toString ();
            output += System.lineSeparator ();
        }output = output.substring (0, output.length () - 2);
     return    String.format ("%s have %d salads:%n%s",this.name,this.data.size (),output);
    }
}
