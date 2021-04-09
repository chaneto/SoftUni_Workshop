package ATECHMODUL.Data_Types_and_Variables;

import java.util.Scanner;

public class C1_Convert_Meters_to_Kilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        a = a / 1000;
        System.out.printf("%.2f",a);

    }
}
