package Simle_Operation;

import java.util.Scanner;

public class CLASS6_Cirkle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double area = Math.PI* a* a;
        double p = 2*Math.PI*a;{
            System.out.printf("Area = %f%nPerimeter = %f",area, p);
        }
    }
}
