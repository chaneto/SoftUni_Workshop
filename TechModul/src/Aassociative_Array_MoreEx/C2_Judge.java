package Aassociative_Array_MoreEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C2_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String,Integer>> in = new LinkedHashMap<>();
        Map<String,Integer> in1 = new TreeMap<>();
        while (true) {
            String[] p = scanner.nextLine().split(" -> ");
            if (p[0].equals("no more time")) {
                break;
            }
            String name = p[0];
            String concurs = p[1];
            int tochki = Integer.parseInt(p[2]);
            if(!in.containsKey(concurs)){
                in.put(concurs,new TreeMap<>());
                in.get(concurs).put(name,tochki);
            }else {
                if(!in.get(concurs).containsKey(name)){
                    in.get(concurs).put(name,tochki);
                }else {
                    if(in.get(concurs).get(name) < tochki){
                        in.get(concurs).put(name,tochki);
                    }
                }
            }
            if(!in1.containsKey(name)){
                in1.put(name,tochki);
            }else {
                if(in.containsKey(concurs) && in1.get(name) < tochki){
                    in1.put(name,tochki);
                }else {
                    int a = in1.get(name);
                    in1.put(name, a + tochki);
                }
            }
        }in.entrySet()
                .forEach(f -> {
                    System.out.printf("%s: %d participants%n",f.getKey(),f.getValue().size());
                    int[] index = {0};
                    in.get(f.getKey())
                            .entrySet()
                            .stream()
                            .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                            .forEach( m -> {
                                System.out.printf("%d. %s <::> %s%n",++index[0],m.getKey(),m.getValue());

                            });
                });
        System.out.println("Individual standings:");
        int[] index = {0};
        in1.entrySet()
                .stream()
                .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(f -> System.out.printf("%d. %s -> %d%n",++index[0],f.getKey(),f.getValue()));

    }
}
