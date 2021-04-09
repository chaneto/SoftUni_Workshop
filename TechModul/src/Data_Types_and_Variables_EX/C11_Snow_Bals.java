package ATECHMODUL.Data_Types_and_Variables_EX;

import java.util.Scanner;

public class C11_Snow_Bals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b1 = 0;
        int c1 = 0;
        int d1 = 0;
        double sum = 0;
        double winner = 0;
        for (int i = 1; i <= a ; i++) {
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());
            int d = Integer.parseInt(scanner.nextLine());
            sum = Math.pow((b / c),d);
            if(sum > winner) {
                winner = sum;
                b1 = b;
                c1 = c;
                d1 = d;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",b1,c1,winner,d1);

    }
}
