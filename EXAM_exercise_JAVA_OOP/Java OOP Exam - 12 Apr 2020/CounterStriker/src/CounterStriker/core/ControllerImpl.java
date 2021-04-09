package CounterStriker.core;

import CounterStriker.models.field.Field;
import CounterStriker.models.field.FieldImpl;
import CounterStriker.models.guns.Gun;
import CounterStriker.models.guns.Pistol;
import CounterStriker.models.guns.Rifle;
import CounterStriker.models.players.CounterTerrorist;
import CounterStriker.models.players.Player;
import CounterStriker.models.players.Terrorist;
import CounterStriker.repositories.GunRepository;
import CounterStriker.repositories.PlayerRepository;
import CounterStriker.repositories.Repository;

import java.util.*;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller{
    private Repository<Gun> guns;
    private Repository<Player> players;
    private Field field;

    public ControllerImpl() {
        guns = new GunRepository<> ();
        players = new PlayerRepository<> ();
        field = new FieldImpl ();
    }

    public void setGuns(GunRepository guns) {
        this.guns = guns;
    }

    public void setPlayers(PlayerRepository players) {
        this.players = players;
    }

    public void setField(Field field) {
        this.field = field;
    }

    @Override
    public String addGun(String type, String name, int bulletsCount) {
        Gun gun = null;
        if(type.equals ("Pistol")){
            gun = new Pistol (name, bulletsCount);
            guns.add (gun);
        }else if(type.equals ("Rifle")){
            gun = new Rifle (name, bulletsCount);
            guns.add (gun);
        }else {
            throw new IllegalArgumentException("Invalid gun type!");
        }
        return String.format ("Successfully added gun %s.",name);
    }
    @Override
    public String addPlayer(String type, String username, int health, int armor, String gunName) {
        Player player = null;
        if(type.equals ("Terrorist")){
            if(this.guns.findByName (gunName) == null){
                throw new NullPointerException("Gun cannot be found!");
            }
            player = new Terrorist (username, health, armor,  this.guns.findByName (gunName));
            this.players.add (player);
        }else if(type.equals ("CounterTerrorist")){
            if(this.guns.findByName (gunName) == null){
                throw new NullPointerException("Gun cannot be found!");
            }
            player = new CounterTerrorist (username, health, armor,  this.guns.findByName (gunName));
            this.players.add (player);
        }else {
            throw new IllegalArgumentException ("Invalid player type!");
        }
        return String.format ("Successfully added player %s.", username);
    }
    @Override
    public String startGame() {
        Collection<Player> players = this.players.getModels ()
                .stream ()
                .filter (Player::isAlive)
                .collect(Collectors.toList());
        return this.field.start (players);
    }
    @Override
    public String report() {
        List<Player> list = (List<Player>) this.players.getModels ();
        StringBuilder st = new StringBuilder ();
        list.stream ()
                .sorted ((s1, s2) -> {
                    int result = s1.getClass ().getSimpleName ().compareTo (s2.getClass ().getSimpleName ());
                    if(result == 0){
                        result = Integer.compare (s2.getHealth (), s1.getHealth ());
                    }
                    if(result == 0){
                        result = s1.getUsername ().compareTo (s2.getUsername ());
                    }
                    return result;
                })
                .forEach (f-> st.append (f.toString ()));

        return st.toString ().trim ();
    }
}
