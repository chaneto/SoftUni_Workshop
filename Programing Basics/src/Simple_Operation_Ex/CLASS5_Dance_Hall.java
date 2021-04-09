package Simple_Operation_Ex;

import java.util.Scanner;

public class CLASS5_Dance_Hall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double a = Double.parseDouble(scanner.nextLine());
        double zalam2 = (l*100)*(w*100);
        double garderobm2=(a*100)*(a*100);
        double peikam2 = zalam2/10;
        double tancior = 40;
        double tancior1 = 7000;
        double tanciortotal= tancior1+tancior;
        double totalzala = zalam2-garderobm2-peikam2;
        double total= totalzala/tanciortotal;
        System.out.printf("%.0f",Math.floor(total));
    }
}
