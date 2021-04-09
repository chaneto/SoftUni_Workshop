package ATECHMODUL.Attays_Ex;

import java.util.Scanner;

public class C4_Meine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] p = scanner.nextLine().split(" ");
        int a = Integer.parseInt(scanner.nextLine());
        String b = "";
        int t = a;
        if(a == p.length ){
            t = 0;
        }if(a > p.length){
            t = a - p.length;
        } for (int i = 0; i <  p.length; i++) {
            b += p[t];
            b+=" ";
            t++;
            if(t == p.length){
                t = 0;
            }

        }System.out.printf("%s",b);
    }
}
