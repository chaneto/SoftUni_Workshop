package EXAM;

import java.util.Scanner;

public class TASK13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        double broi = Double.parseDouble(scanner.nextLine());
        double date = Double.parseDouble(scanner.nextLine());
        double total = 0;
        if(date <= 15)
        {
            if(p.equals("Cake"))
            {
                total = broi * 24;
            }
           else if(p.equals("Souffle"))
            {
                total = broi * 6.66;
            }
           else if(p.equals("Baklava"))
            {
                total = broi * 12.60;
            }
        }
        if(date > 15)
        {
            if(p.equals("Cake"))
            {
                total = broi * 28.70;
            }
            if(p.equals("Souffle"))
            {
                total = broi * 9.80;
            }
            if(p.equals("Baklava"))
            {
                total = broi * 16.98;
            }
        }
        if(total >= 100 && total <= 200 && date <= 22)
        {
            total = total - total * 0.15;
        }
        if(total > 200 && date <= 22)
        {
            total = total - total * 0.25;
        }
        if(date <= 15)
        {
            total = total - total * 0.10;
        }
        System.out.printf("%.2f",total);
    }
}
