package Simple_Operation_Ex;

import java.util.Scanner;

public class CLASS7_Alkohol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cenauiski = Double.parseDouble(scanner.nextLine());
        double biralt = Double.parseDouble(scanner.nextLine());
        double vinolt = Double.parseDouble(scanner.nextLine());
        double rakiqlt = Double.parseDouble(scanner.nextLine());
        double uiskilt = Double.parseDouble(scanner.nextLine());
        double cenarakiq = cenauiski/2;
        double cenavino = cenarakiq - cenarakiq*0.40;
        double cenabira = cenarakiq - cenarakiq*0.80;
        double uiski = uiskilt*cenauiski;
        double bira = biralt*cenabira;
        double rakiq = rakiqlt*cenarakiq;
        double vino = cenavino*vinolt;
        double total = uiski+vino+rakiq+bira;
        System.out.printf("%.2f",total);
    }
}
