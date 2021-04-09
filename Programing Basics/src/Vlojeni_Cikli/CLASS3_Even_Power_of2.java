package Vlojeni_Cikli;

import java.util.Scanner;

public class CLASS3_Even_Power_of2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int sum = 1;
        for (int i = 0; i <= a; i+=2) {
            System.out.println(sum);
            sum = sum * 4;

            
        }

    }
}
