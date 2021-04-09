package ATECHMODUL.Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C10_Poke_Mon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int sum = n;
        int counter = 0;
        while (m <= n) {
            counter++;
            n = n - m;
            if (n == (sum * 0.50)) {
                if (y > 0) {
                    n = n / y;
                }
            }
        }
        System.out.println(n);
        System.out.println(counter);
    }
}
