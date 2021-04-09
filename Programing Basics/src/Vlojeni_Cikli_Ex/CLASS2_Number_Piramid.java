package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS2_Number_Piramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        boolean stop = false;
        int counter = 1;
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(counter > a){
                    stop = true;
                    break;
                }System.out.print(counter + " ");
                counter++;

            }if(stop){break;
            }System.out.println();

        }
    }
}
