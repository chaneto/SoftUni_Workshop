package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS5_Equal_Sum_Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = a; i <= b; i++) {
            total = i;
            int edno = total % 10;
            total = total / 10;
            int dve = total % 10;
            total = total / 10;
            int tri = total % 10;
            total = total / 10;
            int chetiri = total % 10;
            total = total / 10;
            int pet = total % 10;
            total = total / 10;
            int shest = total % 10;
            if(edno + tri + pet == dve + chetiri + shest){
                System.out.printf("%d ",i);
            }

        }

    }
}
