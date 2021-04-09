package CounterStriker.repositories;

import CounterStriker.models.players.Player;

import java.util.ArrayList;
import java.util.Collection;

public class PlayerRepository<T extends Player> implements Repository<T>{
    private Collection<T> models;

    public PlayerRepository() {
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
        this.models.add (model);
    }
    @Override
    public boolean remove(Player model) {
        return this.models.removeIf (f -> f.getClass ().getSimpleName ().equals (model));
    }
    @Override
    public T findByName(String name) {
        T player = null;
        for(T out: this.models){
            if(out.getUsername ().equals (name)){
                player = out;
                break;
            }
        }return player;
    }
}
