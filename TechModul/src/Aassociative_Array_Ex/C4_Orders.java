package Aassociative_Array_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class C4_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Double> in = new LinkedHashMap<>();
        Map<String,Integer> kol = new LinkedHashMap<>();
        String[] p = scanner.nextLine().split(" ");
        while (!p[0].equals("buy")){
            String product = p[0];
            double cena = Double.parseDouble(p[1]);
            int kolichestwo = Integer.parseInt(p[2]);
            in.put(product,cena);
            kol.putIfAbsent(product,0);
            int vr = kol.get(product);
            kol.put(product, vr + kolichestwo);



            p = scanner.nextLine().split(" ");
        }for(Map.Entry<String,Double> out : in.entrySet()){
            for(Map.Entry<String,Integer> out1 : kol.entrySet()){
                if(out.getKey().equals(out1.getKey())){
                    in.put(out.getKey(),out.getValue() * out1.getValue());
                }
            }
        }in.forEach((k,v) -> System.out.println(String.format("%s -> %.2f",k,v)));
    }
}
