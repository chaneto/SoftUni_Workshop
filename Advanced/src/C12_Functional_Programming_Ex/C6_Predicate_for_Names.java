package C12_Functional_Programming_Ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class C6_Predicate_for_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = Integer.parseInt (scanner.nextLine ());
        String[] input = scanner.nextLine ().split (" ");
        Predicate<String> predicate = f -> f.length () <= size;
        Arrays.stream (input)
                .filter (predicate)
                .forEach (f -> System.out.println (f));
    }
}
