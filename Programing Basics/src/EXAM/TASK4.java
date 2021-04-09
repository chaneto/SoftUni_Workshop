package EXAM;

import java.util.Scanner;

public class TASK4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double counter16 = 0;
        double counterover = 0;
        double sumtoys = 0;
        double sumsw = 0;
        while (true){
            String p = scanner.nextLine();
            if(p.equals("Christmas")){break;}
            double a = Double.parseDouble(p);
            if(a <= 16){
                counter16++;

            }else{
                counterover++;
            }
        }sumsw = counterover * 15;
        sumtoys = counter16 * 5;
        System.out.printf("Number of adults: %.0f%n",counterover);
        System.out.printf("Number of kids: %.0f%n",counter16);
        System.out.printf("Money for toys: %.0f%n",sumtoys);
        System.out.printf("Money for sweaters: %.0f",sumsw);
    }
}
