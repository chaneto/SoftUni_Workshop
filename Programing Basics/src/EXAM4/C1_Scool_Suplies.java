package EXAM4;

import java.util.Scanner;

public class C1_Scool_Suplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double himikali = Double.parseDouble(scanner.nextLine());
        double markeri = Double.parseDouble(scanner.nextLine());
        double preparat = Double.parseDouble(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());
        double totalhimikali = himikali * 5.80;
        double totalmarkeri = markeri * 7.20;
        double totalpreparat = preparat * 1.20;
        double total = totalhimikali + totalmarkeri + totalpreparat;
        double p = total - (total*procent)/100;
        System.out.printf("%.3f",p);

    }
}
