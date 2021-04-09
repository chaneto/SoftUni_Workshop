package EXAM3;

import java.util.Scanner;

public class C2_Maiden_Party {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double pricepatry = Double.parseDouble(scanner.nextLine());
            double sumlove = Double.parseDouble(scanner.nextLine());
            double sumroses = Double.parseDouble(scanner.nextLine());
            double sumkluch = Double.parseDouble(scanner.nextLine());
            double sumkarikaturi = Double.parseDouble(scanner.nextLine());
            double sumsurorise = Double.parseDouble(scanner.nextLine());
            double totallove = sumlove * 0.60;
            double totalroses = sumroses * 7.20;
            double totalkluch = sumkluch * 3.60;
            double totalkarikatura = sumkarikaturi * 18.20;
            double totaisurprise = sumsurorise * 22.00;
            double totalprice = totallove + totalroses + totalkluch + totalkarikatura + totaisurprise;
            double broi = sumlove + sumkluch + sumroses + sumkarikaturi + sumsurorise;
            if(broi > 25){
                totalprice  = totalprice - totalprice * 0.35;
            }totalprice = totalprice - totalprice * 0.10;
            if(pricepatry <= totalprice){
                System.out.printf("Yes! %.2f lv left.",totalprice - pricepatry);
            }else {
                System.out.printf("Not enough money! %.2f lv needed.",pricepatry - totalprice);
            }
        }
    }

