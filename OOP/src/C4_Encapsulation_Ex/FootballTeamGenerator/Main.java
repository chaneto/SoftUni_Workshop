package FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String,Team> map = new LinkedHashMap<> ();
        while (true){
            String input = scanner.nextLine ();
            if(input.equals ("END")){break;
            }else {
                String[] intput = input.split (";");
            String command = intput[0];
            String teamName = intput[1];
            if(command.equals ("Team")){
                try {
                 Team  team = new Team (teamName);
                   map.putIfAbsent (teamName,team);
                }catch (IllegalArgumentException e){
                    System.out.println (e.getMessage ());
                }
            }else if(command.equals ("Add")){
                String playersName = intput[2];
                if(map.containsKey (teamName)){
                    try {
                     Player player = new Player (playersName,Integer.parseInt (intput[3]),Integer.parseInt (intput[4])
                                ,Integer.parseInt (intput[5]),Integer.parseInt (intput[6]),Integer.parseInt (intput[7]));
                        map.get (teamName).addPlayer (player);
                    }catch (IllegalArgumentException e){
                        System.out.println (e.getMessage ());
                    }
                }else {
                    System.out.printf ("Team %s does not exist.%n",teamName);
                }
            }else if(command.equals ("Remove")){
                try {
                    if(map.containsKey (teamName)){
                    map.get (teamName).removePlayer (intput[2]);
                    }else {
                        System.out.printf ("Team %s does not exist.%n",teamName);
                    }
                }catch (IllegalArgumentException e){
                    System.out.println (e.getMessage ());
                }

            }else if(command.equals ("Rating")){
                if(map.containsKey (teamName)){
                    System.out.printf ("%s - ",teamName);
                    System.out.printf ("%d%n",Math.round (map.get (teamName).getRating ()));
                }else {
                    System.out.printf ("Team %s does not exist.%n",teamName);
                }
            }
          }
        }
    }
}
