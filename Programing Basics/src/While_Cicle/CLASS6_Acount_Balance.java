package While_Cicle;

import java.util.Scanner;

public class CLASS6_Acount_Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broivnoski = Integer.parseInt(scanner.nextLine());
        double suma = 0;
        int broqch = 0;
        while(broivnoski > broqch){
            broqch++;
            double vnoski = Double.parseDouble(scanner.nextLine());
            if(vnoski<0){
                System.out.println("Invalid operation!");break;
            }suma =suma + vnoski;
            System.out.printf("Increase: %.2f%n",vnoski);
        }System.out.printf("Total: %.2f", suma);

    }
}
