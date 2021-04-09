package Vlojeni_Uslovni_Construkci;

import java.util.Scanner;

public class CLASS4_Summer_Out_Fit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String p = scanner.nextLine();
        if (10 <= a && a <= 18) {
            if (p.equals("Morning")) {
                System.out.printf("It's %.0f degrees, get your Sweatshirt and Sneakers.", a);
            } else if (p.equals("Afternoon")) {
                System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", a);
            } else if (p.equals("Evening")) {
                System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", a);
            }
        }
        if (18 < a && a <= 24) {
            if (p.equals("Morning")) {
                System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", a);
            } else if (p.equals("Afternoon")) {
                System.out.printf("It's %.0f degrees, get your T-Shirt and Sandals.", a);
            } else if (p.equals("Evening")) {
                System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", a);

            }
        }
        if (25 <= a) {
            if (p.equals("Morning")) {
                System.out.printf("It's %.0f degrees, get your T-Shirt and Sandals.", a);
            } else if (p.equals("Afternoon")) {
                System.out.printf("It's %.0f degrees, get your Swim Suit and Barefoot.", a);
            } else if (p.equals("Evening")) {
                System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", a);
            }
        }
    }
}