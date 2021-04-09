package Aassociative_Array_MoreEx;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C3_MOBA_Challenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String,Integer>> in = new TreeMap<>();
        while (true){
            String[] p = scanner.nextLine().split(" ");
            if(p[0].equals("Season")){break;}
            if(p[1].equals("->")){
                String player = p[0];
                String poziciq = p[2];
                int tocki = Integer.parseInt(p[4]);
                if(!in.containsKey(player)){
                    in.put(player, new TreeMap<>());
                    in.get(player).put(poziciq,tocki);
                }else {
                    if(!in.get(player).containsKey(poziciq)){
                        in.get(player).put(poziciq,tocki);
                    }else {
                        if(in.get(player).get(poziciq) < tocki){
                            in.get(player).put(poziciq,tocki);
                        }
                    }
                }
            }
            if(p[1].equals("vs")){
                String player = p[0];
                String player1 = p[2];
                if(in.containsKey(player) && in.containsKey(player1)){
                    Map<String,Integer> neu = new  TreeMap<>();
                    Map<String,Integer> neu1 = new  TreeMap<>();
                    neu = in.get(player);
                    neu1 = in.get(player1);
                    for(String out : neu.keySet()){
                        for(String out1 : neu1.keySet()){
                            if(out.equals(out1)){
                                if(neu.get(out) < neu1.get(out1)){
                                    in.remove(player);
                                }else {
                                    in.remove(player1);
                                }
                            }
                        }
                    }
                }
            }
        }Map<String,Integer> p = new TreeMap<>();
        Map<String,Integer> p1 = new TreeMap<>();

        for(Map.Entry<String,Map<String,Integer>> out : in.entrySet()){
            int a = 0;
            for(Map.Entry<String,Integer> out1 : out.getValue().entrySet()){
                a+=out1.getValue();
                p1.put(out1.getKey(),out1.getValue());
            }if(!p.containsKey(out.getKey())){
                p.put(out.getKey(),a);
            }
        }p.entrySet()
                .stream()
                .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(f ->{
                    System.out.printf("%s: %d skill%n",f.getKey(),f.getValue());
                    in.get(f.getKey())
                            .entrySet()
                            .stream()
                            .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                            .forEach( m -> {
                                System.out.printf("- %s <::> %d%n",m.getKey(),m.getValue());

                            });
                });
    }
}
