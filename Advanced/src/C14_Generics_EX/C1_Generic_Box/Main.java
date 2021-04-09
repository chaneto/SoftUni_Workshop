package C14_Generics_EX.C1_Generic_Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = Integer.parseInt (scanner.nextLine ());
        Box<String> box = new Box<> ();
        for (int i = 0; i < size; i++) {
            String text = scanner.nextLine ();
            box.add (text);
        }
        System.out.println (box);

    }
}
