package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C10_Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d X %d = %d%n",a,1,a*1);
        System.out.printf("%d X %d = %d%n",a,2,a*2);
        System.out.printf("%d X %d = %d%n",a,3,a*3);
        System.out.printf("%d X %d = %d%n",a,4,a*4);
        System.out.printf("%d X %d = %d%n",a,5,a*5);
        System.out.printf("%d X %d = %d%n",a,6,a*6);
        System.out.printf("%d X %d = %d%n",a,7,a*7);
        System.out.printf("%d X %d = %d%n",a,8,a*8);
        System.out.printf("%d X %d = %d%n",a,9,a*9);
        System.out.printf("%d X %d = %d",a,10,a*10);
    }
}
