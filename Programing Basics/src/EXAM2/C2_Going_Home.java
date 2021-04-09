package EXAM2;

import java.util.Scanner;

public class C2_Going_Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km = Double.parseDouble(scanner.nextLine());
        double l100 = Double.parseDouble(scanner.nextLine());
        double pricefuel = Double.parseDouble(scanner.nextLine());
        double sumturnir = Double.parseDouble(scanner.nextLine());
        double totalpricegorivo = (km / 100) * l100 * pricefuel;
        if(sumturnir >= totalpricegorivo){
            System.out.printf( "You can go home. %.2f money left.",sumturnir - totalpricegorivo);
        }else {
            System.out.printf("Sorry, you cannot go home. Each will receive %.2f money.",sumturnir / 5);
        }
    }
}
