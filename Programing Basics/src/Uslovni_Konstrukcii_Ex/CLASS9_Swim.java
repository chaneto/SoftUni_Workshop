package Uslovni_Konstrukcii_Ex;

import java.util.Scanner;

public class CLASS9_Swim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double records = Double.parseDouble(scanner.nextLine());
        double razstoqniem = Double.parseDouble(scanner.nextLine());
        double vremezametar = Double.parseDouble(scanner.nextLine());
        double totaltime = razstoqniem*vremezametar;
        double zabawqne =Math.floor(razstoqniem/15);
        double zabavqne = zabawqne*12.5;
        double total= totaltime+zabavqne;
        if(records>total){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",total);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(records-total));
        }
    }
}
