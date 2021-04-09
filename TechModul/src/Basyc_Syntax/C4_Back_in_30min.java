package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C4_Back_in_30min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int mm = b;
        int hh = a * 60;
        int sum = mm + hh + 30;
        double h = Math.floor(sum / 60);
        double m = sum - h * 60;
        if(h > 23){
            h = 0;
        }
        if(m < 10){
            System.out.printf("%.0f:0%.0f",h,m);
        }else{
            System.out.printf("%.0f:%.0f",h,m);
        }

    }
}
