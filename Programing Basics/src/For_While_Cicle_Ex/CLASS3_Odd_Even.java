package For_While_Cicle_Ex;

import java.util.Scanner;

public class CLASS3_Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double oddmin = 100000000;
        double oddmax = -100000000;
        double oddsum = 0;
        double evenmin = 100000000;
        double evenmax = -100000000;
        double evensum = 0;

        for (double i = 1; i <= a; i++) {
            double b = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evensum += b;
                if (evenmin > b) {
                    evenmin = b;
                } if (evenmax < b) {
                    evenmax = b;
                }

            }
            else {
                oddsum += b;
                if (oddmin > b) {
                    oddmin = b;
                }  if (oddmax < b) {
                    oddmax = b;
                }

            }
        }System.out.printf("OddSum = %.2f,%n", oddsum);
        if(oddmin == 100000000){
            System.out.println("OddMin = No");
        }else {
            System.out.printf("OddMin = %.2f,%n", oddmin);
        }if(oddmax == -100000000){
            System.out.println("OddMax = No");
        }else {
            System.out.printf("OddMax = %.2f,%n",oddmax);
        }
        System.out.printf("EvenSum = %.2f,%n",evensum);
        if(evenmin == 100000000){
            System.out.println("EvenMin = No");
        }else{
            System.out.printf("EvenMin = %.2f,%n",evenmin);
        }if(evenmax == -100000000){
            System.out.println("EvenMax = No");
        }else {
            System.out.printf("EvenMax = %.1f",evenmax);
        }

    }
}
