package AassocIative_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C1_Coun_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] in = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(f->Double.parseDouble(f))
                .toArray();
        Map<Double,Integer> map = new TreeMap<>();
        for(Double out : in){
            if(!map.containsKey(out)){
                map.put(out,1);
            }else {
                map.put(out,map.get(out) + 1);
            }
        }
        for (Map.Entry<Double,Integer> out : map.entrySet()) {
            System.out.printf("%.0f -> %d%n",out.getKey(),out.getValue());
        }
    }
}

