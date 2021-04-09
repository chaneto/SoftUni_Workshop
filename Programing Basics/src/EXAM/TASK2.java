package EXAM;

import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        double fantasy = Double.parseDouble(scanner.nextLine());
        double horar = Double.parseDouble(scanner.nextLine());
        double romantik = Double.parseDouble(scanner.nextLine());
        double sumfantasy = fantasy * 14.90;
        double sumhorar = horar * 9.80;
        double sumromantik = romantik * 4.30;
        double total = sumfantasy + sumhorar + sumromantik;
        double procent = total * 0.20;
        double totalsum = total - procent;
        double razlika = totalsum - sum;
        double razlikasum = 0;

        if(totalsum > sum)
        {
            razlikasum = Math.floor(razlika * 0.10);
        }
        double r = razlika - razlikasum;
        double darenie  = sum + r;
        if(darenie > sum)
        {
            System.out.printf("%.2f leva donated.%n",darenie);
            System.out.printf("Sellers will receive %.0f leva.",razlikasum);
        }
        else
            {
            System.out.printf("%.2f money needed.",sum - darenie);
        }
    }
}
