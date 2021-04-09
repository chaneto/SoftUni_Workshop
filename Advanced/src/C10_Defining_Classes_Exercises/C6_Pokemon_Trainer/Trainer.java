package C10_Defining_Classes_Exercises.C6_Pokemon_Trainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
   private List<Pockemon> pockemons;
   private int znachki;

    public Trainer( List<Pockemon> pockemons) {
        this.pockemons = new ArrayList<>();
        this.znachki = 0;
    }

    public int getZnachki() {
        return znachki;
    }

    public void setZnachki(int znachki) {
        this.znachki = znachki;
    }



    public List<Pockemon> getPockemons() {
        return pockemons;
    }


    public void setPockemons(List<Pockemon> pockemons) {
        this.pockemons = pockemons;
    }
}
