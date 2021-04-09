package viceCity.repositories.interfaces;

import viceCity.models.guns.Gun;

import java.util.ArrayList;
import java.util.Collection;

public class GunRepository<T extends Gun> implements Repository<T>{
    Collection<T> models;

    public GunRepository() {
        this.models = new ArrayList<> ();
    }

    @Override
    public Collection<T> getModels() {
        return this.models;
    }

    @Override
    public void add(T model) {

        this.models.add (model);
    }

    @Override
    public boolean remove(T model) {
        boolean yes = false;
        for(T out: this.models){
            if(out.equals (model)){
                yes = true;
                this.getModels ().remove (out);
                break;
            }
        }return yes;
    }

    @Override
    public T find(String name) {
        for(T out: this.models){
            if(out.getName ().equals (name)){
                return out;
            }
        }
        return null;
    }
}
