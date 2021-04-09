package Uslovni_Konstrukcii_Ex;

import java.util.Scanner;

public class CLASS5_Time_15min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double b1=b+15;
        if(b1>59){a=a+1;b1=b1-60;}
        if(a>23){a=0;}
        if(b1<10){
            System.out.printf("%.0f:0%.0f",a,b1);
        }else {
            System.out.printf("%.0f:%.0f",a,b1);
        }
    }
}
