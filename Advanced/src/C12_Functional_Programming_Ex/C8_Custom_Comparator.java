package C12_Functional_Programming_Ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class C8_Custom_Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] input = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        Predicate<Integer> even = f -> f%2 == 0;
        Predicate<Integer> odd = f -> f%2 != 0;
        Arrays.stream (input)
                .sorted ()
                .boxed ()
                .filter (even)
                .forEach (f -> System.out.print (f + " "));

        Arrays.stream (input)
                .sorted ()
                .boxed ()
                .filter ( odd)
                .forEach (f -> System.out.print (f + " "));
    }
}
