package C11_FUNCTIONAL_PROGRAMMING;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class C4_Add_VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double[] input = Arrays.stream (scanner.nextLine ().split (", ")).mapToDouble (Double::parseDouble).toArray ();
        System.out.println ("Prices with VAT:");
        Function<Double,Double> DDS = f -> f * 1.2;
        Arrays.stream (input)
                .map (f -> DDS.apply ( (f)))
                .forEach (f -> System.out.printf ("%.2f%n",f));
    }
}
