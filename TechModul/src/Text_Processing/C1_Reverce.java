package ATECHMODUL.Text_Processing;

import java.util.Scanner;

public class C1_Reverce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String out = "";
        String[] p = scanner.nextLine().split(" ");
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length(); j++) {
                out+=p[i];
            }
        }
        System.out.println(out);
    }
}
