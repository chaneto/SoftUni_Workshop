package ATECHMODUL.Method_Ex;

import java.util.Scanner;

public class C3_Characters_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char p = scanner.nextLine().charAt(0);
        char p1 = scanner.nextLine().charAt(0);
        M(p,p1);
    }public static String M (char p,char p1){
        String out = "";
        if(p <  p1){
            for (int i = p + 1; i < p1; i++) {
                out+=(char)i;
                out+=" ";
            }
        }else {
            for (int i = p1 + 1; i < p ; i++) {
                out+=(char)i;
                out+=" ";
            }
        }
        System.out.println(out);
        return out;
    }
}
