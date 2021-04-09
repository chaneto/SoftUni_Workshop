package EXAM2;

import java.util.Scanner;

public class C5_Computer_Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double broi = Double.parseDouble(scanner.nextLine());
        double r = 0;
        double rs = 0;
        double totalr = 0;
        double p = 0;
        double broiprodajbi = 0;
        double totalp = 0;
        for (int i = 0; i < broi; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            r = num % 10;
            rs += r;
            totalr = rs / broi;
            p = Math.floor(num / 10);
            if(r==2){
                totalp += p * 0;
            }else if(r==3){
                totalp += p * 0.50;
            }else if(r==4){
                totalp += p * 0.70;
            }else if(r==5){
                totalp += p * 0.85;
            }else if(r==6){
                totalp += p;
            }

        }
        System.out.printf("%.2f%n",totalp);
        System.out.printf("%.2f",totalr);
    }
}
