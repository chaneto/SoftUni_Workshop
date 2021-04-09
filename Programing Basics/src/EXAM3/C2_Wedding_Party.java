package EXAM3;

import java.util.Scanner;

public class C2_Wedding_Party {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double borigosti = Double.parseDouble(scanner.nextLine());
            double budjet = Double.parseDouble(scanner.nextLine());
            double cena = borigosti * 20;
            double ostatatak = 0;
            double foerverki = 0;
            double darenie = 0;
            if (budjet >= cena) {
                ostatatak = budjet - cena;
                foerverki = ostatatak * 0.40;
                darenie = ostatatak - foerverki;
                System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.", foerverki, darenie);


            } else {
                System.out.printf("They won't have enough money to pay the covert." +
                        " They will need %.0f lv more.", cena - budjet);
            }
        }
    }

