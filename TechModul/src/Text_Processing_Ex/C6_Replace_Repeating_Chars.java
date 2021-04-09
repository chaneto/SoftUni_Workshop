package ATECHMODUL.Text_Processing_Ex;

import java.util.Scanner;

public class C6_Replace_Repeating_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String out = "";
        for (int i = 0; i < p.length() - 1; i++) {
            char vr = p.charAt(i);
            char vr1 = p.charAt(i + 1);
            if(vr != vr1){
                out+=vr;
            }
        }out+=p.charAt(p.length() - 1);
        System.out.println(out);
    }
}
