package Vlojeni_Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS6_Fruit_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double a = Double.parseDouble(scanner.nextLine());
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                System.out.println(a * 2.50);
            } else if (fruit.equals("apple")) {
                System.out.println(a * 1.20);
            } else if (fruit.equals("orange")) {
                System.out.println(a * 0.85);
            } else if (fruit.equals("grapefruit")) {
                System.out.println(a * 1.45);
            } else if (fruit.equals("kiwi")) {
                System.out.println(a * 2.70);
            } else if (fruit.equals("pineapple")) {
                System.out.println(a * 5.50);
            } else if (fruit.equals("grapes")) {
                System.out.println(a * 3.85);
            }
        }
        if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                System.out.println(a * 2.7);
            } else if (fruit.equals("apple")) {
                System.out.println(a * 1.25);
            } else if (fruit.equals("orange")) {
                System.out.println(a * 0.90);
            } else if (fruit.equals("grapefruit")) {
                System.out.println(a * 1.60);
            } else if (fruit.equals("kiwi")) {
                System.out.println(a * 3.00);
            } else if (fruit.equals("pineapple")) {
                System.out.println(a * 5.60);
            } else if (fruit.equals("grapes")) {
                System.out.println(a * 4.20);
            }
        } else {
            System.out.println("error");
        }
    }
}
