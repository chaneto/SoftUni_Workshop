package ATECHMODUL.Method_Ex;

import java.util.Scanner;

public class C8_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double out = factorial(a) / factorial1(b);
        System.out.printf("%.2f",out);
    }public static double factorial(double a){
        double sum = 1;
        for (double i = a; i > 0; i--) {
            sum*=i;
        }return sum;
    }public static double factorial1(double b){
        double sum = 1;
        for (double i = b; i > 0; i--) {
            sum*=i;
        }return sum;
    }
}
