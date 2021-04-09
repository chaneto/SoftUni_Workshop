package Simle_Operation;

import java.util.Scanner;

public class CLASS5_Trapec_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = (a+b)*h/2;{
            System.out.println(area);
        }
    }
}
