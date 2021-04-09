package ATECHMODUL.Method_Ex;

import java.util.Scanner;

public class C1_Smales_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        Integer [] in = new Integer[]{a,b,c};
        int out = Integer.MAX_VALUE;
        smallnumber(a,b,c,out,in);
    }public static Integer smallnumber(int a,int b, int c,int out,Integer[] in){
        for (int i = 0; i < 3; i++) {
            if(in[i] < out ){
                out = in[i];
            }
        }
        System.out.println(out);
        return out;
    }

}
