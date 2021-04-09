package ATECHMODUL.Text_Processing_Ex;

import java.util.Scanner;

public class C2_Character_Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split(" ");
        String p = in[0];
        String p1 = in[1];
        int min = Math.min(p.length(),p1.length());
        int max = Math.max(p.length(),p1.length());
        int sum = 0;
        for (int i = 0; i < max; i++) {
            if(i < min){
                sum += p.charAt(i) * p1.charAt(i);
            }else if (p.length() == max){
                sum += p.charAt(i);
            }else {
                sum += p1.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
