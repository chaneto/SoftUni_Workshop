package Uslovni_Konstrukcii_Ex;

import java.util.Scanner;

public class CLASS1_Summ_Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double sek1 = a+b+c;
        double sek = sek1%60;
        double min =sek1/60;
        if(sek<10){
            System.out.printf("%.0f:0%.0f",Math.floor(min), sek);
        }else{
        System.out.printf("%.0f:%.0f",Math.floor(min),sek);}







    }
}
