package ATECHMODUL.Basyc_Syntax;

import java.util.Scanner;

public class C4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        b += 30;
        if(b > 59){
            a++;
            b -= 60;
            if(a > 23){
                a = 0;
            }
        }if(b < 10){
            System.out.printf("%d:0%d",a,b);
        }else{
            System.out.printf("%d:%d",a,b);
        }
    }
}
