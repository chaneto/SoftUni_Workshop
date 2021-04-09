package EXAM_EX.EXAM_6.vetClinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<> ();
    }
    public void add(Pet pet){
        if(this.data.size () < capacity){
            this.data.add (pet);
        }
    }
    public boolean remove(String name){
        return this.data.removeIf (f -> f.getName ().equals (name));
    }
    public Pet getPet(String name, String owner){
        Pet pet = null;
        for(Pet out : this.data){
            if(out.getName ().equals (name) && out.getOwner ().equals (owner)){
                pet = out;
            }
        }return pet;
    }public Pet getOldestPet (){
        Pet pet = null;
        int current = 0;
        for(Pet out : this.data){
            if(out.getAge () > current){
                current = out.getAge ();
                pet = out;
            }
        }return pet;
    }public int getCount(){
        return this.data.size ();
    }public String getStatistics(){
        String output = "";
        for(Pet out: this.data){
            output += out.getName () + " " + out.getOwner ();
            output += System.lineSeparator ();
        }return String.format ("The clinic has the following patients:%n%s",output);
    }
}
