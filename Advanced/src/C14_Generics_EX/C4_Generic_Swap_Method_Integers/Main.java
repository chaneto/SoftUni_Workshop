package C14_Generics_EX.C4_Generic_Swap_Method_Integers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = Integer.parseInt (scanner.nextLine ());
        Swap_Int<Integer> stringSwap = new Swap_Int<> ();
        for (int i = 0; i < size; i++) {
            Integer input = Integer.parseInt (scanner.nextLine ());
            stringSwap.add (input);
        }
        int[] a = Arrays.stream (scanner.nextLine ().split (" ")).mapToInt (Integer::parseInt).toArray ();
        int one = a[0];
        int two = a[1];
        stringSwap.swap (one,two);
        System.out.println (stringSwap.toString ());
    }
}
