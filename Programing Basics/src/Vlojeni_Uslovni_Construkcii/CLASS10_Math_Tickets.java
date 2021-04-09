package Vlojeni_Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS10_Math_Tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budjet = Double.parseDouble(scanner.nextLine());
        String kategoriq = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine());
        if (p <= 4) {
            budjet = budjet - budjet * 0.75;
            if (kategoriq.equals("VIP")) {
                if (budjet > p * 499.99) {
                    System.out.printf("Yes! You have %.2f leva left.", budjet - p * 499.99);
                }
                if (budjet < p * 499.99) {
                    System.out.printf("Not enough money! You need %.2f leva.", p * 499.99 - budjet);
                }
            }
            if (kategoriq.equals("Normal")) {
                if (budjet > p * 249.99) {
                    System.out.printf("Yes! You have %.2f leva left.", budjet - p * 249.99);
                }
                if (budjet < p * 249.99) {
                    System.out.printf("Not enough money! You need %.2f leva.", p * 249.99 - budjet);
                }
            }
        } else if (p <= 9) {
            budjet = budjet - budjet * 0.60;
            if (kategoriq.equals("VIP")) {
                if (budjet > p * 499.99) {
                    System.out.printf("Yes! You have %.2f leva left.", budjet - p * 499.99);
                }
                if (budjet < p * 499.99) {
                    System.out.printf("Not enough money! You need %.2f leva.", p * 499.99 - budjet);
                }
            }
            if (kategoriq.equals("Normal")) {
                if (budjet > p * 249.99) {
                    System.out.printf("Yes! You have %.2f leva left.", budjet - p * 249.99);
                }
                if (budjet < p * 249.99) {
                    System.out.printf("Not enough money! You need %.2f leva.", p * 249.99 - budjet);
                }
            }
        } else if (p <= 24) {
            budjet = budjet - budjet * 0.50;
            if (kategoriq.equals("VIP")) {
                if (budjet > p * 499.99) {
                    System.out.printf("Yes! You have %.2f leva left.", budjet - p * 499.99);
                }
                if (budjet < p * 499.99) {
                    System.out.printf("Not enough money! You need %.2f leva.", p * 499.99 - budjet);
                }
            }
            if (kategoriq.equals("Normal")) {
                if (budjet > p * 249.99) {
                    System.out.printf("Yes! You have %.2f leva left.", budjet - p * 249.99);
                }
                if (budjet < p * 249.99) {
                    System.out.printf("Not enough money! You need %.2f leva.", p * 249.99 - budjet);
                }
            }
        } else if (p <= 49) {
            budjet = budjet - budjet * 0.40;
            if (kategoriq.equals("VIP")) {
                if (budjet > p * 499.99) {
                    System.out.printf("Yes! You have %.2f leva left.", budjet - p * 499.99);
                }
                if (budjet < p * 499.99) {
                    System.out.printf("Not enough money! You need %.2f leva.", p * 499.99 - budjet);
                }
            }
            if (kategoriq.equals("Normal")) {
                if (budjet > p * 249.99) {
                    System.out.printf("Yes! You have %.2f leva left.", budjet - p * 249.99);
                }
                if (budjet < p * 249.99) {
                    System.out.printf("Not enough money! You need %.2f leva.", p * 249.99 - budjet);
                }
            }
        } else if (p >= 50) {
            budjet = budjet - budjet * 0.25;
            if (kategoriq.equals("VIP")) {
                if (budjet > p * 499.99) {
                    System.out.printf("Yes! You have %.2f leva left.", budjet - p * 499.99);
                }
                if (budjet < p * 499.99) {
                    System.out.printf("Not enough money! You need %.2f leva.", p * 499.99 - budjet);
                }
            }
            if (kategoriq.equals("Normal")) {
                if (budjet > p * 249.99) {
                    System.out.printf("Yes! You have %.2f leva left.", budjet - p * 249.99);
                }
                if (budjet < p * 249.99) {
                    System.out.printf("Not enough money! You need %.2f leva.", p * 249.99 - budjet);
                }
            }
        }
    }
}
