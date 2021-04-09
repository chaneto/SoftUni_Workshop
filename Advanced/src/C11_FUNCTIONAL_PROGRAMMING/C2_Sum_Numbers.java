package C11_FUNCTIONAL_PROGRAMMING;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class C2_Sum_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] a = Arrays.stream (scanner.nextLine ().split (", ")).mapToInt (Integer::parseInt).toArray ();

        Function<int[],String> count = f -> String.format ("Count = " + f.length);
        System.out.println (count.apply (a));

        Function<int[],String > sum = f -> String.format ("Sum = " + Arrays.stream (f).sum ());
        System.out.println (sum.apply (a));
    }
}
