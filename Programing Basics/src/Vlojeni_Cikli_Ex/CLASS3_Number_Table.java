package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS3_Number_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int current = 1;
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < a ; j++) {
                current = i + j + 1;
                if(current > a){
                    current = 2 * a - current;
                }
                System.out.print(current + " ");

            }
            System.out.println();

        }
    }
}
