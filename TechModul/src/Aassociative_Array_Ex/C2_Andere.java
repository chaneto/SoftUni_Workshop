package Aassociative_Array_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class C2_Andere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> p = new LinkedHashMap<>();
        String resurs = scanner.nextLine();
        while (!resurs.equals("stop")){
            int a = Integer.parseInt(scanner.nextLine());
            if(!p.containsKey(resurs)){
                p.put(resurs,a);
            }else {
                int vr = p.get(resurs);
                p.put(resurs, vr + a);
            }
            resurs = scanner.nextLine();
        }p.entrySet()
                .forEach(f -> System.out.printf("%s -> %d%n",f.getKey(),f.getValue()));

    }
}
