package AassocIative_Arrays;

import java.util.*;

public class C3_Examples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> in = new LinkedHashMap<>();
        String[] p = scanner.nextLine().split(" ");
        for (int i = 0; i < p.length; i++) {
            String word = p[i].toLowerCase();
            if(!in.containsKey(word)){
                in.put(word,new ArrayList<>());
                in.get(word).add(word);
            }else {
                in.get(word).add(word);
            }
        }List<String> out = new ArrayList<>();

        for(Map.Entry<String, List<String>> vr : in.entrySet()){
            if(vr.getValue().size()%2 != 0){
                out.add(vr.getKey());
            }
        }
        for (int i = 0; i < out.size(); i++) {
            System.out.print(out.get(i));
            if(i < out.size() - 1){
                System.out.print(", ");
            }
        }

    }
}
