package Vlojeni_Uslovni_Construkci;

import java.util.Scanner;

public class CLASS10_Hotel_Room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        double a = Double.parseDouble(scanner.nextLine());
        double apartment = 0;
        double studio = 0;
        if(p.equals("May") || p.equals("October"))
        {
            apartment = a * 65;
            studio = a * 50;
            if(a > 7 && a <= 14)
            {
                studio = studio - studio * 0.05;
            }
            if(a > 14)
            {
                studio = studio - studio * 0.30;
            }
        }
        if(p.equals("June") || p.equals("September"))
        {
            apartment = a * 68.70;
            studio = a * 75.20;
            if(a > 14)
            {
                studio = studio - studio * 0.20;
            }
        }
        if(p.equals("July") || p.equals("August"))
        {
            apartment = a * 77;
            studio = a * 76;
        }
        if(a > 14)
        {
            apartment = apartment - apartment * 0.10;
        }

        System.out.printf("Apartment: %.2f lv.%n",apartment);
        System.out.printf("Studio: %.2f lv.",studio);

        }
    }

