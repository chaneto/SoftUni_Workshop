package Simle_Operation;

import java.util.Scanner;

public class CLASS8_Celzii_to_Farenhait {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double c = a*1.8000+32;
        System.out.printf("%.2f",c);
    }
}
