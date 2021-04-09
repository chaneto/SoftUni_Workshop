package C12_Functional_Programming_Ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class C3_Custom_Min_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] input = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        Function<int[],Integer> function = f -> Arrays.stream (f).min ().getAsInt ();
        System.out.println (function.apply (input));
    }
}
