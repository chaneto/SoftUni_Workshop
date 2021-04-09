package ATECHMODUL.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C8_Math_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());
        DecimalFormat format = new DecimalFormat("#.####");
        double result = Math.pow(number,pow);
        System.out.printf(format.format(result));

    }
    static double Math_Power(double a,int stepen){
        double result = 1;
        for (int i = 1; i <= stepen ; i++) {
            result *= a;

        }return result;

    }
}
