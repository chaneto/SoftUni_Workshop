package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C12_Sum_of_od_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            b = 2 * i + 1;
            System.out.println(b);
            sum += b;
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
