package C11_FUNCTIONAL_PROGRAMMING;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class C3_Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] input = scanner.nextLine ().split (" ");

        Predicate<String> UperCase = f -> Character.isUpperCase (f.charAt (0));

        List<String> output = Arrays.stream (input)
                .filter (UperCase)
                .collect(Collectors.toList());
        System.out.println (output.size ());
        System.out.println (output.stream ().collect(Collectors.joining(System.lineSeparator ())));
    }
}
