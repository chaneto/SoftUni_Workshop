package Simle_Operation;

import java.util.Scanner;

public class CLASS10_Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double p = Double.parseDouble(scanner.nextLine());
        double obem = a*b*h;
        double litri = obem*0.001;
        double pr = p*0.01;
        double tutal = litri * (1-pr);
        System.out.printf("%.3f", tutal);
    }
}
