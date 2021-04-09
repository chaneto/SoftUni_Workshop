package ATECHMODUL.Methods;

import java.util.Scanner;

public class C6_Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double area = Calculate_Rectangle_Area(a,b);
        System.out.printf("%.0f",area);
    }
    public static double Calculate_Rectangle_Area(double a,double b){
        double result  = a * b;
        return result;


    }
}
