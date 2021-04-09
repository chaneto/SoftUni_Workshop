package ATECHMODUL.List_Ex;

import java.sql.Array;
import java.util.*;

public class C7_Append_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split("\\|");
        List<String> in1 = new ArrayList<>();
        for (int i = p.length - 1; i >= 0  ; i--) {
            String[] in = p[i].trim().split("\\s+");
            for(String a : in){
                in1.add(a);
            }in1.remove("");
        }
        System.out.println(String.join(" ",in1));
    }
}
