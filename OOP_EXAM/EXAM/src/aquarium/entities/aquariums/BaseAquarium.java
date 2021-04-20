package aquarium.entities.aquariums;

import aquarium.entities.decorations.Decoration;
import aquarium.entities.fish.Fish;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseAquarium implements Aquarium{
    private String name;
    private int capacity;
    private Collection<Decoration> decorations;
    private Collection<Fish> fish;

    protected BaseAquarium(String name, int capacity) {
        setName (name);
        this.capacity = capacity;
        this.decorations = new ArrayList<> ();
        this.fish = new ArrayList<> ();
    }

    private void setName(String name) {
        if(name == null || name.trim ().isEmpty ()){
            throw new NullPointerException ("Aquarium name cannot be null or empty.");
        }
        this.name = name;
    }

    @Override
    public int calculateComfort() {
        return this.decorations.stream ().mapToInt (Decoration::getComfort).sum ();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addFish(Fish fish) {
        if(this.capacity > this.fish.size ()){
            this.fish.add (fish);
        }
        else {
            throw new IllegalStateException ("Not enough capacity.");
        }
    }

    @Override
    public void removeFish(Fish fish) {
        this.fish.remove (fish);
    }

    @Override
    public void addDecoration(Decoration decoration) {
        this.decorations.add (decoration);
    }

    @Override
    public void feed() {
        for(Fish fish: this.fish){
            fish.eat ();
        }
    }

    @Override
    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder ();
        stringBuilder.append (String.format ("%s (%s):",getName (), this.getClass ().getSimpleName ()));
        stringBuilder.append (System.lineSeparator ());
        stringBuilder.append ("Fish: ");
        if(this.fish.isEmpty ()){
            stringBuilder.append ("none");
        }else {
        for(Fish out: this.fish){
            stringBuilder.append (out.getName () + " ");
          }
        }stringBuilder = stringBuilder.delete (stringBuilder.length () - 1, stringBuilder.length ());
        stringBuilder.append (System.lineSeparator ());
        stringBuilder.append (String.format ("Decorations: %d",this.decorations.size ()));
        stringBuilder.append (System.lineSeparator ());
        stringBuilder.append (String.format ("Comfort: %d",calculateComfort ()));
        return stringBuilder.toString ().trim ();
    }

    @Override
    public Collection<Fish> getFish() {
        return this.fish;
    }

    @Override
    public Collection<Decoration> getDecorations() {
        return this.decorations;
    }
}
