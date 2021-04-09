package C14_Generics_EX.C5_Generic_Count_Method_Strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = Integer.parseInt (scanner.nextLine ());
        Counter<String> counter = new Counter<> ();
        for (int i = 0; i < size; i++) {
            String input = scanner.nextLine ();
            counter.add (input);
        }
        String p = scanner.nextLine ();
        System.out.println (counter.count (p));
    }
}
