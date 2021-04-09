package C6_Sets_And_Maps_Advanced_EX;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class C2_Sets_of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        int input1 = number[0];
        int input2 = number[1];
        Set<Integer> set1 = new LinkedHashSet<> ();
        Set<Integer> set2 = new LinkedHashSet<> ();
        for (int i = 0; i < input1; i++) {
            int a = Integer.parseInt (scanner.nextLine ());
            set1.add (a);
        }
        for (int i = 0; i < input2; i++) {
            int a = Integer.parseInt (scanner.nextLine ());
            set2.add(a);
        }
        for(Integer out : set1){
            for(Integer out1 : set2){
                if(out == out1){
                    System.out.print (out + " ");
                }
            }
        }
    }
}
