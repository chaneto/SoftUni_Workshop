package ATECHMODUL.Exercise_BasycSyntax;

import java.util.Scanner;

public class C8_Padawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        double broiuchenuci = Double.parseDouble(scanner.nextLine());
        double pricemech = Double.parseDouble(scanner.nextLine());
        double pricehalat = Double.parseDouble(scanner.nextLine());
        double pricekolan = Double.parseDouble(scanner.nextLine());
        double pricemech1 = Math.ceil(broiuchenuci + broiuchenuci * 0.10);
        double broi = broiuchenuci;
        if(broiuchenuci > 5) {
            broi = broi - Math.floor(broi/6);}
        double total = (pricemech1 * pricemech) + (broiuchenuci * pricehalat) + (broi * pricekolan);
        if(total <= sum){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }else{
            System.out.printf("Ivan Cho will need %.2flv more.",total - sum);
        }
    }
}
