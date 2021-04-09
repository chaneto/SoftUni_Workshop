package Vlojeni_Cikli;

import java.util.Scanner;

public class CLASS4_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int et = Integer.parseInt(scanner.nextLine());
        int ap = Integer.parseInt(scanner.nextLine());
        for (int i = et; i >= 1 ; i--) {
            for (int j = 0; j <ap ; j++) {

                if(i == et || et == 1){
                    System.out.print("L" + i + j + " ");
                }else if(i % 2 == 0){
                    System.out.print("O" + i + j + " ");
                }else {
                    System.out.print("A" + i + j + " ");
                }

            }System.out.println();


        }
    }

}
