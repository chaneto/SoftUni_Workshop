package C6_Sets_And_Maps_Advanced_EX;

import java.util.*;

public class C8_Hands_Of_Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> in = new LinkedHashMap<>();
        Map<String,Integer> out = new LinkedHashMap<>();
        int sila = 0;
        int tip = 0;
        while (true){
        String[] p = scanner.nextLine().split(": ");
        String name = p[0];
        if(name.equals("JOKER")){break;}
        String [] karti = p[1].split(", ");
        if(!in.containsKey(name)){
            in.put(name,new ArrayList<>());
            for (int i = 0; i < karti.length; i++) {
                String karta = karti[i];
                if(!in.get(name).contains(karta)){
                    in.get(name).add(karta);
                }
             }
           }else {
            for (int i = 0; i < karti.length; i++) {
                String karta = karti[i];
                if(!in.get(name).contains(karta)){
                    in.get(name).add(karta);
                }
            }
          }
        }for(Map.Entry<String,List<String>> red : in.entrySet()){
            int sbor = 0;
            for (int i = 0; i < red.getValue().size(); i++) {
                String karta = red.getValue().get(i);
                int poziciq = 1;
                if(karta.charAt(0) == 'J'){
                    sila = 11;
                }else if(karta.charAt(0) == 'Q'){
                    sila = 12;
                }else if(karta.charAt(0) == 'K'){
                    sila = 13;
                }else if(karta.charAt(0) == 'A'){
                    sila = 14;
                }else {
                    if(karta.length() == 3){
                        String sub = karta.substring(0,2);
                        sila  = Integer.parseInt(sub);
                        poziciq = 2;
                    }else {
                    sila = Character.getNumericValue(karta.charAt(0));
                    }
                }if(karta.charAt(poziciq) == 'C'){
                    tip = 1;
                }else if(karta.charAt(poziciq) == 'D'){
                    tip = 2;
                }else if(karta.charAt(poziciq) == 'H'){
                    tip = 3;
                }else if(karta.charAt(poziciq) == 'S'){
                    tip = 4;
                }sbor += sila * tip;

            }out.put(red.getKey(),sbor);
        }out.entrySet().stream()
                .forEach(f -> System.out.printf("%s: %d%n",f.getKey(),f.getValue()));

    }
}
