package Vlojeni_Cikli;

import java.util.Scanner;

public class CLASS5_Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 0; i <= a ; i++) {
            for (int j = 0; j <= a ; j++) {
                for (int k = 0; k <= a ; k++) {
                    for (int l = 0; l <= a ; l++) {
                        for (int m = 0; m <= a ; m++) {
                            int total = i + j + k + l + m;
                            if(a == total){
                                counter++;
                            }

                        }

                    }

                }

            }
            
        }
        System.out.println(counter);
    }
}
