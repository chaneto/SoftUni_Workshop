package ATECHMODUL.Exercise_BasycSyntax;

import java.util.Scanner;

public class C5_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int b = 0;
        int c = a;
        while (true) {
            if(c == 0){
                if(a == total){
                    System.out.println("yes");break;
                }else {
                    System.out.println("no");break;
                }
            }

            b = c % 10;
            int sum = 1;
            for (int i = 1; i <= b; i++) {
                sum *= i;
            }
            total += sum;
            c = c / 10;

        }
    }
}
