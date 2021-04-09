package Uslovni_Konstrukcii_Ex;

import java.util.Scanner;

public class CLASS6_Three_Brothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double f = Double.parseDouble(scanner.nextLine());
        double cleaning = 1/(1/a+1/b+1/c);
        double total =cleaning + cleaning*0.15;
        if(total<f){
            System.out.printf("Cleaning time: %.2f%n",total);
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.",Math.floor(f-total));
        }else {
            System.out.printf("Cleaning time: %.2f%n",total);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.",Math.ceil(total-f));
        }
    }
}
