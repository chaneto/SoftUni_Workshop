package Vlojeni_Cikli_Ex;

import java.util.Scanner;

public class CLASS11_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 9 ; i++) {
            if(a % i != 0)continue;
            for (int j = 1; j <= 9 ; j++) {
                if(a % j != 0)continue;
                for (int k = 1; k <= 9 ; k++) {
                    if(a % k != 0)continue;
                    for (int l = 1; l <= 9 ; l++) {
                        if(a % l != 0 )continue;
                        if(a % i == 0 && a % j == 0 && a % k == 0 && a % l == 0){
                            System.out.print("" + i + j + k + l + " ");
                        }

                    }

                }
                
            }

        }
    }
}
