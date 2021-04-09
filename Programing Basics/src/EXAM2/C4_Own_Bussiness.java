package EXAM2;

import java.util.Scanner;

public class C4_Own_Bussiness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        String p = "";
        double cm3 = w * l * h;
        double cm3k = 0;
        while (!(p.equals("Done"))){
            p = scanner.nextLine();
            if(p.equals("Done")){System.out.printf("%.0f Cubic meters left.",cm3 - cm3k);break;
            }double broi = Double.parseDouble(p);
            cm3k = cm3k + broi;
            if(cm3 < cm3k){
                System.out.printf("No more free space! You need %.0f Cubic meters more.",cm3k - cm3);break;
            }

            }

    }
}
