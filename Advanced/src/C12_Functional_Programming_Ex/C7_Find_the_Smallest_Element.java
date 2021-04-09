package C12_Functional_Programming_Ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class C7_Find_the_Smallest_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] input = Arrays.stream (scanner.nextLine ().split ("\\s+")).mapToInt (Integer::parseInt).toArray ();
        int index = 0;
        int num = 0;
        Function<int[],Integer> function = f -> Arrays.stream (f).min ().getAsInt ();
        num = function.apply (input);
        for (int i = 0; i < input.length; i++) {
            if(num == input[i]){
                index = i;
            }
        }
        System.out.println (index);
    }
}
