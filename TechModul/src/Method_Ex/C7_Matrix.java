package ATECHMODUL.Method_Ex;

import java.util.Scanner;

public class C7_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        M(a);
    }public static Integer M (int a){
        int b = a;
        while (b > 0) {
            for (int i = 0; i < a; i++) {
                System.out.print(a + " ");
            }System.out.println();
            b--;
        }
        return a;
    }
}
