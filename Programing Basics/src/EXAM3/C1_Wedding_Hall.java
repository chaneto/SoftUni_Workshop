package EXAM3;

import java.util.Scanner;

public class C1_Wedding_Hall {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                double c = Double.parseDouble(scanner.nextLine());
                double hallcm2 = a * b;
                double barcm2 = c * c;
                double dancing = hallcm2 * 0.19;
                double total = hallcm2 - (dancing + barcm2);
                double people =Math.ceil(total/3.2);
                System.out.printf("%.0f",people);


            }

        }

