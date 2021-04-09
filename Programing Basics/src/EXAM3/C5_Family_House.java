package EXAM3;

import java.util.Scanner;

public class C5_Family_House {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double woda = a * 20;
        double net = a * 15;
        double tok = 0;
        double oder = 0;
        double total = 0;
        double oder1 = 0;

        for (int i = 0; i < a ; i++) {
            double I = Double.parseDouble(scanner.nextLine());
            tok += I;

        }
        oder = (woda + tok + net) * 0.20;
        oder1 = woda + tok + net + oder;
        total = (woda + net + tok + oder1) / a;
        System.out.printf("Electricity: %.2f lv%n",tok);
        System.out.printf("Water: %.2f lv%n",woda);
        System.out.printf("Internet: %.2f lv%n",net);
        System.out.printf("Other: %.2f lv%n",oder1);
        System.out.printf("Average: %.2f lv",total);

        }
    }

