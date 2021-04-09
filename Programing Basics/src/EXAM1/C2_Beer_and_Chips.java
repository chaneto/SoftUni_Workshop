package EXAM1;

import java.util.Scanner;

public class C2_Beer_and_Chips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double budjet = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double chips = Double.parseDouble(scanner.nextLine());
        double totalbeer = beer * 1.20;
        double packetchips = totalbeer * 0.45;
        double totalchips = Math.ceil(packetchips * chips);
        double total = totalbeer + totalchips;
        if(budjet >= total){
            System.out.printf("%s bought a snack and has %.2f leva left.",name,budjet - total);
        }else {
            System.out.printf("%s needs %.2f more leva!",name,total - budjet);
        }
    }
}
