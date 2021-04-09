package EXAM_EX.EXAM_4.guild;

import EXAM_EX.EXAM_4.guild.Player;

import java.util.ArrayList;
import java.util.List;

public class Guild {
   private String name;
   private int capacity;
   private List<Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<> ();
    }
    public void addPlayer(Player player){
        if(capacity > roster.size ()){
            roster.add(player);
        }
    }public boolean removePlayer(String name){
        return roster.removeIf (f -> f.getName ().equals (name));
    }
    public void promotePlayer(String name){
        for(Player out : roster){
            if(out.getName ().equals (name)){
                out.setRank ("Member");
                break;
            }
        }
    }public void demotePlayer(String name){
        for(Player out : roster){
            if(out.getName ().equals (name)){
                out.setRank ("Trial");
                break;
            }
        }
    }public Player[] kickPlayersByClass(String clazz){
        Player[] output = roster.stream ().filter (f -> f.getClazz ().equals (clazz)).toArray (Player[]::new);
        roster.removeIf (f -> f.getClazz ().equals (clazz));


        return output;
    }
    public int count(){
        return roster.size ();
    }
    public String report(){
        String output = "";
        for(Player out : roster){
            output += out.toString ();
            output += System.lineSeparator ();
        }
        output = output.substring (0,output.length () - 2);
      return   String.format ("Players in the guild: %s:%n%s",this.name,output);
    }
}
