package Aassociative_Array_Ex;

import java.util.*;

public class C8_Company_Users {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> in = new TreeMap<>();
        while (true) {
            String[] p = scanner.nextLine().split(" -> ");
            if (p[0].equals("End")) {
                break;
            }
            String brand = p[0];
            String ID = p[1];
            if(!in.containsKey(brand)){
                in.put(brand,new ArrayList<>());
            }
            if(!in.get(brand).contains(ID)) {
                in.get(brand).add(ID);
            }
        }in
                .entrySet()
                .stream()
                .forEach(f -> {
                    System.out.println(f.getKey());
                    f.getValue()
                            .stream()
                            .forEach(m -> System.out.printf("-- %s%n",m));
                });
    }
}
