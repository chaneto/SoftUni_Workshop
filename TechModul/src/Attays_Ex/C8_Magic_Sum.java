package ATECHMODUL.Attays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C8_Magic_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        int[] a = new int[p.length];
        int b = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < p.length; i++) {
            a[i] = Integer.parseInt(p[i]);
        }
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if(b == a[i] + a[j]){
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
}
