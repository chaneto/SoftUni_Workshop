package EXAM_EX.EXAM_2.C3_rabbits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {
    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<> ();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {

        return capacity;
    }
    public void add(Rabbit rabbit){
        if(data.size () < this.capacity){
        data.add (rabbit);
        }
    }
    public boolean removeRabbit(String name){
        for (int i = 0; i < data.size (); i++) {
            if(data.get (i).getName ().equals (name)){
                data.remove (i);
                return true;
           }
        }
        return false;

    }
    public void removeSpecies(String species){
        this.data.removeIf(r-> r.getSpecies().equals(species));


    }public Rabbit sellRabbit(String name){
        Rabbit rabbit = null;
        for (int i = 0; i < data.size (); i++) {
            if(data.get (i).getName ().equals (name)){
                data.get (i).setAvailable (false);
                rabbit = data.get (i);
                break;
            }
        }return rabbit;
    }
    public List<Rabbit> sellRabbitBySpecies(String species){
        List<Rabbit> soldRabbits = data.stream().filter(r-> r.getSpecies().equals(species)).collect(Collectors.toList());

        data.removeIf(x-> x.getSpecies().equals(species));

        return soldRabbits;
    }
    public int count(){
        return data.size ();
    }
    public String report(){
       String output = "";
        for (int i = 0; i < data.size (); i++) {
            if(data.get (i).isAvailable ()){
           output += (data.get (i).toString ());
           output += (System.lineSeparator ());
            }

        }output = output.substring (0,output.length () - 2);
        return String.format ("Rabbits available at %s:%n%s",this.name,output);
    }
}
