package C5_Sets_And_Maps;

import java.util.*;

public class C7_Cities_by_Continent_and_Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String,Map<String, List<String>>> in = new LinkedHashMap<>();
        for (int i = 0; i < number; i++) {
            String[] p = scanner.nextLine().split(" ");
            String continent = p[0];
            String country = p[1];
            String town = p[2];
            if(!in.containsKey(continent)){
                in.put(continent,new LinkedHashMap<>());
                in.get(continent).put(country,new ArrayList<>());
                in.get(continent).get(country).add(town);
            }else {
                if(!in.get(continent).containsKey(country)){
                    in.get(continent).put(country,new ArrayList<>());
                    in.get(continent).get(country).add(town);
                }else {
                    in.get(continent).get(country).add(town);
                }
            }
        }in.entrySet().stream()
                .forEach(f -> {
                    System.out.printf("%s:%n",f.getKey());
                    f.getValue().entrySet().stream()
                            .forEach(m -> {
                                System.out.printf("%s -> ",m.getKey());
                                System.out.print(String.join(", ",m.getValue()));
                                System.out.println();
                            });
                });
        System.out.println();
    }
}
