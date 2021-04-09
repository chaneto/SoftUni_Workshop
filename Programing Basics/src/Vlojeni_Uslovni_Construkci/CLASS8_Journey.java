package Vlojeni_Uslovni_Construkci;

import java.util.Scanner;

public class CLASS8_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String p = scanner.nextLine();
        if(a <= 100)
        {
            if(p.equals("summer"))
            {
                System.out.printf("Somewhere in Bulgaria%n");
                System.out.printf("Camp - %.2f",a * 0.30);
            }if(p.equals("winter"))
            {
            System.out.printf("Somewhere in Bulgaria%n");
            System.out.printf("Hotel - %.2f",a * 0.70);
        }
        }
        else if(a <= 1000)
        {
            if(p.equals("summer")){
                System.out.printf("Somewhere in Balkans%n");
                System.out.printf("Camp - %.2f",a * 0.40);
            }
            if(p.equals("winter"))
            {
            System.out.printf("Somewhere in Balkans%n");
            System.out.printf("Hotel - %.2f",a * 0.80);
        }
        }
        else if(a > 1000)
        {
            System.out.printf("Somewhere in Europe%n");
            System.out.printf("Hotel - %.2f",a * 0.90);
        }



    }
}
