package ATECHMODUL.Text_Processing_Ex;

import java.util.Scanner;

public class C8_Letters_Change_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p = scanner.nextLine().split("\\s+");
        double result = 0;
        double sum = 0;
        for (int i = 0; i < p.length; i++) {
            String vr = p[i];
            char first = vr.charAt(0);
            char last = vr.charAt(vr.length() - 1);
            String num = vr.substring(1,vr.length() - 1);
            double nummer = Double.parseDouble(num);
            if(Character.isLowerCase(first)){
                sum = nummer * (first - 96);
            } else {
                sum = nummer / (first - 64);
            }if(Character.isLowerCase(last)){
                sum = sum + (last - 96);
            } else {
                sum = sum - (last - 64);
            }
            result+=sum;
        }
        System.out.printf("%.2f",result);
    }
}
