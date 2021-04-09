package C11_FUNCTIONAL_PROGRAMMING;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class C1_Sort_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] input = scanner.nextLine ().split (", ");
        String output = Arrays.stream (input)
                .mapToInt (f -> Integer.parseInt (f))
                .filter (f -> f %2 == 0)
                .mapToObj (f -> String.valueOf (f))
                .collect (Collectors.joining (", "));
        System.out.println (output);
        String outpu1 = Arrays.stream (input)
                .mapToInt (Integer::parseInt)
                .filter (f -> f%2 == 0)
                .sorted ()
                .mapToObj (String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println (outpu1);
    }
}
