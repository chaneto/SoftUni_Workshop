package ATECHMODUL.Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = a / b;
        System.out.printf("%.0f",Math.ceil(c));
    }
}
