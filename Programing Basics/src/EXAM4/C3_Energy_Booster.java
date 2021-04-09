package EXAM4;

import java.util.Scanner;

public class C3_Energy_Booster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plod = scanner.nextLine();
        String bigorsmall = scanner.nextLine();
        double broi = Double.parseDouble(scanner.nextLine());
        double pricegel = 0;
        if(plod.equals("Watermelon")){
            if(bigorsmall.equals("small")){
                pricegel =broi * 56 *2;
            }else if(bigorsmall.equals("big")){
                pricegel = broi * 28.70 *5;
            }
        } else if(plod.equals("Mango")){
            if(bigorsmall.equals("small")){
                pricegel =broi * 36.66 * 2;
            }else if(bigorsmall.equals("big")){
                pricegel = broi * 19.60 * 5;
            }
        } else if(plod.equals("Pineapple" )){
            if(bigorsmall.equals("small")){
                pricegel = broi * 42.10 * 2 ;
            }else if(bigorsmall.equals("big")){
                pricegel = broi * 24.80 * 5;
            }
        } else if(plod.equals("Raspberry" )){
        if(bigorsmall.equals("small")){
            pricegel = broi * 20 * 2;
        }else if(bigorsmall.equals("big")){
            pricegel = broi * 15.20 * 5;
        }
    }if(pricegel >= 400 && pricegel <=1000){
            pricegel = pricegel - pricegel * 0.15;
        }if(pricegel > 1000){
            pricegel = pricegel - pricegel * 0.50;
        }
        System.out.printf("%.2f lv.",pricegel);
    }
}
