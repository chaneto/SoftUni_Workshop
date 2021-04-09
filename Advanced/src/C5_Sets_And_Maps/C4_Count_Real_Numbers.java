package C5_Sets_And_Maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class C4_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer> map = new LinkedHashMap<>();
        int b = 0;
        for (int i = 0; i < input.length; i++) {
            if(!map.containsKey(input[i])){
                map.put(input[i],1);
            }else {
                int counter = map.get(input[i]);
                counter++;
                map.put(input[i],counter);
            }
        }map.entrySet()
                .stream()
                .forEach(f -> System.out.printf("%.1f -> %d%n",f.getKey(),f.getValue()));
    }
}
