package C6_Sets_And_Maps_Advanced_EX;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C12_Legendary_Farming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> gold = new TreeMap<>();
        gold.put("shards",0);
        gold.put("fragments",0);
        gold.put("motes",0);
        Map<String,Integer> mul = new TreeMap<>();
        int item = 0;
        String legendary = "";
        while (true){
        String[] p = scanner.nextLine().split(" ");
        for (int i = 0; i < p.length; i+=2) {
                item = Integer.parseInt(p[i]);
                 legendary = p[i + 1].toLowerCase();
            if(legendary.equals("shards") || legendary.equals("fragments") || legendary.equals("motes")){

                    gold.put(legendary,gold.get(legendary) + item);

                if(gold.get(legendary) >= 250){
                    if(legendary.equals("shards")){
                        System.out.println("Shadowmourne obtained!");
                    }
                    if(legendary.equals("fragments")){
                        System.out.println("Valanyr obtained!");
                    }
                    if(legendary.equals("motes")){
                        System.out.println("Dragonwrath obtained!");
                    }
                    gold.put(legendary,gold.get(legendary) - 250);
                    gold.entrySet().stream()
                            .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                            .forEach(f -> System.out.printf("%s: %d%n",f.getKey(),f.getValue()));
                    for(Map.Entry<String,Integer> out : mul.entrySet()){
                        System.out.printf("%s: %d%n",out.getKey(),out.getValue());
                    }return;
                }

            }
            else {
                if (!mul.containsKey(legendary)) {
                    mul.put(legendary, item);
                } else {
                    mul.put(legendary, mul.get(legendary) + item);
                }
            }
           }
        }
    }
}
