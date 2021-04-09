package ATECHMODUL.Text_Processing;

import java.util.Scanner;

public class C2_Repeat_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split(" ");
        System.out.println(resukt(p));

    }public static String resukt(String [] p){
        String result = "";
        for (int i = 0; i < p.length; i++) {
            int a = p[i].length();
            for (int j = 0; j < a; j++) {
                result+=p[i];
            }
        }return result;
    }
}
