package C5_Sets_And_Maps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class C1_Parking_Lot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> in = new LinkedHashSet<>();
        while (true){
            String[] p = scanner.nextLine().split(", ");
            if(p[0].equals("END")){break;}
            if(p[0].equals("IN")){
                if(!in.contains(p[1])){
                    in.add(p[1]);
                }
            }
            if(p[0].equals("OUT")){
                in.remove(p[1]);
            }
        }if(in.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
        for(String out : in){
            System.out.println(out);
            }
        }
    }
}
