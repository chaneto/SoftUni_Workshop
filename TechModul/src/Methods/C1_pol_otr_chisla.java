package ATECHMODUL.Methods;

import java.util.Scanner;

public class C1_pol_otr_chisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        sign(a);

    }public static Integer sign(int a){
        if(a > 0){
            System.out.printf("The number %d is positive.",a);
        }else if(a == 0){
            System.out.printf("The number %d is zero.",a);
        }else {
            System.out.printf("The number %d is negative.",a);
        }return a;

    }
}
