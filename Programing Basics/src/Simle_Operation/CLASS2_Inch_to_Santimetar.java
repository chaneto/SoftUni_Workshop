package Simle_Operation;

import java.util.Scanner;

public class CLASS2_Inch_to_Santimetar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double sm = a * 2.54;
        System.out.println(sm);
    }
}
