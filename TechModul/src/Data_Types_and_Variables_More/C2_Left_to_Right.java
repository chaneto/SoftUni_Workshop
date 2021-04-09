package ATECHMODUL.Data_Types_and_Variables_More;

import java.util.Scanner;

public class C2_Left_to_Right {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double sum2 = 0;
        int sum1 = 0;
        double num = 0;
        for (int i = 0; i < a; i++) {
            double b = Double.parseDouble(scanner.next());
            double c = Double.parseDouble(scanner.next());
            if (b > c) {
                num = Math.abs(b);
                while (num > 0) {
                    sum1 += (num % 10);
                    num = num / 10;
                }
            }else {
                num = Math.abs(c);
                while (num > 0) {
                    sum1 += (num % 10);
                    num = num / 10;
                }

            }System.out.printf("%.0f%n",sum1);
            sum2 = 0;

        }
    }
}