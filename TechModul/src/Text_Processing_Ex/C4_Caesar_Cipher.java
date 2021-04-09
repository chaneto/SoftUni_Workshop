package ATECHMODUL.Text_Processing_Ex;

import java.util.Scanner;

public class C4_Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String out = "";
        for ( int i = 0; i < p.length(); i++) {
            char vr = p.charAt(i);
            int a = vr + 3;
            out+=(char)a;
        }
        System.out.println(out);
    }
}
