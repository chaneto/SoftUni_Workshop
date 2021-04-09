package C14_Generics_EX.C2_Generic_Box_of_Integer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = Integer.parseInt (scanner.nextLine ());
        GenericBox<Integer> box = new GenericBox<> ();
        for (int i = 0; i < size; i++) {
            Integer text = Integer.parseInt (scanner.nextLine ());
            box.add (text);
        }
        System.out.println (box);
    }
}
