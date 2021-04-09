package Vlojeni_Uslovni_Construkci;

import java.util.Scanner;

public class CLASS6_Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budjet = Integer.parseInt(scanner.nextLine());
        String sezon = scanner.nextLine();
        int broiribari = Integer.parseInt(scanner.nextLine());
        double naem = 0;
        if (sezon.equals("Spring")){naem=3000;}
        else if (sezon.equals("Summer") || sezon.equals("Autumn")) {naem=4200;}
        else if (sezon.equals("Winter")) {naem=2600;}
        naem = naem;
        if (broiribari<=6){naem=naem-naem*0.10;}
        else if(broiribari>=7 && broiribari<=11) {naem=naem-naem*0.15;}
        else if (broiribari>=12) {naem=naem-naem*0.25;}
        if (!(sezon.equals("Autumn")) && broiribari %2==0){naem=naem-naem*0.05;}
        if(budjet<naem) {
            System.out.printf("Not enough money! You need %.2f leva.",naem-budjet);


        }else { System.out.printf("Yes! You have %.2f leva left.",budjet-naem);}

    }
}
