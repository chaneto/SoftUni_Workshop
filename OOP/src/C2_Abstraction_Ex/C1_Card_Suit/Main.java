package C2_Abstraction_Ex.C1_Card_Suit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String p = scanner.nextLine ();
        System.out.println (p + ":");
        for (int i = 0; i < Card.values ().length; i++) {
            System.out.printf ("Ordinal value: %d; Name value: %s%n",Card.values ()[i].ordinal (),Card.values ()[i]);
        }
    }
}
