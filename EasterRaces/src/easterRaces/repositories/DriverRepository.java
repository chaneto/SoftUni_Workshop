package easterRaces.repositories;

import easterRaces.entities.cars.Car;
import easterRaces.entities.drivers.Driver;
import easterRaces.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;

public class DriverRepository implements Repository<Driver> {
    private Collection<Driver> drivers = new ArrayList<> ();


    @Override
    public Driver getByName(String name) {
        Driver driver = null;
        for(Driver out: this.drivers){
            if(out.getName ().equals (name)){
                driver = out;
                break;
            }
        }
        return driver;
    }

    @Override
    public Collection<Driver> getAll() {
        return this.drivers;
    }

    @Override
    public void add(Driver model) {
        this.drivers.add (model);
    }

    @Override
    public boolean remove(Driver model) {
        boolean yes = false;
        if(this.drivers.contains (model)){
            yes = true;
            this.drivers.remove (model);
        }
        return yes;
    }
}
