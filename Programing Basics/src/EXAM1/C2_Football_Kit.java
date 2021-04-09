package EXAM1;

import java.util.Scanner;

public class C2_Football_Kit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cenatenicka = Double.parseDouble(scanner.nextLine());
        double kitsum = Double.parseDouble(scanner.nextLine());
        double shorti = cenatenicka * 0.75 ;
        double chorapi = shorti * 0.20;
        double butonki = (cenatenicka + shorti) * 2;
        double total1 = (cenatenicka + shorti + chorapi + butonki) * 0.15;
        double total = (cenatenicka + shorti + chorapi + butonki) - total1;
        if(total >= kitsum){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.",total);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",kitsum - total );
        }
    }
}
