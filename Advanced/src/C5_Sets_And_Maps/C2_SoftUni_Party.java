package C5_Sets_And_Maps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class C2_SoftUni_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> in = new TreeSet<>();
        while (true){
            String p = scanner.nextLine();
            if(p.equals("PARTY")){break;}
            in.add(p);
        }
        while (true){
            String p = scanner.nextLine();
            if(p.equals("END")){break;}
            if(in.contains(p)){
                in.remove(p);
            }
        }
        System.out.println(in.size());
        for(String out : in){
            System.out.println(out);
        }
    }
}
