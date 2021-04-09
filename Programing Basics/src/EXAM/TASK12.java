package EXAM;

import java.util.Scanner;

public class TASK12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        double fantasy = Double.parseDouble(scanner.nextLine());
        double horar = Double.parseDouble(scanner.nextLine());
        double romantic = Double.parseDouble(scanner.nextLine());
        double sumfantasy = fantasy * 14.90;
        double sumhorar = horar * 9.80;
        double sumromantik = romantic * 4.30;
        double total = sumfantasy + sumromantik + sumhorar;
        total = total - total * 0.20;
        double razlika  = total - sum;
        double razlika1 = 0;
        if(total >= sum)
        {
            razlika1 = Math.floor(razlika * 0.10);
        }
        double totalsum = sum +  (razlika - razlika1);
        if(total >= sum)
        {
            System.out.printf("%.2f leva donated.%n",totalsum);
            System.out.printf("Sellers will receive %.0f leva.",razlika1);
        }
        else
        {
            System.out.printf("%.2f money needed.",sum - totalsum);
        }

    }
}
