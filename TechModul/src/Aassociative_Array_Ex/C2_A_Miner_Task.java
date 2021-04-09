package Aassociative_Array_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C2_A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> in = new LinkedHashMap<>();
        while (true){
            String p = scanner.nextLine();
            if(p.equals("stop")){break;}
            int a = Integer.parseInt(scanner.nextLine());
            in.putIfAbsent(p,0);
            int vr = in.get(p);
            in.put(p,vr + a);
        }in.forEach((k,v) -> System.out.println(String.format("%s -> %d",k,v)));
    }
}
