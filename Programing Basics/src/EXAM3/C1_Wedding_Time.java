package EXAM3;

import java.util.Scanner;

public class C1_Wedding_Time {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double pricewhiskey = Double.parseDouble(scanner.nextLine());
            double wasser = Double.parseDouble(scanner.nextLine());
            double wine = Double.parseDouble(scanner.nextLine());
            double schamp = Double.parseDouble(scanner.nextLine());
            double whiskey = Double.parseDouble(scanner.nextLine());
            double schampprice = pricewhiskey*0.50;
            double wineprice = schampprice - schampprice * 0.60;
            double wasserprice =schampprice - schampprice * 0.90;
            double whiskeytotal = pricewhiskey * whiskey;
            double wassertotal = wasser * wasserprice;
            double winetotal = wineprice * wine;
            double schamptotal = schamp * schampprice;
            double total = whiskeytotal + wassertotal + winetotal + schamptotal;
            System.out.printf("%.2f",total);
        }
    }

