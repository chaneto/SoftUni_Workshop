package Simple_Operation_Ex;

import java.util.Scanner;

public class CLASS2_USD_Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double usd = 1.79549;
        double bgn = a*usd;
        System.out.printf("%.2f",bgn);
    }
}
