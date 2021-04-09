package ATECHMODUL.Arrays;

import java.util.Scanner;

public class C4_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        String a = "";
        for (int i = p.length-1 ; i >= 0 ; i--) {
            a += p[i];
            a += " ";
        }
        System.out.println(a);
    }
}
