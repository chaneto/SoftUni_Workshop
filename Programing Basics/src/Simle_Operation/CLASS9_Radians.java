package Simle_Operation;

import java.util.Scanner;

public class CLASS9_Radians {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double g = a*180/Math.PI;
        System.out.printf("%.0f",g);
    }
}
