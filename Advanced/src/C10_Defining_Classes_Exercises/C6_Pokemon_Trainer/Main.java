package C10_Defining_Classes_Exercises.C6_Pokemon_Trainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Trainer> out = new LinkedHashMap<>();
        while (true){
            String[] p = scanner.nextLine().split(" ");
            if(p[0].equals("Tournament")){
                break;
            }
            String name = p[0];
            String pockemonname = p[1];
            String element = p[2];
            int power = Integer.parseInt(p[3]);
            Pockemon pockemon = new Pockemon(pockemonname,element,power);
            if(!out.containsKey(name)){
                out.put(name,new Trainer(new ArrayList<>()));
                out.get(name).getPockemons().add(pockemon);
            }else {
                out.get(name).getPockemons().add(pockemon);
                }
            }while (true){
                String cmd = scanner.nextLine();
                if(cmd.equals("End")){break;}
                int counter = 0;
                for(Map.Entry<String,Trainer> t : out.entrySet()){
                    boolean yes = false;
                    for(Pockemon f : t.getValue().getPockemons()){
                        if(f.getElement().equals(cmd)){
                            yes = true;
                            break;
                        }
                    }if(yes){
                        int vr = t.getValue().getZnachki() + 1;
                        t.getValue().setZnachki(vr);
                    }else {
                        int size = t.getValue().getPockemons().size();
                        for (int i = 0; i < size; i++) {
                            int vr = t.getValue().getPockemons().get(i).getPower() - 10;
                            if(vr <= 0){
                                t.getValue().getPockemons().remove(i);
                                size--;
                            }else {
                            t.getValue().getPockemons().get(i).setPower(vr);
                            }
                        }
                    }
                }
            }out.entrySet().stream()
                .sorted((s1,s2) -> Integer.compare(s2.getValue().getZnachki(),s1.getValue().getZnachki()))
                .forEach(f -> System.out.printf("%s %d %d%n",f.getKey(),f.getValue().getZnachki(),f.getValue().getPockemons().size()));

    }
}
