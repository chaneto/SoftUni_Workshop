package ATECHMODUL.EXAM;


import java.util.*;

public class C1_3_Nikuldens_meals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> in = new TreeMap<>();
        int counter = 0;
        while (true){
            String[] cmd = scanner.nextLine().split("-");
            if(cmd[0].equals("Stop")){break;}
            String comand = cmd[0];
            String name = cmd[1];
            String meat = cmd[2];
            if(comand.equals("Like")){
                if(!in.containsKey(name)){
                    in.put(name,new ArrayList<>());
                    in.get(name).add(meat);
                }else {
                  if(!in.get(name).contains(meat)){
                      in.get(name).add(meat);
                  }

                }
            }if(comand.equals("Unlike")){
                if(!in.containsKey(name)){
                    System.out.printf("%s is not at the party.%n",name);
                }else {
                    if(!in.get(name).contains(meat)){
                        System.out.printf("%s doesn't have the %s in his/her collection.%n",name,meat);
                    }else {
                        in.get(name).remove(meat);
                        System.out.printf("%s doesn't like the %s.%n",name,meat);
                        counter++;
                    }
                }
            }
        }in.entrySet()
                .stream()
                .sorted((s1,s2) -> s2.getValue().size()- s1.getValue().size())
                .forEach(f ->
                    System.out.printf("%s: %s%n",f.getKey(),String.join(", ",f.getValue())));

        System.out.printf("Unliked meals: %d",counter);

    }
}
