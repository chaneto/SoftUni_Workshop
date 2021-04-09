package ATECHMODUL.Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C5_ASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        for (int i = a; i <= b; i++) {
            System.out.print(" "+(char)i);

        }
    }
}
