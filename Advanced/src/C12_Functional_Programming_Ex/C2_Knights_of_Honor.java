package C12_Functional_Programming_Ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class C2_Knights_of_Honor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] p = scanner.nextLine ().split (" ");
        Consumer<String> consumer  = f -> System.out.println ("Sir " + f);
        Arrays.stream (p)
                .forEach (consumer);
    }
}
