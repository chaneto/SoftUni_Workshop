package CounterStriker.repositories;

import CounterStriker.models.guns.Gun;

import java.util.ArrayList;
import java.util.Collection;

public class GunRepository<T extends Gun> implements Repository<T>{
  private Collection<T> models;

    public GunRepository() {
        this.models = new ArrayList<> ();
    }
    @Override
    public Collection getModels() {
        return this.models;
    }
    @Override
    public void add(T model) {
        if(model == null){
            throw new NullPointerException("Cannot add null in Gun Repository");
        }
        this.models.add ( model);
    }
    @Override
    public boolean remove(Gun model) {
        return this.models.removeIf (f -> f.getClass ().getSimpleName ().equals (model));
    }
    @Override
    public T findByName(String name) {
        T gun = null;
        for(T out: this.models){
            if(out.getName ().equals (name)){
                gun = out;
                break;
            }
        }return gun;
    }
}
