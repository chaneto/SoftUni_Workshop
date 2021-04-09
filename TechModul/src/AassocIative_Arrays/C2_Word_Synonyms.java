package AassocIative_Arrays;

import java.util.*;

public class C2_Word_Synonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Map<String,List<String>> map = new LinkedHashMap<>();
        for (int i = 0; i < a; i++) {
            String wort = scanner.nextLine();
            String sinonim = scanner.nextLine();
            if(!map.containsKey(wort)){
                map.put(wort, new ArrayList<>());
                map.get(wort).add(sinonim);
            }else {
                map.get(wort).add(sinonim);
            }
        }for(Map.Entry<String,List<String>> out : map.entrySet()){
            System.out.printf("%s - %s%n",out.getKey(),
                    String.join(", ",out.getValue()));
        }
    }
}
