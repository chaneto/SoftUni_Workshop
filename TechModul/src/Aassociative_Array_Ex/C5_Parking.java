package Aassociative_Array_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class C5_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> in = new LinkedHashMap<>() ;
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a; i++) {
            String[] p = scanner.nextLine().split(" ");
            String cmd = p[0];
            String name = p[1];
            if(cmd.equals("register")){
                String nummer = p[2];
                if(!in.containsKey(name)){
                    in.put(name,nummer);
                    System.out.printf("%s registered %s successfully%n",name,nummer);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n",nummer);
                }
            }if(cmd.equals("unregister")){
                if(in.containsKey(name)){
                    System.out.printf("%s unregistered successfully%n",name);
                    in.remove(name);
                }else {
                    System.out.printf("ERROR: user %s not found%n",name);
                }
            }
        }in.entrySet()
                .forEach(f -> System.out.printf("%s => %s%n",f.getKey(),f.getValue()));
    }
}
