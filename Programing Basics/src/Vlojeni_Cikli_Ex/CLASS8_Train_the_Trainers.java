package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS8_Train_the_Trainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double juri = Double.parseDouble(scanner.nextLine());
        String p = scanner.nextLine();
        double total = 0;
        double counter = 0;
        while (!(p.equals("Finish"))) {
            double totala = 0;

            for (int i = 0; i < juri; i++) {
                double a = Double.parseDouble(scanner.nextLine());
                totala += a;


            }System.out.printf("%s - %.2f.%n", p, totala / juri);
            total = total + (totala / juri);
            p = scanner.nextLine();
            counter++;

        }System.out.printf("Student's final assessment is %.2f.", total / counter);


    }
}
