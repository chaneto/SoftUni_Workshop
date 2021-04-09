package C6_Sets_And_Maps_Advanced_EX;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C4_Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> in = new TreeMap<>();
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if(!in.containsKey(symbol)){
                in.put(symbol,1);
            }else {
                int count = in.get(symbol);
                count++;
                in.put(symbol,count);
            }
        }in.entrySet().stream()
                .forEach(f -> System.out.printf("%s: %d time/s%n",f.getKey(),f.getValue()));
    }
}
