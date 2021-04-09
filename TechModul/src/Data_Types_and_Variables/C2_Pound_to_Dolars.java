package ATECHMODUL.Data_Types_and_Variables;

import java.util.Scanner;

public class C2_Pound_to_Dolars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        a = a * 1.31;
        System.out.printf("%.3f",a);
    }
}
