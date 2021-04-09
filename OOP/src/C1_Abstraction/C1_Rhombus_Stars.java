package C1_Abstraction;

import java.util.Scanner;

public class C1_Rhombus_Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int size = Integer.parseInt (scanner.nextLine ());
        for (int i = 1; i <= size; i++) {
            printRow (size, i);
        }
        for (int i = size - 1; i >= 0; i--) {
            printRow (size, i);
        }
    }

    private static void printRow(int size, int i) {
        getSpeaces (i, size);
        printStars (i);
        System.out.println ();
    }

    private static void printStars(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print ("* ");
        }
    }

    private static void getSpeaces(int i, int size) {
        int spacescount = Math.abs (size - i);
        for (int j = 0; j < spacescount; j++) {
            System.out.print (" ");
        }

    }
}
