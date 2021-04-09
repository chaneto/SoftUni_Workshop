package Aassociative_Array_Ex;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C3_Legendary_Farming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> win = new TreeMap<>();{
            win.put("shards",0);
            win.put("fragments",0);
            win.put("motes",0);
        }
        Map<String,Integer> junk = new TreeMap<>();
        int rest = 0;
        while (true){
            String[] p = scanner.nextLine().split(" ");
            for (int i = 0; i < p.length; i+=2) {
                int num = Integer.parseInt(p[i]);
                String wort = p[i + 1].toLowerCase();
                if(wort.equals("shards")){
                    win.putIfAbsent(wort,0);
                    int vr = win.get(wort);
                    win.put(wort,vr + num);
                    if(win.get("shards") >= 250 ){
                        System.out.println("Shadowmourne obtained!");
                        rest = win.get("shards") - 250;
                        win.put(wort,rest);
                        win
                                .entrySet()
                                .stream()
                                .sorted((f,f1) -> f1.getValue().compareTo(f.getValue()))
                                .forEach(f -> System.out.println(String.format("%s: %d",f.getKey(),f.getValue())));
                        junk.forEach((k,v) -> System.out.println(String.format("%s: %d",k,v)));
                        return;
                    }
                } if(wort.equals("fragments")){
                    win.putIfAbsent(wort,0);
                    int vr = win.get(wort);
                    win.put(wort,vr + num);
                    if(win.get("fragments") >= 250 ){
                        System.out.println("Valanyr obtained!");
                        rest = win.get("fragments") - 250;
                        win.put(wort,rest);
                        win
                                .entrySet()
                                .stream()
                                .sorted((f,f1) -> f1.getValue().compareTo(f.getValue()))
                                .forEach(f -> System.out.println(String.format("%s: %d",f.getKey(),f.getValue())));
                        junk.forEach((k,v) -> System.out.println(String.format("%s: %d",k,v)));
                        return;
                    }
                }if(wort.equals("motes")){
                    win.putIfAbsent(wort,0);
                    int vr = win.get(wort);
                    win.put(wort,vr + num);
                    if(win.get("motes") >= 250 ){
                        System.out.println("Dragonwrath obtained!");
                        rest = win.get("motes") - 250;
                        win.put(wort,rest);
                        win
                                .entrySet()
                                .stream()
                                .sorted((f,f1) -> f1.getValue().compareTo(f.getValue()))
                                .forEach(f -> System.out.println(String.format("%s: %d",f.getKey(),f.getValue())));
                        junk.forEach((k,v) -> System.out.println(String.format("%s: %d",k,v)));
                        return;
                    }
                }if(wort.equals("shards") || wort.equals("motes") || wort.equals("fragments")){
                    continue;
                }
                else {
                    junk.putIfAbsent(wort,0);
                    int vr = junk.get(wort);
                    junk.put(wort,vr + num);
                }
            }
        }

    }
}
