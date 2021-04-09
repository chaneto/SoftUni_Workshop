package ATECHMODUL.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String p = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());
        Math_0peration(a,p,b);
        double sum = Math_0peration(a,p,b);
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.printf(format.format(sum));
    }public static double Math_0peration(double a, String p, double b){
        double sum = 0;
        if(p.equals("+")) {
            sum = a + b;
        }  if(p.equals("-")) {
            sum = a - b;
        }  if(p.equals("*")) {
            sum = a * b;
        }  if(p.equals("/")) {
            sum = a / b;
        }return sum;
    }
}
