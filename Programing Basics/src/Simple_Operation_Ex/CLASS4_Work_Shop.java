package Simple_Operation_Ex;

import java.util.Scanner;

public class CLASS4_Work_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double broimasi = Double.parseDouble(scanner.nextLine());
        double lmasi = Double.parseDouble(scanner.nextLine());
        double wmasi = Double.parseDouble(scanner.nextLine());
        double pm2 = (lmasi+2*0.3)*(wmasi+2*0.3)*broimasi;
        double km2 = (lmasi/2)*(lmasi/2)*broimasi;
        double totalsump = pm2*7;
        double totalsumk = km2*9;
        double total = totalsump + totalsumk;
        System.out.printf("%.2f USD%n",total);
        System.out.printf("%.2f BGN",total*1.85);

    }

}
