package Vlojeni_Cikli;

import java.util.Scanner;

public class CLASS6_Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String p = scanner.nextLine();
            if (p.equals("End"))
                break;

            double a = Double.parseDouble(scanner.nextLine());
            double total = 0;
            while (a > total) {
                double b = Double.parseDouble(scanner.nextLine());
                total += b;

            }
            System.out.printf("Going to %s!%n", p);
        }
    }
}
