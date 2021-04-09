package viceCity.core;

import viceCity.core.interfaces.Controller;
import viceCity.models.guns.Gun;
import viceCity.models.guns.Pistol;
import viceCity.models.guns.Rifle;
import viceCity.models.neighbourhood.GangNeighbourhood;
import viceCity.models.players.CivilPlayer;
import viceCity.models.players.MainPlayer;
import viceCity.models.players.Player;
import viceCity.repositories.interfaces.GunRepository;

import java.util.ArrayList;
import java.util.Collection;

public class ControllerImpl implements Controller {
    private Player mainPlayer;
    private Collection<Player> civilPlayers;
    private GunRepository<Gun> gunGunRepository;
    private GangNeighbourhood gangNeighbourhood;

    public ControllerImpl() {
        this.mainPlayer = new MainPlayer ();
        this.civilPlayers = new ArrayList<> ();
        this.gunGunRepository = new GunRepository<> ();
        this.gangNeighbourhood = new GangNeighbourhood ();
    }

    public String addPlayer(String name) {
        CivilPlayer civilPlayer = new CivilPlayer (name);
        this.civilPlayers.add (civilPlayer);
        return String.format ("Successfully added civil player: %s!", name);
    }

    @Override
    public String addGun(String type, String name) {
        Gun gun = null;
        if(type.equals ("Pistol")){
            gun = new Pistol (name);
            this.gunGunRepository.add (gun);
            return String.format ("Successfully added %s of type: %s",name,type);
        }else if(type.equals ("Rifle")){
            gun = new Rifle (name);
            this.gunGunRepository.add (gun);
            return String.format ("Successfully added %s of type: %s",name,type);
        }else {
            return "Invalid gun type!";
        }
    }

    @Override
    public String addGunToPlayer(String name) {
        Player player = null;
        if (name.equals ("Vercetti")) {
            player = this.mainPlayer;
        } else {
            for (Player out : this.civilPlayers) {
                if (out.getName ().equals (name)) {
                    player = out;
                }
            }
        }
        if (player == null) {
            return "Civil player with that name doesn't exists!";
        } else if (this.gunGunRepository.getModels ().isEmpty ()) {
            return "There are no guns in the queue!";
        } else {
            Gun gun = null;
            for (Gun out : this.gunGunRepository.getModels ()) {
                gun = out;
                this.gunGunRepository.remove (out);
                break;
            }
            if (name.equals ("Vercetti")) {
                this.mainPlayer.getGunRepository ().add (gun);
                return String.format ("Successfully added %s to the Main Player: Tommy Vercetti",gun.getName ());
            } else {
                player.getGunRepository ().add (gun);
                return String.format ("Successfully added %s to the Civil Player: %s",gun.getName (),name);
            }
        }
    }

    @Override
    public String fight() {
        String result = "";
        gangNeighbourhood.action (mainPlayer, this.civilPlayers);
        long deadCivilPlayers = civilPlayers.stream()
                .filter(p->!p.isAlive())
                .count();

        StringBuilder sb = new StringBuilder();

        boolean allLifePointsCivilPlayer = this.civilPlayers.stream()
                .allMatch(p->p.getLifePoints() == 50);

        if(this.mainPlayer.getLifePoints() == 100 && allLifePointsCivilPlayer){
            result += "Everything is okay!";
            result += System.lineSeparator ();
        }else {
            result = String.format ("A fight happened:%nTommy live points: %d!%n" +
                    "Tommy has killed: %d players!%nLeft Civil Players: %d!%n",
                    this.mainPlayer.getLifePoints (), deadCivilPlayers, this.civilPlayers.size() - deadCivilPlayers);
        }
        return result.trim ();
    }
}
