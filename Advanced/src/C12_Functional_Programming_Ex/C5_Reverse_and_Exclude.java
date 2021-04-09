package C12_Functional_Programming_Ex;

import java.util.*;
import java.util.function.Consumer;

public class C5_Reverse_and_Exclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] input = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        int del = Integer.parseInt (scanner.nextLine ());
        List<Integer> output = new ArrayList<> ();
        for (int i = 0; i < input.length; i++) {
            output.add (input[i]);
        }

        Collections.reverse (output);
        output.stream ()
                .filter (f -> f%del != 0)
                .forEach (f -> System.out.print (f + " "));
    }
}
