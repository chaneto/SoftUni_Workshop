package ATECHMODUL.Attays_Ex;

import java.util.Scanner;

public class C4_Array_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        int a = Integer.parseInt(scanner.nextLine());
        String index = "";
        for  (int i = 0; i < a; i++) {
            index = p[0];
            for (int j = 0; j < p.length - 1; j++) {
                p[j] = p[j + 1];
            }p[p.length - 1] = index;
        }
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
        }
    }
}
