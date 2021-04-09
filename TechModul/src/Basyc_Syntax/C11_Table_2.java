package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C11_Table_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        for (int i = b; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d%n",a,i,a*i);
        }if(b > 10){
            System.out.printf("%d X %d = %d%n",a,b,a*b);
        }
    }
}
