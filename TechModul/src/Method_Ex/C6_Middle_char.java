package ATECHMODUL.Method_Ex;

import java.util.Scanner;

public class C6_Middle_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] in = scanner.nextLine().split("");
        M(in);
    }public static String M (String [] in){
        int a = in.length / 2;
        if(in.length%2 == 0){
            System.out.print(in[a - 1] + in[a] );
        }else {
            System.out.println(in[a]);
        }return in[a];
    }
}
