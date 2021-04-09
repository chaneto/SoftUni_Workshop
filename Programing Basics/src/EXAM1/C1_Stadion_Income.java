package EXAM1;

import java.util.Scanner;

public class C1_Stadion_Income {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double broisektori = Double.parseDouble(scanner.nextLine());
        double kapacitet = Double.parseDouble(scanner.nextLine());
        double cenabilet = Double.parseDouble(scanner.nextLine());
        double total = cenabilet * kapacitet;
        double pechalbasektor = total / broisektori;
        double procentsektor = pechalbasektor * 0.75;
        double t = total -procentsektor;
        double blatvoritelnst = t/8;
        System.out.printf("Total income - %.2f BGN%n",total);
        System.out.printf("Money for charity - %.2f BGN",blatvoritelnst);


    }
}
