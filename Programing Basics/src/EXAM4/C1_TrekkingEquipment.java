package EXAM4;

import java.util.Scanner;

public class C1_TrekkingEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double broialpinisti = Double.parseDouble(scanner.nextLine());
        double broikarabini = Double.parseDouble(scanner.nextLine());
        double broivajeta = Double.parseDouble(scanner.nextLine());
        double broipikeli = Double.parseDouble(scanner.nextLine());
        double sumkarabini = broikarabini * 36;
        double sumvajeta = broivajeta * 3.60;
        double sumpikeli = broipikeli * 19.80;
        double sum = (sumkarabini + sumpikeli + sumvajeta) * broialpinisti;
        double total = sum + sum * 0.20;
        System.out.printf("%.2f",total);
    }

}
