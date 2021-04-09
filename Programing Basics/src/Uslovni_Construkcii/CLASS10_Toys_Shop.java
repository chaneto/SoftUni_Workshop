package Uslovni_Construkcii;

import java.util.Scanner;

public class CLASS10_Toys_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ex = Double.parseDouble(scanner.nextLine());
        double p = Double.parseDouble(scanner.nextLine());
        double k = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double mi = Double.parseDouble(scanner.nextLine());
        double ka = Double.parseDouble(scanner.nextLine());
        double pazel = p*2.60;
        double kukli = k*3;
        double mecheta = m*4.10;
        double minioni = mi*8.20;
        double kamioncheta = ka*2;
        double total = pazel+kukli+mecheta+minioni+kamioncheta;
        double t = total-total*0.10;
        double broi = p+k+m+mi+ka;
        double otstapka = t-t*0.25;
        if(broi>=50){
            if(otstapka>ex){
                System.out.printf("Yes! %.2f lv left.", otstapka-ex);
            }else if (otstapka<ex) {
                System.out.printf("Not enough money! %.2f lv needed.",ex-otstapka);}
            }else if(t>ex){
                System.out.printf("Yes! %.2f lv left.",t-ex);
            }else if(ex>t){
                System.out.printf("Not enough money! %.2f lv needed.",ex-t);
            }
        }
    }

