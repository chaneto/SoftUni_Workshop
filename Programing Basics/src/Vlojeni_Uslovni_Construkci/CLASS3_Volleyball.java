package Vlojeni_Uslovni_Construkci;

import java.util.Scanner;

public class CLASS3_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String years = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine());
        double weekendrg = Double.parseDouble(scanner.nextLine());
        double weekends = 48 - weekendrg;
        double igiris = weekends*3/4;
        double igirirg = weekendrg;
        double igiripraznici = p*2/3;
        double obshtoigri = igiris + igirirg + igiripraznici;
        double leap = obshtoigri + obshtoigri*0.15;
        if (years.equals("leap")) {
            System.out.printf("%.0f",Math.floor(leap) );

        }else if (years.equals("normal")) {
            System.out.printf("%.0f", Math.floor(obshtoigri));
        }
    }
}
