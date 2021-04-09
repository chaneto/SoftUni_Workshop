package EXAM_EX.EXAM_3.christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<> ();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }
    public int count(){
        return this.data.size ();
    }
    public void add(Present present){
        if(this.data.size () < capacity) {
            this.data.add (present);
        }
    }
    public boolean remove(String name){
        return this.data.removeIf (Present ->  Present.getName ().contains (name));
    }
    
    public Present heaviestPresent (){
     return   this.data.stream ().max (Comparator.comparing (Present::getWeight)).orElse (null);
    }public Present getPresent(String name){
        Present present = null;
        for (int i = 0; i < this.data.size (); i++) {
            if(this.data.get (i).getName ().equals (name)){
                present = this.data.get (i);
            }
        }return present;
    }public String report(){
        String output = "";
        for (int i = 0; i < this.data.size (); i++) {
            output += this.data.get (i).toString ();
            output += System.lineSeparator ();
        }output = output.substring (0,output.length () - 1);
        return String.format ("%s bag contains:%n%s",this.color,output);
    }
}
