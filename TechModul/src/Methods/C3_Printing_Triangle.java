package ATECHMODUL.Methods;

import java.util.Scanner;

public class C3_Printing_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= a; i++) {
            TRiangle(i);
        }
        for (int i = a -1; i > 0; i--) {
            TRiangle(i);
        }
    }

    private static void TRiangle(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
