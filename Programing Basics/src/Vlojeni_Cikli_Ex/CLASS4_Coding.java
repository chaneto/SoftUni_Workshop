package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS4_Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int char1 = 0;
        while (a > 0){
            total = a % 10;
            if(total == 0){
                System.out.println("ZERO");
            }else{
                char1 = total + 33;
                char symbol = (char)char1;
                for (int i = 0; i < total; i++) {
                    System.out.print(symbol);

                }System.out.println();
            }a /= 10;

        }

    }
}
