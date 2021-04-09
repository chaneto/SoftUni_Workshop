package C2_Abstraction_Ex.C2_Card_Rank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String p = scanner.nextLine ();
        System.out.println (p + ":");
        for (int i = 0; i < Card_Rank.values ().length; i++) {
            System.out.printf ("Ordinal value: %d; Name value: %s%n",Card_Rank.values ()[i].ordinal (),Card_Rank.values ()[i]);
        }
    }
}
