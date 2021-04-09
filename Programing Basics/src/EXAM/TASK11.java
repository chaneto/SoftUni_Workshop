package EXAM;

import java.util.Scanner;

public class TASK11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricebaklava = Double.parseDouble(scanner.nextLine());
        double pricemufin = Double.parseDouble(scanner.nextLine());
        double schtolenkg = Double.parseDouble(scanner.nextLine());
        double bonbonskg = Double.parseDouble(scanner.nextLine());
        double biskvitokg = Double.parseDouble(scanner.nextLine());
        double priceschtolen = (pricebaklava + pricebaklava * 0.60) * schtolenkg;
        double pricebonboni = (pricemufin + pricemufin * 0.80) * bonbonskg;
        double pricebiskviti = biskvitokg * 7.50;
        double total = priceschtolen + pricebiskviti + pricebonboni;
        System.out.printf("%.2f",total);
    }
}
