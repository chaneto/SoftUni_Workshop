package easterRaces.repositories;

import easterRaces.entities.racers.Race;
import easterRaces.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;

public class RaceRepository implements Repository<Race> {
    private Collection<Race> races = new ArrayList<> ();
    @Override
    public Race getByName(String name) {
        Race race = null;
        for(Race out: this.races){
            if(out.getName ().equals (name)){
                race = out;
                break;
            }
        }
        return race;
    }

    @Override
    public Collection<Race> getAll() {
        return this.races;
    }

    @Override
    public void add(Race model) {
        this.races.add (model);
    }

    @Override
    public boolean remove(Race model) {
        boolean yes = false;
        if(this.races.contains (model)){
            yes = true;
            this.races.remove (model);
        }
        return yes;
    }
}
