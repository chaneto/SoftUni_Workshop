package CounterStriker.models.field;
import CounterStriker.models.players.Player;

import java.util.*;
import java.util.stream.Collectors;

public class FieldImpl implements Field{
    Collection<Player> terrorists = new ArrayList<> ();
    Collection<Player> counterTerrorists = new ArrayList<> ();
    @Override
    public String start(Collection<Player> players) {
        for(Player out: players){
            if(out.getClass ().getSimpleName ().equals ("Terrorist")){
                if(out.isAlive ()){
                this.terrorists.add (out);
                }
            }else if(out.getClass ().getSimpleName ().equals ("CounterTerrorist")){
                if(out.isAlive ()){
                this.counterTerrorists.add (out);
                }
            }
        }
        while (!this.terrorists.isEmpty () && !this.counterTerrorists.isEmpty ()){
            for(Player outTerrorist: this.terrorists){
                for(Player outCounterTerrorist: counterTerrorists){
                    outCounterTerrorist.takeDamage (outTerrorist.getGun ().fire ());
                }
            }this.counterTerrorists = this.counterTerrorists.stream ().filter (Player::isAlive).collect(Collectors.toList());
            for(Player outCounterTerrorist: this.counterTerrorists){
                for(Player outTerrorist: this.terrorists){
                    outTerrorist.takeDamage (outCounterTerrorist.getGun ().fire ());
                }
            }this.terrorists = this.terrorists.stream ().filter (Player::isAlive).collect(Collectors.toList());

        }if(this.counterTerrorists.isEmpty ()){
            return "Terrorist wins!";
        }else {
            return "Counter Terrorist wins!";
        }
    }
}
