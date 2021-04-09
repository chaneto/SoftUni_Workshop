package EXAM4;

import java.util.Scanner;

public class C2_Scool_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dni = Double.parseDouble(scanner.nextLine());
        double hranakg = Double.parseDouble(scanner.nextLine());
        double k1 = Double.parseDouble(scanner.nextLine());
        double k2 = Double.parseDouble(scanner.nextLine());
        double k3 = Double.parseDouble(scanner.nextLine());
        double k11 = k1 * dni;
        double k21 = k2 * dni;
        double k31 = k3 * dni;
        double total = k11 + k21 + k31;
        double min = Math.ceil(total - hranakg);
        double max = Math.floor(hranakg - total);
        if(hranakg >= total){
            System.out.printf("%.0f kilos of food left.",max);
        }else{
            System.out.printf("%.0f more kilos of food are needed.",min);
        }

    }
}
