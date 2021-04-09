package EXAM1;

import java.util.Scanner;

public class C6_Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int a1 = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int b1 = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = a; i <= 8 ; i++) {
            for (int j = 9; j >= a1 ; j--) {
                for (int k = b; k <= 8 ; k++) {
                    for (int l = 9; l >= b1 ; l--) {
                        if(counter == 6)break;
                        if(i %2 == 0 && k %2 == 0 && j % 2 !=0 && l % 2 != 0){

                            if(i == k && j == l ){
                                System.out.println("Cannot change the same player.");

                            }else{
                                System.out.printf("%d%d - %d%d%n",i,j,k,l);
                                counter++;
                            }
                        }

                    }

                }

            }

        }
    }
}
