package Aassociative_Array_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class C1_Count_Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] p = scanner.nextLine().toCharArray();
        Map<Character,Integer> in = new LinkedHashMap<>();
        for(char out : p){
            if(out == ' '){
                continue;
            }
            in.putIfAbsent(out,0);
            int count = in.get(out);
            in.put(out,count + 1);
        }in
                .entrySet()
                .forEach(f -> System.out.println(String.format("%c -> %d",f.getKey(),f.getValue())));
    }
}
