package ATECHMODUL.Method_more_Ex;

import java.util.Scanner;

public class C2_Center_Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        punkt(x,y,x1,y1);
    }public static void punkt(int x, int y, int x1, int y1){
        int xx = Math.abs(x) + Math.abs(y);
        int xxx = Math.abs(x1) + Math.abs(y1);
        if(xx < xxx){
            System.out.printf("(%d, %d)",x,y);
        }else {
            System.out.printf("(%d, %d)",x1,y1);
        }
    }
}
