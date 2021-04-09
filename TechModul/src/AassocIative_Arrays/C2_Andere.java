package AassocIative_Arrays;

import java.util.*;

public class C2_Andere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Map<String,List<String>> in = new LinkedHashMap<>();
        for (int i = 0; i < a; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if(!in.containsKey(word)){
                in.put(word,new ArrayList<>());
                in.get(word).add(synonym);
            }else {
                in.get(word).add(synonym);
            }
        }in
                .entrySet()
                .stream()
                .forEach(f ->
                        System.out.printf("%s - %s%n",f.getKey(),String.join(", ",f.getValue())));
    }
}
