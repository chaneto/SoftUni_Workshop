package Aassociative_Array_Ex;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import java.util.*;

public class C9_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> in = new TreeMap<>();
        while (true){
            String[] p = scanner.nextLine().split(" ");
            if(p[0].equals("Lumpawaroo")){break;}
            String side = p[0];
            String name = p[2];
            if(p[1].equals("|")){
                int counter  = 0;
                for(Map.Entry<String,List<String>> out : in.entrySet()){
                    if(out.getValue().contains(name)){
                        counter++;
                    }
                    break;
                }if(counter == 0){
                    if(!in.containsKey(side)){
                        in.put(side,new ArrayList<>());
                        in.get(side).add(name);
                    }else if(in.containsKey(side) && !in.get(side).contains(name)){
                        in.get(side).add(name);
                    }
                }break;

            }if(p[1].equals("->")){
                for(Map.Entry<String,List<String>> out : in.entrySet()){
                    if(out.getValue().contains(name)){
                        in.get(out.getKey()).remove(name);
                        break;
                    }
                }if(!in.containsKey(side)){
                    in.put(side,new ArrayList<>());
                    in.get(side).add(name);
                    System.out.printf("%s joins the %s side!%n",name,side);
                }else if(in.containsKey(side) && !in.get(side).contains(name)){
                    in.get(side).add(name);
                    System.out.printf("%s joins the %s side!%n",name,side);
                }break;

            }
        }in
                .entrySet()
                .stream()
                .filter(f -> f.getValue().size() > 0)
                .sorted((s1,s2) -> s1.getKey().compareTo(s2.getKey()))
                .forEach(f ->{System.out.printf("%s: Lighter, Members: %d",f.getKey(),f.getValue().size());
        f.getValue()
                .stream()
                .forEach(m -> System.out.printf("! %s%n",m));
                });
    }
}
