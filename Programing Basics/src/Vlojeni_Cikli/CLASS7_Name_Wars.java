package Vlojeni_Cikli;

import java.util.Scanner;

public class CLASS7_Name_Wars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pobeditel = 0;
        String imepobeditel = "";
        while (true){
            String p = scanner.nextLine();
            if(p.equals("STOP")){break;}
            int tochki = 0;
            for (int i = 0; i < p.length(); i++) {
              tochki +=  p.charAt(i);
            }if(tochki > pobeditel){
                pobeditel = tochki;
                imepobeditel = p;
            }
        }
        System.out.printf("Winner is %s - %d!",imepobeditel,pobeditel);
    }
}
