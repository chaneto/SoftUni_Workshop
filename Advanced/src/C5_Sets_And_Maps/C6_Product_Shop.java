package C5_Sets_And_Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C6_Product_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Map<String,Double>> map = new TreeMap<>();
        while (true){
            String[] input = scanner.nextLine().split(", ");
            if(input[0].equals("Revision")){
                break;
            }
            String market = input[0];
            String product = input[1];
            double price = Double.parseDouble(input[2]);
            if(!map.containsKey(market)){
                map.put(market,new LinkedHashMap<>());
                map.get(market).put(product,price);
            }else {
                if(!map.get(market).containsKey(product)){
                    map.get(market).put(product,price);
                }else {
                    map.get(market).put(product,price);
                }
            }
        }
       map.entrySet().stream()
               .forEach(f -> {
                   System.out.printf("%s->%n",f.getKey());
                   f.getValue().entrySet().stream()
                           .forEach(m -> System.out.printf("Product: %s, Price: %.1f%n",m.getKey(),m.getValue()));
               });
    }
}
