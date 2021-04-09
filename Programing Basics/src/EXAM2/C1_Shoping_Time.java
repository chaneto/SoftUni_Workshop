package EXAM2;

import java.util.Scanner;

public class C1_Shoping_Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double time = Double.parseDouble(scanner.nextLine());
        double periferia = Double.parseDouble(scanner.nextLine());
        double pograma = Double.parseDouble(scanner.nextLine());
        double frape = Double.parseDouble(scanner.nextLine());
        double totalprice = (3 * periferia) + (2 * pograma) + frape;
        System.out.printf("%.2f%n",totalprice);
        System.out.printf("%.0f",time - 15);
    }
}
