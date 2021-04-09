package Vlojeni_Cikli;

import java.util.Scanner;

public class CLASS2_Numbers_N_Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= a; i+=3) {
            System.out.println(i);
        }
    }
}
