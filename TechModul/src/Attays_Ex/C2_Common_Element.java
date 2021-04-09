package ATECHMODUL.Attays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C2_Common_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        String[] b = scanner.nextLine().split(" ");
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < b.length ; j++) {
                if(a[i].equals(b[j]) ){
                    System.out.print(a[i] + " ");
                }

            }

        }

    }
}
