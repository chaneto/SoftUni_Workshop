package Simple_Operation_Ex;

import java.util.Scanner;

public class CLASS6_Chairity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double broqdni = Double.parseDouble(scanner.nextLine());
        double broqsladkari = Double.parseDouble(scanner.nextLine());
        double broqtorti = Double.parseDouble(scanner.nextLine());
        double broqgofreti = Double.parseDouble(scanner.nextLine());
        double broqpalachinki = Double.parseDouble(scanner.nextLine());
        double totaltorti = broqtorti*45;
        double totalgofreti = broqgofreti*5.80;
        double totalpalachinki = broqpalachinki*3.20;
        double totalsum = totaltorti+totalgofreti+totalpalachinki;
        double sladkari = totalsum*broqsladkari;
        double total= sladkari*broqdni;
        double t = total-total/8;
        System.out.printf("%.2f",t);
    }
}
