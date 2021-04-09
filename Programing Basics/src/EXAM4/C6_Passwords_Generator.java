package EXAM4;

import java.util.Scanner;

public class C6_Passwords_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int A = 35;
        int B = 64;
        int counter = 0;
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= b; j++ , A++, B++, max--) {
                if(A > 55){
                    A = 35;
                }if(B > 96){
                    B = 64;
                }if(max == 0){break;}

            System.out.print("" + (char)A + (char)B + i + j + (char)B + (char)A + "|" );
            }
        }
    }
}
