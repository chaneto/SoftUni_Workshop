package aquarium.repositories;

import aquarium.entities.decorations.Decoration;

import java.util.ArrayList;
import java.util.Collection;

public class DecorationRepository implements Repository{
    private Collection<Decoration> decorations = new ArrayList<> ();
    @Override
    public void add(Decoration decoration) {
        this.decorations.add (decoration);
    }

    @Override
    public boolean remove(Decoration decoration) {
        boolean yes = false;
        for(Decoration out: this.decorations){
            if(out.equals (decoration)){
                this.decorations.remove (decoration);
                yes = true;
                break;
            }
        }return yes;
    }

    @Override
    public Decoration findByType(String type) {
        Decoration decoration = null;
        for(Decoration out: this.decorations){
            if(out.getClass ().getSimpleName ().equals (type)){
                decoration = out;
                break;
            }
        }
        return decoration;
    }
}
