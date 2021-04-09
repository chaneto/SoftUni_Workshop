package Vlojeni_Uslovni_Construkci;

import java.util.Scanner;

public class CLASS2_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        double r = Double.parseDouble(scanner.nextLine());
        double k = Double.parseDouble(scanner.nextLine());
        double full = r * k;
        if(p.equals("Premiere")) {
            System.out.printf("%.2f",full*12);
        }else if (p.equals("Normal")) {
            System.out.printf("%.2f",full*7.50);
        }else if (p.equals("Discount")) {
            System.out.printf("%.2f", full*5);
        }

    }
}
