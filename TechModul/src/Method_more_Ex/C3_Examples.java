package ATECHMODUL.Method_more_Ex;

import java.util.Scanner;

public class C3_Examples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int a1 = Integer.parseInt(scanner.nextLine());
        int b1 = Integer.parseInt(scanner.nextLine());
        punkt(x,y,x1,y1,a,b,a1,b1);
    }public static void punkt(int x, int y, int x1, int y1,int a,int b, int a1, int b1){
        int xx = Math.abs(x) + Math.abs(y);
        int xxx = Math.abs(x1) + Math.abs(y1);
        int line = Math.abs(xx) + Math.abs(xxx);
        int yy = Math.abs(a) + Math.abs(b);
        int yyy = Math.abs(a1) + Math.abs(b1);
        int line1 = Math.abs(yy) + Math.abs(yyy);
        if(line > line1 ){
            if(xx < xxx){
                System.out.printf("(%d, %d)(%d, %d",x,y,x1,y1);
            }else {
                System.out.printf("(%d, %d)(%d, %d",x1,y1,x,y);
            }
        }
         if(line1 > line){
         if(yy < yyy){
             System.out.printf("(%d, %d)(%d, %d)",a,b,a1,b1);
         }else {
             System.out.printf("(%d, %d)(%d, %d)",a1,b1,a,b);
         }
         }
    }
}
