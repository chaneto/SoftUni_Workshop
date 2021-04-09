package C12_Functional_Programming_Ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class C1_Consumer_Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] p = scanner.nextLine ().split ("\\s+");
        Consumer<String> output = f -> System.out.println (f);
        Arrays.stream (p)
                .forEach (output);

    }
}
