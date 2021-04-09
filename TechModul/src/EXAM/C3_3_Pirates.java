package ATECHMODUL.EXAM;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C3_3_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> hora = new TreeMap<>();
        Map<String,Integer> zlato = new TreeMap<>();
        while (true){
            String[] p = scanner.nextLine().split("\\|\\|");
            String name = p[0];
            if(name.equals("Sail")){break;}
            int people = Integer.parseInt(p[1]);
            int gold = Integer.parseInt(p[2]);
            if(!hora.containsKey(name)){
               hora.put(name,people);
               zlato.put(name,gold);
            }else {
                hora.put(name,hora.get(name) + people);
                zlato.put(name,zlato.get(name) + gold);
            }
        }while (true){
            String[] p = scanner.nextLine().split("=>");
            String cmd = p[0];
            if(cmd.equals("End")){break;}
            if(cmd.equals("Plunder")){
                String town = p[1];
                int people = Integer.parseInt(p[2]);
                int gold = Integer.parseInt(p[3]);
                if(hora.containsKey(town)){
                  int peopleend = hora.get(town) - people;
                  int  goldend = zlato.get(town) - gold;
                if(peopleend <= 0 || goldend <= 0){
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
                    System.out.printf("%s has been wiped off the map!%n",town);
                    hora.remove(town);
                    zlato.remove(town);
                }else {
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
                    hora.put(town,peopleend);
                    zlato.put(town,goldend);
                  }
                }
            }if(cmd.equals("Prosper")){
                String town = p[1];
                int gold = Integer.parseInt(p[2]);
                if(gold < 0){
                    System.out.println("Gold added cannot be a negative number!");
                }else {
                    zlato.put(town,zlato.get(town) + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",gold,town,zlato.get(town));
                }
            }
        }int count = zlato.size();
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",count);
        zlato.entrySet()
                .stream()
                .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(f -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",f.getKey(),hora.get(f.getKey()),f.getValue()));


    }
}
