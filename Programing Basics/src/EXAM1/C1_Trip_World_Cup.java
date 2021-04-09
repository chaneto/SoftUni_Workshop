package EXAM1;

import java.util.Scanner;

public class C1_Trip_World_Cup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double biletotivane = Double.parseDouble(scanner.nextLine());
        double biletvrashtane = Double.parseDouble(scanner.nextLine());
        double biletmach = Double.parseDouble(scanner.nextLine());
        double broimachove = Double.parseDouble(scanner.nextLine());
        double otstapka = Double.parseDouble(scanner.nextLine());
        double cenabilett = biletotivane + biletvrashtane;
        double otstapkat = (cenabilett * otstapka) / 100;
        double cenabilet = cenabilett - otstapkat;
        double totalmachove = biletmach * broimachove;
        double chovek = cenabilet + totalmachove;
        double total = chovek * 6;
        System.out.printf("Total sum: %.2f lv.%n",total);
        System.out.printf("Each friend has to pay %.2f lv.",chovek);
    }
}
