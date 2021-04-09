package ATECHMODUL.EXAM;

import java.util.*;

public class C2_3_Hero_Recruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>>  in = new TreeMap<>();
        while (true){
            String[] cmd = scanner.nextLine().split(" ");
            if(cmd[0].equals("End")){break;}
            String command = cmd[0];
            String name = cmd[1];
            if(command.equals("Enroll")){
                if(!in.containsKey(name)){
                    in.put(name,new ArrayList<>());
                }else {
                    System.out.printf("%s is already enrolled.%n",name);
                }
            }if(command.equals("Learn")){
                String text = cmd[2];
                if(in.containsKey(name)){
                    if(!in.get(name).contains(text)){
                        in.get(name).add(text);
                    }else {
                        System.out.printf("%s has already learnt %s.%n",name,text);
                    }
                }else {
                    System.out.printf("%s doesn't exist.%n",name);
                }
            }if(command.equals("Unlearn")){
                String text = cmd[2];
                if(in.containsKey(name)){
                    if(in.get(name).contains(text)){
                        in.get(name).remove(text);
                    }else {
                        System.out.printf("%s doesn't know %s.%n",name,text);
                    }
                }else {
                    System.out.printf("%s doesn't exist.%n",name);
                }
            }
        }System.out.println("Heroes:");
        in.entrySet()
                .stream()
                .sorted((s1,s2) -> s2.getValue().size() - s1.getValue().size())
                .forEach(f -> System.out.printf("== %s: %s%n",f.getKey(),String.join(", ",f.getValue())));
    }
}
