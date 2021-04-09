package EXAM2;

import java.util.Scanner;

public class C4_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double cm3 = w * l * h;
        double total = 0;
        while (cm3 >= total){
            String p = scanner.nextLine();
            if(p.equals("Done")){break;}
            double sum = Double.parseDouble(p);
            total += sum;


        }if(total >= cm3){
            System.out.printf("No more free space! You need %.0f Cubic meters more.",total - cm3);
        }else {
            System.out.printf("%.0f Cubic meters left.",cm3 - total);
        }
    }
}
