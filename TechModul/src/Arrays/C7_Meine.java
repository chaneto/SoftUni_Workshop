package ATECHMODUL.Arrays;

import java.util.Scanner;

public class C7_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] p = scanner.nextLine().split(" ");
        int [] a = new int[p.length];
        int sum = 0;
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(p[i]);
        }
        while (a.length > 1){
            int [] b = new int[a.length - 1];
            for (int j = 0; j < a.length; j++) {
                b[j] = a[j] + a[j + 1];
            }a = b;
        }

        System.out.println(a[0]);
    }
}
