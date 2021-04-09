package EXAM;

import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricebaklava = Double.parseDouble(scanner.nextLine());
        double pricemufin = Double.parseDouble(scanner.nextLine());
        double shtolenkg = Double.parseDouble(scanner.nextLine());
        double bonbonikg = Double.parseDouble(scanner.nextLine());
        double biskvitikg = Double.parseDouble(scanner.nextLine());
        double shtolen = pricebaklava * 0.60;
        double priceshtolen = pricebaklava + shtolen;
        double totalshtolen = priceshtolen * shtolenkg;
        double bonboni = pricemufin * 0.80;
        double pricebonboni = pricemufin + bonboni;
        double totalbonboni = bonbonikg * pricebonboni;
        double totalbiskviti = biskvitikg * 7.50;
        double total = totalbiskviti + totalbonboni + totalshtolen;
        System.out.printf("%.2f",total);
    }
}
