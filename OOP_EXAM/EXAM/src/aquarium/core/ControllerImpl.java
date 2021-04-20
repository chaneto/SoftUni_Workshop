package aquarium.core;

import aquarium.entities.aquariums.Aquarium;
import aquarium.entities.aquariums.FreshwaterAquarium;
import aquarium.entities.aquariums.SaltwaterAquarium;
import aquarium.entities.decorations.Decoration;
import aquarium.entities.decorations.Ornament;
import aquarium.entities.decorations.Plant;
import aquarium.entities.fish.Fish;
import aquarium.entities.fish.FreshwaterFish;
import aquarium.entities.fish.SaltwaterFish;
import aquarium.repositories.DecorationRepository;
import aquarium.repositories.Repository;

import java.util.ArrayList;
import java.util.Collection;

public class ControllerImpl implements Controller{
    private Repository repository = new DecorationRepository ();
    private Collection<Aquarium> aquariums = new ArrayList<> ();


    @Override
    public String addAquarium(String aquariumType, String aquariumName) {
        Aquarium aquarium = null;
        if(aquariumType.equals ("FreshwaterAquarium")){
            aquarium = new FreshwaterAquarium (aquariumName);
        }
        else if(aquariumType.equals ("SaltwaterAquarium")){
            aquarium = new SaltwaterAquarium (aquariumName);
        }
        else {
            throw new NullPointerException ("Invalid aquarium type.");
        }
        this.aquariums.add (aquarium);
        return String.format ("Successfully added %s.",aquariumType);
    }

    @Override
    public String addDecoration(String type) {
        Decoration decoration = null;
        if(type.equals ("Ornament")){
            decoration = new Ornament ();
        }
        else if(type.equals ("Plant")){
            decoration = new Plant ();
        }
        else {
            throw new IllegalArgumentException ("Invalid decoration type.");
        }
        repository.add (decoration);
        return String.format ("Successfully added %s.",type);
    }

    @Override
    public String insertDecoration(String aquariumName, String decorationType) {
        Decoration decoration = repository.findByType (decorationType);
        Aquarium aquarium = null;
        for(Aquarium out: this.aquariums){
            if(out.getName ().equals (aquariumName)){
                aquarium = out;
                break;
            }
        }if(decoration == null){
            throw new IllegalArgumentException (String.format ("There isn't a decoration of type %s.",decorationType));
        }
        if(aquarium != null){
            aquarium.addDecoration (decoration);
            repository.remove (decoration);
        }
        return String.format ("Successfully added %s to %s.",decorationType,aquariumName);
    }

    @Override
    public String addFish(String aquariumName, String fishType, String fishName, String fishSpecies, double price) {
        Fish fish = null;
        Aquarium aquarium = null;
        for(Aquarium out: this.aquariums){
            if(out.getName ().equals (aquariumName)){
                aquarium = out;
                break;
            }
        }
        if(fishType.equals ("FreshwaterFish")){
            fish = new FreshwaterFish (fishName,fishSpecies,price);
        }
        else if(fishType.equals ("SaltwaterFish")){
            fish = new SaltwaterFish (fishName,fishSpecies,price);
        }
        else {
            throw new IllegalArgumentException ("Invalid fish type." );
        }
        if((fish.getClass ().getSimpleName ().equals ("FreshwaterFish")
                && aquarium.getClass ().getSimpleName ().equals ("FreshwaterAquarium"))
                || ((fish.getClass ().getSimpleName ().equals ("SaltwaterFish")
                && aquarium.getClass ().getSimpleName ().equals ("SaltwaterAquarium"))) ){
            aquarium.addFish (fish);
            return String.format ("Successfully added %s to %s.",fishType,aquariumName );


        }else {
            return "Water not suitable.";
        }

    }

    @Override
    public String feedFish(String aquariumName) {
        Aquarium aquarium = null;
        int counter = 0;
        for(Aquarium out: this.aquariums){
            if(out.getName ().equals (aquariumName)){
                aquarium = out;
                break;
            }
        }
        for(Fish out: aquarium.getFish ()){
            out.eat ();
            counter++;
        }
        return String.format ("Fish fed: %d", counter);
    }

    @Override
    public String calculateValue(String aquariumName) {
        Aquarium aquarium = null;
        double result = 0;
        int counter = 0;
        for(Aquarium out: this.aquariums){
            if(out.getName ().equals (aquariumName)){
                aquarium = out;
                break;
            }
        } result += aquarium.getFish ().stream ().mapToDouble (Fish::getPrice).sum ();
        result += aquarium.getDecorations ().stream ().mapToDouble (Decoration::getPrice).sum ();

        return String.format ("The value of Aquarium %s is %.2f.",aquariumName,result);
    }

    @Override
    public String report() {
        StringBuilder stringBuilder = new StringBuilder ();
        for(Aquarium out: this.aquariums){
            stringBuilder.append (out.getInfo ());
            stringBuilder.append (System.lineSeparator ());
        }
        return stringBuilder.toString ().trim ();
    }
}
