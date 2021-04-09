package C11_FUNCTIONAL_PROGRAMMING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class C6_Find_Evens_or_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] input = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        List<Integer> output = new ArrayList<> ();
        for (int i = input[0]; i <= input[1]; i++) {
            output.add (i);
        }
        String comand = scanner.nextLine ();
        Predicate<Integer> predicate;
        if(comand.equals ("even")){
            predicate = f -> f %2 == 0;

        }else {
            predicate = f -> f %2 != 0;
        }
        output.stream ()
                .filter (predicate)
                .forEach (f -> System.out.print (f + " "));

    }
}
